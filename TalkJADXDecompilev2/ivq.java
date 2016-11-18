package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class ivq extends AnimatorListenerAdapter {
    final /* synthetic */ ivp a;

    ivq(ivp ivp) {
        this.a = ivp;
    }

    public void onAnimationEnd(Animator animator) {
        if (this.a.c != null) {
            this.a.c.run();
            this.a.c = null;
        }
    }
}
