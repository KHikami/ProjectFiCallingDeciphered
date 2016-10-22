import android.content.Context;

public final class ckf {
    public static final String a;
    private static ckd b;

    static {
        a = cjq.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new ckd();
        }
        jyn.a(cjq.class, b.a());
    }
}
