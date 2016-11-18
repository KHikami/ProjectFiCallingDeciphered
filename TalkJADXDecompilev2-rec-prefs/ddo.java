package p000;

import android.view.View;

public final class ddo extends ccv<ddp> {
    public ddo(View view, ddp ddp, gai gai) {
        super(view, ddp, gai);
    }

    protected boolean mo809a() {
        if (!gwb.m1906a(gwb.m1400H(), "babel_network_change_notification", false)) {
            return false;
        }
        if (!((ddp) this.c).mo822A() || ((ddp) this.c).mo823B()) {
            return false;
        }
        return true;
    }

    protected gag mo810b() {
        return m7186e().m16814a(this.b.getResources().getString(bc.hg)).m16815a(true).m16811a();
    }
}
