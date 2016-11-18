package p000;

import android.opengl.EGL14;
import android.opengl.EGLSurface;

final class irb implements ird {
    final /* synthetic */ ira f18752a;
    private final EGLSurface f18753b;

    irb(ira ira, EGLSurface eGLSurface) {
        this.f18752a = ira;
        this.f18753b = eGLSurface;
    }

    public void mo3380a() {
        EGL14.eglDestroySurface(this.f18752a.f18749a, this.f18753b);
    }

    public int mo3381b() {
        if (EGL14.eglMakeCurrent(this.f18752a.f18749a, this.f18753b, this.f18753b, this.f18752a.f18750b)) {
            return 0;
        }
        return EGL14.eglGetError();
    }

    public int mo3382c() {
        if (EGL14.eglSwapBuffers(this.f18752a.f18749a, this.f18753b)) {
            return 0;
        }
        return EGL14.eglGetError();
    }
}
