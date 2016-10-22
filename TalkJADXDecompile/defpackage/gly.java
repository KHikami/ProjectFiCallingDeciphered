package defpackage;

import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: gly */
final class gly extends glx {
    private static Method a;
    private static Method b;
    private static Method c;

    gly() {
        super();
        try {
            Class[] clsArr = new Class[]{Long.TYPE, String.class, Integer.TYPE};
            Class cls = Trace.class;
            a = cls.getDeclaredMethod("asyncTraceBegin", clsArr);
            b = cls.getDeclaredMethod("asyncTraceEnd", clsArr);
            a.setAccessible(true);
            b.setAccessible(true);
            Method declaredMethod = cls.getDeclaredMethod("traceCounter", clsArr);
            c = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Throwable e) {
            glk.d("Babel_Trace", "No async tracer available.", e);
        }
    }

    void c(String str) {
        if (c != null) {
            try {
                c.invoke(null, new Object[]{Long.valueOf(4096), str, Integer.valueOf(0)});
            } catch (InvocationTargetException e) {
            } catch (IllegalAccessException e2) {
            }
        }
    }

    void a(String str) {
        if (a != null) {
            try {
                a.invoke(null, new Object[]{Long.valueOf(4096), str, Integer.valueOf(0)});
            } catch (InvocationTargetException e) {
            } catch (IllegalAccessException e2) {
            }
        }
    }

    void b(String str) {
        if (b != null) {
            try {
                b.invoke(null, new Object[]{Long.valueOf(4096), str, Integer.valueOf(0)});
            } catch (InvocationTargetException e) {
            } catch (IllegalAccessException e2) {
            }
        }
    }
}
