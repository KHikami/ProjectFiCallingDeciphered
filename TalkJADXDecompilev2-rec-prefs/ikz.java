package p000;

import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.view.Surface;

public final class ikz {
    private final irc f17966a;
    private ird f17967b;
    private Surface f17968c;

    public ikz(irc irc, Surface surface) {
        this.f17966a = irc;
        this.f17968c = surface;
    }

    public Surface m22216a() {
        return this.f17968c;
    }

    public boolean m22218b() {
        if (this.f17967b != null) {
            return false;
        }
        this.f17967b = this.f17966a.mo3377a(this.f17968c);
        if (this.f17967b != null) {
            return true;
        }
        gwb.m1462W("eglCreateWindowSurface");
        itx.m23277a(6, "vclib", "Unable to create EGL surface for encoder input.");
        return false;
    }

    public void m22219c() {
        if (this.f17967b != null) {
            this.f17967b.mo3380a();
            this.f17967b = null;
        }
        if (this.f17968c != null) {
            this.f17968c.release();
            this.f17968c = null;
        }
    }

    public boolean m22217a(long j) {
        if (this.f17967b == null || this.f17967b.mo3381b() != 0) {
            return false;
        }
        if (this.f17966a instanceof ira) {
            EGLExt.eglPresentationTimeANDROID(EGL14.eglGetCurrentDisplay(), EGL14.eglGetCurrentSurface(12377), j);
        }
        return true;
    }

    public boolean m22220d() {
        return this.f17967b.mo3382c() == 0;
    }
}
