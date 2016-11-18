package p000;

final class eou extends eov {
    final /* synthetic */ eon f11952a;

    eou(eon eon) {
        this.f11952a = eon;
        super(eon);
    }

    void mo1926c() {
        super.mo1926c();
        this.f11952a.f11941h.mo1693b().mo1714c(2100);
    }

    void mo1927d() {
        super.mo1927d();
        this.f11952a.f11941h.mo1693b().mo1714c(2101);
    }

    boolean mo1924a() {
        if (!gwb.m1906a(this.f11952a.f11938e, "babel_network_change_notification", false)) {
            return false;
        }
        if (((eaj) jyn.m25426a(this.f11952a.f11938e, eaj.class)).mo1802a().m13284a()) {
            return false;
        }
        return true;
    }

    gag mo1925b() {
        return new gah(this.f11952a.f11938e).m16814a(this.f11952a.f11938e.getString(bc.hg)).m16811a();
    }
}
