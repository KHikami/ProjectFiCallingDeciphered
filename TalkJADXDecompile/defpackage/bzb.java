package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: bzb */
final class bzb extends cbc implements bza, bzj, jza {
    private jca a;
    private byq b;
    private ed c;
    private iih d;
    private fit e;

    protected bzb(Context context, kbu kbu) {
        super(context, kbu);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.a = (jca) jyn.a(jca.class);
        this.b = (byq) jyn.a(byq.class);
        this.c = (ed) jyn.a(ed.class);
        this.d = (iih) jyn.a(iih.class);
        this.e = (fit) jyn.a(fit.class);
    }

    public String b() {
        return this.h.getString(gwb.kw);
    }

    public String c() {
        return this.b.c();
    }

    public boolean e() {
        return !gwb.i(this.b.e()) && this.b.d() == 2;
    }

    public void g() {
        this.d.a(this.a.a()).b().c(3289);
        String c = this.b.c();
        bzf bzf = new bzf();
        Bundle bundle = new Bundle();
        bundle.putString("name", c);
        bzf.setArguments(bundle);
        bzf.a((bzj) this);
        bzf.a(this.c, null);
    }

    public void a(String str) {
        if (!TextUtils.equals(this.b.c(), str)) {
            this.e.a(fde.e(this.a.a()), this.b.a(), str);
            this.b.b(str);
            this.b.u();
        }
    }
}
