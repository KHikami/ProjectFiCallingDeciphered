package defpackage;

import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;

public final class eok {
    public static final String a = ActivityLifecycleCallbacks.class.getName();
    public static final String b = jtu.class.getName();
    public static final String c = jfn.class.getName();
    private static eoi d;

    public static void a(Context context, jyn jyn) {
        if (d == null) {
            d = new eoi();
        }
        jyn.a(ActivityLifecycleCallbacks.class, new fcy(context), new ftc(context), new ftd(context), new ftb(context), new ftf(context), new fsy(context), new ftj(context));
    }

    public static void a(jyn jyn) {
        if (d == null) {
            d = new eoi();
        }
        jyn.a(jtu.class, new eru());
    }

    public static void b(jyn jyn) {
        if (d == null) {
            d = new eoi();
        }
        jyn.a(jfn.class, d.a());
    }
}
