package defpackage;

import android.content.Context;

/* renamed from: inc */
public final class inc extends iis {
    private static final int[] a;
    private final ijn b;
    private final iim c;

    static {
        a = new int[]{2};
    }

    public inc(Context context, ijn ijn) {
        super(context, a);
        this.b = ijn;
        this.c = new iim(context);
    }

    public void a(mdg mdg) {
        super.a(mdg);
        ith o = this.b.o();
        itf a = o.a();
        if (a != null) {
            mdg.e = a.d();
        }
        if (mdg.a == null) {
            mdg.a = new mcv();
        }
        mcv mcv = mdg.a;
        mcv.a = new mcu();
        mcv.a.k = o.c();
        mcv.a.e = o.f();
        mcv.a.b = o.d();
        mcv.g = new lkz();
        mcv.g.d = Integer.valueOf(o.g());
    }
}
