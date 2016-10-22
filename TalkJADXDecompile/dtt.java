import android.content.Context;

public final class dtt {
    public static final String a;
    private static dtr b;

    static {
        a = dtp.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new dtr();
        }
        jyn.a(dtp.class, b.a());
    }
}
