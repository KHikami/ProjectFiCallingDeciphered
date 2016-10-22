package defpackage;

import android.support.v7.widget.SwitchCompat;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: afj */
public final class afj implements AnimationListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ SwitchCompat b;

    public afj(SwitchCompat switchCompat, boolean z) {
        this.b = switchCompat;
        this.a = z;
    }

    public void onAnimationStart(Animation animation) {
    }

    public void onAnimationEnd(Animation animation) {
        if (this.b.a == animation) {
            float f;
            SwitchCompat switchCompat = this.b;
            if (this.a) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            switchCompat.a(f);
            this.b.a = null;
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }
}
