package defpackage;

import android.content.Context;

/* renamed from: gba */
public final class gba {
    public static final String a;
    public static final String b;
    private static gaz c;

    static {
        a = gav.class.getName();
        b = dyy.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new gaz();
        }
        jyn.a(gav.class, new gbb());
    }

    public static void b(Context context, jyn jyn) {
        if (c == null) {
            c = new gaz();
        }
        jyn.a(dyy.class, new gbo(context));
    }
}
