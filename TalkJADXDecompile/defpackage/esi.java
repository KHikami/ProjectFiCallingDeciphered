package defpackage;

import android.content.Context;

/* renamed from: esi */
final class esi {
    private final cxd a;
    private esm b;

    esi() {
        this.a = new cxe().a("promoframework").b("Module that hosts the promo/OOB framework.").a(true).a();
    }

    public cxd[] a() {
        return new cxd[]{this.a};
    }

    public ese a(Context context) {
        return (ese) this.a.a(context, new esk());
    }

    public erw b(Context context) {
        return (erw) this.a.a(context, new esf());
    }

    public esm b() {
        if (this.b == null) {
            this.b = new esm();
        }
        return this.b;
    }
}
