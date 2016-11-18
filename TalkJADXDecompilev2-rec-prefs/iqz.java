package p000;

import javax.microedition.khronos.egl.EGLSurface;

final class iqz implements ird {
    final /* synthetic */ iqy f18743a;
    private final EGLSurface f18744b;

    iqz(iqy iqy, EGLSurface eGLSurface) {
        this.f18743a = iqy;
        this.f18744b = eGLSurface;
    }

    public void mo3380a() {
        this.f18743a.f18739a.eglDestroySurface(this.f18743a.f18740b, this.f18744b);
    }

    public int mo3381b() {
        if (this.f18743a.f18739a.eglMakeCurrent(this.f18743a.f18740b, this.f18744b, this.f18744b, this.f18743a.f18741c)) {
            return 0;
        }
        return this.f18743a.f18739a.eglGetError();
    }

    public int mo3382c() {
        if (this.f18743a.f18739a.eglSwapBuffers(this.f18743a.f18740b, this.f18744b)) {
            return 0;
        }
        return this.f18743a.f18739a.eglGetError();
    }
}
