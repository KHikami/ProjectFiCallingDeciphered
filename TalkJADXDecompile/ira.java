import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

public final class ira implements irc {
    private static final int d;
    private static final int[] e;
    private static final int[] f;
    EGLDisplay a;
    EGLContext b;
    EGLConfig c;

    static {
        d = gwb.at() ? 12344 : 12610;
        e = new int[]{12344};
        f = new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, d, 1, 12344};
    }

    public void a() {
        iil.a("init may only be called once per context instance", this.a);
        this.a = EGL14.eglGetDisplay(0);
        if (EGL14.eglInitialize(this.a, new int[2], 0, new int[2], 0)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr = new int[1];
            if (!EGL14.eglChooseConfig(this.a, f, 0, eGLConfigArr, 0, 1, iArr, 0)) {
                throw new IllegalArgumentException("eglChooseConfig failed");
            } else if (iArr[0] == 0) {
                throw new IllegalArgumentException("No config chosen");
            } else {
                this.c = eGLConfigArr[0];
                this.b = EGL14.eglCreateContext(this.a, this.c, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                if (this.b == null || this.b == EGL14.EGL_NO_CONTEXT) {
                    throw new RuntimeException("eglCreateContext failed");
                }
                return;
            }
        }
        throw new RuntimeException("eglInitialize failed");
    }

    public void b() {
        if (!EGL14.eglDestroyContext(this.a, this.b)) {
            itx.a(6, "vclib", "Unable to destroy eglContext");
        }
        EGL14.eglTerminate(this.a);
        this.b = null;
        this.a = null;
        this.c = null;
    }

    public ird a(Object obj) {
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.a, this.c, obj, e, 0);
        int eglGetError = EGL14.eglGetError();
        if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL14.EGL_NO_SURFACE || eglGetError != 12288) {
            return null;
        }
        return new irb(this, eglCreateWindowSurface);
    }
}
