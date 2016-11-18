package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.hangouts.floatingactionbutton.impl.FloatingActionButton;

public final class cxq implements AnimatorUpdateListener {
    final /* synthetic */ FloatingActionButton f9267a;

    public cxq(FloatingActionButton floatingActionButton) {
        this.f9267a = floatingActionButton;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        this.f9267a.f6217f = gwb.m1480a(f);
        this.f9267a.invalidate();
    }
}
