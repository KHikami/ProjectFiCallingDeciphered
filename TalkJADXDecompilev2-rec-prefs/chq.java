package p000;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.google.android.apps.hangouts.conversation.v2.FloatingButtonWithCounter;

public final class chq implements AnimatorListener {
    final /* synthetic */ FloatingButtonWithCounter f5343a;

    public chq(FloatingButtonWithCounter floatingButtonWithCounter) {
        this.f5343a = floatingButtonWithCounter;
    }

    public void onAnimationEnd(Animator animator) {
        this.f5343a.f6067a.m10452b(this.f5343a.getContext().getResources().getColor(ba.iZ));
        this.f5343a.f6067a.clearColorFilter();
        this.f5343a.findViewById(gwb.lr).setVisibility(0);
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
