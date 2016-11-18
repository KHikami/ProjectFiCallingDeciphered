package p000;

import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class gly extends glx {
    private static Method f15618a;
    private static Method f15619b;
    private static Method f15620c;

    gly() {
        super();
        try {
            Class[] clsArr = new Class[]{Long.TYPE, String.class, Integer.TYPE};
            Class cls = Trace.class;
            f15618a = cls.getDeclaredMethod("asyncTraceBegin", clsArr);
            f15619b = cls.getDeclaredMethod("asyncTraceEnd", clsArr);
            f15618a.setAccessible(true);
            f15619b.setAccessible(true);
            Method declaredMethod = cls.getDeclaredMethod("traceCounter", clsArr);
            f15620c = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Throwable e) {
            glk.m17980d("Babel_Trace", "No async tracer available.", e);
        }
    }

    void mo2295c(String str) {
        if (f15620c != null) {
            try {
                f15620c.invoke(null, new Object[]{Long.valueOf(4096), str, Integer.valueOf(0)});
            } catch (InvocationTargetException e) {
            } catch (IllegalAccessException e2) {
            }
        }
    }

    void mo2293a(String str) {
        if (f15618a != null) {
            try {
                f15618a.invoke(null, new Object[]{Long.valueOf(4096), str, Integer.valueOf(0)});
            } catch (InvocationTargetException e) {
            } catch (IllegalAccessException e2) {
            }
        }
    }

    void mo2294b(String str) {
        if (f15619b != null) {
            try {
                f15619b.invoke(null, new Object[]{Long.valueOf(4096), str, Integer.valueOf(0)});
            } catch (InvocationTargetException e) {
            } catch (IllegalAccessException e2) {
            }
        }
    }
}
