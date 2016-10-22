import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
final class azh extends AnimatorListenerAdapter {
    private /* synthetic */ azg a;

    azh(azg azg) {
        this.a = azg;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (!this.a.a) {
            this.a.b.j.setVisibility(8);
        }
    }

    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        if (this.a.a) {
            this.a.b.j.setVisibility(0);
        }
    }
}
