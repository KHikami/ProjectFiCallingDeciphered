package io.grpc.internal;

import bm;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import mex;
import okw;
import olv;

public abstract class a<IdT> extends h<IdT> implements x {
    private static final Logger a;
    private db b;
    private boolean c;
    private olv d;
    private okw e;
    private Runnable f;
    private volatile boolean m;

    public abstract void a(dm dmVar, boolean z, boolean z2);

    public abstract void a(olv olv);

    static {
        a = Logger.getLogger(a.class.getName());
    }

    protected a(dn dnVar, int i) {
        super(dnVar, i);
    }

    public void a(db dbVar) {
        bm.b(this.b == null, (Object) "stream already started");
        this.b = (db) bm.a((Object) dbVar, (Object) "listener");
    }

    protected void a(InputStream inputStream) {
        if (!this.c) {
            bm.b(this.b != null, (Object) "stream not started");
            this.b.a(inputStream);
        }
    }

    protected void a(olv olv, okw okw) {
        bm.a((Object) okw, (Object) "metadata");
        if (this.i == i.STATUS) {
            a.log(Level.INFO, "Received transport error on closed stream {0} {1}", new Object[]{a(), olv});
            return;
        }
        a(olv, false, okw);
    }

    protected void a(okw okw) {
        boolean z;
        if (this.b != null) {
            z = true;
        } else {
            z = false;
        }
        bm.b(z, (Object) "stream not started");
        if (this.i == i.STATUS) {
            a.log(Level.INFO, "Received headers on closed stream {0} {1}", new Object[]{a(), okw});
        }
        a(i.MESSAGE);
        this.b.a(okw);
    }

    protected void a(cm cmVar) {
        Throwable th;
        bm.a((Object) cmVar, (Object) "frame");
        Object obj = 1;
        try {
            if (this.i == i.STATUS) {
                cmVar.close();
            } else if (this.i == i.HEADERS) {
                a(olv.p.a("headers not received before payload"), new okw());
                cmVar.close();
            } else {
                a(i.MESSAGE);
                try {
                    a(cmVar, false);
                } catch (Throwable th2) {
                    th = th2;
                    obj = null;
                    if (obj != null) {
                        cmVar.close();
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (obj != null) {
                cmVar.close();
            }
            throw th;
        }
    }

    protected final void a(Throwable th) {
        b(olv.p.a("Exception deframing message").b(th));
    }

    protected void a(okw okw, olv olv) {
        bm.a((Object) okw, (Object) "trailers");
        if (this.i == i.STATUS) {
            a.log(Level.INFO, "Received trailers on closed stream {0}\n {1}\n {2}", new Object[]{a(), olv, okw});
        }
        this.d = olv;
        this.e = okw;
        a(cn.a, true);
    }

    protected void c() {
        a(this.d, true, this.e);
    }

    protected final void b(dm dmVar, boolean z, boolean z2) {
        boolean z3 = dmVar != null || z;
        bm.a(z3, (Object) "null frame before EOS");
        a(dmVar, z, z2);
    }

    public void a(olv olv, boolean z, okw okw) {
        bm.a((Object) olv, (Object) "newStatus");
        Object obj = (this.f == null || z) ? null : 1;
        if (!this.c && obj == null) {
            a(i.STATUS);
            this.d = olv;
            this.f = null;
            boolean a = this.h.a();
            if (z || a) {
                b(olv, okw);
            } else {
                this.f = new b(this, olv, okw);
            }
        }
    }

    void b(olv olv, okw okw) {
        bm.b(this.b != null, (Object) "stream not started");
        if (!this.c) {
            this.c = true;
            this.h.close();
            this.b.b(olv, okw);
        }
    }

    public final void d() {
        if (b(i.STATUS) != i.STATUS && !this.g.b()) {
            this.g.c();
        }
    }

    public final void b(olv olv) {
        bm.a(!olv.d(), (Object) "Should not cancel with OK status");
        this.m = true;
        a(olv);
        i();
    }

    public final boolean e() {
        return !this.m && super.e();
    }

    protected mex f() {
        mex f = super.f();
        if (this.d != null) {
            f.a("status", this.d);
        }
        return f;
    }

    protected void b() {
        if (this.f != null) {
            this.f.run();
            this.f = null;
        }
    }

    protected /* synthetic */ db g() {
        return this.b;
    }
}
