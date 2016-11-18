package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

final class duc implements AnimatorUpdateListener {
    final /* synthetic */ View f10549a;
    final /* synthetic */ dua f10550b;

    duc(dua dua, View view) {
        this.f10550b = dua;
        this.f10549a = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        dua.m12695a(this.f10549a);
    }
}
