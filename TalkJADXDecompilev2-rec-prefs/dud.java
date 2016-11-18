package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

final class dud implements AnimatorUpdateListener {
    final /* synthetic */ View f10551a;
    final /* synthetic */ dua f10552b;

    dud(dua dua, View view) {
        this.f10552b = dua;
        this.f10551a = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        dua.m12695a(this.f10551a);
    }
}
