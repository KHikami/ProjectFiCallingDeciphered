package p000;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.view.View;
import com.google.android.apps.hangouts.peoplelistv2.impl.EditParticipantsView;

public final class egh implements AnimatorListener {
    final /* synthetic */ EditParticipantsView f11411a;

    public egh(EditParticipantsView editParticipantsView) {
        this.f11411a = editParticipantsView;
    }

    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.f11411a.f6517d.removeView((View) ((ObjectAnimator) animator).getTarget());
        this.f11411a.m8766a();
    }

    public void onAnimationCancel(Animator animator) {
        this.f11411a.f6517d.removeView((View) ((ObjectAnimator) animator).getTarget());
        this.f11411a.m8766a();
    }
}
