package defpackage;

import android.content.Context;

/* renamed from: dwh */
public final class dwh {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    private static dwg h;

    static {
        a = jnd.class.getName();
        b = jnh.class.getName();
        c = dwi.class.getName();
        d = jcq.class.getName();
        e = dwk.class.getName();
        f = jnc.class.getName();
        g = dwa.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (h == null) {
            h = new dwg();
        }
        jyn.a(jnd.class, new dwe());
    }

    public static void b(Context context, jyn jyn) {
        if (h == null) {
            h = new dwg();
        }
        jyn.a(jnh.class, (jnh) jyn.a(context, dwk.class));
    }

    public static void c(Context context, jyn jyn) {
        if (h == null) {
            h = new dwg();
        }
        jyn.a(dwi.class, new dwi());
    }

    public static void a(jyn jyn) {
        if (h == null) {
            h = new dwg();
        }
        jyn.a(jcq.class, new dwq());
    }

    public static void d(Context context, jyn jyn) {
        if (h == null) {
            h = new dwg();
        }
        jyn.a(dwk.class, new dwk(context));
    }

    public static void b(jyn jyn) {
        if (h == null) {
            h = new dwg();
        }
        jyn.a(jnc.class, new dwf());
    }

    public static void c(jyn jyn) {
        if (h == null) {
            h = new dwg();
        }
        jyn.a(dwa.class, new dwo());
    }
}
