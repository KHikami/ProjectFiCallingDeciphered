package io.grpc.internal;

import cob;
import cyl;
import dgr;
import dhn;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class a extends e implements r {
    public static final Logger a;
    public cg b;
    public dhn c;
    public dgr d;
    private boolean m;
    private Runnable n;
    private volatile boolean o;

    public abstract void b(dhn dhn);

    public abstract void b(co coVar, boolean z, boolean z2);

    static {
        a = Logger.getLogger(a.class.getName());
    }

    protected a(cp cpVar, int i) {
        super(cpVar, i);
    }

    public void a(cg cgVar) {
        cob.b(this.b == null, (Object) "stream already started");
        this.b = (cg) cob.b((Object) cgVar, (Object) "listener");
    }

    protected final void a(InputStream inputStream) {
        if (!this.m) {
            cob.b(this.b != null, (Object) "stream not started");
            this.b.a(inputStream);
        }
    }

    public final void a(dhn dhn, dgr dgr) {
        cob.b((Object) dgr, (Object) "metadata");
        if (this.g == f.STATUS) {
            a.log(Level.INFO, "Received transport error on closed stream {0} {1}", new Object[]{g(), dhn});
            return;
        }
        a(dhn, false, dgr);
    }

    protected final void a(Throwable th) {
        a(dhn.i.a("Exception deframing message").b(th));
    }

    public void b() {
        a(this.c, true, this.d);
    }

    protected final void a(co coVar, boolean z, boolean z2) {
        boolean z3 = coVar != null || z;
        cob.a(z3, (Object) "null frame before EOS");
        b(coVar, z, z2);
    }

    public final void a(dhn dhn, boolean z, dgr dgr) {
        cob.b((Object) dhn, (Object) "newStatus");
        Object obj = (this.n == null || z) ? null : 1;
        if (!this.m && obj == null) {
            a(f.STATUS);
            this.c = dhn;
            this.n = null;
            boolean z2 = this.f.e;
            if (z || z2) {
                b(dhn, dgr);
            } else {
                this.n = new b(this, dhn, dgr);
            }
        }
    }

    final void b(dhn dhn, dgr dgr) {
        cob.b(this.b != null, (Object) "stream not started");
        if (!this.m) {
            this.m = true;
            this.f.close();
            this.b.a(dhn, dgr);
        }
    }

    public final void c() {
        if (b(f.STATUS) != f.STATUS && !this.e.g) {
            bn bnVar = this.e;
            if (!bnVar.g) {
                bnVar.g = true;
                if (bnVar.a != null && bnVar.a.b() == 0) {
                    bnVar.a();
                }
                bnVar.a(true, true);
            }
        }
    }

    public final void a(dhn dhn) {
        cob.a(!dhn.a(), (Object) "Should not cancel with OK status");
        this.o = true;
        b(dhn);
        bn bnVar = this.e;
        bnVar.g = true;
        bnVar.a();
    }

    public final boolean d() {
        return !this.o && super.d();
    }

    protected final cyl e() {
        cyl e = super.e();
        if (this.c != null) {
            e.a("status", this.c);
        }
        return e;
    }

    protected final void a() {
        if (this.n != null) {
            this.n.run();
            this.n = null;
        }
    }

    protected final /* synthetic */ cg f() {
        return this.b;
    }
}
