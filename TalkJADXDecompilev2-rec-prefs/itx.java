package p000;

import android.util.Log;

public final class itx {
    public static itz f19011a;
    public static int f19012b = itx.m23285b();

    public static boolean m23284a(int i) {
        return i >= f19012b || (f19011a != null && i >= 3);
    }

    public static void m23277a(int i, String str, String str2) {
        if (i >= f19012b) {
            Log.println(i, str, str2);
        }
        itz itz = f19011a;
        if (itz != null && i >= 3) {
            itz.m23292a(i, str, str2);
        }
    }

    public static void m23279a(int i, String str, String str2, Object... objArr) {
        if (itx.m23284a(i)) {
            itx.m23277a(i, str, String.format(str2, objArr));
        }
    }

    public static void m23278a(int i, String str, String str2, Throwable th) {
        if (itx.m23284a(i)) {
            String valueOf = String.valueOf(th.toString());
            String valueOf2 = String.valueOf(Log.getStackTraceString(th));
            itx.m23277a(i, str, new StringBuilder(((String.valueOf(str2).length() + 2) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append(str2).append("\n").append(valueOf).append("\n").append(valueOf2).toString());
        }
    }

    public static void m23282a(String str, String str2, Object... objArr) {
        itx.m23277a(4, str, String.format(str2, objArr));
    }

    public static void m23287b(String str, String str2, Object... objArr) {
        itx.m23277a(5, str, String.format(str2, objArr));
    }

    public static void m23288c(String str, String str2, Object... objArr) {
        itx.m23277a(6, str, String.format(str2, objArr));
    }

    public static void m23281a(String str, String str2, Throwable th) {
        itx.m23278a(6, str, str2, th);
    }

    public static void m23286b(String str, String str2, Throwable th) {
        itx.m23281a(str, str2, th);
        Log.wtf(str, str2, th);
        if (itx.m23283a()) {
            throw new AssertionError(str2);
        }
    }

    private static int m23285b() {
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

    public static boolean m23283a() {
        return 2 >= f19012b;
    }

    public static String m23276a(String str) {
        if (itx.m23284a(3)) {
            return str;
        }
        return "Redacted-" + (str == null ? 0 : str.length());
    }

    public static void m23280a(String str, String str2) {
        itx.m23277a(6, str, str2);
        Log.wtf(str, str2);
        if (itx.m23283a()) {
            throw new AssertionError(str2);
        }
    }
}
