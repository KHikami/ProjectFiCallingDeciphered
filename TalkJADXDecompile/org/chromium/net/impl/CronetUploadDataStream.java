package org.chromium.net.impl;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;
import org.chromium.base.annotations.NativeClassQualifiedName;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;
import owz;
import oxa;
import oxb;
import oxc;

@JNINamespace
public final class CronetUploadDataStream implements UploadDataSink {
    public final UploadDataProvider a;
    public ByteBuffer b;
    public final Object c;
    public long d;
    public oxc e;
    private final Executor f;
    private long g;
    private long h;
    private CronetUrlRequest i;
    private final Runnable j;
    private boolean k;
    private Runnable l;

    private native long nativeAttachUploadDataToRequest(long j, long j2);

    private native long nativeCreateAdapterForTesting();

    private native long nativeCreateUploadDataStreamForTesting(long j, long j2);

    @NativeClassQualifiedName
    private static native void nativeDestroy(long j);

    @NativeClassQualifiedName
    private native void nativeOnReadSucceeded(long j, int i, boolean z);

    @NativeClassQualifiedName
    private native void nativeOnRewindSucceeded(long j);

    public CronetUploadDataStream(UploadDataProvider uploadDataProvider, Executor executor) {
        this.j = new owz(this);
        this.b = null;
        this.c = new Object();
        this.d = 0;
        this.e = oxc.d;
        this.k = false;
        this.f = executor;
        this.a = uploadDataProvider;
    }

    @CalledByNative
    void readData(ByteBuffer byteBuffer) {
        this.b = byteBuffer;
        a(this.j);
    }

    @CalledByNative
    void rewind() {
        a(new oxa(this));
    }

    public void a(oxc oxc) {
        if (this.e != oxc) {
            throw new IllegalStateException("Expected " + oxc + ", but was " + this.e);
        }
    }

    @CalledByNative
    void onUploadDataStreamDestroyed() {
        b();
    }

    public void a(Throwable th) {
        synchronized (this.c) {
            if (this.e == oxc.d) {
                throw new IllegalStateException("There is no read or rewind or length check in progress.");
            }
            this.e = oxc.d;
            this.b = null;
            c();
        }
        this.i.a(th);
    }

    public void a(boolean z) {
        synchronized (this.c) {
            a(oxc.a);
            int position = this.b.position();
            this.h -= (long) position;
            if (this.h >= 0 || this.g < 0) {
                this.b = null;
                this.e = oxc.d;
                c();
                if (this.d == 0) {
                    return;
                }
                nativeOnReadSucceeded(this.d, position, false);
                return;
            }
            throw new IllegalArgumentException(String.format("Read upload data length %d exceeds expected length %d", new Object[]{Long.valueOf(this.g - this.h), Long.valueOf(this.g)}));
        }
    }

    public void a() {
        synchronized (this.c) {
            a(oxc.b);
            this.e = oxc.d;
            this.h = this.g;
            if (this.d == 0) {
                return;
            }
            nativeOnRewindSucceeded(this.d);
        }
    }

    void a(Runnable runnable) {
        try {
            this.f.execute(runnable);
        } catch (Throwable th) {
            this.i.a(th);
        }
    }

    private void b() {
        synchronized (this.c) {
            if (this.e == oxc.a) {
                this.k = true;
            } else if (this.d == 0) {
            } else {
                nativeDestroy(this.d);
                this.d = 0;
                if (this.l != null) {
                    this.l.run();
                }
                a(new oxb(this));
            }
        }
    }

    private void c() {
        synchronized (this.c) {
            if (this.e == oxc.a) {
                throw new IllegalStateException("Method should not be called when read has not completed.");
            }
            if (this.k) {
                b();
            }
        }
    }

    public void a(CronetUrlRequest cronetUrlRequest) {
        synchronized (this.c) {
            this.i = cronetUrlRequest;
            this.e = oxc.c;
        }
        try {
            this.g = this.a.a();
            this.h = this.g;
        } catch (Throwable th) {
            a(th);
        }
        synchronized (this.c) {
            this.e = oxc.d;
        }
    }

    public void a(long j) {
        synchronized (this.c) {
            this.d = nativeAttachUploadDataToRequest(j, this.g);
        }
    }
}
