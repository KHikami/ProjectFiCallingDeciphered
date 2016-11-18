package defpackage;

import android.content.Context;

public final class bnh {
    public static final String a = bnd.class.getName();
    private static bng b;

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new bng();
        }
        bbm bbm = (bbm) jyn.a(context, bbm.class);
        jyn.a(bnd.class, new bnj(bbm), new bni(bbm));
    }
}
