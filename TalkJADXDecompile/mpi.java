import java.util.concurrent.atomic.AtomicBoolean;

public final class mpi {
    public static final AtomicBoolean a;
    static mon b;

    static {
        a = new AtomicBoolean(false);
        b = mpl.a(mop.REWRITE);
    }

    public static void a(mph mph) {
        if (mph == null) {
            mph = new mpr();
        }
        if (mpn.a.compareAndSet(null, mph)) {
            mpn.c();
            return;
        }
        throw new IllegalStateException("Logger backends can only be configured once.");
    }

    public static void a(mop mop) {
        if (mop == null) {
            mop = mop.REWRITE;
        }
        b = mpl.a(mop);
    }
}
