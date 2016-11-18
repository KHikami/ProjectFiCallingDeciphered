package p000;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

final class msj extends msa {
    static final Unsafe f28259a;
    static final long f28260b;
    static final long f28261c;
    static final long f28262d;
    static final long f28263e;
    static final long f28264f;

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
            f28261c = unsafe.objectFieldOffset(cls.getDeclaredField("waiters"));
            f28260b = unsafe.objectFieldOffset(cls.getDeclaredField("listeners"));
            f28262d = unsafe.objectFieldOffset(cls.getDeclaredField("value"));
            f28263e = unsafe.objectFieldOffset(msl.class.getDeclaredField("thread"));
            f28264f = unsafe.objectFieldOffset(msl.class.getDeclaredField("next"));
            f28259a = unsafe;
        } catch (Throwable e3) {
            mfw.m32011a(e3);
            throw new RuntimeException(e3);
        }
    }

    void mo3932a(msl msl, Thread thread) {
        f28259a.putObject(msl, f28263e, thread);
    }

    void mo3933a(msl msl, msl msl2) {
        f28259a.putObject(msl, f28264f, msl2);
    }

    boolean mo3936a(mrz<?> mrz_, msl msl, msl msl2) {
        return f28259a.compareAndSwapObject(mrz_, f28261c, msl, msl2);
    }

    boolean mo3935a(mrz<?> mrz_, mse mse, mse mse2) {
        return f28259a.compareAndSwapObject(mrz_, f28260b, mse, mse2);
    }

    boolean mo3934a(mrz<?> mrz_, Object obj, Object obj2) {
        return f28259a.compareAndSwapObject(mrz_, f28262d, obj, obj2);
    }

    msj() {
    }
}
