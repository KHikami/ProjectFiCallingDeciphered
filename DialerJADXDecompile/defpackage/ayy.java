package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View.OnLayoutChangeListener;

/* compiled from: PG */
/* renamed from: ayy */
final class ayy extends AnimatorListenerAdapter {
    private /* synthetic */ azn a;
    private /* synthetic */ ayx b;

    ayy(ayx ayx, azn azn) {
        this.b = ayx;
        this.a = azn;
    }

    public final void onAnimationEnd(Animator animator) {
        this.b.a.j.setTag(az.aQ, null);
        ayv ayv = this.b.a;
        OnLayoutChangeListener onLayoutChangeListener = this.a;
        ayv.b(ayv.k);
        ayv.b(ayv.g);
        ayv.b(ayv.d);
        ayv.b(ayv.h);
        ayv.b(ayv.i);
        ayv.b(ayv.f);
        ayv.j.removeOnLayoutChangeListener(onLayoutChangeListener);
        ayv.m.a(0);
        this.b.a.r = false;
        bcj b = bcj.b();
        if (b.A) {
            b.a(b.k);
        }
    }
}
