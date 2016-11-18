package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.hangouts.floatingactionbutton.impl.QuickButtonContainer;

public final class cyg implements AnimatorUpdateListener {
    final /* synthetic */ QuickButtonContainer f9329a;

    public cyg(QuickButtonContainer quickButtonContainer) {
        this.f9329a = quickButtonContainer;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.f9329a.f6224a) {
            this.f9329a.setAlpha(valueAnimator.getAnimatedFraction());
        }
    }
}
