package defpackage;

import android.view.Menu;
import android.view.MenuItem;

final class vn implements wy {
    final /* synthetic */ vg a;
    private wy b;

    public vn(vg vgVar, wy wyVar) {
        this.a = vgVar;
        this.b = wyVar;
    }

    public boolean a(wx wxVar, Menu menu) {
        return this.b.a(wxVar, menu);
    }

    public boolean b(wx wxVar, Menu menu) {
        return this.b.b(wxVar, menu);
    }

    public boolean a(wx wxVar, MenuItem menuItem) {
        return this.b.a(wxVar, menuItem);
    }

    public void a(wx wxVar) {
        this.b.a(wxVar);
        if (this.a.t != null) {
            this.a.d.getDecorView().removeCallbacks(this.a.u);
        }
        if (this.a.s != null) {
            this.a.p();
            this.a.v = oa.m(this.a.s).a(0.0f);
            this.a.v.a(new vo(this));
        }
        if (this.a.g != null) {
            this.a.g.b(this.a.r);
        }
        this.a.r = null;
    }
}
