package p000;

import com.google.android.apps.hangouts.hangout.HangoutFragment;
import java.util.Collections;

public final class dhu {
    final /* synthetic */ HangoutFragment f9770a;

    public dhu(HangoutFragment hangoutFragment) {
        this.f9770a = hangoutFragment;
    }

    bko m11848a() {
        return this.f9770a.ak;
    }

    dw m11851b() {
        return this.f9770a.f6342d;
    }

    public int m11853c() {
        return this.f9770a.al;
    }

    void m11854d() {
        this.f9770a.f6344f.m11730v();
        if (this.f9770a.al == 0 || this.f9770a.al == 1) {
            this.f9770a.m8580a(2);
        }
    }

    public ed m11855e() {
        return this.f9770a.getFragmentManager();
    }

    fg m11856f() {
        return this.f9770a.getLoaderManager();
    }

    public int m11857g() {
        return this.f9770a.m8595v();
    }

    public int m11858h() {
        did s = this.f9770a.f6344f.m11727s();
        if (this.f9770a.ak.m5642k()) {
            return 0;
        }
        if (s == null || !s.m11938A()) {
            return 1;
        }
        return 2;
    }

    public void m11850a(String str) {
        boolean z;
        HangoutFragment hangoutFragment = this.f9770a;
        if (this.f9770a.f6346h) {
            z = false;
        } else {
            z = true;
        }
        hangoutFragment.m8583a(str, z);
    }

    boolean m11859i() {
        return this.f9770a.f6346h;
    }

    void m11849a(int i) {
        this.f9770a.aj.setVisibility(i);
        if (i == 0 && this.f9770a.f6345g != null) {
            gld.m17933a(this.f9770a.f6347i, this.f9770a.f6345g, m11851b().getString(bc.f2944b));
        }
    }

    public void m11852b(int i) {
        this.f9770a.as = i;
        glk.m17970a("Babel_calls", "Switch camera menu item visibility is now " + i, new Object[0]);
        this.f9770a.m8587c();
    }

    public void m11860j() {
        this.f9770a.m8587c();
    }

    void m11861k() {
        this.f9770a.m8588d();
    }

    public void m11862l() {
        glk.m17979c("Babel_calls", "HangoutFragment onExit with state: " + this.f9770a.al, new Object[0]);
        did s = this.f9770a.f6344f.m11727s();
        if (s != null) {
            s.m11973b(11004);
        } else {
            this.f9770a.f6342d.m8568n();
        }
    }

    public void m11863m() {
        if (this.f9770a.f6341c.mo1882a("android.permission.CAMERA")) {
            this.f9770a.mo495a();
        } else {
            this.f9770a.f6340b.mo1886a(new eie(HangoutFragment.f6339a, 2657), Collections.singletonList("android.permission.CAMERA"));
        }
    }

    public ish m11864n() {
        return this.f9770a.am;
    }
}
