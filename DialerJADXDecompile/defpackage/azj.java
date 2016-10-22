package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: azj */
final class azj extends AnimatorListenerAdapter {
    private /* synthetic */ azi a;

    azj(azi azi) {
        this.a = azi;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.a.a) {
            this.a.b.l.setVisibility(8);
        }
    }

    public final void onAnimationStart(Animator animator) {
        if (this.a.a) {
            this.a.b.l.setVisibility(0);
        }
    }
}
