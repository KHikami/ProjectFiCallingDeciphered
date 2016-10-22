package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.google.android.apps.hangouts.conversation.v2.FloatingButtonWithCounter;

/* renamed from: chq */
public final class chq implements AnimatorListener {
    final /* synthetic */ FloatingButtonWithCounter a;

    public chq(FloatingButtonWithCounter floatingButtonWithCounter) {
        this.a = floatingButtonWithCounter;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.a.b(this.a.getContext().getResources().getColor(ba.iZ));
        this.a.a.clearColorFilter();
        this.a.findViewById(gwb.lr).setVisibility(0);
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
