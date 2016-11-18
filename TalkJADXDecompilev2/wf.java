package defpackage;

import android.view.View;

final class wf extends pz {
    final /* synthetic */ we a;

    wf(we weVar) {
        this.a = weVar;
    }

    public void b(View view) {
        if (this.a.j && this.a.f != null) {
            oa.b(this.a.f, 0.0f);
            oa.b(this.a.c, 0.0f);
        }
        this.a.c.setVisibility(8);
        this.a.c.a(false);
        this.a.m = null;
        this.a.l();
        if (this.a.b != null) {
            oa.o(this.a.b);
        }
    }
}
