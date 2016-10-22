import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

final class cav extends caw implements cat, jej, jza {
    private jca b;
    private byq c;
    private iih d;
    private fit e;

    public cav(Context context, kbu kbu) {
        super(context, kbu);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        super.a(context, jyn, bundle);
        this.b = (jca) jyn.a(jca.class);
        this.c = (byq) jyn.a(byq.class);
        this.d = (iih) jyn.a(iih.class);
        this.e = (fit) jyn.a(fit.class);
        this.a.a(gwb.kW, (jej) this);
    }

    public String b() {
        return this.h.getString(gwb.kX);
    }

    public String c() {
        return gku.a(this.h, a());
    }

    public boolean d() {
        return this.c.f() != 10;
    }

    public boolean e() {
        if (!gwb.i(this.c.e()) || this.c.p().b().size() == 1) {
            return true;
        }
        return false;
    }

    public void g() {
        this.d.a(this.b.a()).b().c(3295);
        a(gwb.kW, this.h.getString(gwb.kX), a(), h(), 1);
    }

    public void a(int i, Intent intent) {
        if (i == -1) {
            Object a = a(intent, h());
            if (!gwb.g(a, this.c.l())) {
                this.d.a(this.b.a()).b().c(1600);
            }
            this.c.f(a);
            this.e.c(fde.e(this.b.a()), this.c.b()[0], a);
            this.c.u();
        }
    }

    private Uri a() {
        if (this.c.l() != null) {
            return gld.c(this.c.l());
        }
        return h();
    }

    private Uri h() {
        return gld.c(gwb.c(fde.e(this.b.a())));
    }
}
