package p000;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

final class gps implements AnimatorListener {
    final /* synthetic */ gpr f15880a;

    gps(gpr gpr) {
        this.f15880a = gpr;
    }

    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationCancel(Animator animator) {
        m18281a();
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        m18281a();
    }

    private void m18281a() {
        this.f15880a.f15879a.f7075f = false;
        this.f15880a.f15879a.m9479b(true);
    }
}
