package p000;

import android.view.Menu;
import android.view.MenuItem;

final class vn implements wy {
    final /* synthetic */ vg f35373a;
    private wy f35374b;

    public vn(vg vgVar, wy wyVar) {
        this.f35373a = vgVar;
        this.f35374b = wyVar;
    }

    public boolean mo4444a(wx wxVar, Menu menu) {
        return this.f35374b.mo4444a(wxVar, menu);
    }

    public boolean mo4446b(wx wxVar, Menu menu) {
        return this.f35374b.mo4446b(wxVar, menu);
    }

    public boolean mo4445a(wx wxVar, MenuItem menuItem) {
        return this.f35374b.mo4445a(wxVar, menuItem);
    }

    public void mo4443a(wx wxVar) {
        this.f35374b.mo4443a(wxVar);
        if (this.f35373a.f35343t != null) {
            this.f35373a.d.getDecorView().removeCallbacks(this.f35373a.f35344u);
        }
        if (this.f35373a.f35342s != null) {
            this.f35373a.m41012p();
            this.f35373a.f35345v = oa.m37366m(this.f35373a.f35342s).m40272a(0.0f);
            this.f35373a.f35345v.m40275a(new vo(this));
        }
        if (this.f35373a.g != null) {
            this.f35373a.g.b(this.f35373a.f35341r);
        }
        this.f35373a.f35341r = null;
    }
}
