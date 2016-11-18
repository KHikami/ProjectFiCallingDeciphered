package defpackage;

import android.animation.Animator;

final class ivh extends iuf {
    final /* synthetic */ ivf a;

    ivh(ivf ivf) {
        this.a = ivf;
    }

    public void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            this.a.b = null;
            return;
        }
        super.setVisible(this.a.a, false);
        if (this.a.b != null) {
            this.a.b.run();
            this.a.b = null;
        }
        this.a.b();
    }
}
