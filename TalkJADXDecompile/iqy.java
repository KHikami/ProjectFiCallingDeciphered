import android.os.Build.VERSION;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

public final class iqy implements irc {
    private static final int e;
    private static final int[] f;
    EGL10 a;
    EGLDisplay b;
    EGLContext c;
    EGLConfig d;

    static {
        int i;
        if (gwb.at() || VERSION.SDK_INT < 19) {
            i = 12344;
        } else {
            i = 12610;
        }
        e = i;
        f = new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, e, 1, 12344};
    }

    public void a() {
        iil.a("init may only be called once per context instance", this.b);
        this.a = (EGL10) EGLContext.getEGL();
        this.b = this.a.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (this.a.eglInitialize(this.b, new int[2])) {
            int[] iArr = new int[1];
            if (this.a.eglChooseConfig(this.b, f, null, 0, iArr)) {
                int i = iArr[0];
                if (i <= 0) {
                    throw new IllegalArgumentException("No configs match configSpec");
                }
                EGLConfig[] eGLConfigArr = new EGLConfig[i];
                if (this.a.eglChooseConfig(this.b, f, eGLConfigArr, i, iArr)) {
                    EGLConfig a = a(eGLConfigArr);
                    if (a == null) {
                        throw new IllegalArgumentException("No config chosen");
                    }
                    this.d = a;
                    this.c = this.a.eglCreateContext(this.b, this.d, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                    if (this.c == null || this.c == EGL10.EGL_NO_CONTEXT) {
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

    public void b() {
        if (!this.a.eglDestroyContext(this.b, this.c)) {
            itx.a(6, "vclib", "Unable to destroy eglContext");
        }
        this.a.eglTerminate(this.b);
        this.a = null;
        this.c = null;
        this.b = null;
        this.d = null;
    }

    public ird a(Object obj) {
        EGLSurface eglCreateWindowSurface = this.a.eglCreateWindowSurface(this.b, this.d, obj, null);
        int eglGetError = this.a.eglGetError();
        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE && eglGetError == 12288) {
            return new iqz(this, eglCreateWindowSurface);
        }
        itx.a(6, "vclib", "createWindowSurface failed because: " + eglGetError);
        return null;
    }

    private EGLConfig a(EGLConfig[] eGLConfigArr) {
        for (EGLConfig eGLConfig : eGLConfigArr) {
            int a = a(this.a, this.b, eGLConfig, 12324, 0);
            int a2 = a(this.a, this.b, eGLConfig, 12323, 0);
            int a3 = a(this.a, this.b, eGLConfig, 12322, 0);
            if (a == 8 && a2 == 8 && a3 == 8) {
                return eGLConfig;
            }
        }
        throw new IllegalArgumentException("Unable to identify a supported opengl configuration");
    }

    private static int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
        int[] iArr = new int[1];
        if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, iArr)) {
            return iArr[0];
        }
        return 0;
    }
}
