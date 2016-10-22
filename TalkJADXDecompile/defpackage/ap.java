package defpackage;

import android.support.design.widget.Snackbar;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: ap */
public final class ap implements AnimationListener {
    final /* synthetic */ Snackbar a;

    public ap(Snackbar snackbar) {
        this.a = snackbar;
    }

    public void onAnimationEnd(Animation animation) {
        this.a.c();
    }

    public void onAnimationStart(Animation animation) {
    }

    public void onAnimationRepeat(Animation animation) {
    }
}
