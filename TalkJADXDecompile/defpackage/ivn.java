package defpackage;

import android.animation.Animator;

/* renamed from: ivn */
final class ivn extends iuf {
    final /* synthetic */ ivm a;

    ivn(ivm ivm) {
        this.a = ivm;
    }

    public void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            this.a.b = null;
            return;
        }
        super.setVisible(this.a.a, false);
        this.a.b();
        if (this.a.b != null) {
            this.a.b.run();
            this.a.b = null;
        }
    }
}
