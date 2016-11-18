package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

final class cav extends caw implements cat, jej, jza {
    private jca f4938b;
    private byq f4939c;
    private iih f4940d;
    private fit f4941e;

    public cav(Context context, kbu kbu) {
        super(context, kbu);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        super.mo479a(context, jyn, bundle);
        this.f4938b = (jca) jyn.m25443a(jca.class);
        this.f4939c = (byq) jyn.m25443a(byq.class);
        this.f4940d = (iih) jyn.m25443a(iih.class);
        this.f4941e = (fit) jyn.m25443a(fit.class);
        this.a.m24033a(gwb.kW, (jej) this);
    }

    public String mo783b() {
        return this.h.getString(gwb.kX);
    }

    public String mo778c() {
        return gku.m17911a(this.h, m7117a());
    }

    public boolean mo779d() {
        return this.f4939c.m6944f() != 10;
    }

    public boolean mo780e() {
        if (!gwb.m2254i(this.f4939c.m6942e()) || this.f4939c.m6956p().m5590b().size() == 1) {
            return true;
        }
        return false;
    }

    public void mo782g() {
        this.f4940d.mo1979a(this.f4938b.mo2317a()).mo1693b().mo1714c(3295);
        m7107a(gwb.kW, this.h.getString(gwb.kX), m7117a(), m7118h(), 1);
    }

    public void mo747a(int i, Intent intent) {
        if (i == -1) {
            Object a = m7106a(intent, m7118h());
            if (!gwb.m2223g(a, this.f4939c.m6952l())) {
                this.f4940d.mo1979a(this.f4938b.mo2317a()).mo1693b().mo1714c(1600);
            }
            this.f4939c.m6945f(a);
            this.f4941e.mo2017c(fde.m15018e(this.f4938b.mo2317a()), this.f4939c.m6933b()[0], a);
            this.f4939c.m6961u();
        }
    }

    private Uri m7117a() {
        if (this.f4939c.m6952l() != null) {
            return gld.m17945c(this.f4939c.m6952l());
        }
        return m7118h();
    }

    private Uri m7118h() {
        return gld.m17945c(gwb.m2084c(fde.m15018e(this.f4938b.mo2317a())));
    }
}
