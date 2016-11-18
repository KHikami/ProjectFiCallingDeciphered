package defpackage;

final class eoq extends eov {
    final /* synthetic */ eon a;

    eoq(eon eon) {
        this.a = eon;
        super(eon);
    }

    boolean a() {
        if (!gwb.a(this.a.e, "babel_network_change_notification", false)) {
            return false;
        }
        if (((eaj) jyn.a(this.a.e, eaj.class)).a() == eai.CAPTIVE_PORTAL) {
            return true;
        }
        return false;
    }

    gag b() {
        return new gah(this.a.e).a(this.a.e.getString(bc.Q)).a();
    }
}
