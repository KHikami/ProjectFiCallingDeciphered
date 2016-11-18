package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public final class msy extends gwb {
    private static final msp<mti<Object>, Object> f28275a = new msz();

    public static <V> mti<V> m32868T(V v) {
        if (v == null) {
            return mtd.f28279a;
        }
        return new mtd(v);
    }

    public static <V> mti<V> m32873b(Throwable th) {
        bm.m6122a((Object) th);
        return new mtc(th);
    }

    public static <V, X extends Throwable> mti<V> m32869a(mti<? extends V> mti__extends_V, Class<X> cls, msp<? super X, ? extends V> msp__super_X___extends_V, Executor executor) {
        return mrx.m32826a(mti__extends_V, cls, msp__super_X___extends_V, executor);
    }

    public static <I, O> mti<O> m32870a(mti<I> mti_I, met<? super I, ? extends O> met__super_I___extends_O) {
        return msn.m32859a((mti) mti_I, (met) met__super_I___extends_O);
    }

    public static <V> void m32871a(mti<V> mti_V, msx<? super V> msx__super_V, Executor executor) {
        bm.m6122a((Object) msx__super_V);
        mti_V.mo3706a(new mta(mti_V, msx__super_V), executor);
    }

    public static <V> V m32872b(Future<V> future) {
        bm.m6152b(future.isDone(), "Future was expected to be done: %s", (Object) future);
        return gwb.m1639a((Future) future);
    }
}
