package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.google.android.apps.hangouts.peoplelistv2.impl.ScrollViewCustom;

public final class ehx implements AnimatorListener {
    final /* synthetic */ ScrollViewCustom a;

    public ehx(ScrollViewCustom scrollViewCustom) {
        this.a = scrollViewCustom;
    }

    public void onAnimationStart(Animator animator) {
        this.a.c = true;
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.a.c = false;
        this.a.b.post(this.a.d);
    }

    public void onAnimationCancel(Animator animator) {
        this.a.c = false;
        this.a.b.post(this.a.d);
    }
}
