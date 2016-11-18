package defpackage;

import com.google.api.client.http.HttpMethods;
import io.grpc.internal.bi;
import io.grpc.internal.bn;
import io.grpc.internal.cn;
import io.grpc.internal.db;
import io.grpc.internal.dc;
import io.grpc.internal.dn;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.BidirectionalStream.Builder;

final class omh extends bn {
    private static final ByteBuffer m = ByteBuffer.allocateDirect(0);
    final omk a;
    final Object b;
    Queue<omj> c = new LinkedList();
    boolean d;
    olv e;
    boolean f;
    private final String n;
    private final String o;
    private final Executor p;
    private final okw q;
    private final Runnable r;
    private final boolean s;
    private BidirectionalStream t;
    private boolean u = false;
    private int v;
    private boolean w;

    public /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    omh(String str, String str2, Executor executor, okw okw, omk omk, Runnable runnable, Object obj, int i, boolean z, boolean z2) {
        super(new dn(), i);
        this.n = (String) bm.a(str, "url");
        this.o = (String) bm.a(str2, "userAgent");
        this.p = (Executor) bm.a(executor, "executor");
        this.q = (okw) bm.a(okw, "headers");
        this.a = (omk) bm.a(omk, "transport");
        this.r = (Runnable) bm.a(runnable, "startCallback");
        this.b = bm.a(obj, "lock");
        this.s = z;
        this.w = z2;
    }

    public void a(int i) {
        synchronized (this.b) {
            try {
                this.h.a(i);
            } catch (Throwable th) {
                a(th);
            }
        }
    }

    public void a(String str) {
        throw new UnsupportedOperationException("Cronet does not support overriding authority");
    }

    public void a(db dbVar) {
        super.a(dbVar);
        this.r.run();
    }

    public void a(omg omg) {
        Builder a = omg.a(this.n, new omi(this), this.p);
        if (this.s) {
            a.a(HttpMethods.PUT);
        }
        if (this.w) {
            a.a(true);
        }
        a.a(bi.f.a, this.o);
        a.a(bi.e.a, "application/grpc");
        a.a("te", "trailers");
        byte[][] a2 = dc.a(this.q);
        for (int i = 0; i < a2.length; i += 2) {
            boolean z;
            String str = new String(a2[i], Charset.forName("UTF-8"));
            if (str.startsWith(":") || bi.e.a.equalsIgnoreCase(str) || bi.f.a.equalsIgnoreCase(str)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                a.a(str, new String(a2[i + 1], Charset.forName("UTF-8")));
            }
        }
        this.t = a.a();
        this.t.a();
    }

    void a(List<Entry<String, String>> list, boolean z) {
        List arrayList = new ArrayList();
        for (Entry entry : list) {
            arrayList.add((String) entry.getKey());
            arrayList.add((String) entry.getValue());
        }
        byte[][] bArr = new byte[arrayList.size()][];
        for (int i = 0; i < arrayList.size(); i += 2) {
            bArr[i] = ((String) arrayList.get(i)).getBytes(Charset.forName("UTF-8"));
            bArr[i + 1] = ((String) arrayList.get(i + 1)).getBytes(Charset.forName("UTF-8"));
        }
        okw okw = new okw(dc.a(bArr));
        synchronized (this.b) {
            if (z) {
                c(okw);
            } else {
                b(okw);
            }
        }
    }

    void a(ByteBuffer byteBuffer, boolean z) {
        this.v += byteBuffer.remaining();
        synchronized (this.b) {
            super.b(cn.a(byteBuffer), z);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(io.grpc.internal.dm r6, boolean r7, boolean r8) {
        /*
        r5 = this;
        r1 = r5.b;
        monitor-enter(r1);
        r0 = r5.u;	 Catch:{ all -> 0x0031 }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x0031 }
    L_0x0008:
        return;
    L_0x0009:
        if (r6 == 0) goto L_0x0034;
    L_0x000b:
        r6 = (io.grpc.internal.dm) r6;	 Catch:{ all -> 0x0031 }
        r0 = r6.c();	 Catch:{ all -> 0x0031 }
        r0.flip();	 Catch:{ all -> 0x0031 }
    L_0x0014:
        r2 = r0.remaining();	 Catch:{ all -> 0x0031 }
        r3 = r5.l;	 Catch:{ all -> 0x0031 }
        monitor-enter(r3);	 Catch:{ all -> 0x0031 }
        r4 = r5.k;	 Catch:{ all -> 0x0037 }
        r2 = r2 + r4;
        r5.k = r2;	 Catch:{ all -> 0x0037 }
        monitor-exit(r3);	 Catch:{ all -> 0x0037 }
        r2 = r5.d;	 Catch:{ all -> 0x0031 }
        if (r2 != 0) goto L_0x003a;
    L_0x0025:
        r2 = r5.c;	 Catch:{ all -> 0x0031 }
        r3 = new omj;	 Catch:{ all -> 0x0031 }
        r3.<init>(r0, r7, r8);	 Catch:{ all -> 0x0031 }
        r2.add(r3);	 Catch:{ all -> 0x0031 }
    L_0x002f:
        monitor-exit(r1);	 Catch:{ all -> 0x0031 }
        goto L_0x0008;
    L_0x0031:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0031 }
        throw r0;
    L_0x0034:
        r0 = m;	 Catch:{ all -> 0x0031 }
        goto L_0x0014;
    L_0x0037:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0037 }
        throw r0;	 Catch:{ all -> 0x0031 }
    L_0x003a:
        r5.a(r0, r7, r8);	 Catch:{ all -> 0x0031 }
        goto L_0x002f;
        */
        throw new UnsupportedOperationException("Method not decompiled: omh.a(io.grpc.internal.dm, boolean, boolean):void");
    }

    protected void b(int i) {
        this.v -= i;
        if (this.v == 0 && !this.f) {
            this.t.a(ByteBuffer.allocateDirect(4096));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(olv r4) {
        /*
        r3 = this;
        r1 = r3.b;
        monitor-enter(r1);
        r0 = r3.u;	 Catch:{ all -> 0x0026 }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x0026 }
    L_0x0008:
        return;
    L_0x0009:
        r0 = 1;
        r3.u = r0;	 Catch:{ all -> 0x0026 }
        r3.e = r4;	 Catch:{ all -> 0x0026 }
        r0 = r3.c;	 Catch:{ all -> 0x0026 }
        r2 = r0.iterator();	 Catch:{ all -> 0x0026 }
    L_0x0014:
        r0 = r2.hasNext();	 Catch:{ all -> 0x0026 }
        if (r0 == 0) goto L_0x0029;
    L_0x001a:
        r0 = r2.next();	 Catch:{ all -> 0x0026 }
        r0 = (defpackage.omj) r0;	 Catch:{ all -> 0x0026 }
        r0 = r0.a;	 Catch:{ all -> 0x0026 }
        r0.clear();	 Catch:{ all -> 0x0026 }
        goto L_0x0014;
    L_0x0026:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0026 }
        throw r0;
    L_0x0029:
        r0 = r3.c;	 Catch:{ all -> 0x0026 }
        r0.clear();	 Catch:{ all -> 0x0026 }
        r0 = r3.t;	 Catch:{ all -> 0x0026 }
        if (r0 == 0) goto L_0x0039;
    L_0x0032:
        r0 = r3.t;	 Catch:{ all -> 0x0026 }
        r0.c();	 Catch:{ all -> 0x0026 }
    L_0x0037:
        monitor-exit(r1);	 Catch:{ all -> 0x0026 }
        goto L_0x0008;
    L_0x0039:
        r0 = r3.a;	 Catch:{ all -> 0x0026 }
        r0.a(r3, r4);	 Catch:{ all -> 0x0026 }
        goto L_0x0037;
        */
        throw new UnsupportedOperationException("Method not decompiled: omh.a(olv):void");
    }

    void a(ByteBuffer byteBuffer, boolean z, boolean z2) {
        this.t.a(byteBuffer, z);
        if (z2) {
            this.t.b();
        }
    }

    void a(ByteBuffer byteBuffer) {
        Object obj = 1;
        int position = byteBuffer.position();
        synchronized (this.l) {
            Object obj2 = this.k < this.j ? 1 : null;
            this.k -= position;
            Object obj3;
            if (this.k < this.j) {
                obj3 = 1;
            } else {
                obj3 = null;
            }
            if (obj2 != null || r2 == null) {
                obj = null;
            }
        }
        if (obj != null) {
            k();
        }
    }
}
