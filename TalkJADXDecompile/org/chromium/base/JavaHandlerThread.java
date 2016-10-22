package org.chromium.base;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;
import otq;
import otr;

@JNINamespace
public class JavaHandlerThread {
    public final HandlerThread a;

    private native void nativeInitializeThread(long j, long j2);

    private native void nativeStopThread(long j, long j2);

    private JavaHandlerThread(String str) {
        this.a = new HandlerThread(str);
    }

    @CalledByNative
    private static JavaHandlerThread create(String str) {
        return new JavaHandlerThread(str);
    }

    @CalledByNative
    private void start(long j, long j2) {
        this.a.start();
        new Handler(this.a.getLooper()).post(new otq(this, j, j2));
    }

    @CalledByNative
    private void stop(long j, long j2) {
        boolean z = VERSION.SDK_INT >= 18;
        new Handler(this.a.getLooper()).post(new otr(this, j, j2, z));
        if (z) {
            this.a.quitSafely();
        }
    }
}
