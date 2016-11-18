package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class ajp {
    private static Method a = null;

    public static String a(String str) {
        if (a == null) {
            try {
                Class cls = Class.forName("android.os.SystemProperties");
                if (cls != null) {
                    a = cls.getMethod("get", new Class[]{String.class});
                }
            } catch (ClassNotFoundException e) {
            } catch (NoSuchMethodException e2) {
            }
        }
        if (a != null) {
            try {
                return (String) a.invoke(null, new Object[]{str});
            } catch (IllegalArgumentException e3) {
            } catch (IllegalAccessException e4) {
            } catch (InvocationTargetException e5) {
            }
        }
        return null;
    }
}
