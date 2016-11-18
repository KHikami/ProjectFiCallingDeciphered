package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class ei implements AnimationListener {
    private AnimationListener a;
    private boolean b;
    View c;

    public ei(View view, Animation animation) {
        if (view != null && animation != null) {
            this.c = view;
        }
    }

    public ei(View view, Animation animation, AnimationListener animationListener) {
        if (view != null && animation != null) {
            this.a = animationListener;
            this.c = view;
            this.b = true;
        }
    }

    public void onAnimationStart(Animation animation) {
        if (this.a != null) {
            this.a.onAnimationStart(animation);
        }
    }

    public void onAnimationEnd(Animation animation) {
        if (this.c != null && this.b) {
            if (oa.s(this.c) || gwb.c()) {
                this.c.post(new ej(this));
            } else {
                oa.a(this.c, 0, null);
            }
        }
        if (this.a != null) {
            this.a.onAnimationEnd(animation);
        }
    }

    public void onAnimationRepeat(Animation animation) {
        if (this.a != null) {
            this.a.onAnimationRepeat(animation);
        }
    }
}
