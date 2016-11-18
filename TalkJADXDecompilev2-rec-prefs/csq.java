package p000;

import android.content.Context;

public final class csq extends iis {
    private final ite f9000a;
    private final itf f9001b;

    public csq(Context context, int[] iArr, ite ite, itf itf) {
        super(context, iArr);
        this.f9000a = ite;
        this.f9001b = itf;
    }

    protected void mo1404a(mdg mdg) {
        super.mo1404a(mdg);
        ith o = this.f9000a.mo3224o();
        mdg.f27451e = this.f9001b.m23169d();
        mdg.f27447a = new mcv();
        mcv mcv = mdg.f27447a;
        mcv.f27386a = new mcu();
        mcv.f27386a.f27384k = o.m23211c();
        mcv.f27386a.f27378e = o.m23214f();
        mcv.f27386a.f27375b = o.m23212d();
        mcv.f27392g = new lkz();
        mcv.f27392g.f25295d = Integer.valueOf(o.m23215g());
    }
}
