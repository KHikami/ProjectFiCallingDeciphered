import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
final class atf implements AnimatorUpdateListener {
    private /* synthetic */ atd a;

    atf(atd atd) {
        this.a = atd;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * ((float) this.a.a.x())));
    }
}
