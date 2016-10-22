package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: bar */
final class bar extends AnimatorListenerAdapter {
    private /* synthetic */ baq a;

    bar(baq baq) {
        this.a = baq;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.a.setClipToOutline(false);
        if (this.a.b.b != null) {
            bas bas = this.a.b.b;
            this.a.b.getFragmentManager();
            bas.a();
        }
    }
}
