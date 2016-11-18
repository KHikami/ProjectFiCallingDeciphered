package defpackage;

import android.telephony.SmsManager;

public final class fyv {
    public static final String a = fxw.class.getName();
    public static final String b = fyd.class.getName();
    private static fyu c;

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
