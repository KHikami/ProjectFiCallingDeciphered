package org.chromium.net.impl;

import android.util.Log;
import com.google.api.client.http.HttpStatusCodes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.List;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;
import org.chromium.net.ChunkedWritableByteChannel;
import org.chromium.net.HttpUrlRequest;

@Deprecated
@JNINamespace
public class ChromiumUrlRequest implements HttpUrlRequest {
    private long a;
    private final WritableByteChannel b;
    private ReadableByteChannel c;
    private IOException d;
    private volatile boolean e;
    private volatile boolean f;
    private boolean g;
    private boolean h;
    private long i;
    private long j;
    private boolean k;
    private boolean l;
    private boolean m;
    private long n;
    private boolean o;
    private int p;
    private String q;
    private String r;
    private long s;
    private int t;
    private String u;
    private final Object v;

    private native void nativeAddHeader(long j, String str, String str2);

    private native void nativeAppendChunk(long j, ByteBuffer byteBuffer, int i, boolean z);

    private native void nativeCancel(long j);

    private native long nativeCreateRequestAdapter(long j, String str, int i);

    private native void nativeDestroyRequestAdapter(long j);

    private native void nativeDisableRedirects(long j);

    private native void nativeEnableChunkedUpload(long j, String str);

    private native void nativeGetAllHeaders(long j, ResponseHeadersMap responseHeadersMap);

    private native long nativeGetContentLength(long j);

    private native String nativeGetContentType(long j);

    private native int nativeGetErrorCode(long j);

    private native String nativeGetErrorString(long j);

    private native String nativeGetHeader(long j, String str);

    private native int nativeGetHttpStatusCode(long j);

    private native String nativeGetHttpStatusText(long j);

    private native String nativeGetNegotiatedProtocol(long j);

    private native boolean nativeGetWasCached(long j);

    private native void nativeSetMethod(long j, String str);

    private native void nativeSetUploadChannel(long j, String str, long j2);

    private native void nativeSetUploadData(long j, String str, byte[] bArr);

    private native void nativeStart(long j);

    public WritableByteChannel a() {
        return this.b;
    }

    public void b() {
        synchronized (this.v) {
            if (this.e) {
                return;
            }
            this.e = true;
            if (this.a != 0) {
                nativeCancel(this.a);
            }
        }
    }

    private void c() {
        this.l = true;
        b();
    }

    private void a(Exception exception) {
        this.d = new IOException("CalledByNative method has thrown an exception", exception);
        Log.e("ChromiumNetwork", "Exception in CalledByNative method", exception);
        try {
            b();
        } catch (Throwable e) {
            Log.e("ChromiumNetwork", "Exception trying to cancel request", e);
        }
    }

    @CalledByNative
    private void onResponseStarted() {
        try {
            this.p = nativeGetHttpStatusCode(this.a);
            this.q = nativeGetHttpStatusText(this.a);
            this.r = nativeGetContentType(this.a);
            this.s = nativeGetContentLength(this.a);
            this.g = true;
            if (this.j <= 0 || this.s <= this.j || !this.k) {
                if (!(!this.h || this.s == -1 || this.l)) {
                    ((ChunkedWritableByteChannel) a()).a((int) this.s);
                }
                if (this.i == 0) {
                    return;
                }
                if (this.p == HttpStatusCodes.STATUS_CODE_OK) {
                    if (this.s != -1) {
                        this.s -= this.i;
                    }
                    this.m = true;
                    return;
                }
                this.n = this.i;
                return;
            }
            c();
        } catch (Exception e) {
            a(e);
        }
    }

    @CalledByNative
    private void onBytesRead(ByteBuffer byteBuffer) {
        Object obj = null;
        try {
            if (!this.l) {
                int remaining = byteBuffer.remaining();
                this.n += (long) remaining;
                if (this.m) {
                    if (this.n > this.i) {
                        this.m = false;
                        byteBuffer.position((int) (this.i - (this.n - ((long) remaining))));
                    } else {
                        return;
                    }
                }
                if (this.j != 0 && this.n > this.j) {
                    obj = 1;
                }
                if (obj != null) {
                    byteBuffer.limit(remaining - ((int) (this.n - this.j)));
                }
                while (byteBuffer.hasRemaining()) {
                    this.b.write(byteBuffer);
                }
                if (obj != null) {
                    c();
                }
            }
        } catch (Exception e) {
            a(e);
        }
    }

    @CalledByNative
    private void finish() {
        try {
            synchronized (this.v) {
                if (this.o) {
                    this.g = true;
                }
                this.f = true;
                if (this.a == 0) {
                    return;
                }
                try {
                    this.b.close();
                } catch (IOException e) {
                }
                try {
                    if (this.c != null && this.c.isOpen()) {
                        this.c.close();
                    }
                } catch (IOException e2) {
                }
                this.t = nativeGetErrorCode(this.a);
                this.u = nativeGetErrorString(this.a);
                if (this.t != 0) {
                    this.p = nativeGetHttpStatusCode(this.a);
                    this.q = nativeGetHttpStatusText(this.a);
                }
                nativeDestroyRequestAdapter(this.a);
                this.a = 0;
            }
        } catch (Throwable e3) {
            this.d = new IOException("Exception in finish", e3);
        }
    }

    @CalledByNative
    private void onAppendResponseHeader(ResponseHeadersMap responseHeadersMap, String str, String str2) {
        try {
            if (!responseHeadersMap.containsKey(str)) {
                responseHeadersMap.put(str, new ArrayList());
            }
            ((List) responseHeadersMap.get(str)).add(str2);
        } catch (Exception e) {
            a(e);
        }
    }

    @CalledByNative
    private int readFromUploadChannel(ByteBuffer byteBuffer) {
        try {
            if (this.c == null || !this.c.isOpen()) {
                return -1;
            }
            int read = this.c.read(byteBuffer);
            if (read >= 0) {
                return read;
            }
            this.c.close();
            return 0;
        } catch (Exception e) {
            a(e);
            return -1;
        }
    }
}
