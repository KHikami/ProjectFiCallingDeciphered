package defpackage;

import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: kdt */
public final class kdt {
    private static final Method a;
    private static final Method b;
    private static final Method c;

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
                    a = method;
                    b = method2;
                    c = method3;
                } catch (Exception e2) {
                    e = e2;
                    try {
                        e.printStackTrace();
                        a = method;
                        b = method2;
                        c = null;
                    } catch (Throwable th2) {
                        th = th2;
                        a = method;
                        b = method2;
                        c = null;
                        throw th;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                method2 = null;
                e.printStackTrace();
                a = method;
                b = method2;
                c = null;
            } catch (Throwable th3) {
                th = th3;
                method2 = null;
                a = method;
                b = method2;
                c = null;
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            method2 = null;
            method = null;
            e.printStackTrace();
            a = method;
            b = method2;
            c = null;
        } catch (Throwable th4) {
            th = th4;
            method2 = null;
            method = null;
            a = method;
            b = method2;
            c = null;
            throw th;
        }
    }

    public static long a(String str, long j) {
        try {
            if (c != null) {
                return ((Long) c.invoke(null, new Object[]{str, Long.valueOf(100)})).longValue();
            }
        } catch (Throwable e) {
            Log.e("SystemProperties", "get error", e);
        }
        return 100;
    }
}
