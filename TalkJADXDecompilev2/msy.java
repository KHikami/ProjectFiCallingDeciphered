package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public final class msy extends gwb {
    private static final msp<mti<Object>, Object> a = new msz();

    public static <V> mti<V> T(V v) {
        if (v == null) {
            return mtd.a;
        }
        return new mtd(v);
    }

    public static <V> mti<V> b(Throwable th) {
        bm.a((Object) th);
        return new mtc(th);
    }

    public static <V, X extends Throwable> mti<V> a(mti<? extends V> mti__extends_V, Class<X> cls, msp<? super X, ? extends V> msp__super_X___extends_V, Executor executor) {
        return mrx.a(mti__extends_V, cls, msp__super_X___extends_V, executor);
    }

    public static <I, O> mti<O> a(mti<I> mti_I, met<? super I, ? extends O> met__super_I___extends_O) {
        return msn.a((mti) mti_I, (met) met__super_I___extends_O);
    }

    public static <V> void a(mti<V> mti_V, msx<? super V> msx__super_V, Executor executor) {
        bm.a((Object) msx__super_V);
        mti_V.a(new mta(mti_V, msx__super_V), executor);
    }

    public static <V> V b(Future<V> future) {
        bm.b(future.isDone(), "Future was expected to be done: %s", (Object) future);
        return gwb.a((Future) future);
    }
}
