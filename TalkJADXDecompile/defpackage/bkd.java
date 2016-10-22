package defpackage;

import android.content.Context;

/* renamed from: bkd */
public final class bkd {
    public static final String a;
    private static bkc b;

    static {
        a = bhq.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new bkc();
        }
        jyn.a(bhq.class, new bhq(bkm.class));
    }
}
