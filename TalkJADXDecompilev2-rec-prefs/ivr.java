package p000;

import android.animation.Animator;

final class ivr extends iuf {
    final /* synthetic */ ivp f19191a;

    ivr(ivp ivp) {
        this.f19191a = ivp;
    }

    public void onAnimationEnd(Animator animator) {
        if (m23305a(animator)) {
            this.f19191a.f19172d = null;
            return;
        }
        super.setVisible(this.f19191a.f19170b, false);
        this.f19191a.f19169a.cancel();
        this.f19191a.m23375b();
        if (this.f19191a.f19172d != null) {
            this.f19191a.f19172d.run();
            this.f19191a.f19172d = null;
        }
    }
}
