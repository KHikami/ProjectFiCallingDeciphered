package p000;

import android.animation.Animator;

final class ivn extends iuf {
    final /* synthetic */ ivm f19167a;

    ivn(ivm ivm) {
        this.f19167a = ivm;
    }

    public void onAnimationEnd(Animator animator) {
        if (m23305a(animator)) {
            this.f19167a.f19151b = null;
            return;
        }
        super.setVisible(this.f19167a.f19150a, false);
        this.f19167a.m23369b();
        if (this.f19167a.f19151b != null) {
            this.f19167a.f19151b.run();
            this.f19167a.f19151b = null;
        }
    }
}
