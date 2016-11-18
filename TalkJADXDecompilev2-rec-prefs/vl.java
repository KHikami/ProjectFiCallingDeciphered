package p000;

import android.view.View;

final class vl extends pz {
    final /* synthetic */ vg f35371a;

    vl(vg vgVar) {
        this.f35371a = vgVar;
    }

    public void mo4439a(View view) {
        this.f35371a.f35342s.setVisibility(0);
        this.f35371a.f35342s.sendAccessibilityEvent(32);
        if (this.f35371a.f35342s.getParent() != null) {
            oa.m37368o((View) this.f35371a.f35342s.getParent());
        }
    }

    public void mo4440b(View view) {
        oa.m37348c(this.f35371a.f35342s, 1.0f);
        this.f35371a.f35345v.m40275a(null);
        this.f35371a.f35345v = null;
    }
}
