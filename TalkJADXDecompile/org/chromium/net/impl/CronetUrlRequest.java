package org.chromium.net.impl;

import android.os.SystemClock;
import android.util.Log;
import com.google.api.client.http.HttpMethods;
import java.nio.ByteBuffer;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.Executor;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;
import org.chromium.base.annotations.NativeClassQualifiedName;
import org.chromium.net.Preconditions;
import org.chromium.net.QuicException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.RequestFinishedInfo.Metrics;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequest.Callback;
import org.chromium.net.UrlRequest.StatusListener;
import org.chromium.net.UrlRequestException;
import org.chromium.net.UrlResponseInfo;
import oxd;
import oxe;
import oxf;
import oxg;
import oxh;
import oxi;
import oxj;
import oxk;
import oxl;
import wi;

@JNINamespace
public final class CronetUrlRequest implements UrlRequest {
    private static final Metrics i;
    public long a;
    public boolean b;
    public boolean c;
    public final oxl d;
    public final Object e;
    public final Callback f;
    public CronetUploadDataStream g;
    public UrlResponseInfo h;
    private boolean j;
    private final CronetUrlRequestContext k;
    private final Executor l;
    private final List<String> m;
    private long n;
    private final String o;
    private final int p;
    private String q;
    private final HeadersList r;
    private final Collection<Object> s;
    private final boolean t;
    private final boolean u;
    private oxk v;
    private Runnable w;

    @NativeClassQualifiedName
    private native boolean nativeAddRequestHeader(long j, String str, String str2);

    private native long nativeCreateRequestAdapter(long j, String str, int i, boolean z, boolean z2);

    @NativeClassQualifiedName
    private native void nativeDestroy(long j, boolean z);

    @NativeClassQualifiedName
    private native void nativeFollowDeferredRedirect(long j);

    @NativeClassQualifiedName
    private native void nativeGetStatus(long j, StatusListener statusListener);

    @NativeClassQualifiedName
    private native boolean nativeReadData(long j, ByteBuffer byteBuffer, int i, int i2);

    @NativeClassQualifiedName
    private native boolean nativeSetHttpMethod(long j, String str);

    @NativeClassQualifiedName
    private native void nativeStart(long j);

    static {
        i = new Metrics(null, null, null, null);
    }

    CronetUrlRequest(CronetUrlRequestContext cronetUrlRequestContext, String str, int i, Callback callback, Executor executor, Collection<Object> collection, boolean z, boolean z2, boolean z3) {
        int i2 = 0;
        this.j = false;
        this.b = false;
        this.c = false;
        this.e = new Object();
        this.m = new ArrayList();
        this.r = new HeadersList();
        if (str == null) {
            throw new NullPointerException("URL is required");
        } else if (callback == null) {
            throw new NullPointerException("Listener is required");
        } else if (executor == null) {
            throw new NullPointerException("Executor is required");
        } else if (collection == null) {
            throw new NullPointerException("requestAnnotations is required");
        } else {
            oxl oxl;
            this.k = cronetUrlRequestContext;
            this.o = str;
            this.m.add(str);
            switch (i) {
                case wi.w /*0*/:
                    break;
                case wi.j /*1*/:
                    i2 = 1;
                    break;
                case wi.l /*2*/:
                    i2 = 2;
                    break;
                case wi.z /*3*/:
                    i2 = 3;
                    break;
                case wi.h /*4*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 3;
                    break;
            }
            this.p = i2;
            this.f = callback;
            this.l = executor;
            this.s = collection;
            if (z) {
                oxl = new oxl(this);
            } else {
                oxl = null;
            }
            this.d = oxl;
            this.t = z2;
            this.u = z3;
        }
    }

    public void a(String str) {
        g();
        if (str == null) {
            throw new NullPointerException("Method is required.");
        }
        this.q = str;
    }

    public void a(String str, String str2) {
        g();
        if (str == null) {
            throw new NullPointerException("Invalid header name.");
        } else if (str2 == null) {
            throw new NullPointerException("Invalid header value.");
        } else {
            this.r.add(new SimpleImmutableEntry(str, str2));
        }
    }

    public void a(UploadDataProvider uploadDataProvider, Executor executor) {
        if (uploadDataProvider == null) {
            throw new NullPointerException("Invalid UploadDataProvider.");
        }
        if (this.q == null) {
            this.q = HttpMethods.POST;
        }
        this.g = new CronetUploadDataStream(uploadDataProvider, executor);
    }

    public void a() {
        synchronized (this.e) {
            g();
            try {
                this.a = nativeCreateRequestAdapter(this.k.g(), this.o, this.p, this.t, this.u);
                this.k.e();
                if (this.q == null || nativeSetHttpMethod(this.a, this.q)) {
                    Iterator it = this.r.iterator();
                    Object obj = null;
                    while (it.hasNext()) {
                        Object obj2;
                        Entry entry = (Entry) it.next();
                        if (!((String) entry.getKey()).equalsIgnoreCase("Content-Type") || ((String) entry.getValue()).isEmpty()) {
                            obj2 = obj;
                        } else {
                            obj2 = 1;
                        }
                        if (nativeAddRequestHeader(this.a, (String) entry.getKey(), (String) entry.getValue())) {
                            obj = obj2;
                        } else {
                            throw new IllegalArgumentException("Invalid header " + ((String) entry.getKey()) + "=" + ((String) entry.getValue()));
                        }
                    }
                    if (this.g == null) {
                        this.j = true;
                        c();
                        return;
                    } else if (obj == null) {
                        throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
                    } else {
                        this.j = true;
                        this.g.a(new oxd(this));
                        return;
                    }
                }
                throw new IllegalArgumentException("Invalid http method " + this.q);
            } catch (RuntimeException e) {
                a(false);
                throw e;
            }
        }
    }

    public void c() {
        if (this.d != null) {
            oxl oxl = this.d;
            if (oxl.a != null) {
                throw new IllegalStateException("onRequestStarted called repeatedly");
            }
            oxl.a = Long.valueOf(SystemClock.elapsedRealtime());
        }
        nativeStart(this.a);
    }

    public void b() {
        synchronized (this.e) {
            if (this.b) {
                this.b = false;
                if (d()) {
                    return;
                }
                nativeFollowDeferredRedirect(this.a);
                return;
            }
            throw new IllegalStateException("No redirect to follow.");
        }
    }

    public void a(ByteBuffer byteBuffer) {
        Preconditions.b(byteBuffer);
        Preconditions.a(byteBuffer);
        synchronized (this.e) {
            if (this.c) {
                this.c = false;
                if (d()) {
                    return;
                }
                if (nativeReadData(this.a, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                    return;
                } else {
                    this.c = true;
                    throw new IllegalArgumentException("Unable to call native read");
                }
            }
            throw new IllegalStateException("Unexpected read attempt.");
        }
    }

    public void e() {
        synchronized (this.e) {
            if (d() || !this.j) {
                return;
            }
            a(true);
        }
    }

    public boolean d() {
        return this.j && this.a == 0;
    }

    private void a(Runnable runnable) {
        try {
            this.l.execute(runnable);
        } catch (Throwable e) {
            Log.e("ChromiumNetwork", "Exception posting task to executor", e);
            a(false);
        }
    }

    private UrlResponseInfo a(int i, String str, String[] strArr, boolean z, String str2, String str3) {
        HeadersList headersList = new HeadersList();
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            headersList.add(new SimpleImmutableEntry(strArr[i2], strArr[i2 + 1]));
        }
        return new UrlResponseInfo(new ArrayList(this.m), i, str, headersList, z, str2, str3);
    }

    private void g() {
        synchronized (this.e) {
            if (this.j || d()) {
                throw new IllegalStateException("Request is already started.");
            }
        }
    }

    public void a(boolean z) {
        synchronized (this.e) {
            if (this.a == 0) {
                return;
            }
            if (this.d != null) {
                oxl oxl = this.d;
                if (oxl.a != null && oxl.c == null) {
                    oxl.c = Long.valueOf(SystemClock.elapsedRealtime() - oxl.a.longValue());
                }
            }
            nativeDestroy(this.a, z);
            this.k.a(this);
            this.k.f();
            this.a = 0;
            if (this.w != null) {
                this.w.run();
            }
        }
    }

    public void a(Exception exception) {
        UrlRequestException urlRequestException = new UrlRequestException("Exception received from UrlRequest.Callback", exception);
        Log.e("ChromiumNetwork", "Exception in CalledByNative method", exception);
        synchronized (this.e) {
            if (d()) {
                return;
            }
            a(false);
            try {
                this.f.a(this, this.h, urlRequestException);
            } catch (Throwable e) {
                Log.e("ChromiumNetwork", "Exception notifying of failed request", e);
            }
        }
    }

    void a(Throwable th) {
        UrlRequestException urlRequestException = new UrlRequestException("Exception received from UploadDataProvider", th);
        Log.e("ChromiumNetwork", "Exception in upload method", th);
        a(urlRequestException);
    }

    private void a(UrlRequestException urlRequestException) {
        a(new oxe(this, urlRequestException));
    }

    @CalledByNative
    private void onRedirectReceived(String str, int i, String str2, String[] strArr, boolean z, String str3, String str4, long j) {
        UrlResponseInfo a = a(i, str2, strArr, z, str3, str4);
        this.n += j;
        a.a(this.n);
        this.m.add(str);
        a(new oxf(this, a, str));
    }

    @CalledByNative
    private void onResponseStarted(int i, String str, String[] strArr, boolean z, String str2, String str3) {
        this.h = a(i, str, strArr, z, str2, str3);
        a(new oxg(this));
    }

    @CalledByNative
    private void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        this.h.a(this.n + j);
        if (byteBuffer.position() == i2 && byteBuffer.limit() == i3) {
            if (this.v == null) {
                this.v = new oxk(this);
            }
            byteBuffer.position(i2 + i);
            this.v.a = byteBuffer;
            a(this.v);
            return;
        }
        a(new UrlRequestException("ByteBuffer modified externally during read", null));
    }

    @CalledByNative
    private void onSucceeded(long j) {
        this.h.a(this.n + j);
        a(new oxh(this));
    }

    @CalledByNative
    private void onError(int i, int i2, int i3, String str, long j) {
        if (this.h != null) {
            this.h.a(this.n + j);
        }
        if (i == 10) {
            a(new QuicException("Exception in CronetUrlRequest: " + str, i2, i3));
        } else {
            a(new UrlRequestException("Exception in CronetUrlRequest: " + str, i, i2));
        }
    }

    @CalledByNative
    private void onCanceled() {
        a(new oxi(this));
    }

    @CalledByNative
    private void onStatus(StatusListener statusListener, int i) {
        a(new oxj(this, statusListener, i));
    }

    RequestFinishedInfo f() {
        Metrics metrics;
        String str = this.o;
        Collection collection = this.s;
        if (this.d != null) {
            oxl oxl = this.d;
            metrics = new Metrics(oxl.b, oxl.c, null, Long.valueOf(oxl.d.h != null ? oxl.d.h.g() : 0));
        } else {
            metrics = i;
        }
        return new RequestFinishedInfo(str, collection, metrics, this.h);
    }
}
