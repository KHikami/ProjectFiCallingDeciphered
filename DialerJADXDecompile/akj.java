import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

/* compiled from: PG */
final class akj implements AnimatorUpdateListener {
    private /* synthetic */ View a;
    private /* synthetic */ int b;
    private /* synthetic */ int c;
    private /* synthetic */ int d;
    private /* synthetic */ int e;

    akj(View view, int i, int i2, int i3, int i4) {
        this.a = view;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        this.a.getLayoutParams().width = (int) ((f.floatValue() * ((float) this.b)) + ((float) this.c));
        this.a.getLayoutParams().height = (int) ((f.floatValue() * ((float) this.d)) + ((float) this.e));
        this.a.requestLayout();
    }
}
