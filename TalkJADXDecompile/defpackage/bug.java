package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: bug */
final class bug extends AnimatorListenerAdapter {
    final /* synthetic */ aer a;
    final /* synthetic */ View b;
    final /* synthetic */ bue c;

    bug(bue bue, aer aer, View view) {
        this.c = bue;
        this.a = aer;
        this.b = view;
    }

    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationCancel(Animator animator) {
        this.b.setTranslationX(0.0f);
        this.b.setTranslationY(0.0f);
    }

    public void onAnimationEnd(Animator animator) {
        this.c.c.remove(this.a);
        this.c.f(this.a);
        this.c.c();
    }
}
