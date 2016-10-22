package defpackage;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: msn */
abstract class msn<I, O, F, T> extends msi<O> implements Runnable {
    mti<? extends I> a;
    F b;

    abstract T a(F f, I i);

    abstract void a(T t);

    static <I, O> mti<O> a(mti<I> mti_I, met<? super I, ? extends O> met__super_I___extends_O) {
        bm.a((Object) met__super_I___extends_O);
        Object mso = new mso(mti_I, met__super_I___extends_O);
        mti_I.a(mso, gwb.aT());
        return mso;
    }

    msn(mti<? extends I> mti__extends_I, F f) {
        this.a = (mti) bm.a((Object) mti__extends_I);
        this.b = bm.a((Object) f);
    }

    public final void run() {
        int i;
        int i2 = 1;
        Future future = this.a;
        Object obj = this.b;
        boolean isCancelled = isCancelled();
        if (future == null) {
            i = 1;
        } else {
            i = 0;
        }
        i |= isCancelled;
        if (obj != null) {
            i2 = 0;
        }
        if ((i2 | i) == 0) {
            this.a = null;
            this.b = null;
            try {
                try {
                    a(a(obj, msy.b(future)));
                } catch (UndeclaredThrowableException e) {
                    a(e.getCause());
                } catch (Throwable th) {
                    a(th);
                }
            } catch (CancellationException e2) {
                cancel(false);
            } catch (ExecutionException e3) {
                a(e3.getCause());
            } catch (Throwable th2) {
                a(th2);
            } catch (Throwable th22) {
                a(th22);
            }
        }
    }

    protected final void a() {
        a(this.a);
        this.a = null;
        this.b = null;
    }
}
