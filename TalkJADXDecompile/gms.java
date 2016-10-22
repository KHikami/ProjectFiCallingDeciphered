import android.content.Context;

public final class gms {
    public static final String a;
    private static gmr b;

    static {
        a = gmp.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new gmr();
        }
        jyn.a(gmp.class, new gmq(context));
    }
}
