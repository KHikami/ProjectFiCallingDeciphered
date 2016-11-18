package p000;

import android.support.v7.widget.ActionBarOverlayLayout;

public final class ze implements Runnable {
    final /* synthetic */ ActionBarOverlayLayout f35883a;

    public ze(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f35883a = actionBarOverlayLayout;
    }

    public void run() {
        this.f35883a.f();
        this.f35883a.c = oa.m37366m(this.f35883a.a).m40280c((float) (-this.f35883a.a.getHeight())).m40275a(this.f35883a.d);
    }
}
