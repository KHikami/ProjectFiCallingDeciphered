package p000;

import java.util.Set;

final class djl extends itg {
    final /* synthetic */ djd f9952a;

    djl(djd djd) {
        this.f9952a = djd;
        super('\u0000');
    }

    public void mo1559d() {
        iil.m21877b(this.f9952a.f9929i, djm.NONE);
        this.f9952a.m12044c();
        this.f9952a.m12050i();
    }

    public void mo1565b(int i) {
        this.f9952a.m12044c();
        if (i == 1) {
            iry l = this.f9952a.f9922b.m11720l();
            if (l != null) {
                glk.m17979c("Babel_calls", "Disabling camera because there are only PSTN participants", new Object[0]);
                l.m23059a(false);
            }
        }
    }

    public void mo1557a(boolean z) {
        djd djd = this.f9952a;
        if (djd.m12049h()) {
            djd.m12048g();
            return;
        }
        djd.m12044c();
        djd.m12052k();
    }

    public void mo1578i() {
        gwb.m2042b(this.f9952a.f9923c);
        this.f9952a.m12043b();
    }

    public void mo1549d(itl itl) {
        if (itl.m23242f() && !itl.m23240e() && this.f9952a.f9922b.m11727s() != null && this.f9952a.f9922b.m11727s().m11946K()) {
            gwb.m2198f(1536);
            this.f9952a.f9922b.m11727s().m12002x();
        }
    }

    public void mo1568a(isr isr, Set<isq> set) {
        this.f9952a.f9927g.m11861k();
        if (isr == isr.EARPIECE_ON) {
            gwb.m1864a(this.f9952a.f9924d, djd.f9918a);
        } else {
            gwb.m2042b(this.f9952a.f9924d);
        }
        this.f9952a.m12050i();
    }
}
