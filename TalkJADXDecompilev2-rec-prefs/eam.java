package p000;

import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;

public final class eam {
    public static final String f11012a = ActivityLifecycleCallbacks.class.getName();
    public static final String f11013b = eak.class.getName();
    public static final String f11014c = eaj.class.getName();
    private static eal f11015d;

    public static void m13293a(Context context, jyn jyn) {
        if (f11015d == null) {
            f11015d = new eal();
        }
        jyn.m25445a(ActivityLifecycleCallbacks.class, (ActivityLifecycleCallbacks) jyn.m25426a(context, eak.class));
    }

    public static void m13294b(Context context, jyn jyn) {
        if (f11015d == null) {
            f11015d = new eal();
        }
        jyn.m25444a(eak.class, new eak(context));
    }

    public static void m13295c(Context context, jyn jyn) {
        if (f11015d == null) {
            f11015d = new eal();
        }
        jyn.m25444a(eaj.class, (eaj) jyn.m25426a(context, eak.class));
    }
}
