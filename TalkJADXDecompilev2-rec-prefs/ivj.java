package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class ivj extends AnimatorListenerAdapter {
    final /* synthetic */ ivi f19147a;

    ivj(ivi ivi) {
        this.f19147a = ivi;
    }

    public void onAnimationStart(Animator animator) {
        if (!this.f19147a.f19122a.isStarted()) {
            this.f19147a.f19122a.start();
        }
    }
}
