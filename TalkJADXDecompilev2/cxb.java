package defpackage;

import android.content.Context;

public final class cxb {
    public static final String a = cwv.class.getName();
    public static final String b = cxd.class.getName();
    private static cxa c;

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new cxa();
        }
        jyn.a(cwv.class, c.a(context));
    }

    public static void a(jyn jyn) {
        if (c == null) {
            c = new cxa();
        }
        jyn.a(cxd.class, c.a());
    }
}
