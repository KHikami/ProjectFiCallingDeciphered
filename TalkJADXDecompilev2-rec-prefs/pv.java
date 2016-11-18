package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class pv extends AnimatorListenerAdapter {
    final /* synthetic */ py f28979a;
    final /* synthetic */ View f28980b;

    public pv(py pyVar, View view) {
        this.f28979a = pyVar;
        this.f28980b = view;
    }

    public void onAnimationCancel(Animator animator) {
        this.f28979a.mo39c(this.f28980b);
    }

    public void onAnimationEnd(Animator animator) {
        this.f28979a.mo38b(this.f28980b);
    }

    public void onAnimationStart(Animator animator) {
        this.f28979a.mo37a(this.f28980b);
    }
}
