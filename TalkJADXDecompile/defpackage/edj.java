package defpackage;

import android.content.Context;

/* renamed from: edj */
public final class edj {
    public static final String a;
    public static final String b;
    private static edi c;

    static {
        a = ede.class.getName();
        b = cxd.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new edi();
        }
        jyn.a(ede.class, c.a(context));
    }

    public static void a(jyn jyn) {
        if (c == null) {
            c = new edi();
        }
        jyn.a(cxd.class, c.a());
    }
}
