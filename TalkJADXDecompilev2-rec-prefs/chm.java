package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class chm extends AnimatorListenerAdapter {
    final /* synthetic */ View f5330a;

    public chm(View view) {
        this.f5330a = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f5330a.setVisibility(8);
    }
}
