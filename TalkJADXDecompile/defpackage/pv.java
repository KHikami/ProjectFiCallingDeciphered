package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: pv */
public final class pv extends AnimatorListenerAdapter {
    final /* synthetic */ py a;
    final /* synthetic */ View b;

    public pv(py pyVar, View view) {
        this.a = pyVar;
        this.b = view;
    }

    public void onAnimationCancel(Animator animator) {
        this.a.c(this.b);
    }

    public void onAnimationEnd(Animator animator) {
        this.a.b(this.b);
    }

    public void onAnimationStart(Animator animator) {
        this.a.a(this.b);
    }
}
