import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
final class acl extends AnimatorListenerAdapter {
    private /* synthetic */ ack a;

    acl(ack ack) {
        this.a = ack;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
    }

    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        this.a.a.e.setVisibility(0);
    }
}
