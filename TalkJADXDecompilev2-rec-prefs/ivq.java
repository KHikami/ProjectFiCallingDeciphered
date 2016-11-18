package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class ivq extends AnimatorListenerAdapter {
    final /* synthetic */ ivp f19190a;

    ivq(ivp ivp) {
        this.f19190a = ivp;
    }

    public void onAnimationEnd(Animator animator) {
        if (this.f19190a.f19171c != null) {
            this.f19190a.f19171c.run();
            this.f19190a.f19171c = null;
        }
    }
}
