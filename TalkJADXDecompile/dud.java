import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

final class dud implements AnimatorUpdateListener {
    final /* synthetic */ View a;
    final /* synthetic */ dua b;

    dud(dua dua, View view) {
        this.b = dua;
        this.a = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        dua.a(this.a);
    }
}
