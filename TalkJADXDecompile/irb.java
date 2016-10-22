import android.opengl.EGL14;
import android.opengl.EGLSurface;

final class irb implements ird {
    final /* synthetic */ ira a;
    private final EGLSurface b;

    irb(ira ira, EGLSurface eGLSurface) {
        this.a = ira;
        this.b = eGLSurface;
    }

    public void a() {
        EGL14.eglDestroySurface(this.a.a, this.b);
    }

    public int b() {
        if (EGL14.eglMakeCurrent(this.a.a, this.b, this.b, this.a.b)) {
            return 0;
        }
        return EGL14.eglGetError();
    }

    public int c() {
        if (EGL14.eglSwapBuffers(this.a.a, this.b)) {
            return 0;
        }
        return EGL14.eglGetError();
    }
}
