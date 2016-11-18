package p000;

import android.view.View;
import android.view.animation.Animation;

final class eh extends ei {
    final /* synthetic */ dr f11485a;
    final /* synthetic */ ee f11486b;

    eh(ee eeVar, View view, Animation animation, dr drVar) {
        this.f11486b = eeVar;
        this.f11485a = drVar;
        super(view, animation);
    }

    public void onAnimationEnd(Animation animation) {
        super.onAnimationEnd(animation);
        if (this.f11485a.f749l != null) {
            this.f11485a.f749l = null;
            this.f11486b.m13660a(this.f11485a, this.f11485a.f750m, 0, 0, false);
        }
    }
}
