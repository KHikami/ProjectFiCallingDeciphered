package defpackage;

import android.animation.Animator;

/* renamed from: ivk */
final class ivk extends iuf {
    final /* synthetic */ ivi a;

    ivk(ivi ivi) {
        this.a = ivi;
    }

    public void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            this.a.i = null;
            return;
        }
        super.setVisible(this.a.h, false);
        if (this.a.i != null) {
            this.a.i.run();
            this.a.i = null;
        }
        this.a.c();
    }
}
