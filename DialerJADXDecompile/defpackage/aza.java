package defpackage;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* compiled from: PG */
/* renamed from: aza */
final class aza implements OnGlobalLayoutListener {
    private /* synthetic */ ayv a;

    aza(ayv ayv) {
        this.a = ayv;
    }

    public final void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver = this.a.l.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
            this.a.h(this.a.c);
        }
    }
}
