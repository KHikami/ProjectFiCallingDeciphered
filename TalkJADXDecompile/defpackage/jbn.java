package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;

/* renamed from: jbn */
public final class jbn {
    private final jbm a;
    private Animator b;

    public jbn(jbm jbm) {
        this.b = new AnimatorSet();
        this.a = jbm;
    }

    private void a() {
        if (this.b.isStarted()) {
            this.b.end();
        }
    }

    public void a(Animator animator) {
        a();
        if (this.a.c()) {
            this.b = animator;
            this.b.start();
        }
    }

    public void b(Animator animator) {
        a();
        if (!this.a.c()) {
            this.b = animator;
            this.b.start();
        }
    }
}
