package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class buj extends AnimatorListenerAdapter {
    final /* synthetic */ bui f4511a;
    private final View f4512b;

    public buj(bui bui, View view) {
        this.f4511a = bui;
        this.f4512b = view;
    }

    public void onAnimationStart(Animator animator) {
        if (!this.f4511a.f4509d) {
            this.f4511a.f4509d = true;
        }
    }

    public void onAnimationCancel(Animator animator) {
        this.f4511a.f4507b.m6715a(this.f4512b);
    }

    public void onAnimationEnd(Animator animator) {
        this.f4511a.f4507b.m6717b(this.f4512b);
        bui bui = this.f4511a;
        int i = bui.f4508c - 1;
        bui.f4508c = i;
        if (i == 0) {
            this.f4511a.f4510e.f4490b.remove(this.f4511a.f4506a);
            this.f4511a.f4510e.m327f(this.f4511a.f4506a);
            this.f4511a.f4510e.m6708c();
        }
    }
}
