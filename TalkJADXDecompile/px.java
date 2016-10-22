import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

public final class px implements AnimatorUpdateListener {
    final /* synthetic */ qa a;
    final /* synthetic */ View b;

    public px(qa qaVar, View view) {
        this.a = qaVar;
        this.b = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a();
    }
}
