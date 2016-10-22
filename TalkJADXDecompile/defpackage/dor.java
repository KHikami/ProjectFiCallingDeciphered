package defpackage;

import android.content.Context;
import android.os.Bundle;

/* renamed from: dor */
final class dor extends itg implements jza, kco, kcp, kcq {
    final Context a;
    doh b;
    private boolean c;
    private final dot d;
    private final dos e;

    dor(Context context, kbu kbu) {
        super('\u0000');
        this.a = context;
        this.d = new dot(this);
        this.e = new dos(this);
        kbu.a((kcq) this);
    }

    private void l() {
        ite g = dgg.a().g();
        if (g != null && !this.c) {
            ((ijd) g.t().a(ijd.class)).a(this.d);
            ((ijf) g.t().a(ijf.class)).a(this.e);
            this.c = true;
        }
    }

    private void m() {
        ite g = dgg.a().g();
        if (g != null) {
            ((ijd) g.t().a(ijd.class)).b(this.d);
            ((ijf) g.t().a(ijf.class)).b(this.e);
            this.c = false;
        }
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.b = (doh) jyn.a(doh.class);
    }

    public void z_() {
        dgg.a().a((itg) this);
        l();
    }

    public void A_() {
        dgg.a().b((itg) this);
        m();
    }

    public void a(itk itk) {
        l();
    }

    public void a(int i) {
        this.b.a(gwb.p(this.a));
        m();
    }
}
