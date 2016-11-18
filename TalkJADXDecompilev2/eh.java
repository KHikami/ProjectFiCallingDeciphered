package defpackage;

import android.view.View;
import android.view.animation.Animation;

final class eh extends ei {
    final /* synthetic */ dr a;
    final /* synthetic */ ee b;

    eh(ee eeVar, View view, Animation animation, dr drVar) {
        this.b = eeVar;
        this.a = drVar;
        super(view, animation);
    }

    public void onAnimationEnd(Animation animation) {
        super.onAnimationEnd(animation);
        if (this.a.l != null) {
            this.a.l = null;
            this.b.a(this.a, this.a.m, 0, 0, false);
        }
    }
}
