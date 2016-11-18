package p000;

import android.support.design.widget.Snackbar;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

public final class am implements AnimationListener {
    final /* synthetic */ int f1266a;
    final /* synthetic */ Snackbar f1267b;

    am(Snackbar snackbar, int i) {
        this.f1267b = snackbar;
        this.f1266a = i;
    }

    public void onAnimationEnd(Animation animation) {
        this.f1267b.m3148a(this.f1266a);
    }

    public void onAnimationStart(Animation animation) {
    }

    public void onAnimationRepeat(Animation animation) {
    }
}
