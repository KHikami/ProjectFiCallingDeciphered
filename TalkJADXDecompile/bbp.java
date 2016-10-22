import android.content.Context;

public final class bbp {
    public static final String a;
    private static bbo b;

    static {
        a = bbm.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new bbo();
        }
        jyn.a(bbm.class, new bbq(context));
    }
}
