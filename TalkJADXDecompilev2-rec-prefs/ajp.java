package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class ajp {
    private static Method f1023a = null;

    public static String m2642a(String str) {
        if (f1023a == null) {
            try {
                Class cls = Class.forName("android.os.SystemProperties");
                if (cls != null) {
                    f1023a = cls.getMethod("get", new Class[]{String.class});
                }
            } catch (ClassNotFoundException e) {
            } catch (NoSuchMethodException e2) {
            }
        }
        if (f1023a != null) {
            try {
                return (String) f1023a.invoke(null, new Object[]{str});
            } catch (IllegalArgumentException e3) {
            } catch (IllegalAccessException e4) {
            } catch (InvocationTargetException e5) {
            }
        }
        return null;
    }
}
