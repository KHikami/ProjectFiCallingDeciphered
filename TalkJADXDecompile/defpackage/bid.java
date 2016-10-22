package defpackage;

import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;

/* renamed from: bid */
public final class bid {
    public static final String a;
    public static final String b;
    private static bic c;

    static {
        a = ActivityLifecycleCallbacks.class.getName();
        b = bhl.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new bic();
        }
        jyn.a(ActivityLifecycleCallbacks.class, (bhz) jyn.a(context, bhl.class));
    }

    public static void b(Context context, jyn jyn) {
        if (c == null) {
            c = new bic();
        }
        jyn.a(bhl.class, new bhz(context));
    }
}
