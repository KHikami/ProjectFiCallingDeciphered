package p000;

import android.content.Context;
import android.os.Bundle;

final class dor extends itg implements jza, kco, kcp, kcq {
    final Context f10255a;
    doh f10256b;
    private boolean f10257c;
    private final dot f10258d = new dot(this);
    private final dos f10259e = new dos(this);

    dor(Context context, kbu kbu) {
        super('\u0000');
        this.f10255a = context;
        kbu.m25514a((kcq) this);
    }

    private void m12377l() {
        ite g = dgg.m11692a().m11715g();
        if (g != null && !this.f10257c) {
            ((ijd) g.mo3229t().m21926a(ijd.class)).mo3363a(this.f10258d);
            ((ijf) g.mo3229t().m21926a(ijf.class)).mo3363a(this.f10259e);
            this.f10257c = true;
        }
    }

    private void m12378m() {
        ite g = dgg.m11692a().m11715g();
        if (g != null) {
            ((ijd) g.mo3229t().m21926a(ijd.class)).mo3366b(this.f10258d);
            ((ijf) g.mo3229t().m21926a(ijf.class)).mo3366b(this.f10259e);
            this.f10257c = false;
        }
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f10256b = (doh) jyn.m25443a(doh.class);
    }

    public void z_() {
        dgg.m11692a().m11701a((itg) this);
        m12377l();
    }

    public void A_() {
        dgg.m11692a().m11705b((itg) this);
        m12378m();
    }

    public void mo1386a(itk itk) {
        m12377l();
    }

    public void mo1385a(int i) {
        this.f10256b.mo1630a(gwb.m2322p(this.f10255a));
        m12378m();
    }
}
