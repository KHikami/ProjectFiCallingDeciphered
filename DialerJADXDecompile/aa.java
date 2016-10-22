import android.support.design.widget.Snackbar;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* compiled from: PG */
public final class aa implements AnimationListener {
    private /* synthetic */ Snackbar a;

    public aa(Snackbar snackbar) {
        this.a = snackbar;
    }

    public final void onAnimationEnd(Animation animation) {
        this.a.c();
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationRepeat(Animation animation) {
    }
}
