package p000;

import android.animation.Animator;

final class ivh extends iuf {
    final /* synthetic */ ivf f19117a;

    ivh(ivf ivf) {
        this.f19117a = ivf;
    }

    public void onAnimationEnd(Animator animator) {
        if (m23305a(animator)) {
            this.f19117a.f19101b = null;
            return;
        }
        super.setVisible(this.f19117a.f19100a, false);
        if (this.f19117a.f19101b != null) {
            this.f19117a.f19101b.run();
            this.f19117a.f19101b = null;
        }
        this.f19117a.m23353b();
    }
}
