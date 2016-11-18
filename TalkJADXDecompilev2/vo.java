package defpackage;

import android.view.View;

final class vo extends pz {
    final /* synthetic */ vn a;

    vo(vn vnVar) {
        this.a = vnVar;
    }

    public void b(View view) {
        this.a.a.s.setVisibility(8);
        if (this.a.a.t != null) {
            this.a.a.t.dismiss();
        } else if (this.a.a.s.getParent() instanceof View) {
            oa.o((View) this.a.a.s.getParent());
        }
        this.a.a.s.removeAllViews();
        this.a.a.v.a(null);
        this.a.a.v = null;
    }
}
