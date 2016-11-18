package p000;

import android.graphics.SurfaceTexture;
import android.view.Surface;

final class inn implements Runnable {
    final /* synthetic */ inj f18158a;

    inn(inj inj) {
        this.f18158a = inj;
    }

    public void run() {
        Surface surface;
        if (this.f18158a.p instanceof SurfaceTexture) {
            this.f18158a.f18144h = new Surface((SurfaceTexture) this.f18158a.p);
            surface = this.f18158a.f18144h;
        } else {
            surface = (Surface) this.f18158a.p;
        }
        this.f18158a.f18139c.m22313a(surface, null);
        this.f18158a.m22387l();
    }
}
