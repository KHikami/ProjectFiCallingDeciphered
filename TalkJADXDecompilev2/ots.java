package defpackage;

import android.util.Log;
import java.util.Locale;

public class ots {
    private ots() {
    }

    private static String a(String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return str;
        }
        return String.format(Locale.US, str, objArr);
    }

    private static String a(String str) {
        if (str.startsWith("cr_")) {
            return str;
        }
        int i = 0;
        if (str.startsWith("cr.")) {
            i = 3;
        }
        return "cr_" + str.substring(i, str.length());
    }

    public static void a(String str, String str2) {
        ots.a(str, str2, new Object[0]);
    }

    public static void b(String str, String str2, Object... objArr) {
        ots.a(str2, objArr);
        if (ots.a(objArr) != null) {
            ots.a(str);
        } else {
            ots.a(str);
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        ots.a(str2, objArr);
        if (ots.a(objArr) != null) {
            ots.a(str);
        } else {
            ots.a(str);
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        String a = ots.a(str2, objArr);
        Throwable a2 = ots.a(objArr);
        if (a2 != null) {
            Log.e(ots.a(str), a, a2);
        } else {
            Log.e(ots.a(str), a);
        }
    }

    private static Throwable a(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Object obj = objArr[objArr.length - 1];
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        return null;
    }

    private static String a() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = ots.class.getName();
        int i = 0;
        while (i < stackTrace.length) {
            if (stackTrace[i].getClassName().equals(name)) {
                i += 4;
                break;
            }
            i++;
        }
        return stackTrace[i].getFileName() + ":" + stackTrace[i].getLineNumber();
    }

    public static void a(String str, String str2, Object... objArr) {
        new StringBuilder("[").append(ots.a()).append("] ").append(ots.a(str2, objArr));
        if (ots.a(objArr) != null) {
            ots.a(str);
        } else {
            ots.a(str);
        }
    }
}
