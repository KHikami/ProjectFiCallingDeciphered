package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: lfl */
public final class lfl implements jca, jcm, kaw, kcd, kcg, kcj, kcm, kcn, kco, kcp, kcq {
    int a;
    boolean b;
    private final List<jcc> c;
    private final Activity d;
    private final jcf e;
    private final lfj f;
    private boolean g;
    private boolean h;
    private Runnable i;
    private Throwable j;

    lfl(Activity activity, jcf jcf, kbu kbu, lfj lfj) {
        this.c = new ArrayList();
        this.a = -1;
        this.g = false;
        this.b = true;
        this.h = false;
        this.i = null;
        this.j = null;
        this.d = activity;
        this.e = jcf;
        this.f = lfj;
        kbu.a((kcq) this);
    }

    private void a(int i) {
        gwb.aJ();
        int i2 = this.a;
        b(-1);
        this.a = -1;
        if (this.b) {
            a(new lfm(this, this.a));
        } else if (-1 != i2) {
            int i3 = this.a;
            bm.b(!this.b);
            a(new lfn(this, i2, i3));
        }
    }

    private void d() {
        a(-1);
    }

    public void a(Bundle bundle) {
        this.e.a((jcm) this);
        this.g = true;
    }

    public void z_() {
        this.g = true;
        e();
        f();
    }

    public void b_(Bundle bundle) {
        if (!this.h) {
            this.h = true;
            if (bundle != null) {
                return;
            }
            if (b()) {
                this.f.b(lhc.I_AM_THE_FRAMEWORK);
            } else {
                this.f.a(lhc.I_AM_THE_FRAMEWORK);
            }
        }
    }

    public void R_() {
        this.g = true;
        e();
        f();
    }

    public void T_() {
        this.g = false;
    }

    public void b(Bundle bundle) {
        this.g = false;
    }

    public void A_() {
        this.g = false;
    }

    public void o_() {
        this.e.b((jcm) this);
    }

    public void S_() {
        if (this.g) {
            e();
        }
    }

    public int a() {
        gwb.aJ();
        return this.a;
    }

    public boolean b() {
        gwb.aJ();
        return this.a != -1;
    }

    public jch c() {
        gwb.aJ();
        return this.e.a(this.a);
    }

    public jca a(jcc jcc) {
        this.c.add(jcc);
        return this;
    }

    private void a(boolean z, jcb jcb, jcb jcb2, int i, int i2) {
        if (z && i2 != i) {
            ((lhl) this.d).h();
            if (this.d instanceof dw) {
                ed J_ = ((dw) this.d).J_();
                ew a = J_.a();
                if (J_.d() != null) {
                    for (dr drVar : J_.d()) {
                        if (drVar != null && (drVar instanceof lhj)) {
                            a.a(drVar);
                        }
                    }
                    a.a();
                    J_.b();
                }
            }
            if (Log.isLoggable("@AccountRequires", 3)) {
                new StringBuilder(45).append("Account Transition: ").append(i).append(" > ").append(i2);
            }
        }
        for (jcc a2 : this.c) {
            a2.a(z, jcb, jcb2, i, i2);
        }
        if (!this.h) {
            return;
        }
        if (b()) {
            this.f.b(lhc.I_AM_THE_FRAMEWORK);
            return;
        }
        Throwable illegalStateException;
        lfj lfj = this.f;
        lhc lhc = lhc.I_AM_THE_FRAMEWORK;
        if (this.j == null) {
            illegalStateException = new IllegalStateException("Accounts not available.");
        } else {
            illegalStateException = this.j;
        }
        lfj.a(lhc, illegalStateException);
        this.j = null;
    }

    private void e() {
        if (!b(this.a)) {
            d();
        }
    }

    private boolean b(int i) {
        return i == -1 || this.e.c(i);
    }

    private void a(Runnable runnable) {
        if (this.g) {
            runnable.run();
        } else {
            this.i = ljy.a(runnable);
        }
    }

    private void f() {
        if (this.i != null) {
            this.i.run();
            this.i = null;
        }
    }
}
