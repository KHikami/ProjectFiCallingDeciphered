package defpackage;

import android.content.Context;

/* renamed from: clo */
public final class clo {
    public static final String a;
    private static clm b;

    static {
        a = cli.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new clm();
        }
        jyn.a(cli.class, b.a());
    }
}
