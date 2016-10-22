import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.google.android.apps.hangouts.conversation.v2.FloatingButtonWithCounter;

public final class chr implements AnimatorListener {
    final /* synthetic */ FloatingButtonWithCounter a;

    public chr(FloatingButtonWithCounter floatingButtonWithCounter) {
        this.a = floatingButtonWithCounter;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.c();
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
