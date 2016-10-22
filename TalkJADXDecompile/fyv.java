import android.telephony.SmsManager;

public final class fyv {
    public static final String a;
    public static final String b;
    private static fyu c;

    static {
        a = fxw.class.getName();
        b = fyd.class.getName();
    }

    public static void a(jyn jyn) {
        if (c == null) {
            c = new fyu();
        }
        jyn.a(fxw.class, new fxw(SmsManager.getDefault()));
    }

    public static void b(jyn jyn) {
        if (c == null) {
            c = new fyu();
        }
        jyn.a(fyd.class, new fyd(SmsManager.getDefault()));
    }
}
