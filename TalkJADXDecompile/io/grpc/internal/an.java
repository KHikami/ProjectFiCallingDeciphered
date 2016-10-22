package io.grpc.internal;

import bm;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import ojx;
import oki;
import okw;
import olv;

public class an implements x {
    private volatile boolean a;
    private db b;
    x c;
    private olv d;
    private List<Runnable> e;
    private aw f;

    public an() {
        this.e = new ArrayList();
    }

    final void a(x xVar) {
        synchronized (this) {
            if (this.c != null) {
                return;
            }
            this.c = (x) bm.a((Object) xVar, (Object) "stream");
            a();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
        r3 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
    L_0x0005:
        monitor-enter(r3);
        r1 = r3.e;	 Catch:{ all -> 0x0036 }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x0036 }
        if (r1 == 0) goto L_0x001d;
    L_0x000e:
        r0 = 0;
        r3.e = r0;	 Catch:{ all -> 0x0036 }
        r0 = 1;
        r3.a = r0;	 Catch:{ all -> 0x0036 }
        r0 = r3.f;	 Catch:{ all -> 0x0036 }
        monitor-exit(r3);	 Catch:{ all -> 0x0036 }
        if (r0 == 0) goto L_0x001c;
    L_0x0019:
        r0.b();
    L_0x001c:
        return;
    L_0x001d:
        r1 = r3.e;	 Catch:{ all -> 0x0036 }
        r3.e = r0;	 Catch:{ all -> 0x0036 }
        monitor-exit(r3);	 Catch:{ all -> 0x0036 }
        r2 = r1.iterator();
    L_0x0026:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0039;
    L_0x002c:
        r0 = r2.next();
        r0 = (java.lang.Runnable) r0;
        r0.run();
        goto L_0x0026;
    L_0x0036:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0036 }
        throw r0;
    L_0x0039:
        r1.clear();
        r0 = r1;
        goto L_0x0005;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.an.a():void");
    }

    private void a(Runnable runnable) {
        synchronized (this) {
            if (this.a) {
                runnable.run();
                return;
            }
            this.e.add(runnable);
        }
    }

    public void a(String str) {
        bm.b(this.b == null, (Object) "May only be called before start");
        bm.a((Object) str, (Object) "authority");
        a(new ao(this, str));
    }

    public void a(db dbVar) {
        bm.b(this.b == null, (Object) "already started");
        synchronized (this) {
            this.b = (db) bm.a((Object) dbVar, (Object) "listener");
            olv olv = this.d;
            boolean z = this.a;
            if (!z) {
                aw awVar = new aw(dbVar);
                this.f = awVar;
                dbVar = awVar;
            }
        }
        if (olv != null) {
            dbVar.b(olv, new okw());
        } else if (z) {
            this.c.a(dbVar);
        } else {
            a(new ap(this, dbVar));
        }
    }

    public void b(InputStream inputStream) {
        bm.a((Object) inputStream, (Object) "message");
        if (this.a) {
            this.c.b(inputStream);
        } else {
            a(new aq(this, inputStream));
        }
    }

    public void h() {
        if (this.a) {
            this.c.h();
        } else {
            a(new ar(this));
        }
    }

    public void b(olv olv) {
        bm.a((Object) olv, (Object) "reason");
        Object obj = 1;
        db dbVar = null;
        synchronized (this) {
            if (this.c == null) {
                this.c = cl.a;
                obj = null;
                dbVar = this.b;
                this.d = olv;
            }
        }
        if (obj != null) {
            a(new as(this, olv));
            return;
        }
        if (dbVar != null) {
            dbVar.b(olv, new okw());
        }
        a();
    }

    public void d() {
        a(new at(this));
    }

    public void a(int i) {
        if (this.a) {
            this.c.a(i);
        } else {
            a(new au(this, i));
        }
    }

    public void a(ojx ojx) {
        bm.a((Object) ojx, (Object) "compressor");
        a(new av(this, ojx));
    }

    public void a(oki oki) {
        bm.a((Object) oki, (Object) "decompressor");
        synchronized (this) {
        }
        bm.b(this.c != null, (Object) "How did we receive a reply before the request is sent?");
        this.c.a(oki);
    }
}
