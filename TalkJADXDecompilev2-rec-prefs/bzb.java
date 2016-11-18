package p000;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;

final class bzb extends cbc implements bza, bzj, jza {
    private jca f4809a;
    private byq f4810b;
    private ed f4811c;
    private iih f4812d;
    private fit f4813e;

    protected bzb(Context context, kbu kbu) {
        super(context, kbu);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f4809a = (jca) jyn.m25443a(jca.class);
        this.f4810b = (byq) jyn.m25443a(byq.class);
        this.f4811c = (ed) jyn.m25443a(ed.class);
        this.f4812d = (iih) jyn.m25443a(iih.class);
        this.f4813e = (fit) jyn.m25443a(fit.class);
    }

    public String mo783b() {
        return this.h.getString(gwb.kw);
    }

    public String mo778c() {
        return this.f4810b.m6934c();
    }

    public boolean mo780e() {
        return !gwb.m2254i(this.f4810b.m6942e()) && this.f4810b.m6938d() == 2;
    }

    public void mo782g() {
        this.f4812d.mo1979a(this.f4809a.mo2317a()).mo1693b().mo1714c(3289);
        String c = this.f4810b.m6934c();
        bzf bzf = new bzf();
        Bundle bundle = new Bundle();
        bundle.putString("name", c);
        bzf.setArguments(bundle);
        bzf.m7014a((bzj) this);
        bzf.mo2341a(this.f4811c, null);
    }

    public void mo790a(String str) {
        if (!TextUtils.equals(this.f4810b.m6934c(), str)) {
            this.f4813e.mo2005a(fde.m15018e(this.f4809a.mo2317a()), this.f4810b.m6921a(), str);
            this.f4810b.m6931b(str);
            this.f4810b.m6961u();
        }
    }
}
