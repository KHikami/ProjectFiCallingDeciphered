package defpackage;

import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: iqz */
final class iqz implements ird {
    final /* synthetic */ iqy a;
    private final EGLSurface b;

    iqz(iqy iqy, EGLSurface eGLSurface) {
        this.a = iqy;
        this.b = eGLSurface;
    }

    public void a() {
        this.a.a.eglDestroySurface(this.a.b, this.b);
    }

    public int b() {
        if (this.a.a.eglMakeCurrent(this.a.b, this.b, this.b, this.a.c)) {
            return 0;
        }
        return this.a.a.eglGetError();
    }

    public int c() {
        if (this.a.a.eglSwapBuffers(this.a.b, this.b)) {
            return 0;
        }
        return this.a.a.eglGetError();
    }
}
