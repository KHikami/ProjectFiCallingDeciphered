package defpackage;

/* renamed from: eou */
final class eou extends eov {
    final /* synthetic */ eon a;

    eou(eon eon) {
        this.a = eon;
        super(eon);
    }

    void c() {
        super.c();
        this.a.h.b().c(2100);
    }

    void d() {
        super.d();
        this.a.h.b().c(2101);
    }

    boolean a() {
        if (!gwb.a(this.a.e, "babel_network_change_notification", false)) {
            return false;
        }
        if (((eaj) jyn.a(this.a.e, eaj.class)).a().a()) {
            return false;
        }
        return true;
    }

    gag b() {
        return new gah(this.a.e).a(this.a.e.getString(bc.hg)).a();
    }
}
