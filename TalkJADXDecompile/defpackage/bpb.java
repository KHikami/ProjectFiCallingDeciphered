package defpackage;

import android.content.Context;

/* renamed from: bpb */
public final class bpb {
    public static final String a;
    private static bpa b;

    static {
        a = boz.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new bpa();
        }
        jyn.a(boz.class, new bpc(context));
    }
}
