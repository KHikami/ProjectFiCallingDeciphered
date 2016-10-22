import android.content.Context;

public final class cje {
    public static final String a;
    private static cjc b;

    static {
        a = cja.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new cjc();
        }
        jyn.a(cja.class, b.a());
    }
}
