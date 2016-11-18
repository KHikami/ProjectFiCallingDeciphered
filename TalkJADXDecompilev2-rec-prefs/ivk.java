package p000;

import android.animation.Animator;

final class ivk extends iuf {
    final /* synthetic */ ivi f19148a;

    ivk(ivi ivi) {
        this.f19148a = ivi;
    }

    public void onAnimationEnd(Animator animator) {
        if (m23305a(animator)) {
            this.f19148a.f19130i = null;
            return;
        }
        super.setVisible(this.f19148a.f19129h, false);
        if (this.f19148a.f19130i != null) {
            this.f19148a.f19130i.run();
            this.f19148a.f19130i = null;
        }
        this.f19148a.m23360c();
    }
}
