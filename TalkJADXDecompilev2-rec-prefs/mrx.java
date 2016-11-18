package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

abstract class mrx<V, X extends Throwable, F, T> extends msi<V> implements Runnable {
    mti<? extends V> f28242a;
    Class<X> f28243b;
    F f28244c;

    abstract T mo3930a(F f, X x);

    abstract void mo3929a(T t);

    static <X extends Throwable, V> mti<V> m32826a(mti<? extends V> mti__extends_V, Class<X> cls, msp<? super X, ? extends V> msp__super_X___extends_V, Executor executor) {
        mrz mry = new mry(mti__extends_V, cls, msp__super_X___extends_V);
        mti__extends_V.mo3706a(mry, gwb.m1703a(executor, mry));
        return mry;
    }

    mrx(mti<? extends V> mti__extends_V, Class<X> cls, F f) {
        this.f28242a = (mti) bm.m6122a((Object) mti__extends_V);
        this.f28243b = (Class) bm.m6122a((Object) cls);
        this.f28244c = bm.m6122a((Object) f);
    }

    public final void run() {
        Throwable th;
        int i = 1;
        Object obj = null;
        Future future = this.f28242a;
        Class cls = this.f28243b;
        Object obj2 = this.f28244c;
        int i2 = (cls == null ? 1 : 0) | (future == null ? 1 : 0);
        if (obj2 != null) {
            i = 0;
        }
        if (((i | i2) | isCancelled()) == 0) {
            this.f28242a = null;
            this.f28243b = null;
            this.f28244c = null;
            try {
                obj = msy.m32872b(future);
                th = null;
            } catch (ExecutionException e) {
                th = (Throwable) bm.m6122a(e.getCause());
            } catch (Throwable th2) {
                th = th2;
            }
            if (th == null) {
                mo3943b(obj);
            } else if (gwb.m1939a(th, cls)) {
                try {
                    mo3929a(mo3930a(obj2, th));
                } catch (Throwable th3) {
                    mo3941a(th3);
                }
            } else {
                mo3941a(th3);
            }
        }
    }

    protected final void mo3928a() {
        m32819a(this.f28242a);
        this.f28242a = null;
        this.f28243b = null;
        this.f28244c = null;
    }
}
