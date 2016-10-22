import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
final class azb extends AnimatorListenerAdapter {
    private /* synthetic */ ayv a;

    azb(ayv ayv) {
        this.a = ayv;
    }

    public final void onAnimationStart(Animator animator) {
        this.a.o.setEnabled(true);
    }
}
