import android.support.design.widget.Snackbar;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

public final class w implements AnimationListener {
    private /* synthetic */ int a;
    private /* synthetic */ Snackbar b;

    w(Snackbar snackbar, int i) {
        this.b = snackbar;
        this.a = i;
    }

    public final void onAnimationEnd(Animation animation) {
        this.b.c(this.a);
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationRepeat(Animation animation) {
    }
}
