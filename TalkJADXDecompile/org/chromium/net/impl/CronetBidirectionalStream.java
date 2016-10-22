package org.chromium.net.impl;

import com.google.api.client.http.HttpMethods;
import java.nio.ByteBuffer;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;
import org.chromium.base.annotations.NativeClassQualifiedName;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.BidirectionalStream.Callback;
import org.chromium.net.CronetException;
import org.chromium.net.Preconditions;
import org.chromium.net.QuicException;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.UrlResponseInfo.HeaderBlock;
import ots;
import owq;
import owr;
import ows;
import owt;
import owu;
import owv;
import oww;
import owx;
import wi;

@JNINamespace
public class CronetBidirectionalStream extends BidirectionalStream {
    public final Callback a;
    public final String b;
    public final Object c;
    public boolean d;
    public int e;
    public int f;
    public UrlResponseInfo g;
    private final CronetUrlRequestContext h;
    private final Executor i;
    private final String j;
    private final int k;
    private final String[] l;
    private final boolean m;
    private LinkedList<ByteBuffer> n;
    private LinkedList<ByteBuffer> o;
    private boolean p;
    private long q;
    private owv r;
    private Runnable s;

    private native long nativeCreateBidirectionalStream(long j, boolean z);

    @NativeClassQualifiedName
    private native void nativeDestroy(long j, boolean z);

    @NativeClassQualifiedName
    private native boolean nativeReadData(long j, ByteBuffer byteBuffer, int i, int i2);

    @NativeClassQualifiedName
    private native void nativeSendRequestHeaders(long j);

    @NativeClassQualifiedName
    private native int nativeStart(long j, String str, int i, String str2, String[] strArr, boolean z);

    @NativeClassQualifiedName
    private native boolean nativeWritevData(long j, ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2, boolean z);

    CronetBidirectionalStream(CronetUrlRequestContext cronetUrlRequestContext, String str, int i, Callback callback, Executor executor, String str2, List<Entry<String, String>> list, boolean z) {
        int i2;
        this.c = new Object();
        this.e = owx.a;
        this.f = owx.a;
        this.h = cronetUrlRequestContext;
        this.j = str;
        switch (i) {
            case wi.w /*0*/:
                i2 = 0;
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
                throw new IllegalArgumentException("Invalid stream priority.");
        }
        this.k = i2;
        this.a = callback;
        this.i = executor;
        this.b = str2;
        this.l = a((List) list);
        this.m = z;
        this.n = new LinkedList();
        this.o = new LinkedList();
    }

    public void a() {
        boolean z = true;
        synchronized (this.c) {
            if (this.e != owx.a) {
                throw new IllegalStateException("Stream is already started.");
            }
            try {
                this.q = nativeCreateBidirectionalStream(this.h.g(), !this.m);
                this.h.e();
                long j = this.q;
                String str = this.j;
                int i = this.k;
                String str2 = this.b;
                String[] strArr = this.l;
                if (a(this.b)) {
                    z = false;
                }
                int nativeStart = nativeStart(j, str, i, str2, strArr, z);
                if (nativeStart == -1) {
                    throw new IllegalArgumentException("Invalid http method " + this.b);
                } else if (nativeStart > 0) {
                    nativeStart--;
                    throw new IllegalArgumentException("Invalid header " + this.l[nativeStart] + "=" + this.l[nativeStart + 1]);
                } else {
                    nativeStart = owx.b;
                    this.f = nativeStart;
                    this.e = nativeStart;
                }
            } catch (RuntimeException e) {
                a(false);
                throw e;
            }
        }
    }

    public void a(ByteBuffer byteBuffer) {
        synchronized (this.c) {
            Preconditions.b(byteBuffer);
            Preconditions.a(byteBuffer);
            if (this.e != owx.c) {
                throw new IllegalStateException("Unexpected read attempt.");
            } else if (d()) {
            } else {
                if (this.r == null) {
                    this.r = new owv(this);
                }
                this.e = owx.d;
                if (nativeReadData(this.q, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                } else {
                    this.e = owx.c;
                    throw new IllegalArgumentException("Unable to call native read");
                }
            }
        }
    }

    public void a(ByteBuffer byteBuffer, boolean z) {
        synchronized (this.c) {
            Preconditions.a(byteBuffer);
            if (!byteBuffer.hasRemaining() && !z) {
                throw new IllegalArgumentException("Empty buffer before end of stream.");
            } else if (this.p) {
                throw new IllegalArgumentException("Write after writing end of stream.");
            } else if (d()) {
            } else {
                this.n.add(byteBuffer);
                if (z) {
                    this.p = true;
                }
            }
        }
    }

    public void b() {
        synchronized (this.c) {
            if (d() || !(this.f == owx.i || this.f == owx.j)) {
            } else if (this.n.isEmpty() && this.o.isEmpty()) {
                if (!this.d) {
                    this.d = true;
                    nativeSendRequestHeaders(this.q);
                    if (!a(this.b)) {
                        this.f = owx.k;
                    }
                }
            } else {
                if (!this.n.isEmpty()) {
                    this.o.addAll(this.n);
                    this.n.clear();
                }
                if (this.f == owx.j) {
                    return;
                }
                f();
            }
        }
    }

    private void f() {
        boolean z = true;
        int size = this.o.size();
        ByteBuffer[] byteBufferArr = new ByteBuffer[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        for (int i = 0; i < size; i++) {
            ByteBuffer byteBuffer = (ByteBuffer) this.o.poll();
            byteBufferArr[i] = byteBuffer;
            iArr[i] = byteBuffer.position();
            iArr2[i] = byteBuffer.limit();
        }
        this.f = owx.j;
        this.d = true;
        long j = this.q;
        if (!(this.p && this.n.isEmpty())) {
            z = false;
        }
        if (!nativeWritevData(j, byteBufferArr, iArr, iArr2, z)) {
            this.f = owx.i;
            throw new IllegalArgumentException("Unable to call native writev.");
        }
    }

    public void c() {
        synchronized (this.c) {
            if (d() || this.e == owx.a) {
                return;
            }
            int i = owx.f;
            this.f = i;
            this.e = i;
            a(true);
        }
    }

    public boolean d() {
        return this.e != owx.a && this.q == 0;
    }

    public void e() {
        synchronized (this.c) {
            if (d()) {
            } else if (this.f == owx.k && this.e == owx.e) {
                int i = owx.h;
                this.f = i;
                this.e = i;
                a(false);
                try {
                    this.a.a(this.g);
                } catch (Exception e) {
                    ots.d("ChromiumNetwork", "Exception in onSucceeded method", new Object[]{e});
                }
            }
        }
    }

    @CalledByNative
    private void onStreamReady(boolean z) {
        a(new owq(this, z));
    }

    @CalledByNative
    private void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        this.g.a(j);
        if (byteBuffer.position() != i2 || byteBuffer.limit() != i3) {
            b(new CronetException("ByteBuffer modified externally during read", null));
        } else if (i < 0 || i2 + i > i3) {
            b(new CronetException("Invalid number of bytes read", null));
        } else {
            byteBuffer.position(i2 + i);
            this.r.a = byteBuffer;
            this.r.b = i == 0;
            a(this.r);
        }
    }

    @CalledByNative
    private void onWritevCompleted(ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2, boolean z) {
        synchronized (this.c) {
            this.f = owx.i;
            if (!this.o.isEmpty()) {
                f();
            }
        }
        int i = 0;
        while (i < byteBufferArr.length) {
            ByteBuffer byteBuffer = byteBufferArr[i];
            if (byteBuffer.position() == iArr[i] && byteBuffer.limit() == iArr2[i]) {
                byteBuffer.position(byteBuffer.limit());
                boolean z2 = z && i == byteBufferArr.length - 1;
                a(new oww(this, byteBuffer, z2));
                i++;
            } else {
                b(new CronetException("ByteBuffer modified externally during write", null));
                return;
            }
        }
    }

    @CalledByNative
    private void onResponseTrailersReceived(String[] strArr) {
        a(new ows(this, new HeaderBlock(a(strArr))));
    }

    @CalledByNative
    private void onError(int i, int i2, int i3, String str, long j) {
        if (this.g != null) {
            this.g.a(j);
        }
        if (i == 10) {
            b(new QuicException("Exception in BidirectionalStream: " + str, i2, i3));
        } else {
            b(new CronetException("Exception in BidirectionalStream: " + str, i, i2));
        }
    }

    @CalledByNative
    private void onCanceled() {
        a(new owt(this));
    }

    public static boolean a(String str) {
        return (str.equals(HttpMethods.GET) || str.equals(HttpMethods.HEAD)) ? false : true;
    }

    private static ArrayList<Entry<String, String>> a(String[] strArr) {
        ArrayList<Entry<String, String>> arrayList = new ArrayList(strArr.length / 2);
        for (int i = 0; i < strArr.length; i += 2) {
            arrayList.add(new SimpleImmutableEntry(strArr[i], strArr[i + 1]));
        }
        return arrayList;
    }

    private static String[] a(List<Entry<String, String>> list) {
        String[] strArr = new String[(list.size() << 1)];
        int i = 0;
        for (Entry entry : list) {
            int i2 = i + 1;
            strArr[i] = (String) entry.getKey();
            int i3 = i2 + 1;
            strArr[i2] = (String) entry.getValue();
            i = i3;
        }
        return strArr;
    }

    private void a(Runnable runnable) {
        try {
            this.i.execute(runnable);
        } catch (RejectedExecutionException e) {
            ots.d("ChromiumNetwork", "Exception posting task to executor", new Object[]{e});
            synchronized (this.c) {
            }
            int i = owx.g;
            this.f = i;
            this.e = i;
            a(false);
        }
    }

    private void a(boolean z) {
        ots.b("ChromiumNetwork", "destroyNativeStreamLocked " + toString(), new Object[0]);
        if (this.q != 0) {
            nativeDestroy(this.q, z);
            this.q = 0;
            this.h.f();
            if (this.s != null) {
                this.s.run();
            }
        }
    }

    public void a(CronetException cronetException) {
        synchronized (this.c) {
            if (d()) {
                return;
            }
            int i = owx.g;
            this.f = i;
            this.e = i;
            a(false);
            try {
                this.a.a(cronetException);
            } catch (Exception e) {
                ots.d("ChromiumNetwork", "Exception notifying of failed request", new Object[]{e});
            }
        }
    }

    public void a(Exception exception) {
        CronetException cronetException = new CronetException("CalledByNative method has thrown an exception", exception);
        ots.d("ChromiumNetwork", "Exception in CalledByNative method", new Object[]{exception});
        a(cronetException);
    }

    private void b(CronetException cronetException) {
        a(new owu(this, cronetException));
    }

    @CalledByNative
    private void onResponseHeadersReceived(int i, String str, String[] strArr, long j) {
        try {
            int i2 = i;
            UrlResponseInfo urlResponseInfo = new UrlResponseInfo(Arrays.asList(new String[]{this.j}), i2, "", a(strArr), false, str, null);
            urlResponseInfo.a(j);
            this.g = urlResponseInfo;
            a(new owr(this));
        } catch (Exception e) {
            b(new CronetException("Cannot prepare ResponseInfo", null));
        }
    }
}
