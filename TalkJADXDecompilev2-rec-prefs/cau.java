package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

final class cau extends caw implements cas, jej, jza {
    private jca f4933b;
    private byq f4934c;
    private iih f4935d;
    private fuz f4936e;
    private fit f4937f;

    public cau(Context context, kbu kbu) {
        super(context, kbu);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        super.mo479a(context, jyn, bundle);
        this.f4933b = (jca) jyn.m25443a(jca.class);
        this.f4934c = (byq) jyn.m25443a(byq.class);
        this.f4935d = (iih) jyn.m25443a(iih.class);
        this.f4936e = (fuz) jyn.m25443a(fuz.class);
        this.f4937f = (fit) jyn.m25443a(fit.class);
        this.a.m24033a(gwb.kV, (jej) this);
    }

    public String mo783b() {
        return this.h.getString(gwb.kY);
    }

    public String mo778c() {
        return gku.m17911a(this.h, m7109a());
    }

    public boolean mo779d() {
        return this.f4934c.m6944f() != 10;
    }

    public void mo782g() {
        this.f4935d.mo1979a(this.f4933b.mo2317a()).mo1693b().mo1714c(3294);
        m7107a(gwb.kV, this.h.getString(gwb.kY), m7109a(), m7110h(), 2);
    }

    public void mo747a(int i, Intent intent) {
        if (i == -1) {
            String a = m7106a(intent, m7110h());
            this.f4934c.m6943e(a);
            this.f4937f.mo2015b(fde.m15018e(this.f4933b.mo2317a()), this.f4934c.m6933b()[0], a);
            this.f4934c.m6961u();
        }
    }

    private Uri m7109a() {
        if (this.f4934c.m6951k() != null) {
            return gld.m17945c(this.f4934c.m6951k());
        }
        return m7110h();
    }

    private Uri m7110h() {
        return this.f4936e.m16285a(this.f4933b.mo2317a(), fuz.m16282a(this.f4934c.m6942e(), false));
    }
}
