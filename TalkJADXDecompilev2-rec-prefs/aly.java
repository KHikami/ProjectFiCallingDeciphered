package p000;

import android.util.Log;
import java.util.Locale;

public class aly {
    public static String f1261a;
    public static boolean f1262b;

    static {
        String str = "Volley";
        f1261a = str;
        f1262b = Log.isLoggable(str, 2);
    }

    public static void m2882a(String str, Object... objArr) {
        if (f1262b) {
            aly.m2885d(str, objArr);
        }
    }

    public static void m2883b(String str, Object... objArr) {
        aly.m2885d(str, objArr);
    }

    public static void m2884c(String str, Object... objArr) {
        Log.e(f1261a, aly.m2885d(str, objArr));
    }

    public static String m2885d(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        String str3 = "<unknown>";
        for (int i = 2; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClass().equals(aly.class)) {
                str3 = stackTrace[i].getClassName();
                str3 = str3.substring(str3.lastIndexOf(46) + 1);
                str2 = str3.substring(str3.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
                break;
            }
        }
        str2 = str3;
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, str});
    }
}
