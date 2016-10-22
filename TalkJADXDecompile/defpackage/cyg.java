package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.hangouts.floatingactionbutton.impl.QuickButtonContainer;

/* renamed from: cyg */
public final class cyg implements AnimatorUpdateListener {
    final /* synthetic */ QuickButtonContainer a;

    public cyg(QuickButtonContainer quickButtonContainer) {
        this.a = quickButtonContainer;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.a.a) {
            this.a.setAlpha(valueAnimator.getAnimatedFraction());
        }
    }
}
