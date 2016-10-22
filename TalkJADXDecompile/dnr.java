import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

final class dnr implements jza, kcj, kcm, kcq {
    final dw a;
    doh b;
    dna c;
    dng d;
    dnf e;
    private final dmz f;
    private final Handler g;
    private Runnable h;
    private boolean i;

    dnr(dw dwVar, kbu kbu) {
        this.a = dwVar;
        this.g = new Handler(Looper.getMainLooper());
        this.f = new dns(this);
        kbu.a((kcq) this);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.b = (doh) jyn.a(doh.class);
        this.c = (dna) jyn.a(dna.class);
    }

    public void R_() {
        this.i = true;
        this.c.a(this.f);
        if (this.c.a() != null) {
            a(this.c.a());
        }
    }

    public void T_() {
        this.i = false;
        this.c.b(this.f);
        c();
        if (this.e != null) {
            this.e.b();
            this.e = null;
        }
    }

    void a(lym lym) {
        if (lym != null && this.e == null && this.i) {
            this.h = new dnu(this, lym);
            this.g.postDelayed(this.h, 1000);
        }
    }

    void c() {
        if (this.h != null) {
            this.g.removeCallbacks(this.h);
            this.h = null;
        }
        if (this.d != null) {
            this.d.b();
            this.d = null;
        }
    }
}
