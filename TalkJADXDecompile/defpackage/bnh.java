package defpackage;

import android.content.Context;

/* renamed from: bnh */
public final class bnh {
    public static final String a;
    private static bng b;

    static {
        a = bnd.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new bng();
        }
        bbm bbm = (bbm) jyn.a(context, bbm.class);
        jyn.a(bnd.class, new bnj(bbm), new bni(bbm));
    }
}
