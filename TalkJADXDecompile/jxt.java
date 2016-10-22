import android.content.Context;

public final class jxt {
    public static final String a;
    public static final String b;
    private static jxs c;

    static {
        a = jxp.class.getName();
        b = jxq.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new jxs();
        }
        jyn.a(jxp.class, new jxp(context));
    }

    public static void a(jyn jyn) {
        if (c == null) {
            c = new jxs();
        }
        jyn.a(jxq.class, new jxq());
    }
}
