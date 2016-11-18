package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.view.View;
import com.google.android.apps.hangouts.peoplelistv2.impl.EditParticipantsView;

public final class egh implements AnimatorListener {
    final /* synthetic */ EditParticipantsView a;

    public egh(EditParticipantsView editParticipantsView) {
        this.a = editParticipantsView;
    }

    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.a.d.removeView((View) ((ObjectAnimator) animator).getTarget());
        this.a.a();
    }

    public void onAnimationCancel(Animator animator) {
        this.a.d.removeView((View) ((ObjectAnimator) animator).getTarget());
        this.a.a();
    }
}
