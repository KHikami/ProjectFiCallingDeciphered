import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
final class acm extends AnimatorListenerAdapter {
    private /* synthetic */ ack a;

    acm(ack ack) {
        this.a = ack;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.a.e.setVisibility(8);
    }

    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
    }
}
