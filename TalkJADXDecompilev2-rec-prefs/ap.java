package p000;

import android.support.design.widget.Snackbar;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

public final class ap implements AnimationListener {
    final /* synthetic */ Snackbar f1984a;

    public ap(Snackbar snackbar) {
        this.f1984a = snackbar;
    }

    public void onAnimationEnd(Animation animation) {
        this.f1984a.m3151c();
    }

    public void onAnimationStart(Animation animation) {
    }

    public void onAnimationRepeat(Animation animation) {
    }
}
