package p000;

import android.content.Context;

final class esi {
    private final cxd f12156a = new cxe().m11190a("promoframework").m11192b("Module that hosts the promo/OOB framework.").m11191a(true).m11189a();
    private esm f12157b;

    esi() {
    }

    public cxd[] m14347a() {
        return new cxd[]{this.f12156a};
    }

    public ese m14346a(Context context) {
        return (ese) this.f12156a.mo1448a(context, new esk());
    }

    public erw m14348b(Context context) {
        return (erw) this.f12156a.mo1448a(context, new esf());
    }

    public esm m14349b() {
        if (this.f12157b == null) {
            this.f12157b = new esm();
        }
        return this.f12157b;
    }
}
