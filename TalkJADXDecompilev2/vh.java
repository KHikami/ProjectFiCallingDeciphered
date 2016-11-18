package defpackage;

import android.os.Bundle;

final class vh implements Runnable {
    final /* synthetic */ vg a;

    vh(vg vgVar) {
        this.a = vgVar;
    }

    public void run() {
        vg vgVar;
        vq g;
        if ((this.a.x & 1) != 0) {
            vgVar = this.a;
            g = vgVar.g(0);
            if (g.j != null) {
                Bundle bundle;
                bundle = new Bundle();
                g.j.a(bundle);
                if (bundle.size() > 0) {
                    g.s = bundle;
                }
                g.j.g();
                g.j.clear();
            }
            g.r = true;
            g.q = true;
            if (vgVar.q != null) {
                g = vgVar.g(0);
                if (g != null) {
                    g.m = false;
                    vgVar.a(g, null);
                }
            }
        }
        if ((this.a.x & 4096) != 0) {
            vgVar = this.a;
            g = vgVar.g(108);
            if (g.j != null) {
                bundle = new Bundle();
                g.j.a(bundle);
                if (bundle.size() > 0) {
                    g.s = bundle;
                }
                g.j.g();
                g.j.clear();
            }
            g.r = true;
            g.q = true;
            if (vgVar.q != null) {
                g = vgVar.g(0);
                if (g != null) {
                    g.m = false;
                    vgVar.a(g, null);
                }
            }
        }
        this.a.w = false;
        this.a.x = 0;
    }
}
