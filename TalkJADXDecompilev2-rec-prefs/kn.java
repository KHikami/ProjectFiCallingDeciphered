package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

final class kn {
    private static Method f22412a;
    private static Method f22413b;

    static {
        try {
            Class cls = Class.forName("libcore.icu.ICU");
            if (cls != null) {
                f22412a = cls.getMethod("getScript", new Class[]{String.class});
                f22413b = cls.getMethod("addLikelySubtags", new Class[]{String.class});
            }
        } catch (Exception e) {
            f22412a = null;
            f22413b = null;
        }
    }

    public static String m26621a(Locale locale) {
        String b = kn.m26622b(locale);
        if (b != null) {
            return kn.m26620a(b);
        }
        return null;
    }

    private static String m26620a(String str) {
        try {
            if (f22412a != null) {
                return (String) f22412a.invoke(null, new Object[]{str});
            }
        } catch (IllegalAccessException e) {
        } catch (InvocationTargetException e2) {
        }
        return null;
    }

    private static String m26622b(Locale locale) {
        String locale2 = locale.toString();
        try {
            if (f22413b != null) {
                return (String) f22413b.invoke(null, new Object[]{locale2});
            }
        } catch (IllegalAccessException e) {
        } catch (InvocationTargetException e2) {
        }
        return locale2;
    }
}
