package defpackage;

import android.text.TextUtils;
import android.util.Log;

/* compiled from: PG */
/* renamed from: abw */
public final class abw {
    private static final String a;

    static {
        a = abw.class.getSimpleName();
    }

    public static boolean a() {
        return buf.i() >= 23;
    }

    public static boolean b() {
        return buf.i() >= 22;
    }

    public static boolean c() {
        return buf.i() >= 23;
    }

    public static boolean d() {
        return buf.i() > 23;
    }

    public static boolean e() {
        return buf.i() >= 23;
    }

    public static boolean f() {
        return buf.i() >= 22;
    }

    public static boolean g() {
        return buf.i() >= 23;
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        } catch (Throwable th) {
            Log.e(a, new StringBuilder(String.valueOf(str).length() + 62).append("Unexpected exception when checking if class:").append(str).append(" exists at runtime").toString(), th);
            return false;
        }
    }

    public static boolean a(String str, String str2, Class... clsArr) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            Class.forName(str).getMethod(str2, clsArr);
            return true;
        } catch (ClassNotFoundException e) {
            new StringBuilder((String.valueOf(str).length() + 24) + String.valueOf(str2).length()).append("Could not find method: ").append(str).append("#").append(str2);
            return false;
        } catch (NoSuchMethodException e2) {
            new StringBuilder((String.valueOf(str).length() + 24) + String.valueOf(str2).length()).append("Could not find method: ").append(str).append("#").append(str2);
            return false;
        } catch (Throwable th) {
            Log.e(a, new StringBuilder((String.valueOf(str).length() + 65) + String.valueOf(str2).length()).append("Unexpected exception when checking if method: ").append(str).append("#").append(str2).append(" exists at runtime").toString(), th);
            return false;
        }
    }

    public static boolean h() {
        return buf.i() >= 21;
    }
}
