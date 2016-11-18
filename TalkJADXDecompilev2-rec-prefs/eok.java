package p000;

import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;

public final class eok {
    public static final String f11927a = ActivityLifecycleCallbacks.class.getName();
    public static final String f11928b = jtu.class.getName();
    public static final String f11929c = jfn.class.getName();
    private static eoi f11930d;

    public static void m14176a(Context context, jyn jyn) {
        if (f11930d == null) {
            f11930d = new eoi();
        }
        jyn.m25445a(ActivityLifecycleCallbacks.class, new fcy(context), new ftc(context), new ftd(context), new ftb(context), new ftf(context), new fsy(context), new ftj(context));
    }

    public static void m14177a(jyn jyn) {
        if (f11930d == null) {
            f11930d = new eoi();
        }
        jyn.m25444a(jtu.class, new eru());
    }

    public static void m14178b(jyn jyn) {
        if (f11930d == null) {
            f11930d = new eoi();
        }
        jyn.m25444a(jfn.class, f11930d.m14175a());
    }
}
