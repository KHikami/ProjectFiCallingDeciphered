import android.content.Context;

public final class cxk {
    public static final String a;
    public static final String b;
    private static cxj c;

    static {
        a = dpo.class.getName();
        b = cxg.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new cxj();
        }
        jyn.a(dpo.class, new cxi(context));
    }

    public static void b(Context context, jyn jyn) {
        if (c == null) {
            c = new cxj();
        }
        jyn.a(cxg.class, new cxh(context));
    }
}
