package defpackage;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: agv */
final class agv implements AnimationListener {
    final /* synthetic */ agp a;

    agv(agp agp) {
        this.a = agp;
    }

    public void onAnimationEnd(Animation animation) {
        agp agp = this.a;
        agp.c.finish();
        agp.c.overridePendingTransition(0, 0);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
