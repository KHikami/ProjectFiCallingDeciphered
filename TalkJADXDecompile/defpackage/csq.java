package defpackage;

import android.content.Context;

/* renamed from: csq */
public final class csq extends iis {
    private final ite a;
    private final itf b;

    public csq(Context context, int[] iArr, ite ite, itf itf) {
        super(context, iArr);
        this.a = ite;
        this.b = itf;
    }

    protected void a(mdg mdg) {
        super.a(mdg);
        ith o = this.a.o();
        mdg.e = this.b.d();
        mdg.a = new mcv();
        mcv mcv = mdg.a;
        mcv.a = new mcu();
        mcv.a.k = o.c();
        mcv.a.e = o.f();
        mcv.a.b = o.d();
        mcv.g = new lkz();
        mcv.g.d = Integer.valueOf(o.g());
    }
}
