package p000;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

final class jyb implements AnimatorListener {
    public boolean f21273a;
    final /* synthetic */ jya f21274b;

    jyb(jya jya) {
        this.f21274b = jya;
    }

    public void onAnimationStart(Animator animator) {
        this.f21273a = false;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.f21273a && !this.f21274b.al) {
            animator.start();
        }
    }

    public void onAnimationCancel(Animator animator) {
        this.f21273a = true;
    }

    public void onAnimationRepeat(Animator animator) {
    }
}
