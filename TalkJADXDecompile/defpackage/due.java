package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.view.View;

/* renamed from: due */
final class due implements AnimatorListener {
    final /* synthetic */ dug a;
    final /* synthetic */ ObjectAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ dua d;

    due(dua dua, dug dug, ObjectAnimator objectAnimator, View view) {
        this.d = dua;
        this.a = dug;
        this.b = objectAnimator;
        this.c = view;
    }

    public void onAnimationStart(Animator animator) {
        this.d.c.put(this.a, this.b);
    }

    public void onAnimationEnd(Animator animator) {
        if (this.d.c.containsValue(this.b)) {
            this.c.setAlpha(1.0f);
            this.d.b.c(this.a);
            this.d.c.remove(this.a);
        }
    }

    public void onAnimationCancel(Animator animator) {
        this.d.c.remove(this.a);
    }

    public void onAnimationRepeat(Animator animator) {
    }
}
