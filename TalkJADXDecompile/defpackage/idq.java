package defpackage;

/* renamed from: idq */
public final class idq {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    private static idp e;

    static {
        a = idd.class.getName();
        b = ide.class.getName();
        c = ida.class.getName();
        d = idf.class.getName();
    }

    public static void a(jyn jyn) {
        if (e == null) {
            e = new idp();
        }
        jyn.a(idd.class, new idn());
    }

    public static void b(jyn jyn) {
        if (e == null) {
            e = new idp();
        }
        jyn.a(ide.class, new idj((byte) 0));
    }

    public static void c(jyn jyn) {
        if (e == null) {
            e = new idp();
        }
        jyn.a(ida.class, new idl());
    }

    public static void d(jyn jyn) {
        if (e == null) {
            e = new idp();
        }
        jyn.a(idf.class, new ido(new iet()));
    }
}
