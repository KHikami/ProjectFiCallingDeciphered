package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* compiled from: PG */
/* renamed from: azi */
final class azi implements OnPreDrawListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ ayv b;
    private /* synthetic */ boolean c;

    azi(ayv ayv, boolean z, boolean z2) {
        this.b = ayv;
        this.a = z;
        this.c = z2;
    }

    public final boolean onPreDraw() {
        float f;
        float f2 = 0.0f;
        this.b.getView().getViewTreeObserver().removeOnPreDrawListener(this);
        int height = this.b.l.getHeight();
        if (this.a) {
            this.b.l.setVisibility(8);
        } else {
            this.b.l.setVisibility(0);
        }
        bdf.b((Object) this, "setSecondaryInfoVisible: secondaryHeight = " + height);
        View view = this.b.l;
        if (this.c) {
            f = (float) height;
        } else {
            f = 0.0f;
        }
        view.setTranslationY(f);
        ViewPropertyAnimator duration = this.b.l.animate().setInterpolator(ake.c).setDuration((long) this.b.q);
        if (!this.a) {
            f2 = (float) height;
        }
        duration.translationY(f2).setListener(new azj(this)).start();
        bcj.b().a(this.c, height);
        return true;
    }
}
