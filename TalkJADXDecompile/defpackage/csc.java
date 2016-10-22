package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: csc */
final class csc implements AnimatorUpdateListener {
    final /* synthetic */ csb a;

    csc(csb csb) {
        this.a = csb;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.b.a(this.a.a, gwb.a((Integer) valueAnimator.getAnimatedValue()));
        this.a.a.requestLayout();
    }
}
