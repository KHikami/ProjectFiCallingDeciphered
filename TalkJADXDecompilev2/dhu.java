package defpackage;

import com.google.android.apps.hangouts.hangout.HangoutFragment;
import java.util.Collections;

public final class dhu {
    final /* synthetic */ HangoutFragment a;

    public dhu(HangoutFragment hangoutFragment) {
        this.a = hangoutFragment;
    }

    bko a() {
        return this.a.ak;
    }

    dw b() {
        return this.a.d;
    }

    public int c() {
        return this.a.al;
    }

    void d() {
        this.a.f.v();
        if (this.a.al == 0 || this.a.al == 1) {
            this.a.a(2);
        }
    }

    public ed e() {
        return this.a.getFragmentManager();
    }

    fg f() {
        return this.a.getLoaderManager();
    }

    public int g() {
        return this.a.v();
    }

    public int h() {
        did s = this.a.f.s();
        if (this.a.ak.k()) {
            return 0;
        }
        if (s == null || !s.A()) {
            return 1;
        }
        return 2;
    }

    public void a(String str) {
        boolean z;
        HangoutFragment hangoutFragment = this.a;
        if (this.a.h) {
            z = false;
        } else {
            z = true;
        }
        hangoutFragment.a(str, z);
    }

    boolean i() {
        return this.a.h;
    }

    void a(int i) {
        this.a.aj.setVisibility(i);
        if (i == 0 && this.a.g != null) {
            gld.a(this.a.i, this.a.g, b().getString(bc.b));
        }
    }

    public void b(int i) {
        this.a.as = i;
        glk.a("Babel_calls", "Switch camera menu item visibility is now " + i, new Object[0]);
        this.a.c();
    }

    public void j() {
        this.a.c();
    }

    void k() {
        this.a.d();
    }

    public void l() {
        glk.c("Babel_calls", "HangoutFragment onExit with state: " + this.a.al, new Object[0]);
        did s = this.a.f.s();
        if (s != null) {
            s.b(11004);
        } else {
            this.a.d.n();
        }
    }

    public void m() {
        if (this.a.c.a("android.permission.CAMERA")) {
            this.a.a();
        } else {
            this.a.b.a(new eie(HangoutFragment.a, 2657), Collections.singletonList("android.permission.CAMERA"));
        }
    }

    public ish n() {
        return this.a.am;
    }
}
