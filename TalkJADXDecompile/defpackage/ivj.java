package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: ivj */
final class ivj extends AnimatorListenerAdapter {
    final /* synthetic */ ivi a;

    ivj(ivi ivi) {
        this.a = ivi;
    }

    public void onAnimationStart(Animator animator) {
        if (!this.a.a.isStarted()) {
            this.a.a.start();
        }
    }
}
