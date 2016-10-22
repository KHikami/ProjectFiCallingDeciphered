package defpackage;

import android.content.Context;

/* renamed from: dmd */
public final class dmd {
    public static final String a;
    private static dmc b;

    static {
        a = djx.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new dmc();
        }
        jyn.a(djx.class, new dme());
    }
}
