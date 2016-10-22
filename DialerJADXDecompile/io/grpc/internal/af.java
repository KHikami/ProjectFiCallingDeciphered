package io.grpc.internal;

import cob;
import dfp;
import dgb;
import dgr;
import dhn;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
class af implements r {
    private volatile boolean a;
    private cg b;
    r c;
    private dhn d;
    private List e;

    af() {
        this.e = new ArrayList();
    }

    final void a(r rVar) {
        synchronized (this) {
            if (this.c != null) {
                return;
            }
            this.c = (r) cob.b((Object) rVar, (Object) "stream");
            a();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void a() {
        /*
        r3 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
    L_0x0005:
        monitor-enter(r3);
        r1 = r3.e;	 Catch:{ all -> 0x002f }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x002f }
        if (r1 == 0) goto L_0x0016;
    L_0x000e:
        r0 = 0;
        r3.e = r0;	 Catch:{ all -> 0x002f }
        r0 = 1;
        r3.a = r0;	 Catch:{ all -> 0x002f }
        monitor-exit(r3);	 Catch:{ all -> 0x002f }
        return;
    L_0x0016:
        r1 = r3.e;	 Catch:{ all -> 0x002f }
        r3.e = r0;	 Catch:{ all -> 0x002f }
        monitor-exit(r3);	 Catch:{ all -> 0x002f }
        r2 = r1.iterator();
    L_0x001f:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0032;
    L_0x0025:
        r0 = r2.next();
        r0 = (java.lang.Runnable) r0;
        r0.run();
        goto L_0x001f;
    L_0x002f:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x002f }
        throw r0;
    L_0x0032:
        r1.clear();
        r0 = r1;
        goto L_0x0005;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.af.a():void");
    }

    private final void a(Runnable runnable) {
        synchronized (this) {
            if (this.a) {
                runnable.run();
                return;
            }
            this.e.add(runnable);
        }
    }

    public final void a(cg cgVar) {
        cob.b(this.b == null, (Object) "already started");
        synchronized (this) {
            this.b = (cg) cob.b((Object) cgVar, (Object) "listener");
            dhn dhn = this.d;
        }
        if (dhn != null) {
            cgVar.a(dhn, new dgr());
        } else {
            a(new ag(this, cgVar));
        }
    }

    public final void b(InputStream inputStream) {
        cob.b((Object) inputStream, (Object) "message");
        if (this.a) {
            this.c.b(inputStream);
        } else {
            a(new ah(this, inputStream));
        }
    }

    public final void h() {
        if (this.a) {
            this.c.h();
        } else {
            a(new ai(this));
        }
    }

    public void a(dhn dhn) {
        cob.b((Object) dhn, (Object) "reason");
        Object obj = 1;
        cg cgVar = null;
        synchronized (this) {
            if (this.c == null) {
                this.c = br.a;
                obj = null;
                cgVar = this.b;
                this.d = dhn;
            }
        }
        if (obj != null) {
            a(new aj(this, dhn));
            return;
        }
        if (cgVar != null) {
            cgVar.a(dhn, new dgr());
        }
        a();
    }

    public final void c() {
        a(new ak(this));
    }

    public final void a(int i) {
        if (this.a) {
            this.c.a(i);
        } else {
            a(new al(this, i));
        }
    }

    public final void a(dfp dfp) {
        cob.b((Object) dfp, (Object) "compressor");
        a(new am(this, dfp));
    }

    public final void a(dgb dgb) {
        cob.b((Object) dgb, (Object) "decompressor");
        synchronized (this) {
        }
        cob.b(this.c != null, (Object) "How did we receive a reply before the request is sent?");
        this.c.a(dgb);
    }

    public final void a(boolean z) {
        if (this.a) {
            this.c.a(z);
        } else {
            a(new an(this, z));
        }
    }
}
