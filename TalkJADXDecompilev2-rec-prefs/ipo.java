package p000;

import android.content.Context;

final class ipo extends iis {
    private static final int[] f18682a = new int[]{4};
    private final String f18683b;
    private final String f18684c;

    ipo(Context context, String str, String str2) {
        super(context, f18682a);
        this.f18683b = str;
        this.f18684c = str2;
    }

    protected void mo1404a(mdg mdg) {
        super.mo1404a(mdg);
        if (mdg.f27447a == null) {
            mdg.f27447a = new mcv();
        }
        mcv mcv = mdg.f27447a;
        mcv.f27386a = new mcu();
        mcv.f27386a.f27384k = this.f18683b;
        mcv.f27386a.f27378e = this.f18684c;
    }
}
