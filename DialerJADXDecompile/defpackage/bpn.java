package defpackage;

import android.util.Log;

@Deprecated
/* renamed from: bpn */
public final class bpn {
    public static volatile bmv a;

    static {
        a = new bmv();
    }

    public static void a(String str, Object obj) {
        bot bot = bot.a;
        if (bot != null) {
            bot.e(str, obj);
        } else if (bpn.a(3)) {
            if (obj != null) {
                str = str + ":" + obj;
            }
            Log.e((String) boq.b.a(), str);
        }
        bmv bmv = a;
    }

    public static void a(String str) {
        bot bot = bot.a;
        if (bot != null) {
            bot.d(str);
        } else if (bpn.a(1)) {
            boq.b.a();
        }
        bmv bmv = a;
    }

    public static void b(String str) {
        bot bot = bot.a;
        if (bot != null) {
            bot.b(str);
        } else if (bpn.a(0)) {
            boq.b.a();
        }
        bmv bmv = a;
    }

    public static void c(String str) {
        bot bot = bot.a;
        if (bot != null) {
            bot.e(str);
        } else if (bpn.a(2)) {
            Log.w((String) boq.b.a(), str);
        }
        bmv bmv = a;
    }

    private static boolean a(int i) {
        return a != null && a.a() <= i;
    }
}
