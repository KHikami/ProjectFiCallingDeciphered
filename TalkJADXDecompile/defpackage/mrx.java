package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: mrx */
abstract class mrx<V, X extends Throwable, F, T> extends msi<V> implements Runnable {
    mti<? extends V> a;
    Class<X> b;
    F c;

    abstract T a(F f, X x);

    abstract void a(T t);

    static <X extends Throwable, V> mti<V> a(mti<? extends V> mti__extends_V, Class<X> cls, msp<? super X, ? extends V> msp__super_X___extends_V, Executor executor) {
        mrz mry = new mry(mti__extends_V, cls, msp__super_X___extends_V);
        mti__extends_V.a(mry, gwb.a(executor, mry));
        return mry;
    }

    mrx(mti<? extends V> mti__extends_V, Class<X> cls, F f) {
        this.a = (mti) bm.a((Object) mti__extends_V);
        this.b = (Class) bm.a((Object) cls);
        this.c = bm.a((Object) f);
    }

    public final void run() {
        int i = 1;
        Object obj = null;
        Future future = this.a;
        Class cls = this.b;
        Object obj2 = this.c;
        int i2 = (cls == null ? 1 : 0) | (future == null ? 1 : 0);
        if (obj2 != null) {
            i = 0;
        }
        if (((i | i2) | isCancelled()) == 0) {
            Throwable th;
            this.a = null;
            this.b = null;
            this.c = null;
            try {
                obj = msy.b(future);
                th = null;
            } catch (ExecutionException e) {
                th = (Throwable) bm.a(e.getCause());
            } catch (Throwable th2) {
                th = th2;
            }
            if (th == null) {
                b(obj);
            } else if (gwb.a(th, cls)) {
                try {
                    a(a(obj2, th));
                } catch (Throwable th3) {
                    a(th3);
                }
            } else {
                a(th3);
            }
        }
    }

    protected final void a() {
        a(this.a);
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
