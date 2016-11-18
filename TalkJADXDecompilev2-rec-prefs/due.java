package p000;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.view.View;

final class due implements AnimatorListener {
    final /* synthetic */ dug f10553a;
    final /* synthetic */ ObjectAnimator f10554b;
    final /* synthetic */ View f10555c;
    final /* synthetic */ dua f10556d;

    due(dua dua, dug dug, ObjectAnimator objectAnimator, View view) {
        this.f10556d = dua;
        this.f10553a = dug;
        this.f10554b = objectAnimator;
        this.f10555c = view;
    }

    public void onAnimationStart(Animator animator) {
        this.f10556d.f10533c.put(this.f10553a, this.f10554b);
    }

    public void onAnimationEnd(Animator animator) {
        if (this.f10556d.f10533c.containsValue(this.f10554b)) {
            this.f10555c.setAlpha(1.0f);
            this.f10556d.f10532b.mo1130c(this.f10553a);
            this.f10556d.f10533c.remove(this.f10553a);
        }
    }

    public void onAnimationCancel(Animator animator) {
        this.f10556d.f10533c.remove(this.f10553a);
    }

    public void onAnimationRepeat(Animator animator) {
    }
}
