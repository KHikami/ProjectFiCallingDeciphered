package p000;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.google.android.apps.hangouts.conversation.v2.FloatingButtonWithCounter;

public final class chr implements AnimatorListener {
    final /* synthetic */ FloatingButtonWithCounter f5344a;

    public chr(FloatingButtonWithCounter floatingButtonWithCounter) {
        this.f5344a = floatingButtonWithCounter;
    }

    public void onAnimationEnd(Animator animator) {
        this.f5344a.m8346c();
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
