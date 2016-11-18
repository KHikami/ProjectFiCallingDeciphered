package p000;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class agv implements AnimationListener {
    final /* synthetic */ agp f690a;

    agv(agp agp) {
        this.f690a = agp;
    }

    public void onAnimationEnd(Animation animation) {
        agp agp = this.f690a;
        agp.f661c.finish();
        agp.f661c.overridePendingTransition(0, 0);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
