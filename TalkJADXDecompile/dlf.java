import android.content.Context;

public final class dlf {
    public static final String a;
    private static dle b;

    static {
        a = dlc.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new dle();
        }
        jyn.a(dlc.class, new dld(context));
    }
}
