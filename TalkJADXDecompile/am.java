import android.support.design.widget.Snackbar;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

public final class am implements AnimationListener {
    final /* synthetic */ int a;
    final /* synthetic */ Snackbar b;

    am(Snackbar snackbar, int i) {
        this.b = snackbar;
        this.a = i;
    }

    public void onAnimationEnd(Animation animation) {
        this.b.a(this.a);
    }

    public void onAnimationStart(Animation animation) {
    }

    public void onAnimationRepeat(Animation animation) {
    }
}
