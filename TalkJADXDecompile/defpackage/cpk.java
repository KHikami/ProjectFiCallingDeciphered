package defpackage;

import android.content.Context;

/* renamed from: cpk */
public final class cpk {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    private static cpj f;

    static {
        a = cpf.class.getName();
        b = cpg.class.getName();
        c = cxd.class.getName();
        d = cpd.class.getName();
        e = gkf.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (f == null) {
            f = new cpj();
        }
        jyn.a(cpf.class, f.d(context));
    }

    public static void b(Context context, jyn jyn) {
        if (f == null) {
            f = new cpj();
        }
        jyn.a(cpg.class, f.b(context));
    }

    public static void a(jyn jyn) {
        if (f == null) {
            f = new cpj();
        }
        jyn.a(cxd.class, f.a());
    }

    public static void c(Context context, jyn jyn) {
        if (f == null) {
            f = new cpj();
        }
        jyn.a(cpd.class, f.a(context));
    }

    public static void d(Context context, jyn jyn) {
        if (f == null) {
            f = new cpj();
        }
        jyn.a(gkf.class, f.c(context));
    }
}
