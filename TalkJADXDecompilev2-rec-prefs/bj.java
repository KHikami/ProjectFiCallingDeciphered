package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

final class bj implements AnimatorUpdateListener {
    final /* synthetic */ bf f3467a;
    final /* synthetic */ bi f3468b;

    bj(bi biVar, bf bfVar) {
        this.f3468b = biVar;
        this.f3467a = bfVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f3467a.m5037a();
    }
}
