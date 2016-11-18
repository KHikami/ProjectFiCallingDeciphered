package defpackage;

final class mry<V, X extends Throwable> extends mrx<V, X, msp<? super X, ? extends V>, mti<? extends V>> {
    /* synthetic */ Object a(Object obj, Throwable th) {
        Object a = ((msp) obj).a(th);
        bm.a(a, (Object) "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)?");
        return a;
    }

    /* synthetic */ void a(Object obj) {
        c((mti) obj);
    }

    mry(mti<? extends V> mti__extends_V, Class<X> cls, msp<? super X, ? extends V> msp__super_X___extends_V) {
        super(mti__extends_V, cls, msp__super_X___extends_V);
    }

    private void c(mti<? extends V> mti__extends_V) {
        a((mti) mti__extends_V);
    }
}
