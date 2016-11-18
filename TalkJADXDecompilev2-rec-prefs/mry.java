package p000;

final class mry<V, X extends Throwable> extends mrx<V, X, msp<? super X, ? extends V>, mti<? extends V>> {
    /* synthetic */ Object mo3930a(Object obj, Throwable th) {
        Object a = ((msp) obj).mo1301a(th);
        bm.m6123a(a, (Object) "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)?");
        return a;
    }

    /* synthetic */ void mo3929a(Object obj) {
        m32830c((mti) obj);
    }

    mry(mti<? extends V> mti__extends_V, Class<X> cls, msp<? super X, ? extends V> msp__super_X___extends_V) {
        super(mti__extends_V, cls, msp__super_X___extends_V);
    }

    private void m32830c(mti<? extends V> mti__extends_V) {
        mo3942a((mti) mti__extends_V);
    }
}
