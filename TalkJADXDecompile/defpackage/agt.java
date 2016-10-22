package defpackage;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: agt */
final class agt implements AnimationListener {
    final /* synthetic */ agp a;

    agt(agp agp) {
        this.a = agp;
    }

    public void onAnimationEnd(Animation animation) {
        this.a.q();
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
