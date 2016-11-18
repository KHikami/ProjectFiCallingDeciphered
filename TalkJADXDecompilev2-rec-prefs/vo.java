package p000;

import android.view.View;

final class vo extends pz {
    final /* synthetic */ vn f35375a;

    vo(vn vnVar) {
        this.f35375a = vnVar;
    }

    public void mo4440b(View view) {
        this.f35375a.f35373a.f35342s.setVisibility(8);
        if (this.f35375a.f35373a.f35343t != null) {
            this.f35375a.f35373a.f35343t.dismiss();
        } else if (this.f35375a.f35373a.f35342s.getParent() instanceof View) {
            oa.m37368o((View) this.f35375a.f35373a.f35342s.getParent());
        }
        this.f35375a.f35373a.f35342s.removeAllViews();
        this.f35375a.f35373a.f35345v.m40275a(null);
        this.f35375a.f35373a.f35345v = null;
    }
}
