package defpackage;

import android.util.Log;

public final class itx {
    public static itz a;
    public static int b = itx.b();

    public static boolean a(int i) {
        return i >= b || (a != null && i >= 3);
    }

    public static void a(int i, String str, String str2) {
        if (i >= b) {
            Log.println(i, str, str2);
        }
        itz itz = a;
        if (itz != null && i >= 3) {
            itz.a(i, str, str2);
        }
    }

    public static void a(int i, String str, String str2, Object... objArr) {
        if (itx.a(i)) {
            itx.a(i, str, String.format(str2, objArr));
        }
    }

    public static void a(int i, String str, String str2, Throwable th) {
        if (itx.a(i)) {
            String valueOf = String.valueOf(th.toString());
            String valueOf2 = String.valueOf(Log.getStackTraceString(th));
            itx.a(i, str, new StringBuilder(((String.valueOf(str2).length() + 2) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append(str2).append("\n").append(valueOf).append("\n").append(valueOf2).toString());
        }
    }

    public static void a(String str, String str2, Object... objArr) {
        itx.a(4, str, String.format(str2, objArr));
    }

    public static void b(String str, String str2, Object... objArr) {
        itx.a(5, str, String.format(str2, objArr));
    }

    public static void c(String str, String str2, Object... objArr) {
        itx.a(6, str, String.format(str2, objArr));
    }

    public static void a(String str, String str2, Throwable th) {
        itx.a(6, str, str2, th);
    }

    public static void b(String str, String str2, Throwable th) {
        itx.a(str, str2, th);
        Log.wtf(str, str2, th);
        if (itx.a()) {
            throw new AssertionError(str2);
        }
    }

    private static int b() {
        String str = "vclib";
        if (Log.isLoggable(str, 2)) {
            return 2;
        }
        if (Log.isLoggable(str, 3)) {
            return 3;
        }
        if (Log.isLoggable(str, 4)) {
            return 4;
        }
        if (Log.isLoggable(str, 5)) {
            return 5;
        }
        return 6;
    }

    public static boolean a() {
        return 2 >= b;
    }

    public static String a(String str) {
        if (itx.a(3)) {
            return str;
        }
        return "Redacted-" + (str == null ? 0 : str.length());
    }

    public static void a(String str, String str2) {
        itx.a(6, str, str2);
        Log.wtf(str, str2);
        if (itx.a()) {
            throw new AssertionError(str2);
        }
    }
}
