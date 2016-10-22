package defpackage;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: cet */
final class cet implements AnimationListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ cdr b;

    cet(cdr cdr, boolean z) {
        this.b = cdr;
        this.a = z;
    }

    public void onAnimationEnd(Animation animation) {
        if (this.a && this.b.bn != null) {
            this.b.bn.run();
            this.b.bn = null;
        }
    }

    public void onAnimationStart(Animation animation) {
    }

    public void onAnimationRepeat(Animation animation) {
    }
}
