import android.content.Context;

public final class dte {
    public static final String a;
    private static dtd b;

    static {
        a = grg.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new dtd();
        }
        jyn.a(grg.class, new dtc());
    }
}
