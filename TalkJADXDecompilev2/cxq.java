package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.hangouts.floatingactionbutton.impl.FloatingActionButton;

public final class cxq implements AnimatorUpdateListener {
    final /* synthetic */ FloatingActionButton a;

    public cxq(FloatingActionButton floatingActionButton) {
        this.a = floatingActionButton;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        this.a.f = gwb.a(f);
        this.a.invalidate();
    }
}
