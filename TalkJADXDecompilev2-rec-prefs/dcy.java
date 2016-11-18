package p000;

import android.view.View;

public final class dcy extends ccv<dcz> {
    public dcy(View view, dcz dcz, gai gai) {
        super(view, dcz, gai);
    }

    protected boolean mo809a() {
        return ((dcz) this.c).mo977c() && ((dcz) this.c).mo976b() != ((dcz) this.c).mo975a();
    }

    protected gag mo810b() {
        int i;
        gah e = m7186e();
        if (((dcz) this.c).mo976b()) {
            i = bc.kW;
        } else {
            i = bc.kX;
        }
        e.m16814a(this.b.getResources().getString(i));
        return e.m16811a();
    }
}
