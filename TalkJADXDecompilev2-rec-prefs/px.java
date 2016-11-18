package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

public final class px implements AnimatorUpdateListener {
    final /* synthetic */ qa f28983a;
    final /* synthetic */ View f28984b;

    public px(qa qaVar, View view) {
        this.f28983a = qaVar;
        this.f28984b = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f28983a.m33673a();
    }
}
