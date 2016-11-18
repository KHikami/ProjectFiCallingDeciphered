package p000;

import android.content.Context;

public final class inc extends iis {
    private static final int[] f18102a = new int[]{2};
    private final ijn f18103b;
    private final iim f18104c;

    public inc(Context context, ijn ijn) {
        super(context, f18102a);
        this.f18103b = ijn;
        this.f18104c = new iim(context);
    }

    public void mo1404a(mdg mdg) {
        super.mo1404a(mdg);
        ith o = this.f18103b.mo3224o();
        itf a = o.m23201a();
        if (a != null) {
            mdg.f27451e = a.m23169d();
        }
        if (mdg.f27447a == null) {
            mdg.f27447a = new mcv();
        }
        mcv mcv = mdg.f27447a;
        mcv.f27386a = new mcu();
        mcv.f27386a.f27384k = o.m23211c();
        mcv.f27386a.f27378e = o.m23214f();
        mcv.f27386a.f27375b = o.m23212d();
        mcv.f27392g = new lkz();
        mcv.f27392g.f25295d = Integer.valueOf(o.m23215g());
    }
}
