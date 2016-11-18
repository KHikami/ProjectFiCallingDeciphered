package defpackage;

import android.animation.Animator;

final class ivr extends iuf {
    final /* synthetic */ ivp a;

    ivr(ivp ivp) {
        this.a = ivp;
    }

    public void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            this.a.d = null;
            return;
        }
        super.setVisible(this.a.b, false);
        this.a.a.cancel();
        this.a.b();
        if (this.a.d != null) {
            this.a.d.run();
            this.a.d = null;
        }
    }
}
