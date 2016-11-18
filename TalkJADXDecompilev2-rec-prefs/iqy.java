package p000;

import android.os.Build.VERSION;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

public final class iqy implements irc {
    private static final int f18737e;
    private static final int[] f18738f = new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, f18737e, 1, 12344};
    EGL10 f18739a;
    EGLDisplay f18740b;
    EGLContext f18741c;
    EGLConfig f18742d;

    static {
        int i;
        if (gwb.at() || VERSION.SDK_INT < 19) {
            i = 12344;
        } else {
            i = 12610;
        }
        f18737e = i;
    }

    public void mo3378a() {
        iil.m21872a("init may only be called once per context instance", this.f18740b);
        this.f18739a = (EGL10) EGLContext.getEGL();
        this.f18740b = this.f18739a.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (this.f18739a.eglInitialize(this.f18740b, new int[2])) {
            int[] iArr = new int[1];
            if (this.f18739a.eglChooseConfig(this.f18740b, f18738f, null, 0, iArr)) {
                int i = iArr[0];
                if (i <= 0) {
                    throw new IllegalArgumentException("No configs match configSpec");
                }
                EGLConfig[] eGLConfigArr = new EGLConfig[i];
                if (this.f18739a.eglChooseConfig(this.f18740b, f18738f, eGLConfigArr, i, iArr)) {
                    EGLConfig a = m22993a(eGLConfigArr);
                    if (a == null) {
                        throw new IllegalArgumentException("No config chosen");
                    }
                    this.f18742d = a;
                    this.f18741c = this.f18739a.eglCreateContext(this.f18740b, this.f18742d, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                    if (this.f18741c == null || this.f18741c == EGL10.EGL_NO_CONTEXT) {
                        throw new RuntimeException("eglCreateContext failed");
                    }
                    return;
                }
                throw new IllegalArgumentException("eglChooseConfig#2 failed");
            }
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
        throw new RuntimeException("eglInitialize failed");
    }

    public void mo3379b() {
        if (!this.f18739a.eglDestroyContext(this.f18740b, this.f18741c)) {
            itx.m23277a(6, "vclib", "Unable to destroy eglContext");
        }
        this.f18739a.eglTerminate(this.f18740b);
        this.f18739a = null;
        this.f18741c = null;
        this.f18740b = null;
        this.f18742d = null;
    }

    public ird mo3377a(Object obj) {
        EGLSurface eglCreateWindowSurface = this.f18739a.eglCreateWindowSurface(this.f18740b, this.f18742d, obj, null);
        int eglGetError = this.f18739a.eglGetError();
        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE && eglGetError == 12288) {
            return new iqz(this, eglCreateWindowSurface);
        }
        itx.m23277a(6, "vclib", "createWindowSurface failed because: " + eglGetError);
        return null;
    }

    private EGLConfig m22993a(EGLConfig[] eGLConfigArr) {
        for (EGLConfig eGLConfig : eGLConfigArr) {
            int a = iqy.m22992a(this.f18739a, this.f18740b, eGLConfig, 12324, 0);
            int a2 = iqy.m22992a(this.f18739a, this.f18740b, eGLConfig, 12323, 0);
            int a3 = iqy.m22992a(this.f18739a, this.f18740b, eGLConfig, 12322, 0);
            if (a == 8 && a2 == 8 && a3 == 8) {
                return eGLConfig;
            }
        }
        throw new IllegalArgumentException("Unable to identify a supported opengl configuration");
    }

    private static int m22992a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
        int[] iArr = new int[1];
        if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, iArr)) {
            return iArr[0];
        }
        return 0;
    }
}
