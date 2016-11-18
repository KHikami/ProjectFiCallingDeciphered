package p000;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.widget.ImageView;
import com.google.android.apps.hangouts.conversation.v2.FloatingButtonWithCounter;

public final class chp implements AnimatorListener {
    final /* synthetic */ ImageView f5341a;
    final /* synthetic */ FloatingButtonWithCounter f5342b;

    public chp(FloatingButtonWithCounter floatingButtonWithCounter, ImageView imageView) {
        this.f5342b = floatingButtonWithCounter;
        this.f5341a = imageView;
    }

    public void onAnimationEnd(Animator animator) {
        if (this.f5341a != null) {
            this.f5341a.setVisibility(0);
        }
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
