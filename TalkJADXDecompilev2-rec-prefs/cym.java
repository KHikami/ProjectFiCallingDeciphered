package p000;

import android.view.View;

public final class cym extends ccv<cyn> {
    private int f9333e;

    public cym(View view, cyn cyn, gai gai) {
        super(view, cyn, gai);
    }

    protected boolean mo809a() {
        return ((cyn) this.c).mo874u() && !gwb.m1926a(eow.AUTOSWITCH_TRANSPORT);
    }

    protected gag mo810b() {
        if (gwb.m2254i(((cyn) this.c).mo858d())) {
            this.f9333e = bc.f2918B;
        } else {
            this.f9333e = bc.f2917A;
        }
        gwb.m2031b(eow.AUTOSWITCH_TRANSPORT);
        return m7186e().m16814a(this.b.getResources().getString(this.f9333e)).m16811a();
    }
}
