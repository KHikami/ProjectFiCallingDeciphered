import android.support.v7.widget.ActionBarOverlayLayout;

/* compiled from: PG */
public final class ua implements Runnable {
    private /* synthetic */ ActionBarOverlayLayout a;

    public ua(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.a = actionBarOverlayLayout;
    }

    public final void run() {
        this.a.c();
        this.a.h = kn.l(this.a.b).c((float) (-this.a.b.getHeight())).a(this.a.i);
    }
}
