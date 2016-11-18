package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class jby extends AnimatorListenerAdapter {
    final /* synthetic */ View f19841a;

    public jby(View view) {
        this.f19841a = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f19841a.setVisibility(8);
    }
}
