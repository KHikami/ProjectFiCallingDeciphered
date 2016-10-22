import android.content.Context;

public final class gbw {
    public static final String a;
    public static final String b;
    private static gbv c;

    static {
        a = jnh.class.getName();
        b = gbu.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new gbv();
        }
        jyn.a(jnh.class, (jnh) jyn.a(context, gbu.class));
    }

    public static void b(Context context, jyn jyn) {
        if (c == null) {
            c = new gbv();
        }
        jyn.a(gbu.class, new gbu(context));
    }
}
