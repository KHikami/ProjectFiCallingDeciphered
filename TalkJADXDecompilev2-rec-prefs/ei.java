package p000;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class ei implements AnimationListener {
    private AnimationListener f11482a;
    private boolean f11483b;
    View f11484c;

    public ei(View view, Animation animation) {
        if (view != null && animation != null) {
            this.f11484c = view;
        }
    }

    public ei(View view, Animation animation, AnimationListener animationListener) {
        if (view != null && animation != null) {
            this.f11482a = animationListener;
            this.f11484c = view;
            this.f11483b = true;
        }
    }

    public void onAnimationStart(Animation animation) {
        if (this.f11482a != null) {
            this.f11482a.onAnimationStart(animation);
        }
    }

    public void onAnimationEnd(Animation animation) {
        if (this.f11484c != null && this.f11483b) {
            if (oa.s(this.f11484c) || gwb.m2107c()) {
                this.f11484c.post(new ej(this));
            } else {
                oa.a(this.f11484c, 0, null);
            }
        }
        if (this.f11482a != null) {
            this.f11482a.onAnimationEnd(animation);
        }
    }

    public void onAnimationRepeat(Animation animation) {
        if (this.f11482a != null) {
            this.f11482a.onAnimationRepeat(animation);
        }
    }
}
