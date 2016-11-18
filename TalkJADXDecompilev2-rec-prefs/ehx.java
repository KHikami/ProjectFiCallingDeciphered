package p000;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.google.android.apps.hangouts.peoplelistv2.impl.ScrollViewCustom;

public final class ehx implements AnimatorListener {
    final /* synthetic */ ScrollViewCustom f11578a;

    public ehx(ScrollViewCustom scrollViewCustom) {
        this.f11578a = scrollViewCustom;
    }

    public void onAnimationStart(Animator animator) {
        this.f11578a.f6532c = true;
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.f11578a.f6532c = false;
        this.f11578a.f6531b.post(this.f11578a.f6533d);
    }

    public void onAnimationCancel(Animator animator) {
        this.f11578a.f6532c = false;
        this.f11578a.f6531b.post(this.f11578a.f6533d);
    }
}
