package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

/* compiled from: PG */
/* renamed from: mf */
public final class mf implements AnimatorUpdateListener {
    private /* synthetic */ mi a;
    private /* synthetic */ View b;

    public mf(mi miVar, View view) {
        this.a = miVar;
        this.b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a();
    }
}
