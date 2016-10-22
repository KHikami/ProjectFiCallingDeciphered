import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

final class bj implements AnimatorUpdateListener {
    final /* synthetic */ bf a;
    final /* synthetic */ bi b;

    bj(bi biVar, bf bfVar) {
        this.b = biVar;
        this.a = bfVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a();
    }
}
