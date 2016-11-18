package p000;

import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;

public final class bid {
    public static final String f3419a = ActivityLifecycleCallbacks.class.getName();
    public static final String f3420b = bhl.class.getName();
    private static bic f3421c;

    public static void m5302a(Context context, jyn jyn) {
        if (f3421c == null) {
            f3421c = new bic();
        }
        jyn.m25445a(ActivityLifecycleCallbacks.class, (bhz) jyn.m25426a(context, bhl.class));
    }

    public static void m5303b(Context context, jyn jyn) {
        if (f3421c == null) {
            f3421c = new bic();
        }
        jyn.m25444a(bhl.class, new bhz(context));
    }
}
