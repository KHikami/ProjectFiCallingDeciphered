package p000;

import android.os.Bundle;

final class vh implements Runnable {
    final /* synthetic */ vg f35367a;

    vh(vg vgVar) {
        this.f35367a = vgVar;
    }

    public void run() {
        vg vgVar;
        vq g;
        if ((this.f35367a.f35347x & 1) != 0) {
            vgVar = this.f35367a;
            g = vgVar.m41005g(0);
            if (g.f35386j != null) {
                Bundle bundle;
                bundle = new Bundle();
                g.f35386j.m41411a(bundle);
                if (bundle.size() > 0) {
                    g.f35395s = bundle;
                }
                g.f35386j.m41436g();
                g.f35386j.clear();
            }
            g.f35394r = true;
            g.f35393q = true;
            if (vgVar.f35340q != null) {
                g = vgVar.m41005g(0);
                if (g != null) {
                    g.f35389m = false;
                    vgVar.m40989a(g, null);
                }
            }
        }
        if ((this.f35367a.f35347x & 4096) != 0) {
            vgVar = this.f35367a;
            g = vgVar.m41005g(108);
            if (g.f35386j != null) {
                bundle = new Bundle();
                g.f35386j.m41411a(bundle);
                if (bundle.size() > 0) {
                    g.f35395s = bundle;
                }
                g.f35386j.m41436g();
                g.f35386j.clear();
            }
            g.f35394r = true;
            g.f35393q = true;
            if (vgVar.f35340q != null) {
                g = vgVar.m41005g(0);
                if (g != null) {
                    g.f35389m = false;
                    vgVar.m40989a(g, null);
                }
            }
        }
        this.f35367a.f35346w = false;
        this.f35367a.f35347x = 0;
    }
}
