import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

final class jft implements AnimatorListener {
    final /* synthetic */ jfq a;
    private final jfr b;

    public jft(jfq jfq, jfr jfr) {
        this.a = jfq;
        this.b = jfr;
    }

    public void onAnimationStart(Animator animator) {
        this.a.a(this.b);
    }

    public void onAnimationEnd(Animator animator) {
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }
}
