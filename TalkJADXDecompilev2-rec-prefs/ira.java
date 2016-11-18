package p000;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

public final class ira implements irc {
    private static final int f18746d = (gwb.at() ? 12344 : 12610);
    private static final int[] f18747e = new int[]{12344};
    private static final int[] f18748f = new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, f18746d, 1, 12344};
    EGLDisplay f18749a;
    EGLContext f18750b;
    EGLConfig f18751c;

    public void mo3378a() {
        iil.m21872a("init may only be called once per context instance", this.f18749a);
        this.f18749a = EGL14.eglGetDisplay(0);
        if (EGL14.eglInitialize(this.f18749a, new int[2], 0, new int[2], 0)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr = new int[1];
            if (!EGL14.eglChooseConfig(this.f18749a, f18748f, 0, eGLConfigArr, 0, 1, iArr, 0)) {
                throw new IllegalArgumentException("eglChooseConfig failed");
            } else if (iArr[0] == 0) {
                throw new IllegalArgumentException("No config chosen");
            } else {
                this.f18751c = eGLConfigArr[0];
                this.f18750b = EGL14.eglCreateContext(this.f18749a, this.f18751c, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                if (this.f18750b == null || this.f18750b == EGL14.EGL_NO_CONTEXT) {
                    throw new RuntimeException("eglCreateContext failed");
                }
                return;
            }
        }
        throw new RuntimeException("eglInitialize failed");
    }

    public void mo3379b() {
        if (!EGL14.eglDestroyContext(this.f18749a, this.f18750b)) {
            itx.m23277a(6, "vclib", "Unable to destroy eglContext");
        }
        EGL14.eglTerminate(this.f18749a);
        this.f18750b = null;
        this.f18749a = null;
        this.f18751c = null;
    }

    public ird mo3377a(Object obj) {
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f18749a, this.f18751c, obj, f18747e, 0);
        int eglGetError = EGL14.eglGetError();
        if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL14.EGL_NO_SURFACE || eglGetError != 12288) {
            return null;
        }
        return new irb(this, eglCreateWindowSurface);
    }
}
