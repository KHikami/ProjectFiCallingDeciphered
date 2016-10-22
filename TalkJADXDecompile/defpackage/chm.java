package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: chm */
public final class chm extends AnimatorListenerAdapter {
    final /* synthetic */ View a;

    public chm(View view) {
        this.a = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.setVisibility(8);
    }
}
