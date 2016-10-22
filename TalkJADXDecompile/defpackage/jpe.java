package defpackage;

import android.content.Context;

/* renamed from: jpe */
public final class jpe {
    public static final String a;
    private static jpd b;

    static {
        a = jpc.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new jpd();
        }
        jyn.a(jpc.class, new jpc(context));
    }
}
