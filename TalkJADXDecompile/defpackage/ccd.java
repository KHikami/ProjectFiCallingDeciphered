package defpackage;

import android.view.View;

/* renamed from: ccd */
public final class ccd extends ccv<cce> {
    public ccd(View view, cce cce, gai gai) {
        super(view, cce, gai);
    }

    protected boolean a() {
        boolean z;
        if (fde.h() && gwb.j(((cce) this.c).d())) {
            z = true;
        } else {
            z = false;
        }
        if (((cce) this.c).b() && !((cce) this.c).c() && r1) {
            return true;
        }
        return false;
    }

    protected gag b() {
        int g = ((cce) this.c).a().g();
        bbm bbm = (bbm) jyn.a(this.b, bbm.class);
        return e().a(this.b.getString(bc.kf, new Object[]{bbm.c(g)})).a();
    }
}
