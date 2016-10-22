package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: aw */
final class aw implements AnimatorUpdateListener {
    private /* synthetic */ as a;

    aw(av avVar, as asVar) {
        this.a = asVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a();
    }
}
