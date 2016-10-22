import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
public final class dji {
    private final Class a;
    private final String b;
    private final Class[] c;

    public dji(Class cls, String str, Class... clsArr) {
        this.a = cls;
        this.b = str;
        this.c = clsArr;
    }

    public final boolean a(Object obj) {
        return a(obj.getClass()) != null;
    }

    private Object c(Object obj, Object... objArr) {
        Object obj2 = null;
        Method a = a(obj.getClass());
        if (a != null) {
            try {
                obj2 = a.invoke(obj, objArr);
            } catch (IllegalAccessException e) {
            }
        }
        return obj2;
    }

    public final Object a(Object obj, Object... objArr) {
        try {
            return c(obj, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    private Object d(Object obj, Object... objArr) {
        Object a = a(obj.getClass());
        if (a == null) {
            String str = this.b;
            String valueOf = String.valueOf(obj);
            throw new AssertionError(new StringBuilder((String.valueOf(str).length() + 33) + String.valueOf(valueOf).length()).append("Method ").append(str).append(" not supported for object ").append(valueOf).toString());
        }
        try {
            return a.invoke(obj, objArr);
        } catch (Throwable e) {
            String valueOf2 = String.valueOf(a);
            AssertionError assertionError = new AssertionError(new StringBuilder(String.valueOf(valueOf2).length() + 29).append("Unexpectedly could not call: ").append(valueOf2).toString());
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    public final Object b(Object obj, Object... objArr) {
        try {
            return d(obj, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    private final Method a(Class cls) {
        if (this.b == null) {
            return null;
        }
        Method a = a(cls, this.b, this.c);
        if (a == null || this.a == null || this.a.isAssignableFrom(a.getReturnType())) {
            return a;
        }
        return null;
    }

    private static Method a(Class cls, String str, Class[] clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
                return method;
            } catch (NoSuchMethodException e) {
                return method;
            }
        } catch (NoSuchMethodException e2) {
            return null;
        }
    }
}
