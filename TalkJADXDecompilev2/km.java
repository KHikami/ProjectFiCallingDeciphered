package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

final class km {
    private static Method a;

    static {
        try {
            a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public static String a(Locale locale) {
        try {
            return ((Locale) a.invoke(null, new Object[]{locale})).getScript();
        } catch (InvocationTargetException e) {
            return locale.getScript();
        } catch (IllegalAccessException e2) {
            return locale.getScript();
        }
    }
}
