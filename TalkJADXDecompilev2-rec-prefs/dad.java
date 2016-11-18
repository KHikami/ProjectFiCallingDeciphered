package p000;

import android.view.View;

public final class dad extends ccv<ddp> {
    public dad(View view, ddp ddp, gai gai) {
        super(view, null, gai);
    }

    protected boolean mo809a() {
        if (!gwb.m1906a(gwb.m1400H(), "babel_network_change_notification", false)) {
            return false;
        }
        eaj eaj = (eaj) jyn.m25426a(this.b, eaj.class);
        if (eaj == null || eaj.mo1802a() != eai.CAPTIVE_PORTAL) {
            return false;
        }
        return true;
    }

    protected gag mo810b() {
        return m7186e().m16814a(this.b.getResources().getString(bc.f2933Q)).m16811a();
    }
}
