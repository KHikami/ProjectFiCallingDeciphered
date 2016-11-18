package p000;

import android.util.Log;
import java.lang.reflect.Method;

public final class kdt {
    private static final Method f21426a;
    private static final Method f21427b;
    private static final Method f21428c;

    static {
        Method method;
        Method method2;
        Exception e;
        Throwable th;
        try {
            Class cls = Class.forName("android.os.SystemProperties");
            method = cls.getMethod("get", new Class[]{String.class, String.class});
            try {
                method2 = cls.getMethod("getInt", new Class[]{String.class, Integer.TYPE});
                try {
                    Method method3 = cls.getMethod("getLong", new Class[]{String.class, Long.TYPE});
                    f21426a = method;
                    f21427b = method2;
                    f21428c = method3;
                } catch (Exception e2) {
                    e = e2;
                    try {
                        e.printStackTrace();
                        f21426a = method;
                        f21427b = method2;
                        f21428c = null;
                    } catch (Throwable th2) {
                        th = th2;
                        f21426a = method;
                        f21427b = method2;
                        f21428c = null;
                        throw th;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                method2 = null;
                e.printStackTrace();
                f21426a = method;
                f21427b = method2;
                f21428c = null;
            } catch (Throwable th3) {
                th = th3;
                method2 = null;
                f21426a = method;
                f21427b = method2;
                f21428c = null;
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            method2 = null;
            method = null;
            e.printStackTrace();
            f21426a = method;
            f21427b = method2;
            f21428c = null;
        } catch (Throwable th4) {
            th = th4;
            method2 = null;
            method = null;
            f21426a = method;
            f21427b = method2;
            f21428c = null;
            throw th;
        }
    }

    public static long m25604a(String str, long j) {
        try {
            if (f21428c != null) {
                return ((Long) f21428c.invoke(null, new Object[]{str, Long.valueOf(100)})).longValue();
            }
        } catch (Throwable e) {
            Log.e("SystemProperties", "get error", e);
        }
        return 100;
    }
}
