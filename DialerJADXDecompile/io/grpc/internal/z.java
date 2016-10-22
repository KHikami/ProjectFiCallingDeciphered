package io.grpc.internal;

import buf;
import cob;
import cwm;
import dgr;
import dhc;
import dhn;
import i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

final class z implements bg {
    final Object a;
    bh b;
    Collection c;
    boolean d;
    private final Executor e;
    private volatile cwm f;
    private Collection g;

    z(Executor executor) {
        this.a = new Object();
        this.c = new LinkedHashSet();
        this.g = new ArrayList();
        this.e = executor;
    }

    public final void a(bh bhVar) {
        this.b = (bh) cob.b((Object) bhVar, (Object) "listener");
    }

    public final r a(dhc dhc, dgr dgr) {
        cwm cwm = this.f;
        if (cwm == null) {
            synchronized (this.a) {
                cwm = this.f;
                if (cwm != null || this.d) {
                } else {
                    r aeVar = new ae(this, dhc, dgr);
                    this.c.add(aeVar);
                    return aeVar;
                }
            }
        }
        if (cwm != null) {
            return ((s) cwm.b()).a(dhc, dgr);
        }
        return new ao(dhn.j.a("transport shutdown"));
    }

    public final void a(i iVar, Executor executor) {
        cwm cwm = this.f;
        if (cwm == null) {
            synchronized (this.a) {
                cwm = this.f;
                if (cwm != null || this.d) {
                } else {
                    this.g.add(new ac(iVar, executor));
                    return;
                }
            }
        }
        if (cwm != null) {
            ((s) cwm.b()).a(iVar, executor);
        } else {
            executor.execute(new aa(this, iVar));
        }
    }

    public final void a() {
        synchronized (this.a) {
            if (this.d) {
                return;
            }
            this.d = true;
            this.b.a(dhn.j.a("Channel requested transport to shut down"));
            if (this.c == null || this.c.isEmpty()) {
                this.c = null;
                this.b.a();
            }
        }
    }

    public final void a(s sVar) {
        a(buf.D((Object) sVar));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(cwm r7) {
        /*
        r6 = this;
        r2 = r6.a;
        monitor-enter(r2);
        r0 = r6.f;	 Catch:{ all -> 0x0049 }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r2);	 Catch:{ all -> 0x0049 }
    L_0x0008:
        return;
    L_0x0009:
        r0 = r6.b;	 Catch:{ all -> 0x0049 }
        if (r0 == 0) goto L_0x004c;
    L_0x000d:
        r0 = 1;
    L_0x000e:
        r1 = "start() not called";
        cob.b(r0, r1);	 Catch:{ all -> 0x0049 }
        r0 = "supplier";
        r0 = cob.b(r7, r0);	 Catch:{ all -> 0x0049 }
        r0 = (cwm) r0;	 Catch:{ all -> 0x0049 }
        r6.f = r0;	 Catch:{ all -> 0x0049 }
        r0 = r6.g;	 Catch:{ all -> 0x0049 }
        r3 = r0.iterator();	 Catch:{ all -> 0x0049 }
    L_0x0023:
        r0 = r3.hasNext();	 Catch:{ all -> 0x0049 }
        if (r0 == 0) goto L_0x004e;
    L_0x0029:
        r0 = r3.next();	 Catch:{ all -> 0x0049 }
        r0 = (io.grpc.internal.ac) r0;	 Catch:{ all -> 0x0049 }
        r1 = r7.b();	 Catch:{ all -> 0x0049 }
        r1 = (io.grpc.internal.s) r1;	 Catch:{ all -> 0x0049 }
        r4 = r0.a;	 Catch:{ UnsupportedOperationException -> 0x003d }
        r5 = r0.b;	 Catch:{ UnsupportedOperationException -> 0x003d }
        r1.a(r4, r5);	 Catch:{ UnsupportedOperationException -> 0x003d }
        goto L_0x0023;
    L_0x003d:
        r1 = move-exception;
        r4 = r0.b;	 Catch:{ all -> 0x0049 }
        r5 = new io.grpc.internal.ad;	 Catch:{ all -> 0x0049 }
        r5.<init>(r0, r1);	 Catch:{ all -> 0x0049 }
        r4.execute(r5);	 Catch:{ all -> 0x0049 }
        goto L_0x0023;
    L_0x0049:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0049 }
        throw r0;
    L_0x004c:
        r0 = 0;
        goto L_0x000e;
    L_0x004e:
        r0 = 0;
        r6.g = r0;	 Catch:{ all -> 0x0049 }
        r0 = r6.d;	 Catch:{ all -> 0x0049 }
        if (r0 == 0) goto L_0x005e;
    L_0x0055:
        r0 = r6.c;	 Catch:{ all -> 0x0049 }
        if (r0 == 0) goto L_0x005e;
    L_0x0059:
        r0 = r6.b;	 Catch:{ all -> 0x0049 }
        r0.a();	 Catch:{ all -> 0x0049 }
    L_0x005e:
        r0 = r6.c;	 Catch:{ all -> 0x0049 }
        if (r0 == 0) goto L_0x0076;
    L_0x0062:
        r0 = r6.c;	 Catch:{ all -> 0x0049 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0049 }
        if (r0 != 0) goto L_0x0076;
    L_0x006a:
        r0 = r6.c;	 Catch:{ all -> 0x0049 }
        r1 = r6.e;	 Catch:{ all -> 0x0049 }
        r3 = new io.grpc.internal.ab;	 Catch:{ all -> 0x0049 }
        r3.<init>(r6, r0, r7);	 Catch:{ all -> 0x0049 }
        r1.execute(r3);	 Catch:{ all -> 0x0049 }
    L_0x0076:
        r0 = 0;
        r6.c = r0;	 Catch:{ all -> 0x0049 }
        r0 = r6.d;	 Catch:{ all -> 0x0049 }
        if (r0 != 0) goto L_0x0082;
    L_0x007d:
        r0 = r6.b;	 Catch:{ all -> 0x0049 }
        r0.b();	 Catch:{ all -> 0x0049 }
    L_0x0082:
        monitor-exit(r2);	 Catch:{ all -> 0x0049 }
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.z.a(cwm):void");
    }

    public final String b() {
        return ar.a((cn) this);
    }
}
