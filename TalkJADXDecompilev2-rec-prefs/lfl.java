package p000;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class lfl implements jca, jcm, kaw, kcd, kcg, kcj, kcm, kcn, kco, kcp, kcq {
    int f24906a = -1;
    boolean f24907b = true;
    private final List<jcc> f24908c = new ArrayList();
    private final Activity f24909d;
    private final jcf f24910e;
    private final lfj f24911f;
    private boolean f24912g = false;
    private boolean f24913h = false;
    private Runnable f24914i = null;
    private Throwable f24915j = null;

    lfl(Activity activity, jcf jcf, kbu kbu, lfj lfj) {
        this.f24909d = activity;
        this.f24910e = jcf;
        this.f24911f = lfj;
        kbu.m25514a((kcq) this);
    }

    private void m28979a(int i) {
        gwb.aJ();
        int i2 = this.f24906a;
        m28983b(-1);
        this.f24906a = -1;
        if (this.f24907b) {
            m28980a(new lfm(this, this.f24906a));
        } else if (-1 != i2) {
            int i3 = this.f24906a;
            bm.m6150b(!this.f24907b);
            m28980a(new lfn(this, i2, i3));
        }
    }

    private void m28984d() {
        m28979a(-1);
    }

    public void mo643a(Bundle bundle) {
        this.f24910e.mo3460a((jcm) this);
        this.f24912g = true;
    }

    public void z_() {
        this.f24912g = true;
        m28985e();
        m28986f();
    }

    public void b_(Bundle bundle) {
        if (!this.f24913h) {
            this.f24913h = true;
            if (bundle != null) {
                return;
            }
            if (mo2319b()) {
                this.f24911f.m28977b(lhc.I_AM_THE_FRAMEWORK);
            } else {
                this.f24911f.m28975a(lhc.I_AM_THE_FRAMEWORK);
            }
        }
    }

    public void R_() {
        this.f24912g = true;
        m28985e();
        m28986f();
    }

    public void T_() {
        this.f24912g = false;
    }

    public void mo645b(Bundle bundle) {
        this.f24912g = false;
    }

    public void A_() {
        this.f24912g = false;
    }

    public void o_() {
        this.f24910e.mo3465b((jcm) this);
    }

    public void S_() {
        if (this.f24912g) {
            m28985e();
        }
    }

    public int mo2317a() {
        gwb.aJ();
        return this.f24906a;
    }

    public boolean mo2319b() {
        gwb.aJ();
        return this.f24906a != -1;
    }

    public jch mo2320c() {
        gwb.aJ();
        return this.f24910e.mo3456a(this.f24906a);
    }

    public jca mo2318a(jcc jcc) {
        this.f24908c.add(jcc);
        return this;
    }

    private void m28982a(boolean z, jcb jcb, jcb jcb2, int i, int i2) {
        if (z && i2 != i) {
            ((lhl) this.f24909d).mo1202h();
            if (this.f24909d instanceof dw) {
                ed J_ = ((dw) this.f24909d).J_();
                ew a = J_.mo1845a();
                if (J_.mo1850d() != null) {
                    for (dr drVar : J_.mo1850d()) {
                        if (drVar != null && (drVar instanceof lhj)) {
                            a.mo1527a(drVar);
                        }
                    }
                    a.mo1522a();
                    J_.mo1848b();
                }
            }
            if (Log.isLoggable("@AccountRequires", 3)) {
                new StringBuilder(45).append("Account Transition: ").append(i).append(" > ").append(i2);
            }
        }
        for (jcc a2 : this.f24908c) {
            a2.mo1133a(z, jcb, jcb2, i, i2);
        }
        if (!this.f24913h) {
            return;
        }
        if (mo2319b()) {
            this.f24911f.m28977b(lhc.I_AM_THE_FRAMEWORK);
            return;
        }
        Throwable illegalStateException;
        lfj lfj = this.f24911f;
        lhc lhc = lhc.I_AM_THE_FRAMEWORK;
        if (this.f24915j == null) {
            illegalStateException = new IllegalStateException("Accounts not available.");
        } else {
            illegalStateException = this.f24915j;
        }
        lfj.m28976a(lhc, illegalStateException);
        this.f24915j = null;
    }

    private void m28985e() {
        if (!m28983b(this.f24906a)) {
            m28984d();
        }
    }

    private boolean m28983b(int i) {
        return i == -1 || this.f24910e.mo3467c(i);
    }

    private void m28980a(Runnable runnable) {
        if (this.f24912g) {
            runnable.run();
        } else {
            this.f24914i = ljy.m29195a(runnable);
        }
    }

    private void m28986f() {
        if (this.f24914i != null) {
            this.f24914i.run();
            this.f24914i = null;
        }
    }
}
