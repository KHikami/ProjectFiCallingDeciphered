package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.google.android.apps.hangouts.views.MessageListAnimationManager.AnimateInNewMessageRunnable;

/* renamed from: gpj */
public final class gpj implements AnimatorListener {
    final /* synthetic */ AnimateInNewMessageRunnable a;

    public gpj(AnimateInNewMessageRunnable animateInNewMessageRunnable) {
        this.a = animateInNewMessageRunnable;
    }

    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.a.a();
    }
}
