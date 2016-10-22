import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: PG */
final class dcn extends dce {
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
                unsafe = (Unsafe) AccessController.doPrivileged(new dco());
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        }
        try {
            Class cls = dcd.class;
            c = unsafe.objectFieldOffset(cls.getDeclaredField("waiters"));
            b = unsafe.objectFieldOffset(cls.getDeclaredField("listeners"));
            d = unsafe.objectFieldOffset(cls.getDeclaredField("value"));
            e = unsafe.objectFieldOffset(dcp.class.getDeclaredField("thread"));
            f = unsafe.objectFieldOffset(dcp.class.getDeclaredField("next"));
            a = unsafe;
        } catch (Throwable e3) {
            throw cza.a(e3);
        }
    }

    final void a(dcp dcp, Thread thread) {
        a.putObject(dcp, e, thread);
    }

    final void a(dcp dcp, dcp dcp2) {
        a.putObject(dcp, f, dcp2);
    }

    final boolean a(dcd dcd, dcp dcp, dcp dcp2) {
        return a.compareAndSwapObject(dcd, c, dcp, dcp2);
    }

    final boolean a(dcd dcd, dci dci, dci dci2) {
        return a.compareAndSwapObject(dcd, b, dci, dci2);
    }

    final boolean a(dcd dcd, Object obj, Object obj2) {
        return a.compareAndSwapObject(dcd, d, obj, obj2);
    }

    dcn() {
    }
}
