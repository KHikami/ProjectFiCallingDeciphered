package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* compiled from: PG */
/* renamed from: dq */
class dq implements AnimationListener {
    View a;
    private AnimationListener b;
    private boolean c;

    public dq(View view, Animation animation) {
        if (view != null && animation != null) {
            this.a = view;
        }
    }

    public dq(View view, Animation animation, AnimationListener animationListener) {
        if (view != null && animation != null) {
            this.b = animationListener;
            this.a = view;
            this.c = true;
        }
    }

    public void onAnimationStart(Animation animation) {
        if (this.b != null) {
            this.b.onAnimationStart(animation);
        }
    }

    public void onAnimationEnd(Animation animation) {
        if (this.a != null && this.c) {
            if (kn.r(this.a) || buf.c()) {
                this.a.post(new dr(this));
            } else {
                kn.a(this.a, 0, null);
            }
        }
        if (this.b != null) {
            this.b.onAnimationEnd(animation);
        }
    }

    public void onAnimationRepeat(Animation animation) {
        if (this.b != null) {
            this.b.onAnimationRepeat(animation);
        }
    }
}
