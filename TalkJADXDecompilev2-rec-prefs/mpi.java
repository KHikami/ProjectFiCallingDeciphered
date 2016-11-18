package p000;

import java.util.concurrent.atomic.AtomicBoolean;

public final class mpi {
    public static final AtomicBoolean f28042a = new AtomicBoolean(false);
    static mon f28043b = mpl.m32660a(mop.REWRITE);

    public static void m32654a(mph mph) {
        if (mph == null) {
            mph = new mpr();
        }
        if (mpn.f28052a.compareAndSet(null, mph)) {
            mpn.m32662c();
            return;
        }
        throw new IllegalStateException("Logger backends can only be configured once.");
    }

    public static void m32653a(mop mop) {
        if (mop == null) {
            mop = mop.REWRITE;
        }
        f28043b = mpl.m32660a(mop);
    }
}
