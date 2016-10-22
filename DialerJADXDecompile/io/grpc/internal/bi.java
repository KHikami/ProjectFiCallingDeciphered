package io.grpc.internal;

import cob;
import dfo;
import dgb;
import dhn;
import java.io.Closeable;
import java.io.InputStream;
import rq;

/* compiled from: PG */
public final class bi implements Closeable {
    dgb a;
    boolean b;
    u c;
    public long d;
    boolean e;
    private final bk f;
    private final int g;
    private bm h;
    private int i;
    private boolean j;
    private u k;
    private boolean l;

    public bi(bk bkVar, dgb dgb, int i) {
        this.h = bm.HEADER;
        this.i = 5;
        this.c = new u();
        this.e = true;
        this.l = false;
        this.f = (bk) cob.b((Object) bkVar, (Object) "sink");
        this.a = (dgb) cob.b((Object) dgb, (Object) "decompressor");
        this.g = i;
    }

    public final void close() {
        try {
            if (this.c != null) {
                this.c.close();
            }
            if (this.k != null) {
                this.k.close();
            }
            this.c = null;
            this.k = null;
        } catch (Throwable th) {
            this.c = null;
            this.k = null;
        }
    }

    public final boolean a() {
        return this.c == null;
    }

    public final void b() {
        boolean z = true;
        if (!this.l) {
            this.l = true;
            while (this.d > 0 && c()) {
                switch (bj.a[this.h.ordinal()]) {
                    case rq.b /*1*/:
                        try {
                            int b = this.k.b();
                            if ((b & 254) == 0) {
                                this.j = (b & 1) != 0;
                                d dVar = this.k;
                                dVar.a(4);
                                this.i = dVar.b() | (((dVar.b() << 24) | (dVar.b() << 16)) | (dVar.b() << 8));
                                if (this.i >= 0 && this.i <= this.g) {
                                    this.h = bm.BODY;
                                    break;
                                }
                                throw dhn.i.a(String.format("Frame size %d exceeds maximum: %d, ", new Object[]{Integer.valueOf(this.i), Integer.valueOf(this.g)})).b();
                            }
                            throw dhn.i.a("Frame header malformed: reserved bits not zero").b();
                        } finally {
                            this.l = false;
                        }
                        break;
                    case rq.c /*2*/:
                        InputStream d;
                        if (this.j) {
                            d = d();
                        } else {
                            d = bt.a(this.k, true);
                        }
                        this.k = null;
                        this.f.a(d);
                        this.h = bm.HEADER;
                        this.i = 5;
                        this.d--;
                        break;
                    default:
                        String valueOf = String.valueOf(this.h);
                        throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 15).append("Invalid state: ").append(valueOf).toString());
                }
            }
            boolean z2 = this.c.a == 0;
            if (this.b && z2) {
                if (this.k == null || this.k.a <= 0) {
                    z = false;
                }
                if (z) {
                    throw dhn.i.a("Encountered end-of-stream mid-frame").b();
                }
                this.f.b();
                this.e = false;
                return;
            }
            z = this.e;
            this.e = z2;
            if (z2 && !z) {
                this.f.a();
            }
            this.l = false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean c() {
        /*
        r6 = this;
        r0 = 0;
        r1 = r6.k;	 Catch:{ all -> 0x004b }
        if (r1 != 0) goto L_0x000c;
    L_0x0005:
        r1 = new io.grpc.internal.u;	 Catch:{ all -> 0x004b }
        r1.<init>();	 Catch:{ all -> 0x004b }
        r6.k = r1;	 Catch:{ all -> 0x004b }
    L_0x000c:
        r1 = r0;
    L_0x000d:
        r2 = r6.i;	 Catch:{ all -> 0x0039 }
        r3 = r6.k;	 Catch:{ all -> 0x0039 }
        r3 = r3.a;	 Catch:{ all -> 0x0039 }
        r2 = r2 - r3;
        if (r2 <= 0) goto L_0x0042;
    L_0x0016:
        r3 = r6.c;	 Catch:{ all -> 0x0039 }
        r3 = r3.a;	 Catch:{ all -> 0x0039 }
        if (r3 != 0) goto L_0x0024;
    L_0x001c:
        if (r1 <= 0) goto L_0x0023;
    L_0x001e:
        r2 = r6.f;
        r2.a(r1);
    L_0x0023:
        return r0;
    L_0x0024:
        r3 = r6.c;	 Catch:{ all -> 0x0039 }
        r3 = r3.a;	 Catch:{ all -> 0x0039 }
        r2 = java.lang.Math.min(r2, r3);	 Catch:{ all -> 0x0039 }
        r1 = r1 + r2;
        r3 = r6.k;	 Catch:{ all -> 0x0039 }
        r4 = r6.c;	 Catch:{ all -> 0x0039 }
        r2 = r4.b(r2);	 Catch:{ all -> 0x0039 }
        r3.a(r2);	 Catch:{ all -> 0x0039 }
        goto L_0x000d;
    L_0x0039:
        r0 = move-exception;
    L_0x003a:
        if (r1 <= 0) goto L_0x0041;
    L_0x003c:
        r2 = r6.f;
        r2.a(r1);
    L_0x0041:
        throw r0;
    L_0x0042:
        if (r1 <= 0) goto L_0x0049;
    L_0x0044:
        r0 = r6.f;
        r0.a(r1);
    L_0x0049:
        r0 = 1;
        goto L_0x0023;
    L_0x004b:
        r1 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
        goto L_0x003a;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.bi.c():boolean");
    }

    private final InputStream d() {
        if (this.a == dfo.a) {
            throw dhn.i.a("Can't decode compressed frame as compression not configured.").b();
        }
        try {
            return new bl(this.a.a(bt.a(this.k, true)), this.g);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
