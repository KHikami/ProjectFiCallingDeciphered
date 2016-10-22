package org.chromium.net.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;
import org.chromium.net.CronetEngine.Builder;
import owp;

@Deprecated
@JNINamespace
public class ChromiumUrlRequestContext {
    public long a;

    private native long nativeCreateRequestContextAdapter(String str, int i, long j);

    private native String nativeGetStatisticsJSON(String str);

    private native void nativeInitRequestContextOnMainThread(long j);

    private native void nativeInitializeStatistics();

    private native void nativeReleaseRequestContextAdapter(long j);

    private native void nativeStartNetLogToFile(long j, String str, boolean z);

    private native void nativeStopNetLog(long j);

    protected ChromiumUrlRequestContext(Context context, String str, Builder builder) {
        int i = 3;
        CronetLibraryLoader.a(context, builder);
        if (Log.isLoggable("ChromiumNetwork", 2)) {
            i = -2;
        } else if (Log.isLoggable("ChromiumNetwork", 3)) {
            i = -1;
        }
        this.a = nativeCreateRequestContextAdapter(str, i, CronetUrlRequestContext.a(context, builder));
        if (this.a == 0) {
            throw new NullPointerException("Context Adapter creation failed");
        }
        new Handler(Looper.getMainLooper()).post(new owp(this));
    }

    @CalledByNative
    private void initNetworkThread() {
        Thread.currentThread().setName("ChromiumNet");
        Process.setThreadPriority(10);
    }

    protected void finalize() {
        if (this.a != 0) {
            nativeReleaseRequestContextAdapter(this.a);
        }
        super.finalize();
    }
}
