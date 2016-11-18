package p000;

import android.content.Context;

public final class gdv {
    public static final String f14795a = bcp.class.getName();
    public static final String f14796b = ghq.class.getName();
    public static final String f14797c = gdk.class.getName();
    public static final String f14798d = eni.class.getName();
    public static final String f14799e = dis.class.getName();
    public static final String f14800f = cxd.class.getName();
    public static final String f14801g = bbn.class.getName();
    public static final String f14802h = bhq.class.getName();
    private static gdt f14803i;

    public static void m17087a(Context context, jyn jyn) {
        if (f14803i == null) {
            f14803i = new gdt();
        }
        jyn.m25445a(bcp.class, f14803i.m17082a(context));
    }

    public static void m17089b(Context context, jyn jyn) {
        if (f14803i == null) {
            f14803i = new gdt();
        }
        jyn.m25444a(ghq.class, new gez());
    }

    public static void m17090c(Context context, jyn jyn) {
        if (f14803i == null) {
            f14803i = new gdt();
        }
        jyn.m25444a(gdk.class, f14803i.m17086d(context));
    }

    public static void m17091d(Context context, jyn jyn) {
        if (f14803i == null) {
            f14803i = new gdt();
        }
        jyn.m25445a(eni.class, f14803i.m17085c(context));
    }

    public static void m17092e(Context context, jyn jyn) {
        if (f14803i == null) {
            f14803i = new gdt();
        }
        jyn.m25445a(dis.class, f14803i.m17084b(context));
    }

    public static void m17088a(jyn jyn) {
        if (f14803i == null) {
            f14803i = new gdt();
        }
        jyn.m25445a(cxd.class, f14803i.m17083a());
    }

    public static void m17093f(Context context, jyn jyn) {
        if (f14803i == null) {
            f14803i = new gdt();
        }
        jyn.m25444a(bbn.class, new gdy(context));
    }

    public static void m17094g(Context context, jyn jyn) {
        if (f14803i == null) {
            f14803i = new gdt();
        }
        jyn.m25445a(bhq.class, new bhq(gcb.class), new bhq(gfd.class));
    }
}
