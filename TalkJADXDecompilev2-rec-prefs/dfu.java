package p000;

import android.content.Context;

final class dfu {
    private final cxd f9626a = new cxe().m11190a("gvsmsintegrationpromo").m11192b("Promo to enable Gv SMS Integration for Nova users.").m11191a(true).m11189a();

    public cxd[] m11621a() {
        return new cxd[]{this.f9626a};
    }

    dft m11620a(Context context) {
        if (!this.f9626a.mo1450a(context) || gwb.m2116c((biw) jyn.m25426a(context, biw.class))) {
            return null;
        }
        return (dft) this.f9626a.mo1448a(context, new dfw());
    }
}
