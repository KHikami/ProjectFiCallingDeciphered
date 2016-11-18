package p000;

import android.util.Log;

public final class juk implements jun {
    public static final kad f21070a = new kad("debug.social.rpc.debug_log");

    public boolean mo3610a(String str) {
        return juk.m25234a(str, 3);
    }

    public boolean mo3611b(String str) {
        return juk.m25234a(str, 2);
    }

    public void mo3612c(String str) {
        if (str != null) {
            gwb.m2011b(3, "HttpOperation", str);
        }
    }

    public void mo3613d(String str) {
        if (str != null) {
            gwb.m2011b(2, "HttpOperation", str);
        }
    }

    public void mo3609a(String str, juv juv, int i, String str2) {
    }

    private static boolean m25234a(String str, int i) {
        return Log.isLoggable("HttpOperation", i) || Log.isLoggable(gwb.ab(str), i);
    }
}
