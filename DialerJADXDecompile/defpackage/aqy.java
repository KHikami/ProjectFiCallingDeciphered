package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: aqy */
final class aqy extends AnimatorListenerAdapter {
    private /* synthetic */ boolean a;
    private /* synthetic */ aqv b;

    aqy(aqv aqv, boolean z) {
        this.b = aqv;
        this.a = z;
    }

    public final void onAnimationStart(Animator animator) {
        if (!this.a) {
            this.b.g();
        }
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            this.b.g();
        }
    }
}
