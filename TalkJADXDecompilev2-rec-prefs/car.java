package p000;

import android.content.Context;
import android.os.Bundle;

final class car extends cbb implements cam, jza {
    private jca f4928a;
    private byq f4929b;
    private iih f4930c;
    private fit f4931d;

    protected car(Context context, kbu kbu) {
        super(context, kbu);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f4928a = (jca) jyn.m25443a(jca.class);
        this.f4929b = (byq) jyn.m25443a(byq.class);
        this.f4930c = (iih) jyn.m25443a(iih.class);
        this.f4931d = (fit) jyn.m25443a(fit.class);
    }

    public String mo783b() {
        return this.h.getString(gwb.kQ);
    }

    public boolean mo793a() {
        return this.f4929b.m6944f() != 10;
    }

    public void mo782g() {
        if (this.f4929b.m6944f() == 30 || this.f4929b.m6944f() == 25) {
            this.f4930c.mo1979a(this.f4928a.mo2317a()).mo1693b().mo1714c(3293);
            this.f4929b.m6935c(10);
        } else {
            this.f4930c.mo1979a(this.f4928a.mo2317a()).mo1693b().mo1714c(3292);
            this.f4929b.m6935c(30);
        }
        bko e = fde.m15018e(this.f4928a.mo2317a());
        for (String a : this.f4929b.m6933b()) {
            this.f4931d.mo2003a(e, a, this.f4929b.m6944f());
        }
        this.f4929b.m6961u();
    }
}
