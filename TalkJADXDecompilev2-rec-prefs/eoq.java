package p000;

final class eoq extends eov {
    final /* synthetic */ eon f11948a;

    eoq(eon eon) {
        this.f11948a = eon;
        super(eon);
    }

    boolean mo1924a() {
        if (!gwb.m1906a(this.f11948a.f11938e, "babel_network_change_notification", false)) {
            return false;
        }
        if (((eaj) jyn.m25426a(this.f11948a.f11938e, eaj.class)).mo1802a() == eai.CAPTIVE_PORTAL) {
            return true;
        }
        return false;
    }

    gag mo1925b() {
        return new gah(this.f11948a.f11938e).m16814a(this.f11948a.f11938e.getString(bc.f2933Q)).m16811a();
    }
}
