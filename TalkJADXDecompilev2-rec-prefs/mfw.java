package p000;

import java.lang.reflect.Method;

public final class mfw {
    private static final Object f27632a;
    private static final Method f27633b;
    private static final Method f27634c;

    public static void m32011a(Throwable th) {
        bm.m6122a((Object) th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    @Deprecated
    public static void m32013b(Throwable th) {
        if (th != null) {
            mfw.m32011a(th);
        }
    }

    @Deprecated
    public static RuntimeException m32014c(Throwable th) {
        mfw.m32011a(th);
        throw new RuntimeException(th);
    }

    static {
        Method method;
        Method method2 = null;
        Object a = mfw.m32009a();
        f27632a = a;
        if (a == null) {
            method = null;
        } else {
            method = mfw.m32010a("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        f27633b = method;
        if (f27632a != null) {
            method2 = mfw.m32010a("getStackTraceDepth", Throwable.class);
        }
        f27634c = method2;
    }

    private static Object m32009a() {
        Object obj = null;
        try {
            obj = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
        }
        return obj;
    }

    private static Method m32010a(String str, Class<?>... clsArr) {
        Method method = null;
        try {
            method = Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
        }
        return method;
    }

    public static <X extends Throwable> void m32012a(Throwable th, Class<X> cls) {
        if (th != null) {
            bm.m6122a((Object) th);
            if (cls.isInstance(th)) {
                throw ((Throwable) cls.cast(th));
            }
        }
        mfw.m32013b(th);
    }
}
