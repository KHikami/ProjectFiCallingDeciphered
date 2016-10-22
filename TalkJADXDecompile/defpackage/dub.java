package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: dub */
final class dub extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ dug b;
    final /* synthetic */ dua c;

    dub(dua dua, View view, dug dug) {
        this.c = dua;
        this.a = view;
        this.b = dug;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.setAlpha(1.0f);
        this.c.b.b(this.b);
        this.a.setLayerType(0, null);
    }
}
