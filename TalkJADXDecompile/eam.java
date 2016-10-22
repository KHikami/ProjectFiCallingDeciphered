import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;

public final class eam {
    public static final String a;
    public static final String b;
    public static final String c;
    private static eal d;

    static {
        a = ActivityLifecycleCallbacks.class.getName();
        b = eak.class.getName();
        c = eaj.class.getName();
    }

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
