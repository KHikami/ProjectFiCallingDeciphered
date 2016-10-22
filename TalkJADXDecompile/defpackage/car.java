package defpackage;

import android.content.Context;
import android.os.Bundle;

/* renamed from: car */
final class car extends cbb implements cam, jza {
    private jca a;
    private byq b;
    private iih c;
    private fit d;

    protected car(Context context, kbu kbu) {
        super(context, kbu);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.a = (jca) jyn.a(jca.class);
        this.b = (byq) jyn.a(byq.class);
        this.c = (iih) jyn.a(iih.class);
        this.d = (fit) jyn.a(fit.class);
    }

    public String b() {
        return this.h.getString(gwb.kQ);
    }

    public boolean a() {
        return this.b.f() != 10;
    }

    public void g() {
        if (this.b.f() == 30 || this.b.f() == 25) {
            this.c.a(this.a.a()).b().c(3293);
            this.b.c(10);
        } else {
            this.c.a(this.a.a()).b().c(3292);
            this.b.c(30);
        }
        bko e = fde.e(this.a.a());
        for (String a : this.b.b()) {
            this.d.a(e, a, this.b.f());
        }
        this.b.u();
    }
}
