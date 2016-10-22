import android.content.Context;

public final class clw {
    public static final String a;
    private static clu b;

    static {
        a = clp.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new clu();
        }
        jyn.a(clp.class, b.a());
    }
}
