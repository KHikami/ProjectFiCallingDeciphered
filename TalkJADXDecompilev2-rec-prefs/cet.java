package p000;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class cet implements AnimationListener {
    final /* synthetic */ boolean f5137a;
    final /* synthetic */ cdr f5138b;

    cet(cdr cdr, boolean z) {
        this.f5138b = cdr;
        this.f5137a = z;
    }

    public void onAnimationEnd(Animation animation) {
        if (this.f5137a && this.f5138b.bn != null) {
            this.f5138b.bn.run();
            this.f5138b.bn = null;
        }
    }

    public void onAnimationStart(Animation animation) {
    }

    public void onAnimationRepeat(Animation animation) {
    }
}
