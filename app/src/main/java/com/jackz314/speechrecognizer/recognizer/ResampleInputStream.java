package com.jackz314.speechrecognizer.recognizer;

import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.util.Log;

import androidx.annotation.NonNull;

import com.jackz314.resample.Resample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ResampleInputStream extends InputStream{

    public static final int DEFAULT_BUFFER_SIZE = 8192;

    private static final String TAG = "ResampleInputStream";

    private String path;
    private Uri uri;
    private Context context;

    private boolean closed = false;
    private boolean noConversion = false;
    private int sampleRate;
    private final int targetSampleRate;
    private int channels;

    private int bufferSize = DEFAULT_BUFFER_SIZE;
    private long totalSize;
    private long totalReadSize;
    private boolean writeFinished = false;

    private Resample resample;
    private InputStream inputStream;
    private InputStream processedInputStream;
    private PipedOutputStream os;

    private ByteBuffer inByteBuffer;
    private ByteBuffer outByteBuffer;

    private ExecutorService es;

    public ResampleInputStream(String path, int targetSampleRate) throws IOException {
        this(path, targetSampleRate, DEFAULT_BUFFER_SIZE);
    }

    public ResampleInputStream(String path, int targetSampleRate, int bufferSize) throws IOException {
        this.bufferSize = bufferSize;
        this.path = path;
        this.targetSampleRate = targetSampleRate;
        setFileInfo();
        init();
    }

    public ResampleInputStream(Uri uri, int targetSampleRate, Context context) throws IOException {
        this(uri, targetSampleRate, context, DEFAULT_BUFFER_SIZE);
    }

    public ResampleInputStream(Uri uri, int targetSampleRate, Context context, int bufferSize) throws IOException {
        this.bufferSize = bufferSize;
        this.uri = uri;
        this.targetSampleRate = targetSampleRate;
        this.context = context;
        setFileInfo();
        init();
    }

    public ResampleInputStream(InputStream inputStream, int sampleRate, int targetSampleRate, int channels) throws IOException {
        this(inputStream, sampleRate, targetSampleRate, channels, DEFAULT_BUFFER_SIZE);
    }

    public ResampleInputStream(InputStream inputStream, int sampleRate, int targetSampleRate, int channels, int bufferSize) throws IOException {
        this.bufferSize = bufferSize;
        this.inputStream = inputStream;
        this.sampleRate = sampleRate;
        this.targetSampleRate = targetSampleRate;
        this.channels = channels;
        init();
    }

    private void setFileInfo() throws IOException {
        setSampleRate();
        setChannels();
        setInputStream();
    }

    private void setInputStream() throws IOException {
        if(inputStream != null) inputStream.close();
        String fileName;
        if(path != null) {
            inputStream = new FileInputStream(new File(path));
            fileName = path;
        } else {
            inputStream = context.getContentResolver().openInputStream(uri);
            fileName = uri.getLastPathSegment();
        }
        if(fileName.toLowerCase().endsWith(".wav")){
            inputStream.skip(44);//skip wave file header
        }else{
            // TODO: 12/5/2020 other formats with MediaCodec
        }
    }

    private void init() throws IOException {
        if(sampleRate != targetSampleRate){
            resample = new Resample(Resample.ConverterType.SRC_LINEAR, channels, sampleRate, targetSampleRate);
            inByteBuffer = ByteBuffer.allocateDirect(bufferSize);
            outByteBuffer = ByteBuffer.allocateDirect(resample.getOutputSizeEstimate(bufferSize));
            outByteBuffer = ByteBuffer.allocateDirect(resample.getOutputSizeEstimate(bufferSize));
            os = new PipedOutputStream();
            processedInputStream = new PipedInputStream(os, bufferSize * 3);
            startResample();
        }else{
            noConversion = true;
            processedInputStream = inputStream;
        }
    }

    private void startResample(){
        if(es == null) es = Executors.newSingleThreadExecutor();
        es.execute(() -> {
            long startTime = System.nanoTime();
            int readTmp = 0;
            try {
                byte[] buf = new byte[bufferSize];
                int readSize;
                Log.d(TAG, "startResample: available: " + inputStream.available() + ", buf size: " + buf.length);
                while ((readSize = inputStream.read(buf)) != -1){
                    readTmp += readSize;
                    inByteBuffer.put(buf, 0, readSize);
//                    inByteBuffer.limit(readSize);
                    if(closed) return;
                    int outputSize = resample.process(inByteBuffer, outByteBuffer, readSize);
                    totalSize += outputSize;
                    os.write(outByteBuffer.array(), 0, outputSize);
                    os.flush();
                    inByteBuffer.clear();
                    outByteBuffer.clear();
                }
                writeFinished = true;
                if(totalReadSize == totalSize){//read finished, close output stream
                    os.close();
                }
            }catch (Exception e){
                Log.d(TAG, "stream closed when reading");
            }
//            catch (IOException e){
//                Log.e(TAG, "startResample: read from input stream failed", e);
//            }
            long duration = System.nanoTime() - startTime;
            Log.d(TAG, "Resample took " + (duration*1e-6) + "ms. Output size: " + readTmp + "->" + totalSize);
        });
    }

    private void setSampleRate() throws IOException {
        MediaExtractor mex = new MediaExtractor();
        if(path != null) mex.setDataSource(path);
        else mex.setDataSource(context, uri, null);
//        mex.setDataSource(((FileInputStream) inputStream).getFD());
        MediaFormat mf = mex.getTrackFormat(0);
        sampleRate = mf.getInteger(MediaFormat.KEY_SAMPLE_RATE);
        mex.release();
    }

    private void setChannels() throws IOException {
        MediaExtractor mex = new MediaExtractor();
        if(path != null) mex.setDataSource(path);
        else mex.setDataSource(context, uri, null);
//        mex.setDataSource(((FileInputStream) inputStream).getFD());
        MediaFormat mf = mex.getTrackFormat(0);
        channels = mf.getInteger(MediaFormat.KEY_CHANNEL_COUNT);
        mex.release();
    }

    @Override
    public int read() throws IOException {
        if(processedInputStream == null) return -1;
        if(totalReadSize + 1 >= totalSize && writeFinished) os.close();
        int read = processedInputStream.read();
        if(read != -1) ++totalReadSize;
        return read;
    }

    @Override
    public int read(@NonNull byte[] b) throws IOException {
        return read(b, 0, b.length);
    }

    @Override
    public int read(@NonNull byte[] b, int off, int len) throws IOException {
        if(processedInputStream == null) return -1;
        if(totalReadSize + len>= totalSize && writeFinished) os.close();
        int read = processedInputStream.read(b, off, len);
        totalReadSize += read;
//        Log.d(TAG, "read: size: " + totalReadSize);
        return read;
    }

    @Override
    public int available() throws IOException {
        if(noConversion) return inputStream.available();
        if(writeFinished) return (int) totalSize;
        return resample.getOutputSizeEstimate(inputStream.available()); // unknown, estimate
    }

    @Override
    public synchronized void reset() throws IOException {
        Log.d(TAG, "reset: resetting stream");
        if(path == null) {
            inputStream.reset();
            close();
        }
        else {
            setInputStream();
            InputStream tmp = inputStream;
            inputStream = null;
            close();
            inputStream = tmp;
        }
        closed = false;
        init();
    }

    @Override
    public void close() throws IOException {
        if(closed) return;
        closed = true;
        Log.d(TAG, "close: closing resample stream");
        if(es != null) { // shutdown this first to avoid abrupt termination in jni code
            es.shutdown();
            try {
                es.awaitTermination(3, TimeUnit.SECONDS);
            } catch (InterruptedException ignored) {}
        }
        es = null;
        if(resample != null) resample.close();
        resample = null;
        if(inputStream != null) inputStream.close();
        inputStream = null;
        if(processedInputStream != null) processedInputStream.close();
        processedInputStream = null;
        if(os != null) os.close();
        os = null;
        if(inByteBuffer != null) inByteBuffer.clear();
        if(outByteBuffer != null) outByteBuffer.clear();
        inByteBuffer = null;
        outByteBuffer = null;
    }

    @Override
    protected void finalize() throws Throwable {
        if(inputStream != null) close();
    }
}
