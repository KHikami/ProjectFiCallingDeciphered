package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

final class dnr implements jza, kcj, kcm, kcq {
    final dw f10182a;
    doh f10183b;
    dna f10184c;
    dng f10185d;
    dnf f10186e;
    private final dmz f10187f = new dns(this);
    private final Handler f10188g = new Handler(Looper.getMainLooper());
    private Runnable f10189h;
    private boolean f10190i;

    dnr(dw dwVar, kbu kbu) {
        this.f10182a = dwVar;
        kbu.m25514a((kcq) this);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f10183b = (doh) jyn.m25443a(doh.class);
        this.f10184c = (dna) jyn.m25443a(dna.class);
    }

    public void R_() {
        this.f10190i = true;
        this.f10184c.mo1610a(this.f10187f);
        if (this.f10184c.mo1609a() != null) {
            m12316a(this.f10184c.mo1609a());
        }
    }

    public void T_() {
        this.f10190i = false;
        this.f10184c.mo1612b(this.f10187f);
        m12317c();
        if (this.f10186e != null) {
            this.f10186e.m7007b();
            this.f10186e = null;
        }
    }

    void m12316a(lym lym) {
        if (lym != null && this.f10186e == null && this.f10190i) {
            this.f10189h = new dnu(this, lym);
            this.f10188g.postDelayed(this.f10189h, 1000);
        }
    }

    void m12317c() {
        if (this.f10189h != null) {
            this.f10188g.removeCallbacks(this.f10189h);
            this.f10189h = null;
        }
        if (this.f10185d != null) {
            this.f10185d.m7007b();
            this.f10185d = null;
        }
    }
}
