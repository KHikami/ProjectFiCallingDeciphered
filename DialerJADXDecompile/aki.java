import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
final class aki extends AnimatorListenerAdapter {
    private /* synthetic */ View a;

    aki(View view) {
        this.a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.setVisibility(8);
    }

    public final void onAnimationCancel(Animator animator) {
        this.a.setVisibility(8);
        this.a.setScaleX(0.0f);
        this.a.setScaleY(0.0f);
    }
}
