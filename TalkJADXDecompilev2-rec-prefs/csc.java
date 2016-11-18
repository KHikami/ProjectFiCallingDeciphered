package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

final class csc implements AnimatorUpdateListener {
    final /* synthetic */ csb f8978a;

    csc(csb csb) {
        this.f8978a = csb;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f8978a.f8974b.mo1397a(this.f8978a.f8973a, gwb.m1507a((Integer) valueAnimator.getAnimatedValue()));
        this.f8978a.f8973a.requestLayout();
    }
}
