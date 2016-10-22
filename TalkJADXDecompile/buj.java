import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class buj extends AnimatorListenerAdapter {
    final /* synthetic */ bui a;
    private final View b;

    public buj(bui bui, View view) {
        this.a = bui;
        this.b = view;
    }

    public void onAnimationStart(Animator animator) {
        if (!this.a.d) {
            this.a.d = true;
        }
    }

    public void onAnimationCancel(Animator animator) {
        this.a.b.a(this.b);
    }

    public void onAnimationEnd(Animator animator) {
        this.a.b.b(this.b);
        bui bui = this.a;
        int i = bui.c - 1;
        bui.c = i;
        if (i == 0) {
            this.a.e.b.remove(this.a.a);
            this.a.e.f(this.a.a);
            this.a.e.c();
        }
    }
}
