package p000;

import android.util.Log;
import java.util.Locale;

public class ots {
    private ots() {
    }

    private static String m39711a(String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return str;
        }
        return String.format(Locale.US, str, objArr);
    }

    private static String m39710a(String str) {
        if (str.startsWith("cr_")) {
            return str;
        }
        int i = 0;
        if (str.startsWith("cr.")) {
            i = 3;
        }
        return "cr_" + str.substring(i, str.length());
    }

    public static void m39713a(String str, String str2) {
        ots.m39714a(str, str2, new Object[0]);
    }

    public static void m39715b(String str, String str2, Object... objArr) {
        ots.m39711a(str2, objArr);
        if (ots.m39712a(objArr) != null) {
            ots.m39710a(str);
        } else {
            ots.m39710a(str);
        }
    }

    public static void m39716c(String str, String str2, Object... objArr) {
        ots.m39711a(str2, objArr);
        if (ots.m39712a(objArr) != null) {
            ots.m39710a(str);
        } else {
            ots.m39710a(str);
        }
    }

    public static void m39717d(String str, String str2, Object... objArr) {
        String a = ots.m39711a(str2, objArr);
        Throwable a2 = ots.m39712a(objArr);
        if (a2 != null) {
            Log.e(ots.m39710a(str), a, a2);
        } else {
            Log.e(ots.m39710a(str), a);
        }
    }

    private static Throwable m39712a(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Object obj = objArr[objArr.length - 1];
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        return null;
    }

    private static String m39709a() {
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

    public static void m39714a(String str, String str2, Object... objArr) {
        new StringBuilder("[").append(ots.m39709a()).append("] ").append(ots.m39711a(str2, objArr));
        if (ots.m39712a(objArr) != null) {
            ots.m39710a(str);
        } else {
            ots.m39710a(str);
        }
    }
}
