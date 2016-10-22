import android.content.Context;

public final class flr {
    public static final String a;
    public static final String b;
    private static flq c;

    static {
        a = flo.class.getName();
        b = ghz.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new flq();
        }
        jyn.a(flo.class, new flp(context));
    }

    public static void b(Context context, jyn jyn) {
        if (c == null) {
            c = new flq();
        }
        jyn.a(ghz.class, (flp) jyn.a(context, flo.class));
    }
}
