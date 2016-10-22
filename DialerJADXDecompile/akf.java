import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
final class akf extends AnimatorListenerAdapter {
    private /* synthetic */ View a;
    private /* synthetic */ akk b;

    akf(View view, akk akk) {
        this.a = view;
        this.b = akk;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.setVisibility(8);
        if (this.b != null) {
            this.b.a();
        }
    }

    public final void onAnimationCancel(Animator animator) {
        this.a.setVisibility(8);
        this.a.setAlpha(0.0f);
        if (this.b != null) {
            this.b.b();
        }
    }
}
