package io.grpc.internal;

import bm;
import java.io.Closeable;
import java.io.InputStream;
import ojw;
import oki;
import olv;
import wi;

public final class cc implements Closeable {
    private final ce a;
    private final int b;
    private oki c;
    private cg d;
    private int e;
    private boolean f;
    private boolean g;
    private aa h;
    private aa i;
    private long j;
    private boolean k;
    private boolean l;

    public cc(ce ceVar, oki oki, int i) {
        this.d = cg.HEADER;
        this.e = 5;
        this.i = new aa();
        this.k = true;
        this.l = false;
        this.a = (ce) bm.a((Object) ceVar, (Object) "sink");
        this.c = (oki) bm.a((Object) oki, (Object) "decompressor");
        this.b = i;
    }

    public void a(oki oki) {
        this.c = (oki) bm.a((Object) oki, (Object) "Can't pass an empty decompressor");
    }

    public void a(int i) {
        bm.a(i > 0, (Object) "numMessages must be > 0");
        if (!b()) {
            this.j += (long) i;
            c();
        }
    }

    public void a(cm cmVar, boolean z) {
        Throwable th;
        Object obj = null;
        bm.a((Object) cmVar, (Object) "data");
        try {
            boolean z2;
            if (b()) {
                z2 = false;
            } else {
                z2 = true;
            }
            bm.b(z2, (Object) "MessageDeframer is already closed");
            bm.b(!this.g, (Object) "Past end of stream");
            this.i.a(cmVar);
            try {
                this.g = z;
                c();
            } catch (Throwable th2) {
                th = th2;
                if (obj != null) {
                    cmVar.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            obj = 1;
            if (obj != null) {
                cmVar.close();
            }
            throw th;
        }
    }

    public boolean a() {
        return this.k;
    }

    public void close() {
        try {
            if (this.i != null) {
                this.i.close();
            }
            if (this.h != null) {
                this.h.close();
            }
            this.i = null;
            this.h = null;
        } catch (Throwable th) {
            this.i = null;
            this.h = null;
        }
    }

    private boolean b() {
        return this.i == null;
    }

    private void c() {
        boolean z = true;
        if (!this.l) {
            this.l = true;
            while (this.j > 0 && d()) {
                switch (cd.a[this.d.ordinal()]) {
                    case wi.j /*1*/:
                        try {
                            int b = this.h.b();
                            if ((b & 254) == 0) {
                                this.f = (b & 1) != 0;
                                g gVar = this.h;
                                gVar.a(4);
                                this.e = gVar.b() | (((gVar.b() << 24) | (gVar.b() << 16)) | (gVar.b() << 8));
                                if (this.e >= 0 && this.e <= this.b) {
                                    this.d = cg.BODY;
                                    break;
                                }
                                throw olv.p.a(String.format("Frame size %d exceeds maximum: %d. If this is normal, increase the maxMessageSize in the channel/server builder", new Object[]{Integer.valueOf(this.e), Integer.valueOf(this.b)})).e();
                            }
                            throw olv.p.a("Frame header malformed: reserved bits not zero").e();
                        } finally {
                            this.l = false;
                        }
                        break;
                    case wi.l /*2*/:
                        InputStream e;
                        if (this.f) {
                            e = e();
                        } else {
                            e = cn.a(this.h, true);
                        }
                        this.h = null;
                        this.a.a(e);
                        this.d = cg.HEADER;
                        this.e = 5;
                        this.j--;
                        break;
                    default:
                        String valueOf = String.valueOf(this.d);
                        throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 15).append("Invalid state: ").append(valueOf).toString());
                }
            }
            boolean z2 = this.i.a() == 0;
            if (this.g && z2) {
                if (this.h == null || this.h.a() <= 0) {
                    z = false;
                }
                if (z) {
                    throw olv.p.a("Encountered end-of-stream mid-frame").e();
                }
                this.a.b();
                this.k = false;
                return;
            }
            z = this.k;
            this.k = z2;
            if (z2 && !z) {
                this.a.a();
            }
            this.l = false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean d() {
        /*
        r6 = this;
        r0 = 0;
        r1 = r6.h;	 Catch:{ all -> 0x0051 }
        if (r1 != 0) goto L_0x000c;
    L_0x0005:
        r1 = new io.grpc.internal.aa;	 Catch:{ all -> 0x0051 }
        r1.<init>();	 Catch:{ all -> 0x0051 }
        r6.h = r1;	 Catch:{ all -> 0x0051 }
    L_0x000c:
        r1 = r0;
    L_0x000d:
        r2 = r6.e;	 Catch:{ all -> 0x003f }
        r3 = r6.h;	 Catch:{ all -> 0x003f }
        r3 = r3.a();	 Catch:{ all -> 0x003f }
        r2 = r2 - r3;
        if (r2 <= 0) goto L_0x0048;
    L_0x0018:
        r3 = r6.i;	 Catch:{ all -> 0x003f }
        r3 = r3.a();	 Catch:{ all -> 0x003f }
        if (r3 != 0) goto L_0x0028;
    L_0x0020:
        if (r1 <= 0) goto L_0x0027;
    L_0x0022:
        r2 = r6.a;
        r2.a(r1);
    L_0x0027:
        return r0;
    L_0x0028:
        r3 = r6.i;	 Catch:{ all -> 0x003f }
        r3 = r3.a();	 Catch:{ all -> 0x003f }
        r2 = java.lang.Math.min(r2, r3);	 Catch:{ all -> 0x003f }
        r1 = r1 + r2;
        r3 = r6.h;	 Catch:{ all -> 0x003f }
        r4 = r6.i;	 Catch:{ all -> 0x003f }
        r2 = r4.b(r2);	 Catch:{ all -> 0x003f }
        r3.a(r2);	 Catch:{ all -> 0x003f }
        goto L_0x000d;
    L_0x003f:
        r0 = move-exception;
    L_0x0040:
        if (r1 <= 0) goto L_0x0047;
    L_0x0042:
        r2 = r6.a;
        r2.a(r1);
    L_0x0047:
        throw r0;
    L_0x0048:
        if (r1 <= 0) goto L_0x004f;
    L_0x004a:
        r0 = r6.a;
        r0.a(r1);
    L_0x004f:
        r0 = 1;
        goto L_0x0027;
    L_0x0051:
        r1 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
        goto L_0x0040;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.cc.d():boolean");
    }

    private InputStream e() {
        if (this.c == ojw.a) {
            throw olv.p.a("Can't decode compressed frame as compression not configured.").e();
        }
        try {
            return new cf(this.c.a(cn.a(this.h, true)), this.b);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
