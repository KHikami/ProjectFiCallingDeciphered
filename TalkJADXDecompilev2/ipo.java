package defpackage;

import android.content.Context;

final class ipo extends iis {
    private static final int[] a = new int[]{4};
    private final String b;
    private final String c;

    ipo(Context context, String str, String str2) {
        super(context, a);
        this.b = str;
        this.c = str2;
    }

    protected void a(mdg mdg) {
        super.a(mdg);
        if (mdg.a == null) {
            mdg.a = new mcv();
        }
        mcv mcv = mdg.a;
        mcv.a = new mcu();
        mcv.a.k = this.b;
        mcv.a.e = this.c;
    }
}
