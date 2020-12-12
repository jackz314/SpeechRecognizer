package com.google.speech.recognizer;

import java.util.logging.Logger;

@SuppressWarnings("JavaJniMissingFunction") // using third party library
public abstract class AbstractRecognizer {

    private static final Logger logger = Logger.getLogger(AbstractRecognizer.class.getName());

    static public String TAG = "AbstractRecognizer";

    private long nativeObj;

    private native int nativeCancel(final long nativeObj);

    private native long nativeConstruct();

    private native void nativeDelete(final long nativeObj);

    private native int nativeInitFromProto(final long nativeObj, final long resourceNativeObj, final byte[] config);

    private native byte[] nativeRun(final long nativeObj, final byte[] params);

    private native void nativeInit(final long nativeObj);

    public AbstractRecognizer() {
        this.nativeObj = this.nativeConstruct();
    }

    private final void validate() {
        if (this.nativeObj != 0L) {
            return;
        }
        throw new IllegalStateException("recognizer is not initialized");
    }

    public final byte[] run(final byte[] params) {
        this.validate();
        return this.nativeRun(this.nativeObj, params);
    }

    public final int init(final byte[] array, final ResourceManager resourceManager) {
        this.validate();
        return this.nativeInitFromProto(
                this.nativeObj,
                resourceManager.nativeObj,
                array
        );
    }

    public final void delete() {
        synchronized (this) {
            if (this.nativeObj != 0L) {
                this.nativeDelete(this.nativeObj);
                this.nativeObj = 0L;
            }
        }
    }

    public final int cancel() {
        this.validate();
        //return fgg.instanceId(this.nativeCancel(this.instanceId));
        return this.nativeCancel(this.nativeObj);
    }

    @Override
    protected void finalize() {
        this.delete();
    }

    public abstract void handleAudioLevelEvent(final byte[] array);

    public abstract void handleEndpointerEvent(final byte[] array);

    public abstract void handleHotwordEvent(final byte[] array);

    public abstract void handleRecognitionEvent(final byte[] array);

    public abstract int read(final byte[] buffer);

}
