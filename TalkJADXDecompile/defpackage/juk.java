package defpackage;

import android.util.Log;

/* renamed from: juk */
public final class juk implements jun {
    public static final kad a;

    static {
        a = new kad("debug.social.rpc.debug_log");
    }

    public boolean a(String str) {
        return juk.a(str, 3);
    }

    public boolean b(String str) {
        return juk.a(str, 2);
    }

    public void c(String str) {
        if (str != null) {
            gwb.b(3, "HttpOperation", str);
        }
    }

    public void d(String str) {
        if (str != null) {
            gwb.b(2, "HttpOperation", str);
        }
    }

    public void a(String str, juv juv, int i, String str2) {
    }

    private static boolean a(String str, int i) {
        return Log.isLoggable("HttpOperation", i) || Log.isLoggable(gwb.ab(str), i);
    }
}
