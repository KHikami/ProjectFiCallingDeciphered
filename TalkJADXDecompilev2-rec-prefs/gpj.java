package p000;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.google.android.apps.hangouts.views.MessageListAnimationManager.AnimateInNewMessageRunnable;

public final class gpj implements AnimatorListener {
    final /* synthetic */ AnimateInNewMessageRunnable f15860a;

    public gpj(AnimateInNewMessageRunnable animateInNewMessageRunnable) {
        this.f15860a = animateInNewMessageRunnable;
    }

    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.f15860a.m9432a();
    }
}
