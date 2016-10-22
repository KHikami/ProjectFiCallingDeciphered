import android.content.Context;

public final class bjq {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    private static bjp e;

    static {
        a = bjr.class.getName();
        b = jnh.class.getName();
        c = bkq.class.getName();
        d = jcl.class.getName();
    }

    public static void a(jyn jyn) {
        if (e == null) {
            e = new bjp();
        }
        jyn.a(bjr.class, new bnz());
    }

    public static void b(jyn jyn) {
        if (e == null) {
            e = new bjp();
        }
        jyn.a(jnh.class, (jnh) jyn.a(bkq.class));
    }

    public static void a(Context context, jyn jyn) {
        if (e == null) {
            e = new bjp();
        }
        jyn.a(bkq.class, new bkq(context));
    }

    public static void b(Context context, jyn jyn) {
        if (e == null) {
            e = new bjp();
        }
        jyn.a(jcl.class, (jcl) jyn.a(context, bkq.class));
    }
}
