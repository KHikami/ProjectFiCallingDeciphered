package p000;

import android.support.v7.widget.SwitchCompat;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

public final class afj implements AnimationListener {
    final /* synthetic */ boolean f528a;
    final /* synthetic */ SwitchCompat f529b;

    public afj(SwitchCompat switchCompat, boolean z) {
        this.f529b = switchCompat;
        this.f528a = z;
    }

    public void onAnimationStart(Animation animation) {
    }

    public void onAnimationEnd(Animation animation) {
        if (this.f529b.f1788a == animation) {
            float f;
            SwitchCompat switchCompat = this.f529b;
            if (this.f528a) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            switchCompat.m3399a(f);
            this.f529b.f1788a = null;
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }
}
