package p000;

import android.graphics.SurfaceTexture;
import android.os.Build.VERSION;
import android.view.Surface;

final class ilj {
    final /* synthetic */ ild f17985a;
    private final iok f17986b;
    private final ioo f17987c;
    private ird f17988d = null;
    private int f17989e;
    private int f17990f;

    ilj(ild ild, iok iok) {
        this.f17985a = ild;
        this.f17986b = iok;
        this.f17987c = new ioo(iok);
    }

    void m22242a() {
        this.f17987c.m22404b();
        m22241c();
    }

    private void m22241c() {
        if (this.f17988d != null) {
            itx.m23279a(3, "vclib", "Destroying surface for %s.", this.f17986b);
            this.f17985a.f17973c.m22238b();
            this.f17988d.mo3380a();
            this.f17988d = null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void m22243b() {
        int i = -1;
        itp r = this.f17986b.m22366r();
        if (this.f17986b.m22363o() == -1) {
            if (!(r.m23266d() == this.f17989e && r.m23267e() == this.f17990f)) {
                this.f17989e = r.m23266d();
                this.f17990f = r.m23267e();
                m22241c();
            }
        } else if (!(this.f17986b.m22363o() == this.f17989e && this.f17986b.m22364p() == this.f17990f)) {
            this.f17989e = this.f17986b.m22363o();
            this.f17990f = this.f17986b.m22364p();
            m22241c();
        }
        if (this.f17988d == null) {
            Object n = this.f17986b.m22362n();
            if (n == null) {
                itx.m23277a(5, "vclib", "Null surface object passed for renderer");
            } else {
                if (n instanceof SurfaceTexture) {
                    ird a = this.f17985a.f17972b.mo3377a(n);
                    if (a == null) {
                        itx.m23277a(5, "vclib", "Invalid SurfaceTexture passed for renderer");
                    } else {
                        a.mo3380a();
                        ((SurfaceTexture) n).setDefaultBufferSize(this.f17989e, this.f17990f);
                    }
                } else if ((n instanceof Surface) && VERSION.SDK_INT < 17) {
                    itv itv = new itv((Surface) n);
                }
                this.f17988d = this.f17985a.f17972b.mo3377a(n);
                gwb.m1457V("OutputRenderer.initializeGlSurface");
                i = 0;
            }
        }
        if (this.f17988d == null) {
            throw new IllegalStateException("Attempted to render a released OutputRenderer");
        }
        i = this.f17988d.mo3381b();
        if (i == 0 && this.f17987c.mo3345d()) {
            i = this.f17988d.mo3382c();
        }
        if (i != 0) {
            itx.m23287b("vclib", "Failed to render; EGL error=%d", Integer.valueOf(i));
            this.f17985a.m22236c(this.f17986b);
        }
    }
}
