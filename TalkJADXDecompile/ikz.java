import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.view.Surface;

public final class ikz {
    private final irc a;
    private ird b;
    private Surface c;

    public ikz(irc irc, Surface surface) {
        this.a = irc;
        this.c = surface;
    }

    public Surface a() {
        return this.c;
    }

    public boolean b() {
        if (this.b != null) {
            return false;
        }
        this.b = this.a.a(this.c);
        if (this.b != null) {
            return true;
        }
        gwb.W("eglCreateWindowSurface");
        itx.a(6, "vclib", "Unable to create EGL surface for encoder input.");
        return false;
    }

    public void c() {
        if (this.b != null) {
            this.b.a();
            this.b = null;
        }
        if (this.c != null) {
            this.c.release();
            this.c = null;
        }
    }

    public boolean a(long j) {
        if (this.b == null || this.b.b() != 0) {
            return false;
        }
        if (this.a instanceof ira) {
            EGLExt.eglPresentationTimeANDROID(EGL14.eglGetCurrentDisplay(), EGL14.eglGetCurrentSurface(12377), j);
        }
        return true;
    }

    public boolean d() {
        return this.b.c() == 0;
    }
}
