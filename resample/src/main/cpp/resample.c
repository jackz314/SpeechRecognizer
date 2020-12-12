/*
 * Copyright (c) 2020, Jack Zhang (jackz314) <me@jackz314.me>
 * All rights reserved.
 */

#include <android/log.h>
#include <math.h>
#include <stdlib.h>
#include <string.h>
#include <malloc.h>
#include <jni.h>

#include "samplerate.h"
#include "common.h"

#define LOG_TAG "resample.c"

#ifdef __cplusplus
extern "C" {
#endif

double getConvertRatio(int inRate, int outRate) {
    return outRate / (double) inRate;
}

// used to get the limit of a java bytebuffer (could be used as input size, set on Java side)
// not recommended because the performance is not as good as just passing in sizes
int getByteBufferLimit(JNIEnv *env, jobject byteBuffer) {
    jclass cls = (*env)->GetObjectClass(env, byteBuffer);
    jmethodID limit_id = (*env)->GetMethodID(env, cls, "limit", "()I"); // get limit: int limit()
    return (*env)->CallIntMethod(env, byteBuffer, limit_id);
}

// used to set the limit of a java bytebuffer (could be used for output size, set on C side)
// not recommended because the performance is not as good as just passing in sizes
void setByteBufferLimit(JNIEnv *env, jobject byteBuffer, int limit) {
    jclass cls = (*env)->GetObjectClass(env, byteBuffer);
    jmethodID limit_id = (*env)->GetMethodID(env, cls, "limit", "(I)Ljava/nio/Buffer;"); // set limit: Buffer limit(int)
    (*env)->CallObjectMethod(env, byteBuffer, limit_id, limit);
}

JNIEXPORT jlong JNICALL
Java_com_jackz314_resample_Resample_init__IID(JNIEnv *env, jobject thiz, jint converter_type,
                                              jint channels, jdouble ratio) {
    if (!src_is_valid_ratio(ratio)) {
        __android_log_write(ANDROID_LOG_ERROR, LOG_TAG, "invalid convert ratio");
        return -1;
    }
    int error;
    SRC_STATE *state = src_new(converter_type, channels, &error);
    if (!state) {
        __android_log_write(ANDROID_LOG_ERROR, LOG_TAG, src_strerror(error));
        return -1;
    }

    src_set_ratio(state, ratio);

    return (jlong) state; // return pointer to state container
}

JNIEXPORT jlong JNICALL
Java_com_jackz314_resample_Resample_init__IIII(JNIEnv *env, jobject thiz, jint converter_type,
                                               jint channels, jint in_sample_rate,
                                               jint out_sample_rate) {
    double ratio = getConvertRatio(in_sample_rate, out_sample_rate);
    return Java_com_jackz314_resample_Resample_init__IID(env, thiz, converter_type, channels,
                                                         ratio);
}

JNIEXPORT jint JNICALL
Java_com_jackz314_resample_Resample_nativeProcess__J_3B_3B(JNIEnv *env, jobject thiz,
                                                           jlong state_ptr,
                                                           jbyteArray in_data,
                                                           jbyteArray out_data) {
    //unsupported
//    SRC_STATE *state = (SRC_STATE *) state_ptr;
//    SRC_DATA data;
//    data.src_ratio = state->last_ratio;
//    data.end_of_input = false;
//    data.data_in = (*env)->GetPrimitiveArrayCritical(env, in_data, false);
//    data.data_out = (*env)->GetPrimitiveArrayCritical(env, out_data, false);
//    if (!data.data_in || !data.data_out) {
//        __android_log_write(ANDROID_LOG_ERROR, LOG_TAG,
//                            "GetPrimitiveArrayCritical failed, output array is null.");
//        return -1;
//    }
//    int error = src_process(state, &data);
//    (*env)->ReleasePrimitiveArrayCritical(env, in_data, data.data_in, 0);
//    (*env)->ReleasePrimitiveArrayCritical(env, out_data, data.data_out, 0);
//    return error;
    return -1;
}

JNIEXPORT jbyteArray JNICALL
Java_com_jackz314_resample_Resample_nativeProcess__J_3B(JNIEnv *env, jobject thiz, jlong state_ptr,
                                                        jbyteArray in_data) {
    SRC_STATE *state = (SRC_STATE *) state_ptr;
    SRC_DATA data;
    data.src_ratio = state->last_ratio;
    data.end_of_input = false;
    int inputLen = (*env)->GetArrayLength(env, in_data) / 2; // byte to short
    int outputLenEst = (int) ((state->last_ratio) * inputLen) + 5; // estimated output len
    data.input_frames = inputLen / state->channels;
    data.output_frames = outputLenEst / state->channels;
    float *out_data_float = malloc((state->last_ratio) * sizeof(float) * inputLen);
    data.data_out = out_data_float;
    float *in_data_float = malloc(inputLen * sizeof(float));
    short *in_data_ptr = (*env)->GetPrimitiveArrayCritical(env, in_data, false);
    src_short_to_float_array(in_data_ptr, in_data_float, inputLen);
    data.data_in = in_data_float;
    if (!data.data_in || !data.data_out) {
        (*env)->ReleasePrimitiveArrayCritical(env, in_data, in_data_ptr, 0);
        free(in_data_float);
        free(out_data_float);
        __android_log_write(ANDROID_LOG_ERROR, LOG_TAG,
                            "GetPrimitiveArrayCritical failed, output array is null.");
        return NULL;
    }
    int error = src_process(state, &data);
    (*env)->ReleasePrimitiveArrayCritical(env, in_data, in_data_ptr, 0);
    free(in_data_float);
    int outputSize = data.output_frames_gen * state->channels;
    jbyteArray out_data = (*env)->NewByteArray(env, outputSize * 2);
    jbyte *out_data_ptr = (*env)->GetByteArrayElements(env, out_data, 0);
    src_float_to_short_array(out_data_float, (short *) out_data_ptr, outputSize);
    free(out_data_float);
    (*env)->ReleaseByteArrayElements(env, out_data, out_data_ptr, 0);
    if (error) {
        __android_log_write(ANDROID_LOG_ERROR, LOG_TAG, src_strerror(error));
    }
    return out_data;
}

JNIEXPORT jbyteArray JNICALL
Java_com_jackz314_resample_Resample_nativeProcess__JLjava_nio_ByteBuffer_2(JNIEnv *env, jobject thiz, jlong state_ptr, jobject in_data) {
    SRC_STATE *state = (SRC_STATE *) state_ptr;
    SRC_DATA data;
    data.src_ratio = state->last_ratio;
    data.end_of_input = false;
    int inputLen = getByteBufferLimit(env, in_data) / 2; // byte to short
    int outputLenEst = (int) ((state->last_ratio) * inputLen) + 5; // estimated output len
    data.input_frames = inputLen / state->channels;
    data.output_frames = outputLenEst / state->channels;
    float *out_data_float = malloc(outputLenEst * sizeof(float));
    data.data_out = out_data_float;
    short *in_data_ptr = (*env)->GetDirectBufferAddress(env, in_data);
    float *in_data_float = malloc(inputLen * sizeof(float));
    src_short_to_float_array(in_data_ptr, in_data_float, inputLen);
    data.data_in = in_data_float;
    if (!data.data_in || !data.data_out) {
        free(in_data_float);
        free(out_data_float);
        __android_log_write(ANDROID_LOG_ERROR, LOG_TAG, "get direct buffer failed, array is null.");
        return NULL;
    }
    int error = src_process(state, &data);
    free(in_data_float);
    int outputSize = data.output_frames_gen * state->channels;
//    __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, "output size: %d", outputSize);
    jbyteArray out_data = (*env)->NewByteArray(env, outputSize * 2);
    jbyte *out_data_ptr = (*env)->GetByteArrayElements(env, out_data, 0);
    src_float_to_short_array(out_data_float, (short *) out_data_ptr, outputSize);
    free(out_data_float);
    (*env)->ReleaseByteArrayElements(env, out_data, out_data_ptr, 0);
    if (error) {
        __android_log_write(ANDROID_LOG_ERROR, LOG_TAG, src_strerror(error));
    }
    return out_data;
}

JNIEXPORT jbyteArray JNICALL
Java_com_jackz314_resample_Resample_nativeProcessCopy(JNIEnv *env, jobject thiz, jlong state_ptr,
                                                      jbyteArray in_data) {
    SRC_STATE *state = (SRC_STATE *) state_ptr;
    SRC_DATA data;
    data.src_ratio = state->last_ratio;
    data.end_of_input = false;
    int inputLen = (*env)->GetArrayLength(env, in_data) / 2; // byte to short
    int outputLenEst = (int) ((state->last_ratio) * inputLen) + 5; // estimated output len
    data.input_frames = inputLen / state->channels;
    data.output_frames = outputLenEst / state->channels;
    float *out_data_float = malloc((state->last_ratio) * sizeof(float) * inputLen);
    data.data_out = out_data_float;
    float *in_data_float = malloc(inputLen * sizeof(float));
    short *in_data_ptr = (short *) (*env)->GetByteArrayElements(env, in_data, false);
    src_short_to_float_array(in_data_ptr, in_data_float, inputLen);
    data.data_in = in_data_float;
    if (!data.data_in || !data.data_out) {
        (*env)->ReleaseByteArrayElements(env, in_data, in_data_ptr, 0);
        free(in_data_float);
        free(out_data_float);
        __android_log_write(ANDROID_LOG_ERROR, LOG_TAG,
                            "GetPrimitiveArrayCritical failed, output array is null.");
        return NULL;
    }
    int error = src_process(state, &data);
    (*env)->ReleaseByteArrayElements(env, in_data, in_data_ptr, 0);
    free(in_data_float);
    int outputSize = data.output_frames_gen * state->channels;
    jbyteArray out_data = (*env)->NewByteArray(env, outputSize * 2);
    jbyte *out_data_ptr = (*env)->GetByteArrayElements(env, out_data, 0);
    src_float_to_short_array(out_data_float, (short *) out_data_ptr, outputSize);
    free(out_data_float);
    (*env)->ReleaseByteArrayElements(env, out_data, out_data_ptr, 0);
    if (error) {
        __android_log_write(ANDROID_LOG_ERROR, LOG_TAG, src_strerror(error));
    }
    return out_data;
}

JNIEXPORT jint JNICALL
Java_com_jackz314_resample_Resample_nativeProcess__JLjava_nio_ByteBuffer_2Ljava_nio_ByteBuffer_2(
        JNIEnv *env, jobject thiz, jlong state_ptr, jobject in_data, jobject out_data) {
    SRC_STATE *state = (SRC_STATE *) state_ptr;
    SRC_DATA data;
    data.src_ratio = state->last_ratio;
    data.end_of_input = false;
    int inputLen = getByteBufferLimit(env, in_data) / 2; // byte to short
    int outputLenEst = (int) ((state->last_ratio) * inputLen) + 5; // estimated output len
    data.input_frames = inputLen / state->channels;
    data.output_frames = outputLenEst / state->channels;
    float *out_data_float = malloc(outputLenEst * sizeof(float));
    data.data_out = out_data_float;
    short *in_data_ptr = (*env)->GetDirectBufferAddress(env, in_data);
    float *in_data_float = malloc(inputLen * sizeof(float));
    src_short_to_float_array(in_data_ptr, in_data_float, inputLen);
    data.data_in = in_data_float;
    if (!data.data_in || !data.data_out) {
        free(in_data_float);
        free(out_data_float);
        __android_log_write(ANDROID_LOG_ERROR, LOG_TAG, "get direct buffer failed, array is null.");
        return -1;
    }
    int error = src_process(state, &data);
    free(in_data_float);
    int outputSize = data.output_frames_gen * state->channels;
//    __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, "output size: %d", outputSize);
    short *out_data_ptr = (*env)->GetDirectBufferAddress(env, out_data);
    src_float_to_short_array(out_data_float, out_data_ptr, outputSize);
    free(out_data_float);
//    setByteBufferLimit(env, out_data, outputSize * 2); // short to byte
    if (error) {
        __android_log_write(ANDROID_LOG_ERROR, LOG_TAG, src_strerror(error));
    }
    return outputSize * 2; // short to byte
}

JNIEXPORT jint JNICALL
Java_com_jackz314_resample_Resample_nativeProcess__JLjava_nio_ByteBuffer_2Ljava_nio_ByteBuffer_2I(
        JNIEnv *env, jobject thiz, jlong state_ptr, jobject in_data, jobject out_data, jint in_size) {
    SRC_STATE *state = (SRC_STATE *) state_ptr;
    SRC_DATA data;
    data.src_ratio = state->last_ratio;
    data.end_of_input = false;
    int inputLen = in_size / 2; // byte to short
    int outputLenEst = (int) ((state->last_ratio) * inputLen) + 5; // estimated output len
    data.input_frames = inputLen / state->channels;
    data.output_frames = outputLenEst / state->channels;
    float *out_data_float = malloc(outputLenEst * sizeof(float));
    data.data_out = out_data_float;
    short *in_data_ptr = (*env)->GetDirectBufferAddress(env, in_data);
    float *in_data_float = malloc(inputLen * sizeof(float));
    src_short_to_float_array(in_data_ptr, in_data_float, inputLen);
    data.data_in = in_data_float;
    if (!data.data_in || !data.data_out) {
        free(in_data_float);
        free(out_data_float);
        __android_log_write(ANDROID_LOG_ERROR, LOG_TAG, "get direct buffer failed, array is null.");
        return -1;
    }
    int error = src_process(state, &data);
    free(in_data_float);
    int outputSize = data.output_frames_gen * state->channels;
//    __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, "output size: %d", outputSize);
    short *out_data_ptr = (*env)->GetDirectBufferAddress(env, out_data);
    src_float_to_short_array(out_data_float, out_data_ptr, outputSize);
    free(out_data_float);
//    setByteBufferLimit(env, out_data, outputSize * 2); // short to byte
    if (error) {
        __android_log_write(ANDROID_LOG_ERROR, LOG_TAG, src_strerror(error));
    }
    return outputSize * 2; // short to byte
}

JNIEXPORT jstring JNICALL
Java_com_jackz314_resample_Resample_errorMsg(JNIEnv *env, jclass clazz, jint err_no) {
    return (*env)->NewStringUTF(env, src_strerror(err_no));
}

//JNIEXPORT jint JNICALL
//Java_com_jackz314_resample_Resample_simpleResample__IIII_3B_3B(JNIEnv *env, jclass clazz,
//                                                               jint converter_type, jint channels,
//                                                               jint in_sample_rate,
//                                                               jint out_sample_rate,
//                                                               jbyteArray in_data,
//                                                               jbyteArray out_data) {
//}

JNIEXPORT jint JNICALL
Java_com_jackz314_resample_Resample_simpleResample(JNIEnv *env, jclass clazz, jint converter_type,
                                                   jint channels, jdouble convert_ratio,
                                                   jobject in_data, jobject out_data, jint in_size) {
    SRC_DATA data;
    data.src_ratio = convert_ratio;
    data.end_of_input = false;
    int inputLen = in_size / 2; // byte to short
    int outputLenEst = (int) (convert_ratio * inputLen) + 5; // estimated output len
    data.input_frames = inputLen / channels;
    data.output_frames = outputLenEst / channels;
    float *out_data_float = malloc(outputLenEst * sizeof(float));
    data.data_out = out_data_float;
    short *in_data_ptr = (*env)->GetDirectBufferAddress(env, in_data);
    float *in_data_float = malloc(inputLen * sizeof(float));
    src_short_to_float_array(in_data_ptr, in_data_float, inputLen);
    data.data_in = in_data_float;
    if (!data.data_in || !data.data_out) {
        free(in_data_float);
        free(out_data_float);
        __android_log_write(ANDROID_LOG_ERROR, LOG_TAG, "get direct buffer failed, output is null.");
        return -1;
    }
    int error = src_simple(&data, converter_type, channels);
    free(in_data_float);
    int outputSize = data.output_frames_gen * channels;
//    __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, "output size: %d", outputSize);
    short *out_data_ptr = (*env)->GetDirectBufferAddress(env, out_data);
    src_float_to_short_array(out_data_float, out_data_ptr, outputSize);
    free(out_data_float);
//    setByteBufferLimit(env, out_data, outputSize * 2); // short to byte
    if (error) {
        __android_log_write(ANDROID_LOG_ERROR, LOG_TAG, src_strerror(error));
    }
    return outputSize * 2; // short to byte
}


JNIEXPORT jboolean JNICALL
Java_com_jackz314_resample_Resample_isValidRatio(JNIEnv *env, jclass clazz, jint in_sample_rate,
                                                 jint out_sample_rate) {
    return src_is_valid_ratio(getConvertRatio(in_sample_rate, out_sample_rate));
}

JNIEXPORT void JNICALL
Java_com_jackz314_resample_Resample_nativeClose(JNIEnv *env, jobject thiz, jlong state) {
    src_delete((SRC_STATE *) state);
}

#ifdef __cplusplus
}
#endif