package org.chromium.net.impl;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import gwb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;
import org.chromium.base.annotations.NativeClassQualifiedName;
import org.chromium.base.annotations.UsedByReflection;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetEngine.Builder;
import org.chromium.net.CronetEngine.Builder.Pkp;
import org.chromium.net.CronetEngine.Builder.QuicHint;
import org.chromium.net.NetworkQualityRttListener;
import org.chromium.net.NetworkQualityThroughputListener;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.RequestFinishedInfo$Listener;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequest.Callback;
import otu;
import oxm;
import oxn;
import oxo;
import oxp;

@UsedByReflection
@JNINamespace
public class CronetUrlRequestContext extends CronetEngine {
    public final Object a;
    public long b;
    private final ConditionVariable c;
    private final AtomicInteger d;
    private Thread e;
    private boolean f;
    private final Object g;
    private final Object h;
    private int i;
    private final otu<NetworkQualityRttListener> j;
    private final otu<NetworkQualityThroughputListener> k;
    private final List<RequestFinishedInfo$Listener> l;
    private ConditionVariable m;
    private String n;
    private ConditionVariable o;
    private boolean p;
    private boolean q;

    private static native void nativeAddPkp(long j, String str, byte[][] bArr, boolean z, long j2);

    private static native void nativeAddQuicHint(long j, String str, int i, int i2);

    @NativeClassQualifiedName
    private native void nativeConfigureNetworkQualityEstimatorForTesting(long j, boolean z, boolean z2);

    private static native long nativeCreateRequestContextAdapter(long j);

    private static native long nativeCreateRequestContextConfig(String str, String str2, boolean z, String str3, boolean z2, boolean z3, String str4, String str5, String str6, String str7, boolean z4, int i, long j, String str8, long j2, boolean z5, boolean z6, String str9);

    @NativeClassQualifiedName
    private native void nativeDestroy(long j);

    @NativeClassQualifiedName
    private native void nativeGetCertVerifierData(long j);

    private static native byte[] nativeGetHistogramDeltas();

    @NativeClassQualifiedName
    private native void nativeInitRequestContextOnMainThread(long j);

    @NativeClassQualifiedName
    private native void nativeProvideRTTObservations(long j, boolean z);

    @NativeClassQualifiedName
    private native void nativeProvideThroughputObservations(long j, boolean z);

    private static native int nativeSetMinLogLevel(int i);

    @NativeClassQualifiedName
    private native void nativeStartNetLogToDisk(long j, String str, boolean z, int i);

    @NativeClassQualifiedName
    private native void nativeStartNetLogToFile(long j, String str, boolean z);

    @NativeClassQualifiedName
    private native void nativeStopNetLog(long j);

    @UsedByReflection
    public CronetUrlRequestContext(Builder builder) {
        int i = 3;
        this.a = new Object();
        this.c = new ConditionVariable(false);
        this.d = new AtomicInteger(0);
        this.b = 0;
        this.g = new Object();
        this.h = new Object();
        this.i = 0;
        this.j = new otu();
        this.k = new otu();
        this.l = new ArrayList();
        this.m = new ConditionVariable();
        CronetLibraryLoader.a(builder.x(), builder);
        if (Log.isLoggable("ChromiumNetwork", 2)) {
            i = -2;
        } else if (Log.isLoggable("ChromiumNetwork", 3)) {
            i = -1;
        }
        nativeSetMinLogLevel(i);
        synchronized (this.a) {
            this.b = nativeCreateRequestContextAdapter(a(builder.x(), builder));
            if (this.b == 0) {
                throw new NullPointerException("Context Adapter creation failed.");
            }
            this.f = builder.v();
        }
        oxm oxm = new oxm(this, builder);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            oxm.run();
        } else {
            new Handler(Looper.getMainLooper()).post(oxm);
        }
    }

    public static long a(Context context, Builder builder) {
        long nativeCreateRequestContextConfig = nativeCreateRequestContextConfig(builder.b(), builder.c(), builder.g(), builder.a(context), builder.h(), builder.i(), builder.j(), builder.k(), builder.l(), builder.m(), builder.n(), builder.p(), builder.o(), builder.t(), builder.u(), builder.v(), builder.s(), builder.w());
        for (QuicHint quicHint : builder.q()) {
            nativeAddQuicHint(nativeCreateRequestContextConfig, quicHint.a, quicHint.b, quicHint.c);
        }
        for (Pkp pkp : builder.r()) {
            nativeAddPkp(nativeCreateRequestContextConfig, pkp.a, pkp.b, pkp.c, pkp.d.getTime());
        }
        return nativeCreateRequestContextConfig;
    }

    public UrlRequest a(String str, Callback callback, Executor executor, int i, Collection<Object> collection, boolean z, boolean z2) {
        CronetUrlRequest cronetUrlRequest;
        synchronized (this.a) {
            boolean z3;
            h();
            synchronized (this.h) {
                z3 = !this.l.isEmpty();
            }
            cronetUrlRequest = new CronetUrlRequest(this, str, i, callback, executor, collection, z3, z, z2);
        }
        return cronetUrlRequest;
    }

    public BidirectionalStream a(String str, BidirectionalStream.Callback callback, Executor executor, String str2, List<Entry<String, String>> list, int i, boolean z) {
        CronetBidirectionalStream cronetBidirectionalStream;
        synchronized (this.a) {
            h();
            cronetBidirectionalStream = new CronetBidirectionalStream(this, str, i, callback, executor, str2, list, z);
        }
        return cronetBidirectionalStream;
    }

    public boolean a() {
        return VERSION.SDK_INT >= 14;
    }

    public String b() {
        return "Cronet/" + gwb.aW();
    }

    public void c() {
        synchronized (this.a) {
            h();
            if (this.d.get() != 0) {
                throw new IllegalStateException("Cannot shutdown with active requests.");
            } else if (Thread.currentThread() == this.e) {
                throw new IllegalThreadStateException("Cannot shutdown from network thread.");
            }
        }
        this.c.block();
        d();
        synchronized (this.a) {
            if (i()) {
                nativeDestroy(this.b);
                this.b = 0;
                return;
            }
        }
    }

    public void d() {
        synchronized (this.a) {
            if (this.p) {
                h();
                nativeStopNetLog(this.b);
                this.p = false;
                if (this.q) {
                    this.o = new ConditionVariable();
                    this.o.block();
                    return;
                }
                return;
            }
        }
    }

    @CalledByNative
    public void stopNetLogCompleted() {
        synchronized (this.a) {
            this.q = false;
        }
        this.o.open();
    }

    public void a(RequestFinishedInfo$Listener requestFinishedInfo$Listener) {
        synchronized (this.h) {
            this.l.add(requestFinishedInfo$Listener);
        }
    }

    void e() {
        this.d.incrementAndGet();
    }

    void f() {
        this.d.decrementAndGet();
    }

    public long g() {
        long j;
        synchronized (this.a) {
            h();
            j = this.b;
        }
        return j;
    }

    private void h() {
        if (!i()) {
            throw new IllegalStateException("Engine is shut down.");
        }
    }

    private boolean i() {
        return this.b != 0;
    }

    @CalledByNative
    private void initNetworkThread() {
        synchronized (this.a) {
            this.e = Thread.currentThread();
            this.c.open();
        }
        Thread.currentThread().setName("ChromiumNet");
        Process.setThreadPriority(10);
    }

    @CalledByNative
    private void onEffectiveConnectionTypeChanged(int i) {
        synchronized (this.g) {
            this.i = i;
        }
    }

    @CalledByNative
    private void onRttObservation(int i, long j, int i2) {
        synchronized (this.g) {
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                NetworkQualityRttListener networkQualityRttListener = (NetworkQualityRttListener) it.next();
                a(networkQualityRttListener.a(), new oxn(this, networkQualityRttListener, i, j, i2));
            }
        }
    }

    @CalledByNative
    private void onThroughputObservation(int i, long j, int i2) {
        synchronized (this.g) {
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                NetworkQualityThroughputListener networkQualityThroughputListener = (NetworkQualityThroughputListener) it.next();
                a(networkQualityThroughputListener.a(), new oxo(this, networkQualityThroughputListener, i, j, i2));
            }
        }
    }

    @CalledByNative
    private void onGetCertVerifierData(String str) {
        this.n = str;
        this.m.open();
    }

    void a(CronetUrlRequest cronetUrlRequest) {
        ArrayList arrayList;
        RequestFinishedInfo f = cronetUrlRequest.f();
        synchronized (this.h) {
            arrayList = new ArrayList(this.l);
        }
        arrayList = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            RequestFinishedInfo$Listener requestFinishedInfo$Listener = (RequestFinishedInfo$Listener) obj;
            a(requestFinishedInfo$Listener.a(), new oxp(this, requestFinishedInfo$Listener, f));
        }
    }

    private static void a(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable e) {
            Log.e("ChromiumNetwork", "Exception posting task to executor", e);
        }
    }
}
