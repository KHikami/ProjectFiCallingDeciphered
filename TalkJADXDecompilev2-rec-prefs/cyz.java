package p000;

import android.content.res.Resources;
import android.view.View;

public final class cyz extends ccv<czb> {
    gan f9365e = new cza(this);

    public cyz(View view, czb czb, gai gai) {
        super(view, czb, gai);
    }

    protected boolean mo809a() {
        return ((czb) this.c).mo869q() > 0;
    }

    protected gag mo810b() {
        gwb.m1823a(fde.m15018e(((jca) jyn.m25426a(this.b, jca.class)).mo2317a()), 1814);
        gah e = m7186e();
        Resources resources = this.b.getResources();
        if (((czb) this.c).mo869q() == 1) {
            e.m16814a(resources.getString(bc.f2924H, new Object[]{((czb) this.c).mo870r().f11216e}));
            e.m16817c(resources.getString(bc.jG));
            e.m16813a(this.f9365e);
        } else {
            e.m16814a(resources.getString(bc.f2923G, new Object[]{Integer.valueOf(((czb) this.c).mo869q())}));
        }
        e.m16815a(true);
        return e.m16811a();
    }
}
