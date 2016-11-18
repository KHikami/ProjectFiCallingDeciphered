package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class buf extends AnimatorListenerAdapter {
    final /* synthetic */ aer f4499a;
    final /* synthetic */ View f4500b;
    final /* synthetic */ bue f4501c;

    buf(bue bue, aer aer, View view) {
        this.f4501c = bue;
        this.f4499a = aer;
        this.f4500b = view;
    }

    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationCancel(Animator animator) {
        this.f4500b.setTranslationY(0.0f);
        this.f4500b.setAlpha(1.0f);
    }

    public void onAnimationEnd(Animator animator) {
        this.f4501c.f4489a.remove(this.f4499a);
        this.f4501c.m327f(this.f4499a);
        this.f4501c.m6708c();
    }
}
