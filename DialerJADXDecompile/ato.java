import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.android.dialer.app.widget.SearchEditTextLayout;

/* compiled from: PG */
public final class ato implements AnimatorUpdateListener {
    private /* synthetic */ SearchEditTextLayout a;

    public ato(SearchEditTextLayout searchEditTextLayout) {
        this.a = searchEditTextLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
