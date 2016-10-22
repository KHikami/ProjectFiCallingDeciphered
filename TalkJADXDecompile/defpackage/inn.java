package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: inn */
final class inn implements Runnable {
    final /* synthetic */ inj a;

    inn(inj inj) {
        this.a = inj;
    }

    public void run() {
        Surface surface;
        if (this.a.p instanceof SurfaceTexture) {
            this.a.h = new Surface((SurfaceTexture) this.a.p);
            surface = this.a.h;
        } else {
            surface = (Surface) this.a.p;
        }
        this.a.c.a(surface, null);
        this.a.l();
    }
}
