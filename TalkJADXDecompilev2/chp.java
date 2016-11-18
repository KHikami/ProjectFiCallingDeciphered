package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.widget.ImageView;
import com.google.android.apps.hangouts.conversation.v2.FloatingButtonWithCounter;

public final class chp implements AnimatorListener {
    final /* synthetic */ ImageView a;
    final /* synthetic */ FloatingButtonWithCounter b;

    public chp(FloatingButtonWithCounter floatingButtonWithCounter, ImageView imageView) {
        this.b = floatingButtonWithCounter;
        this.a = imageView;
    }

    public void onAnimationEnd(Animator animator) {
        if (this.a != null) {
            this.a.setVisibility(0);
        }
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
