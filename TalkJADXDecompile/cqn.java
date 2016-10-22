import android.content.Context;

public final class cqn {
    public static final String a;
    public static final String b;
    private static cqm c;

    static {
        a = cqj.class.getName();
        b = cxd.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new cqm();
        }
        jyn.a(cqj.class, c.a(context));
    }

    public static void a(jyn jyn) {
        if (c == null) {
            c = new cqm();
        }
        jyn.a(cxd.class, c.a());
    }
}
