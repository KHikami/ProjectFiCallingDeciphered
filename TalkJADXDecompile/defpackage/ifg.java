package defpackage;

import android.content.Context;

/* renamed from: ifg */
public final class ifg {
    public static final String a;
    private static iff b;

    static {
        a = iez.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new iff();
        }
        jyn.a(iez.class, new ifa(context, ((idy) jyn.a(context, idy.class)).a(((ida) jyn.a(context, ida.class)).a()).a(), (idd) jyn.a(context, idd.class)));
    }
}
