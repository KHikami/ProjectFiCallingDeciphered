package defpackage;

import android.view.View;

final class vl extends pz {
    final /* synthetic */ vg a;

    vl(vg vgVar) {
        this.a = vgVar;
    }

    public void a(View view) {
        this.a.s.setVisibility(0);
        this.a.s.sendAccessibilityEvent(32);
        if (this.a.s.getParent() != null) {
            oa.o((View) this.a.s.getParent());
        }
    }

    public void b(View view) {
        oa.c(this.a.s, 1.0f);
        this.a.v.a(null);
        this.a.v = null;
    }
}
