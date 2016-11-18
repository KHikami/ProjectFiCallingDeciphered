package defpackage;

import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;

public final class eam {
    public static final String a = ActivityLifecycleCallbacks.class.getName();
    public static final String b = eak.class.getName();
    public static final String c = eaj.class.getName();
    private static eal d;

    public static void a(Context context, jyn jyn) {
        if (d == null) {
            d = new eal();
        }
        jyn.a(ActivityLifecycleCallbacks.class, (ActivityLifecycleCallbacks) jyn.a(context, eak.class));
    }

    public static void b(Context context, jyn jyn) {
        if (d == null) {
            d = new eal();
        }
        jyn.a(eak.class, new eak(context));
    }

    public static void c(Context context, jyn jyn) {
        if (d == null) {
            d = new eal();
        }
        jyn.a(eaj.class, (eaj) jyn.a(context, eak.class));
    }
}
