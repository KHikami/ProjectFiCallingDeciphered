package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

/* renamed from: jyb */
final class jyb implements AnimatorListener {
    public boolean a;
    final /* synthetic */ jya b;

    jyb(jya jya) {
        this.b = jya;
    }

    public void onAnimationStart(Animator animator) {
        this.a = false;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.a && !this.b.al) {
            animator.start();
        }
    }

    public void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    public void onAnimationRepeat(Animator animator) {
    }
}
