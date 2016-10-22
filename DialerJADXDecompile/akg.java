import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
final class akg extends AnimatorListenerAdapter {
    private /* synthetic */ View a;
    private /* synthetic */ akk b;

    akg(View view, akk akk) {
        this.a = view;
        this.b = akk;
    }

    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
    }

    public final void onAnimationCancel(Animator animator) {
        this.a.setAlpha(1.0f);
        if (this.b != null) {
            this.b.b();
        }
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.b != null) {
            this.b.a();
        }
    }
}
