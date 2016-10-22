package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: bbu */
public final class bbu extends AnimatorListenerAdapter {
    final /* synthetic */ View a;

    public bbu(View view) {
        this.a = view;
    }

    public void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
    }

    public void onAnimationEnd(Animator animator) {
        if (this.a.getAlpha() == 0.0f) {
            this.a.setVisibility(8);
        }
    }
}
