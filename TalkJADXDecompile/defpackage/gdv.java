package defpackage;

import android.content.Context;

/* renamed from: gdv */
public final class gdv {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    private static gdt i;

    static {
        a = bcp.class.getName();
        b = ghq.class.getName();
        c = gdk.class.getName();
        d = eni.class.getName();
        e = dis.class.getName();
        f = cxd.class.getName();
        g = bbn.class.getName();
        h = bhq.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (i == null) {
            i = new gdt();
        }
        jyn.a(bcp.class, i.a(context));
    }

    public static void b(Context context, jyn jyn) {
        if (i == null) {
            i = new gdt();
        }
        jyn.a(ghq.class, new gez());
    }

    public static void c(Context context, jyn jyn) {
        if (i == null) {
            i = new gdt();
        }
        jyn.a(gdk.class, i.d(context));
    }

    public static void d(Context context, jyn jyn) {
        if (i == null) {
            i = new gdt();
        }
        jyn.a(eni.class, i.c(context));
    }

    public static void e(Context context, jyn jyn) {
        if (i == null) {
            i = new gdt();
        }
        jyn.a(dis.class, i.b(context));
    }

    public static void a(jyn jyn) {
        if (i == null) {
            i = new gdt();
        }
        jyn.a(cxd.class, i.a());
    }

    public static void f(Context context, jyn jyn) {
        if (i == null) {
            i = new gdt();
        }
        jyn.a(bbn.class, new gdy(context));
    }

    public static void g(Context context, jyn jyn) {
        if (i == null) {
            i = new gdt();
        }
        jyn.a(bhq.class, new bhq(gcb.class), new bhq(gfd.class));
    }
}
