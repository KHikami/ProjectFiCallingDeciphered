package defpackage;

import java.lang.reflect.Method;

/* renamed from: mfw */
public final class mfw {
    private static final Object a;
    private static final Method b;
    private static final Method c;

    public static void a(Throwable th) {
        bm.a((Object) th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    @Deprecated
    public static void b(Throwable th) {
        if (th != null) {
            mfw.a(th);
        }
    }

    @Deprecated
    public static RuntimeException c(Throwable th) {
        mfw.a(th);
        throw new RuntimeException(th);
    }

    static {
        Method method;
        Method method2 = null;
        Object a = mfw.a();
        a = a;
        if (a == null) {
            method = null;
        } else {
            method = mfw.a("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        b = method;
        if (a != null) {
            method2 = mfw.a("getStackTraceDepth", Throwable.class);
        }
        c = method2;
    }

    private static Object a() {
        Object obj = null;
        try {
            obj = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
        }
        return obj;
    }

    private static Method a(String str, Class<?>... clsArr) {
        Method method = null;
        try {
            method = Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
        }
        return method;
    }

    public static <X extends Throwable> void a(Throwable th, Class<X> cls) {
        if (th != null) {
            bm.a((Object) th);
            if (cls.isInstance(th)) {
                throw ((Throwable) cls.cast(th));
            }
        }
        mfw.b(th);
    }
}
