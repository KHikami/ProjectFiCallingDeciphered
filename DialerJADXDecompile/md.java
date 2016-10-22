import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
public final class md extends AnimatorListenerAdapter {
    private /* synthetic */ mg a;
    private /* synthetic */ View b;

    public md(mg mgVar, View view) {
        this.a = mgVar;
        this.b = view;
    }

    public final void onAnimationCancel(Animator animator) {
        this.a.c(this.b);
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.b(this.b);
    }

    public final void onAnimationStart(Animator animator) {
        this.a.a(this.b);
    }
}
