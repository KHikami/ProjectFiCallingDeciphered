package p000;

import android.view.Choreographer;

final class iuo extends iui {
    private Choreographer f19049a = Choreographer.getInstance();

    public void mo3400a(iuk iuk) {
        this.f19049a.postFrameCallback(iuk.m23307a());
    }

    public void mo3401b(iuk iuk) {
        this.f19049a.removeFrameCallback(iuk.m23307a());
    }
}
