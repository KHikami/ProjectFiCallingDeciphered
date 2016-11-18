package p000;

import android.telephony.SmsManager;

public final class fyv {
    public static final String f14400a = fxw.class.getName();
    public static final String f14401b = fyd.class.getName();
    private static fyu f14402c;

    public static void m16642a(jyn jyn) {
        if (f14402c == null) {
            f14402c = new fyu();
        }
        jyn.m25444a(fxw.class, new fxw(SmsManager.getDefault()));
    }

    public static void m16643b(jyn jyn) {
        if (f14402c == null) {
            f14402c = new fyu();
        }
        jyn.m25444a(fyd.class, new fyd(SmsManager.getDefault()));
    }
}
