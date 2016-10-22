package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* renamed from: aqx */
final class aqx extends AnimatorListenerAdapter {
    private /* synthetic */ View a;
    private /* synthetic */ int b;

    aqx(aqv aqv, View view, int i) {
        this.a = view;
        this.b = i;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.setLayerType(this.b, null);
    }
}
