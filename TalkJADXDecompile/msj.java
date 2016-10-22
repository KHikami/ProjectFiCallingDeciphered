import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

final class msj extends msa {
    static final Unsafe a;
    static final long b;
    static final long c;
    static final long d;
    static final long e;
    static final long f;

    static {
        Unsafe unsafe;
        try {
            unsafe = Unsafe.getUnsafe();
        } catch (SecurityException e) {
            try {
                unsafe = (Unsafe) AccessController.doPrivileged(new msk());
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        }
        try {
            Class cls = mrz.class;
            c = unsafe.objectFieldOffset(cls.getDeclaredField("waiters"));
            b = unsafe.objectFieldOffset(cls.getDeclaredField("listeners"));
            d = unsafe.objectFieldOffset(cls.getDeclaredField("value"));
            e = unsafe.objectFieldOffset(msl.class.getDeclaredField("thread"));
            f = unsafe.objectFieldOffset(msl.class.getDeclaredField("next"));
            a = unsafe;
        } catch (Throwable e3) {
            mfw.a(e3);
            throw new RuntimeException(e3);
        }
    }

    void a(msl msl, Thread thread) {
        a.putObject(msl, e, thread);
    }

    void a(msl msl, msl msl2) {
        a.putObject(msl, f, msl2);
    }

    boolean a(mrz<?> mrz_, msl msl, msl msl2) {
        return a.compareAndSwapObject(mrz_, c, msl, msl2);
    }

    boolean a(mrz<?> mrz_, mse mse, mse mse2) {
        return a.compareAndSwapObject(mrz_, b, mse, mse2);
    }

    boolean a(mrz<?> mrz_, Object obj, Object obj2) {
        return a.compareAndSwapObject(mrz_, d, obj, obj2);
    }

    msj() {
    }
}
