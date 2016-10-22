package defpackage;

import android.support.v7.widget.ActionBarOverlayLayout;

/* compiled from: PG */
/* renamed from: tz */
public final class tz implements Runnable {
    private /* synthetic */ ActionBarOverlayLayout a;

    public tz(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.a = actionBarOverlayLayout;
    }

    public final void run() {
        this.a.c();
        this.a.h = kn.l(this.a.b).c(0.0f).a(this.a.i);
    }
}
