import android.content.Context;

public final class dqj {
    public static final String a;
    public static final String b;
    private static dqi c;

    static {
        a = dqh.class.getName();
        b = cxd.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new dqi();
        }
        jyn.a(dqh.class, c.a(context));
    }

    public static void a(jyn jyn) {
        if (c == null) {
            c = new dqi();
        }
        jyn.a(cxd.class, c.a());
    }
}
