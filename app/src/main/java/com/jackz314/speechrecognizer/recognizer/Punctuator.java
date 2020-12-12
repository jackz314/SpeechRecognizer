package com.jackz314.speechrecognizer.recognizer;

import android.content.Context;
import android.os.Build;
import android.util.Log;

import org.tensorflow.lite.Delegate;
import org.tensorflow.lite.Interpreter;
import org.tensorflow.lite.support.common.FileUtil;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//adds punctuation to stuff
public class Punctuator implements Closeable {
    private static final String TAG = "Punctuator";

    //imported from vocab file
    private static final char[] vocab = new char[]{'*', '-', ' ', '.', '!', ',', '?', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '\'', ':', '~', '`', ';', '"', '#', '$', '%', '&', '(', ')', '+', '/', '<', '=', '>', '@', '[', ']', '|'};
    private static final char[] punctuations = new char[]{'.', '!', ',', '?'};
    private static final char[] eos = new char[]{'.', '!', '?'};

    private Interpreter model;
    private final StringBuilder sb;
    private final ByteBuffer inputBuffer;
    private final ByteBuffer outputBuffer;
    private int lastStrEnd;

//    private ExecutorService es;

    public Punctuator(StringBuilder sb, Context context) throws IOException {
        Interpreter.Options modelOptions = new Interpreter.Options();
        Delegate delegate = getDeviceDelegate();
        if(delegate != null) {
            modelOptions.addDelegate(delegate);
            modelOptions.setUseNNAPI(true);
        }
//        modelOptions.setNumThreads(Math.max(Runtime.getRuntime().availableProcessors() - 2, 1)); // not really helpful

        MappedByteBuffer modelFile = FileUtil.loadMappedFile(context, "punctuation_model.tflite");
        model = new Interpreter(modelFile, modelOptions);
        this.sb = sb;
        inputBuffer = ByteBuffer.allocateDirect(4 * 500);
        fillInt(inputBuffer, 0, 500, 2); // init with space (2)
        outputBuffer = ByteBuffer.allocateDirect(4* 7 * 500); // 7 possibilities per char
    }

    public static boolean isPunctuation(char c){
        for (char punctuation : punctuations) {
            if(punctuation == c) return true;
        }
        return false;
    }

    //end of sentence punctuation
    public static boolean isEOS(char c){
        for (char punctuation : eos) {
            if(punctuation == c) return true;
        }
        return false;
    }

    private int vocabIndexOf(char c){
        for (int i = 0; i < vocab.length; i++)
            if (vocab[i] == c) return i;
        return 0; // default to * if unrecognized
    }

    private static void fillInt(ByteBuffer a, int fromIndex, int toIndex, int val) {
//        a.position(fromIndex);
        for (int i = fromIndex; i < toIndex; i++)
            a.putInt(val);
    }

    private static String getStr(ByteBuffer a){
        a.clear();
        StringBuilder b = new StringBuilder(500);
        for (int i = 0; i < 500; i++) {
            b.append(vocab[Math.max(Math.min(a.getInt(), vocab.length-1), 0)]);
        }
        a.clear();
        return b.toString();
    }

    //maps chars to ints according to the vocab file
    private void charsToInputBuffer(char[] chars){
        inputBuffer.clear();//restart at start position
        for (char c : chars) {
            inputBuffer.putInt(vocabIndexOf(c));
        }
        // pad the rest as space (2), starting from end of current string, to the end of last string
        // (if that's longer than the current one)
        if(lastStrEnd > chars.length)
            fillInt(inputBuffer, chars.length, lastStrEnd,2);
        lastStrEnd = chars.length;
        inputBuffer.clear();
    }

    //executes in a es, async
    /*public void punctuateAsync(int start, int end){
        if(es == null) es = Executors.newSingleThreadExecutor();
        es.execute(() -> punctuate(start, end));
    }
*/
    public void punctuate(int start, int end){
//        Log.d(TAG, "punctuate: start:end " + start + " " + end);
        long startTime = System.nanoTime();
        if(start >= end) return;
        int l = start;
        int r = Math.min(end, start + 500);
        while (r <= end){//process 500 chars at once at most, chop it up
//            if(r-l == 500){//make sure to split at sentence end or at least when there's a space
//                --r;//skip exclusive end
//                while (--r > 0)
//                    if (sb.charAt(r) == ' ' && Character.isUpperCase(sb.charAt(r + 1))) break;
//                    //found sentence start, cut off here
//                Log.d(TAG, "punctuate: broke sentence off at r=" + r);
//            }
            char[] input = new char[r-l];
            sb.getChars(l, r, input, 0);
//            Log.d(TAG, "punctuate: l:r " + l + ":" + r);
            int puncts = runInference(l, input);
            end += puncts;
            r += puncts;
            l = r;
            if(r == end) break;
            r += Math.min(end-l, 500);
        }
        long duration = System.nanoTime() - startTime;
        Log.d(TAG, "Punctuation of " + (end-start) + " chars took " + (duration*1e-6) + "ms.");
    }

    //returns number of punctuations added
    private int runInference(int start, char[] input) {
        charsToInputBuffer(input);
//        String test = getStr(inputBuffer);
//        Log.d(TAG, "punctuate: input: " + test);
//        float[][][] outArr = new float[1][500][7];

        // TODO: 12/11/2020 sometimes TFLite throws error here (sometimes null pointer dereference)
        model.run(inputBuffer.asIntBuffer(), outputBuffer.asFloatBuffer());

        outputBuffer.clear();//reset position to 0 and limit to capacity
        int insertedCnt = 0;
//        ArrayList<String> maxCols = new ArrayList<>();
        for (int row = 0; row < input.length; row++) {
            int maxCol = getNextMaxCol();
//            maxCols.add(String.valueOf(maxCol));
            if(maxCol != 1 && maxCol != 2){ // need to add punctuation (not self (including space))
                if(row == 0){
                    //add punctuation to previous sentence if needed (e.g. this one starts with space, last one ended with no punctuation)
                    if(start - 1 > 0 && !isPunctuation(sb.charAt(start - 1))){
                        sb.insert(start, vocab[maxCol]);
                        ++insertedCnt;
                    }
                }else{
                    sb.insert(start+row+insertedCnt, vocab[maxCol]);
                    ++insertedCnt;
                }
            }
        }
        if(500 - input.length >= 1){
            int trailingPunct = getNextMaxCol();
//            int lastPunct;
//            maxCols.add(String.valueOf(trailingPunct));
            if(trailingPunct > 2){
                //trailing punctuation after the end of sentence
                sb.insert(start+input.length+insertedCnt, vocab[trailingPunct]);
                ++insertedCnt;
            }/*else if(trailingPunct == 2 && 500 - input.length >= 2 && (lastPunct = getNextMaxCol()) > 2){
                // a situation where for short sentences the punctuation is after the ending space
                sb.insert(start+input.length+insertedCnt, vocab[lastPunct]);
                ++insertedCnt;
            }*/
        }

        outputBuffer.clear();
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            Log.d(TAG, "punctuate: input: " + String.join("", maxCols));
//        }
//        Log.d(TAG, "punctuate: result: " + sb.subSequence(start,  start + input.length + insertedCnt));
//        Log.d(TAG, "runInference: added " + insertedCnt + " punctuations");
        return insertedCnt;
    }

    private int getNextMaxCol() {
        int maxCol = -1;
        float max = Float.MIN_VALUE;
        for (int col = 0; col < 7; col++){
//                float out = outArr[0][row][col];
            float out = outputBuffer.getFloat();
            if(out > max){
                max = out;
                maxCol = col;
            }
        }
        return maxCol;
    }

    private Delegate getDeviceDelegate(){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O_MR1){
//            return new NnApiDelegate();
            return null;
        }else{ // CPU
            return null;
        }
    }

    @Override
    public void close() {
        Log.d(TAG, "close: closing punctuator");
        if (model != null) model.close();
        model = null;
//        if (es != null) es.shutdownNow();
    }
}
