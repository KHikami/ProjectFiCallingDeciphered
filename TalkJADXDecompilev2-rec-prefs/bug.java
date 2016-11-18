package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class bug extends AnimatorListenerAdapter {
    final /* synthetic */ aer f4502a;
    final /* synthetic */ View f4503b;
    final /* synthetic */ bue f4504c;

    bug(bue bue, aer aer, View view) {
        this.f4504c = bue;
        this.f4502a = aer;
        this.f4503b = view;
    }

    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationCancel(Animator animator) {
        this.f4503b.setTranslationX(0.0f);
        this.f4503b.setTranslationY(0.0f);
    }

    public void onAnimationEnd(Animator animator) {
        this.f4504c.f4491c.remove(this.f4502a);
        this.f4504c.m327f(this.f4502a);
        this.f4504c.m6708c();
    }
}
