package defpackage;

import android.support.v7.widget.ActionBarOverlayLayout;

public final class ze implements Runnable {
    final /* synthetic */ ActionBarOverlayLayout a;

    public ze(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.a = actionBarOverlayLayout;
    }

    public void run() {
        this.a.f();
        this.a.c = oa.m(this.a.a).c((float) (-this.a.a.getHeight())).a(this.a.d);
    }
}
