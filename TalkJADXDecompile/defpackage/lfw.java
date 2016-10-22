package defpackage;

import android.content.Context;

/* renamed from: lfw */
public final class lfw {
    public static final String a;
    private static lfv b;

    static {
        a = ljp.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new lfv();
        }
        jyn.a(ljp.class, ((lfx) gwb.a((Object) context, lfx.class)).c());
    }
}
