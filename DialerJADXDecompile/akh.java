import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
final class akh extends AnimatorListenerAdapter {
    private /* synthetic */ View a;

    akh(View view) {
        this.a = view;
    }

    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
    }

    public final void onAnimationCancel(Animator animator) {
        this.a.setScaleX(1.0f);
        this.a.setScaleY(1.0f);
    }
}
