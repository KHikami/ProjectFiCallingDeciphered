package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;

public final class jbn {
    private final jbm f19726a;
    private Animator f19727b = new AnimatorSet();

    public jbn(jbm jbm) {
        this.f19726a = jbm;
    }

    private void m23793a() {
        if (this.f19727b.isStarted()) {
            this.f19727b.end();
        }
    }

    public void m23794a(Animator animator) {
        m23793a();
        if (this.f19726a.mo1081c()) {
            this.f19727b = animator;
            this.f19727b.start();
        }
    }

    public void m23795b(Animator animator) {
        m23793a();
        if (!this.f19726a.mo1081c()) {
            this.f19727b = animator;
            this.f19727b.start();
        }
    }
}
