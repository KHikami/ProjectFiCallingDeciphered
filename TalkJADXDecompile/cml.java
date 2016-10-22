import android.content.Context;

public final class cml {
    public static final String a;
    private static cmj b;

    static {
        a = clx.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new cmj();
        }
        jyn.a(clx.class, b.a());
    }
}
