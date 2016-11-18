package p000;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

final class jft implements AnimatorListener {
    final /* synthetic */ jfq f19979a;
    private final jfr f19980b;

    public jft(jfq jfq, jfr jfr) {
        this.f19979a = jfq;
        this.f19980b = jfr;
    }

    public void onAnimationStart(Animator animator) {
        this.f19979a.m24105a(this.f19980b);
    }

    public void onAnimationEnd(Animator animator) {
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }
}
