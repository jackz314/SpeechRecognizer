/*
 * Copyright (c) 2020, Jack Zhang (jackz314) <me@jackz314.me>
 * All rights reserved.
 */

package com.jackz314.resample;

import java.io.Closeable;
import java.nio.ByteBuffer;

/**
 * resample audio in 16-bit PCM format
 * using libsamplerate: https://github.com/libsndfile/libsamplerate
 * @author Jack Zhang me@jackz314.me
 */
public class Resample implements Closeable {

    private static final String TAG = "Resample";

    private static final String RESAMPLE_LIB = "resample";

    static {
        System.loadLibrary(RESAMPLE_LIB);
    }

    private long nativeStatePtr = -1;

    private final double convertRatio;

    /**
     * Initialize a resample instance, initializes the internal SRC_STATE
     * @param converterType the conversion type, see also {@link ConverterType}
     * @param channels number of channels
     * @param convertRatio resample conversion ratio (out to in)
     * @throws IllegalArgumentException if internal initialization fails
     */
    public Resample(ConverterType converterType, int channels, double convertRatio) {
        this.convertRatio = convertRatio;
        nativeStatePtr = init(converterType.getValue(), channels, convertRatio);
        if (nativeStatePtr == -1) {
            throw new IllegalArgumentException("init failed, see JNI log above");
        }
    }

    /**
     * Initialize a resample instance, initializes the internal SRC_STATE
     * @param converterType the conversion type, see also {@link ConverterType}
     * @param channels number of channels
     * @param inSampleRate input sample rate
     * @param outSampleRate output/target sample rate
     */
    public Resample(ConverterType converterType, int channels, int inSampleRate, int outSampleRate) {
        this(converterType, channels, outSampleRate / (double) inSampleRate);
    }

    public double getConvertRatio(){
        return convertRatio;
    }

    //gets an estimate conversion output data size (in bytes) that can be used to set the buffer size of output ByteBuffers or arrays.
    public int getOutputSizeEstimate(int inputSize){
        return (int) (inputSize * convertRatio) + 5;
    }

    /**
     * processes data, uses GetPrimitiveArrayCritical to avoid copy, but will disable GC shortly and could hang other threads
     * for details see https://stackoverflow.com/questions/23258357/whats-the-trade-off-between-using-getprimitivearraycritical-and-getprimitivety
     * or https://docs.oracle.com/javase/8/docs/technotes/guides/jni/spec/functions.html#GetPrimitiveArrayCritical_ReleasePrimitiveArrayCritical
     * @param inData input data
     * @return output data array, with the correct size
     */
    public byte[] process(byte[] inData) {
        return nativeProcess(nativeStatePtr, inData);
    }

    /**
     * process using the simpler copy method in JNI to get the input array (instead of GetPrimitiveArrayCritical), returns output in array
     * @param inData input data
     * @return output data array, with the correct size
     */
    public byte[] processCopy(byte[] inData) {
        return nativeProcessCopy(nativeStatePtr, inData);
    }

    /**
     * processes data, uses GetDirectBufferAddress so the buffer needs to be direct
     * @param inData input buffer, needs to be allocated using {@link ByteBuffer#allocateDirect(int)}
     *               set its limit with {@link ByteBuffer#limit(int)} to limit the input size
     * @return output data array, with the correct size
     */
    public byte[] process(ByteBuffer inData) {
        return nativeProcess(nativeStatePtr, inData);
    }

    /**
     * processes data, uses GetDirectBufferAddress so the buffers need to be direct
     * @param inData input buffer, needs to be allocated using {@link ByteBuffer#allocateDirect(int)}
     *               set its limit with {@link ByteBuffer#limit(int)} to limit the input size
     * @param outData output buffer, needs to be allocated using {@link ByteBuffer#allocateDirect(int)}
     * @return output size
     */
    public int process(ByteBuffer inData, ByteBuffer outData) {
        return nativeProcess(nativeStatePtr, inData, outData);
    }

    /**
     * processes data, uses GetDirectBufferAddress so the buffers need to be direct
     * @param inData input buffer, needs to be allocated using {@link ByteBuffer#allocateDirect(int)}
     * @param outData output buffer, needs to be allocated using {@link ByteBuffer#allocateDirect(int)}
     * @param inSize input size (read size)
     * @return output size (write size to outData)
     */
    public int process(ByteBuffer inData, ByteBuffer outData, int inSize) {
        return nativeProcess(nativeStatePtr, inData, outData, inSize);
    }

    // not used because it's slow and tricky (uses nested GetPrimitiveArrayCritical)
    private void process(byte[] inData, byte[] outData) {
        throw new UnsupportedOperationException("This process mode is unsupported");
    }

    /**
     * performs <b>one-time</b> simple conversions (typically <b>long term</b>, otherwise the performance is bad)
     * @param converterType the conversion type, see also {@link ConverterType}
     * @param channels number of channels
     * @param inSampleRate input sample rate
     * @param outSampleRate output/target sample rate
     * @param inData input buffer, needs to be allocated using {@link ByteBuffer#allocateDirect(int)}
     * @param outData output buffer, needs to be allocated using {@link ByteBuffer#allocateDirect(int)}
     * @return output size
     */
    public int simpleResample(ConverterType converterType, int channels, int inSampleRate, int outSampleRate, ByteBuffer inData, ByteBuffer outData, int inSize){
        return simpleResample(converterType.getValue(), channels, outSampleRate / (double) inSampleRate, inData, outData, inSize);
    }

    /**
     * performs one-time simple conversions (typically long term, otherwise the performance is bad)
     * @param converterType the conversion type, see also {@link ConverterType}
     * @param channels number of channels
     * @param convertRatio resample conversion ration (out to in)
     * @param inData input buffer, needs to be allocated using {@link ByteBuffer#allocateDirect(int)}
     * @param outData output buffer, needs to be allocated using {@link ByteBuffer#allocateDirect(int)}
     * @return output size
     */
    public int simpleResample(ConverterType converterType, int channels, double convertRatio, ByteBuffer inData, ByteBuffer outData, int inSize){
        return simpleResample(converterType.getValue(), channels, convertRatio, inData, outData, inSize);
    }

    @Override
    public void close() {
        if(nativeStatePtr <= 0) return;
        nativeClose(nativeStatePtr);
        nativeStatePtr = -1;
    }

    @Override
    protected void finalize() throws Throwable {
        if(nativeStatePtr != -1) throw new IllegalStateException("Didn't call close on Resample");
        super.finalize();
    }

    /**
     * Linear & Zero Order is really fast but has low quality, Sinc is slower but offer better quality
     * For more details, see https://github.com/libsndfile/libsamplerate/blob/master/docs/api_misc.md#converters
     */
    public enum ConverterType {
        SRC_SINC_BEST_QUALITY(0),
        SRC_SINC_MEDIUM_QUALITY(1),
        SRC_SINC_FASTEST(2),
        SRC_ZERO_ORDER_HOLD(3),
        SRC_LINEAR(4);

        private final int value;

        ConverterType(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private native long init(int converterType, int channels, double convertRatio);

    private native long init(int converterType, int channels, int inSampleRate, int outSampleRate);

    private native void nativeClose(long state);

    private native int nativeProcess(long state, byte[] inData, byte[] outData);

    private native byte[] nativeProcess(long state, byte[] inData);

    private native byte[] nativeProcessCopy(long state, byte[] inData);

    private native byte[] nativeProcess(long state, ByteBuffer inData);

    private native int nativeProcess(long state, ByteBuffer inData, ByteBuffer outData);

    private native int nativeProcess(long state, ByteBuffer inData, ByteBuffer outData, int inSize);

    // gets libsamplerate error message from error number
    public static native String errorMsg(int errNo);

//    public static native int simpleResample(int converterType, int channels, int inSampleRate, int outSampleRate, byte[] inData, byte[] outData);

    private static native int simpleResample(int converterType, int channels, double convertRatio, ByteBuffer inData, ByteBuffer outData, int inSize);

    // checks if conversion ratio is valid
    public static native boolean isValidRatio(int inSampleRate, int outSampleRate);
}
