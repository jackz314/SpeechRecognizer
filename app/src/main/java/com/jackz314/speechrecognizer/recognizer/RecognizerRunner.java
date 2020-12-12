package com.jackz314.speechrecognizer.recognizer;

import android.content.Context;
import android.util.Log;

import com.google.speech.recognizer.api.Recognizer;
import com.google.speech.recognizer.api.RecognizerSessionParamsProto;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RecognizerRunner implements Closeable {

    private static final String TAG = "RecognizerRunner";

    private Context context;

    private ModelLoader modelLoader;
    private StringBuilder resultBuilder;
    private Punctuator punctuator;

    private final ExecutorService recognizerES = Executors.newSingleThreadExecutor();
    private final ExecutorService processES = Executors.newSingleThreadExecutor();
    private CustomRecognizer recognizer;
    private byte[] runConfig;
    private InputStream inputStream;

    private boolean started = false;

    private int lastSentenceEnd = 0;

    private ResultUpdateListener resultListener;

    private boolean initDone = false;
    private Lock lock = new ReentrantLock();
    private Condition cond = lock.newCondition();

    //leave inputStream null if want to use microphone recorder
    public RecognizerRunner(Context context, InputStream inputStream, ResultUpdateListener resultUpdateListener) throws IOException {
        this.context = context;
        this.inputStream = inputStream;
        this.resultListener = resultUpdateListener;
//        init();
        processES.execute(() -> {
            try {
                init();
                initDone = true;
                lock.lock();
                cond.signal();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });
    }

    private void init() throws IOException {
        modelLoader = new ModelLoader(context);
        recognizer = CustomRecognizer.create(
                inputStream,
                modelLoader.getModelConfig(),
                modelLoader.getModelDir().getAbsolutePath()
        );
        resultBuilder = new StringBuilder(1024);
        punctuator = new Punctuator(resultBuilder, context);

        recognizer.setRecognitionEventListener(set -> {
            if(!processES.isShutdown()) processES.execute(() -> {
                if (set.getStatus() == Recognizer.StatusCode.STATUS_SUCCESS) {
                    if (set.hasPartialResult()) { // append to sentence
                        resultBuilder.setLength(lastSentenceEnd);//restart at start of current sentence
                        List<Recognizer.PartialPart> partList = set.getPartialResult().getPartList();
                        for (Recognizer.PartialPart part : partList) {
                            resultBuilder.append(part.getText());
                        }
                        if (lastSentenceEnd == 0 && resultBuilder.length() > 0) { // deal with first sentence capitalization issue
                            resultBuilder.setCharAt(0, Character.toUpperCase(resultBuilder.charAt(0)));
                        }else if(lastSentenceEnd > 1 && resultBuilder.length() > lastSentenceEnd + 1 && resultBuilder.charAt(lastSentenceEnd) == ' ' && Punctuator.isEOS(resultBuilder.charAt(lastSentenceEnd - 1))){
//                            Log.d(TAG, "recognition: capitalizing sentence");
                            resultBuilder.setCharAt(lastSentenceEnd + 1, Character.toUpperCase(resultBuilder.charAt(lastSentenceEnd + 1)));
                        }
                        resultListener.onResultUpdate(resultBuilder);
                    } else if (set.hasResult()) { // one sentence is finished, add period and maybe parse other alignment stuff if needed
                        Log.d(TAG, "runRecognition: sentence over: " + resultBuilder.subSequence(lastSentenceEnd, resultBuilder.length()));
                        punctuator.punctuate(lastSentenceEnd, resultBuilder.length());
                        lastSentenceEnd = resultBuilder.length();
                        resultListener.onResultUpdate(resultBuilder);
                    } else if (set.hasCombinedResult()) {// all done
                        Log.d(TAG, "runRecognition: got combined result");
                        if (!Punctuator.isPunctuation(resultBuilder.charAt(resultBuilder.length() - 1))) {
                            resultBuilder.append('.');//add final period if needed
                        }
                        resultListener.onResultUpdate(resultBuilder);
                    } else {// something's not right
                        Log.d(TAG, "handleRecognitionEvent: doesn't have results available: " + set);
                    }
                } else {
                    Log.d(TAG, "handleRecognitionEvent: recognition not success: " + set.getStatus() + "\n" + set);
                }
            });
        });

        runConfig = RecognizerSessionParamsProto.RecognizerSessionParams.newBuilder()
                .setType(RecognizerSessionParamsProto.RecognizerSessionParams.AudioType.LINEAR16)
                .setMaskOffensiveWords(false)
                .setSampleRate(16000)
                .setChannelCount(1)
                .setEnableAutomaticPunctuation(true)
                .setEnableDecoderEvents(false)
//                        .setEnableDebugging(true)
//                        .setEnableTracing(true)
//                        .setEnableDecoderEvents(true)
                .setEnableVoiceFilter(true)
                .build().toByteArray();
    }

    public void run(){
        recognizerES.execute(() -> {
            if(!initDone){
                lock.lock();//wait until init is done
                try {
                    cond.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }

            started = true;
            long startTime = System.nanoTime();

            final byte[] runResultBytes = recognizer.run(runConfig);
            long duration = System.nanoTime() - startTime;
            recognizer.close();
            recognizer = null;
            Log.d(TAG, "run: recognition took " + (duration * 1e-6) + "ms");
//                NativeRecognizer.NativeRecognitionResult set = NativeRecognizer.NativeRecognitionResult.parseFrom(runResultBytes);
//                Log.d(TAG, "run: result: " + set);
//                String outStr = set.getRecognizerInfo().getTopHypothesis().getHypothesis() + "\n\n" + set.toString();
            if(!processES.isShutdown()) processES.execute(()->resultListener.onResultUpdate(null));
        });

    }

    public void setResultUpdateListener(ResultUpdateListener listener){
        this.resultListener = listener;
    }

    public void pause(){
        recognizer.pauseRecorder();
    }

    public void resume(){
        if(!started) {
            run();
            return;
        }
        recognizer.startRecorder();
    }

    @Override
    public void close() throws IOException {
        if(recognizer != null) recognizer.cancel();
        processES.shutdown();
        /*try {
            //wait for unfinished processing to finish
            processES.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        recognizerES.shutdown();
        punctuator.close();
        if(inputStream != null) inputStream.close();
    }

    @Override
    protected void finalize() throws Throwable {
        if(recognizer != null) throw new IllegalStateException("Didn't call close");
    }

    @FunctionalInterface
    public interface ResultUpdateListener{
        void onResultUpdate(CharSequence result);
    }
}
