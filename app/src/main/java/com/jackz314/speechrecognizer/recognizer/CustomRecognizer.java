package com.jackz314.speechrecognizer.recognizer;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.MediaRecorder;
import android.util.Log;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.speech.recognizer.AbstractRecognizer;
import com.google.speech.recognizer.ResourceManager;
import com.google.speech.recognizer.api.Recognizer;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class CustomRecognizer extends AbstractRecognizer implements Closeable
{
    public final ResourceManager mResourceManager = new CustomResourceManager();

    private InputStream reader;
    private AudioRecord recorder;
    private RecognitionEventListener recognitionEventListener;

//    private static
//
//    FileOutputStream lhandleEndpointerEvent;
//    FileOutputStream lhandleRecognitionEvent;
//    PrintWriter recogEventPW;


    static {
        System.loadLibrary("google_speech_jni");
        System.loadLibrary("inject");
    }

    private CustomRecognizer() {}

    static public CustomRecognizer create(InputStream audioStream, byte[] dictationConfig, String modelPath)
    {
        if(audioStream == null) return create(dictationConfig, modelPath);

        CustomRecognizer recognizer = new CustomRecognizer();

        recognizer.mResourceManager.init(dictationConfig, new String[] { modelPath });
        recognizer.setAudioReader(audioStream);
        recognizer.init(dictationConfig, recognizer.mResourceManager);

        return recognizer;
    }

    //use microphone
    static public CustomRecognizer create(byte[] dictationConfig, String modelPath)
    {

        CustomRecognizer recognizer = new CustomRecognizer();

        recognizer.mResourceManager.init(dictationConfig, new String[] { modelPath });
        recognizer.setupAudioRecorder();
        recognizer.init(dictationConfig, recognizer.mResourceManager);
        recognizer.startRecorder();//start by default
        return recognizer;
    }

    public void setRecognitionEventListener(RecognitionEventListener recognitionEventListener) {
        this.recognitionEventListener = recognitionEventListener;
    }

    @Override
    public void handleAudioLevelEvent(final byte[] array) {
//        Recognizer.AudioLevelEvent set = null;
//        try {
//            set = Recognizer.AudioLevelEvent.parseFrom(array);
//        } catch (InvalidProtocolBufferException e) {
//            e.printStackTrace();
//        }
//        Log.d(TAG, String.format("handleAudioLevelEvent: %s", set.toString()));
    }

    @Override
    public void handleEndpointerEvent(final byte[] array) {
//        if(true) return;
//        Log.d(TAG, " - endpointer: " + bytesToHex(array));

        /*try {
            lhandleEndpointerEvent.write("-next-".getBytes());
            lhandleEndpointerEvent.write(array);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        try {
            Recognizer.EndpointerEvent set = Recognizer.EndpointerEvent.parseFrom(array);
//            Log.d(TAG, String.format("handleEndpointerEvent: %s", set.toString()));
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void handleHotwordEvent(final byte[] array) {
//        Recognizer.HotwordEvent set = null;
//        try {
//            set = Recognizer.HotwordEvent.parseFrom(array);
//        } catch (InvalidProtocolBufferException e) {
//            e.printStackTrace();
//        }
//        Log.d(TAG, String.format("handleHotwordEvent: %s", set.toString()));
    }

    @Override
    public void handleRecognitionEvent(final byte[] array) {
//        if(true) return;
//        Log.d(TAG + " - handleRecognitionEvent", bytesToHex(array));

        /*try {
            lhandleRecognitionEvent.write("-next-".getBytes());
            lhandleRecognitionEvent.write(array);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        try {
            Recognizer.RecognitionEvent set = Recognizer.RecognitionEvent.parseFrom(array);
//            recogEventPW.println(new Date());
//            recogEventPW.println(set);
            if(recognitionEventListener != null) recognitionEventListener.onNewRecognitionEvent(set);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        Log.d(TAG, String.format("recognition event: %s", set.toString()));

    }

    public static String print(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (byte b : bytes) {
            sb.append(String.format("0x%02X ", b));
        }
        sb.append("]");
        return sb.toString();
    }

    public static String bytesToHex(byte[] in) {
        final StringBuilder builder = new StringBuilder();
        for(byte b : in) {
            builder.append(String.format("%02x ", b));
        }
        return builder.toString();
    }

    @Override
    public int read(final byte[] buffer) {

//        Log.d(TAG, String.format("AbstractRecognizer.read(%d %d)", readCounter++, buffer.length));
//        Log.d(TAG, "READ:" + Arrays.toString(buffer));

        int bytesRead = 0;
        try {
            if(reader != null) bytesRead = this.reader.read(buffer);
            else bytesRead = this.recorder.read(buffer, 0, buffer.length);
            if(bytesRead < -1){
                Log.e(TAG, "read: recorder error, code: " + bytesRead);
            }
//                Log.d(TAG, "bytes read: " + bytesRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        return bytesRead;
        return Math.max(bytesRead, 0); // needs to return 0 instead of -1 or error code if end of stream
    }

    public void setAudioReader(InputStream audioStream) {
        reader = audioStream;
    }

    public void setupAudioRecorder() {
        int sampleRate = 16000;
        recorder = new AudioRecord.Builder().setAudioSource(MediaRecorder.AudioSource.MIC)
                .setAudioFormat(new AudioFormat.Builder().setSampleRate(sampleRate)
                        .setEncoding(AudioFormat.ENCODING_PCM_16BIT)
                        .setChannelMask(AudioFormat.CHANNEL_IN_MONO).build())
                .setBufferSizeInBytes(sampleRate / 10) // .1 seconds buffer
                .build();
    }

    public void startRecorder() {
        if(recorder != null) recorder.startRecording();
    }

    public void pauseRecorder() {
        if(recorder != null) recorder.stop();
    }

    public void closeLogFile(){
//        try {
//            lhandleEndpointerEvent.close();
//            lhandleRecognitionEvent.close();
//            recogEventPW.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    public void setLogFile(File sdcard, Context applicationContext) throws IOException {
//        lhandleEndpointerEvent = applicationContext.openFileOutput("endpointer.txt", Context.MODE_APPEND);
//        lhandleRecognitionEvent = applicationContext.openFileOutput("recognition.txt", Context.MODE_APPEND);
//        recogEventPW = new PrintWriter(lhandleRecognitionEvent);
    }

    @Override
    public final void close() {
        this.mResourceManager.delete();
        closeLogFile();
        if (recorder != null) {
            recorder.release();
//            recorder = null;
        }
    }
}