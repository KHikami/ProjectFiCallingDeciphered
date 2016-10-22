package defpackage;

import java.util.Set;

/* renamed from: djl */
final class djl extends itg {
    final /* synthetic */ djd a;

    djl(djd djd) {
        this.a = djd;
        super('\u0000');
    }

    public void d() {
        iil.b(this.a.i, djm.NONE);
        this.a.c();
        this.a.i();
    }

    public void b(int i) {
        this.a.c();
        if (i == 1) {
            iry l = this.a.b.l();
            if (l != null) {
                glk.c("Babel_calls", "Disabling camera because there are only PSTN participants", new Object[0]);
                l.a(false);
            }
        }
    }

    public void a(boolean z) {
        djd djd = this.a;
        if (djd.h()) {
            djd.g();
            return;
        }
        djd.c();
        djd.k();
    }

    public void i() {
        gwb.b(this.a.c);
        this.a.b();
    }

    public void d(itl itl) {
        if (itl.f() && !itl.e() && this.a.b.s() != null && this.a.b.s().K()) {
            gwb.f(1536);
            this.a.b.s().x();
        }
    }

    public void a(isr isr, Set<isq> set) {
        this.a.g.k();
        if (isr == isr.EARPIECE_ON) {
            gwb.a(this.a.d, djd.a);
        } else {
            gwb.b(this.a.d);
        }
        this.a.i();
    }
}
