package defpackage;

import android.content.Context;

/* renamed from: izt */
public final class izt {
    public static final String a;
    private static izs b;

    static {
        a = ixk.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new izs();
        }
        jyn.a(ixk.class, b.a(context));
    }
}
