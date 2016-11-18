package p000;

import android.view.View;

public final class ccd extends ccv<cce> {
    public ccd(View view, cce cce, gai gai) {
        super(view, cce, gai);
    }

    protected boolean mo809a() {
        boolean z;
        if (fde.m15026h() && gwb.m2267j(((cce) this.c).mo858d())) {
            z = true;
        } else {
            z = false;
        }
        if (((cce) this.c).mo852b() && !((cce) this.c).mo856c() && r1) {
            return true;
        }
        return false;
    }

    protected gag mo810b() {
        int g = ((cce) this.c).mo495a().m5638g();
        bbm bbm = (bbm) jyn.m25426a(this.b, bbm.class);
        return m7186e().m16814a(this.b.getString(bc.kf, new Object[]{bbm.mo443c(g)})).m16811a();
    }
}
