package defpackage;

import android.content.Context;

/* renamed from: dfs */
public final class dfs {
    public static final String a;
    public static final String b;
    private static dfr c;

    static {
        a = dfm.class.getName();
        b = dfl.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new dfr();
        }
        jyn.a(dfm.class, new dfp(context));
    }

    public static void a(jyn jyn) {
        if (c == null) {
            c = new dfr();
        }
        jyn.a(dfl.class, new dfn());
    }
}
