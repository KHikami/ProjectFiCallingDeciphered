import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.view.View;

/* compiled from: PG */
public final class aov implements AnimatorUpdateListener {
    private /* synthetic */ aou a;

    public aov(aou aou) {
        this.a = aou;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        try {
            ColorFilter lightingColorFilter = new LightingColorFilter(-16777216, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            View findViewById = this.a.b().findViewById(aq.ad);
            if (findViewById != null) {
                findViewById.getBackground().setColorFilter(lightingColorFilter);
            }
        } catch (Exception e) {
            valueAnimator.cancel();
        }
    }
}
