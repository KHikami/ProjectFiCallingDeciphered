package p000;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

abstract class msn<I, O, F, T> extends msi<O> implements Runnable {
    mti<? extends I> f28267a;
    F f28268b;

    abstract T mo3937a(F f, I i);

    abstract void mo3929a(T t);

    static <I, O> mti<O> m32859a(mti<I> mti_I, met<? super I, ? extends O> met__super_I___extends_O) {
        bm.m6122a((Object) met__super_I___extends_O);
        Object mso = new mso(mti_I, met__super_I___extends_O);
        mti_I.mo3706a(mso, gwb.aT());
        return mso;
    }

    msn(mti<? extends I> mti__extends_I, F f) {
        this.f28267a = (mti) bm.m6122a((Object) mti__extends_I);
        this.f28268b = bm.m6122a((Object) f);
    }

    public final void run() {
        int i;
        int i2 = 1;
        Future future = this.f28267a;
        Object obj = this.f28268b;
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
            this.f28267a = null;
            this.f28268b = null;
            try {
                try {
                    mo3929a(mo3937a(obj, msy.m32872b(future)));
                } catch (UndeclaredThrowableException e) {
                    mo3941a(e.getCause());
                } catch (Throwable th) {
                    mo3941a(th);
                }
            } catch (CancellationException e2) {
                cancel(false);
            } catch (ExecutionException e3) {
                mo3941a(e3.getCause());
            } catch (Throwable th2) {
                mo3941a(th2);
            } catch (Throwable th22) {
                mo3941a(th22);
            }
        }
    }

    protected final void mo3928a() {
        m32819a(this.f28267a);
        this.f28267a = null;
        this.f28268b = null;
    }
}
