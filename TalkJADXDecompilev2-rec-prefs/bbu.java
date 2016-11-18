package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class bbu extends AnimatorListenerAdapter {
    final /* synthetic */ View f2908a;

    public bbu(View view) {
        this.f2908a = view;
    }

    public void onAnimationStart(Animator animator) {
        this.f2908a.setVisibility(0);
    }

    public void onAnimationEnd(Animator animator) {
        if (this.f2908a.getAlpha() == 0.0f) {
            this.f2908a.setVisibility(8);
        }
    }
}
