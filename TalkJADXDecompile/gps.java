import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

final class gps implements AnimatorListener {
    final /* synthetic */ gpr a;

    gps(gpr gpr) {
        this.a = gpr;
    }

    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationCancel(Animator animator) {
        a();
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        a();
    }

    private void a() {
        this.a.a.f = false;
        this.a.a.b(true);
    }
}
