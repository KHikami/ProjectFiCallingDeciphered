package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

final class km {
    private static Method f22333a;

    static {
        try {
            f22333a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public static String m26487a(Locale locale) {
        try {
            return ((Locale) f22333a.invoke(null, new Object[]{locale})).getScript();
        } catch (InvocationTargetException e) {
            return locale.getScript();
        } catch (IllegalAccessException e2) {
            return locale.getScript();
        }
    }
}
