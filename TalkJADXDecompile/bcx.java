import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;

public final class bcx {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    private static bcw i;

    static {
        a = ActivityLifecycleCallbacks.class.getName();
        b = bcp.class.getName();
        c = bcs.class.getName();
        d = bct.class.getName();
        e = bcr.class.getName();
        f = bcz.class.getName();
        g = bcu.class.getName();
        h = bcv.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (i == null) {
            i = new bcw();
        }
        jyn.a(ActivityLifecycleCallbacks.class, i.b(context));
    }

    public static void b(Context context, jyn jyn) {
        if (i == null) {
            i = new bcw();
        }
        jyn.a(bcp.class, i.c(context));
    }

    public static void c(Context context, jyn jyn) {
        if (i == null) {
            i = new bcw();
        }
        jyn.a(bcs.class, (bcs) jyn.a(context, bcz.class));
    }

    public static void d(Context context, jyn jyn) {
        if (i == null) {
            i = new bcw();
        }
        jyn.a(bct.class, new bdb((bcz) jyn.a(context, bcz.class)));
    }

    public static void e(Context context, jyn jyn) {
        if (i == null) {
            i = new bcw();
        }
        jyn.a(bcr.class, i.a(context));
    }

    public static void f(Context context, jyn jyn) {
        if (i == null) {
            i = new bcw();
        }
        jyn.a(bcz.class, new bcz());
    }

    public static void g(Context context, jyn jyn) {
        if (i == null) {
            i = new bcw();
        }
        jyn.a(bcu.class, new bdc(context));
    }

    public static void h(Context context, jyn jyn) {
        if (i == null) {
            i = new bcw();
        }
        jyn.a(bcv.class, new bdf(context));
    }
}
