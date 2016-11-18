package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class pw extends AnimatorListenerAdapter {
    final /* synthetic */ py f28981a;
    final /* synthetic */ View f28982b;

    public pw(py pyVar, View view) {
        this.f28981a = pyVar;
        this.f28982b = view;
    }

    public void onAnimationCancel(Animator animator) {
        this.f28981a.mo39c(this.f28982b);
    }

    public void onAnimationEnd(Animator animator) {
        this.f28981a.mo38b(this.f28982b);
    }

    public void onAnimationStart(Animator animator) {
        this.f28981a.mo37a(this.f28982b);
    }
}
