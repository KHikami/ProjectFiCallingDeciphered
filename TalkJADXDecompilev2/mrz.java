package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mrz<V> implements mti<V> {
    private static final boolean a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger b = Logger.getLogger(mrz.class.getName());
    private static final Object c = new Object();
    static final msa d;
    volatile mse listeners;
    volatile Object value;
    volatile msl waiters;

    static {
        msa msj;
        Throwable th;
        try {
            msj = new msj();
        } catch (Throwable th2) {
            b.log(Level.SEVERE, "UnsafeAtomicHelper is broken!", th);
            b.log(Level.SEVERE, "SafeAtomicHelper is broken!", th2);
            msj = new msh();
        }
        d = msj;
    }

    private void a(msl msl) {
        msl.thread = null;
        while (true) {
            msl msl2 = this.waiters;
            if (msl2 != msl.a) {
                msl msl3 = null;
                while (msl2 != null) {
                    msl msl4 = msl2.next;
                    if (msl2.thread == null) {
                        if (msl3 != null) {
                            msl3.next = msl4;
                            if (msl3.thread == null) {
                            }
                        } else if (d.a(this, msl2, msl4)) {
                        }
                        msl2 = msl3;
                    }
                    msl3 = msl2;
                    msl2 = msl4;
                }
                return;
            }
            return;
        }
    }

    public V get(long j, TimeUnit timeUnit) {
        long toNanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if (((obj != null ? 1 : 0) & (!(obj instanceof msg) ? 1 : 0)) != 0) {
            return mrz.a(obj);
        }
        long nanoTime;
        if (toNanos > 0) {
            nanoTime = System.nanoTime() + toNanos;
        } else {
            nanoTime = 0;
        }
        long j2;
        Object obj2;
        if (toNanos >= 1000) {
            msl msl = this.waiters;
            if (msl != msl.a) {
                msl msl2 = new msl((byte) 0);
                do {
                    msl2.a(msl);
                    if (d.a(this, msl, msl2)) {
                        j2 = toNanos;
                        do {
                            LockSupport.parkNanos(this, j2);
                            if (Thread.interrupted()) {
                                a(msl2);
                                throw new InterruptedException();
                            }
                            obj2 = this.value;
                            if (((obj2 != null ? 1 : 0) & (!(obj2 instanceof msg) ? 1 : 0)) != 0) {
                                return mrz.a(obj2);
                            }
                            j2 = nanoTime - System.nanoTime();
                        } while (j2 >= 1000);
                        a(msl2);
                    } else {
                        msl = this.waiters;
                    }
                } while (msl != msl.a);
            }
            return mrz.a(this.value);
        }
        j2 = toNanos;
        while (j2 > 0) {
            obj2 = this.value;
            if (((obj2 != null ? 1 : 0) & (!(obj2 instanceof msg) ? 1 : 0)) != 0) {
                return mrz.a(obj2);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            j2 = nanoTime - System.nanoTime();
        }
        throw new TimeoutException();
    }

    public V get() {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if (((obj != null ? 1 : 0) & (!(obj instanceof msg) ? 1 : 0)) != 0) {
            return mrz.a(obj);
        }
        msl msl = this.waiters;
        if (msl != msl.a) {
            msl msl2 = new msl((byte) 0);
            do {
                msl2.a(msl);
                if (d.a(this, msl, msl2)) {
                    Object obj2;
                    int i;
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            a(msl2);
                            throw new InterruptedException();
                        }
                        obj2 = this.value;
                        if (obj2 != null) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                    } while ((i & (!(obj2 instanceof msg) ? 1 : 0)) == 0);
                    return mrz.a(obj2);
                }
                msl = this.waiters;
            } while (msl != msl.a);
        }
        return mrz.a(this.value);
    }

    private static V a(Object obj) {
        if (obj instanceof msb) {
            Throwable th = ((msb) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof msc) {
            throw new ExecutionException(((msc) obj).b);
        } else if (obj == c) {
            return null;
        } else {
            return obj;
        }
    }

    public boolean isDone() {
        int i = 1;
        Object obj = this.value;
        int i2 = obj != null ? 1 : 0;
        if (obj instanceof msg) {
            i = 0;
        }
        return i2 & i;
    }

    public boolean isCancelled() {
        return this.value instanceof msb;
    }

    public boolean cancel(boolean z) {
        Object obj = this.value;
        if (((obj == null ? 1 : 0) | (obj instanceof msg)) == 0) {
            return false;
        }
        Throwable cancellationException;
        if (a) {
            cancellationException = new CancellationException("Future.cancel() was called.");
        } else {
            cancellationException = null;
        }
        Object msb = new msb(z, cancellationException);
        Object obj2 = obj;
        boolean z2 = false;
        while (true) {
            if (d.a(this, obj2, msb)) {
                if (z) {
                    b();
                }
                mrz.a(this);
                if (!(obj2 instanceof msg)) {
                    return true;
                }
                mti mti = ((msg) obj2).b;
                if (mti instanceof msi) {
                    mrz mrz = (mrz) mti;
                    obj = mrz.value;
                    if (((obj == null ? 1 : 0) | (obj instanceof msg)) == 0) {
                        return true;
                    }
                    this = mrz;
                    obj2 = obj;
                    z2 = true;
                } else {
                    mti.cancel(z);
                    return true;
                }
            }
            obj2 = this.value;
            if (!(obj2 instanceof msg)) {
                return z2;
            }
        }
    }

    public void b() {
    }

    protected final boolean c() {
        Object obj = this.value;
        return (obj instanceof msb) && ((msb) obj).a;
    }

    public void a(Runnable runnable, Executor executor) {
        bm.a((Object) runnable, (Object) "Runnable was null.");
        bm.a((Object) executor, (Object) "Executor was null.");
        mse mse = this.listeners;
        if (mse != mse.a) {
            mse mse2 = new mse(runnable, executor);
            do {
                mse2.next = mse;
                if (!d.a(this, mse, mse2)) {
                    mse = this.listeners;
                } else {
                    return;
                }
            } while (mse != mse.a);
        }
        mrz.b(runnable, executor);
    }

    public boolean b(V v) {
        if (v == null) {
            Object obj = c;
        }
        if (!d.a(this, null, obj)) {
            return false;
        }
        mrz.a(this);
        return true;
    }

    public boolean a(Throwable th) {
        if (!d.a(this, null, new msc((Throwable) bm.a((Object) th)))) {
            return false;
        }
        mrz.a(this);
        return true;
    }

    protected boolean a(mti<? extends V> mti__extends_V) {
        Object msg;
        bm.a((Object) mti__extends_V);
        Object obj = this.value;
        if (obj == null) {
            if (mti__extends_V.isDone()) {
                if (!d.a(this, null, mrz.b((mti) mti__extends_V))) {
                    return false;
                }
                mrz.a(this);
                return true;
            }
            msg = new msg(this, mti__extends_V);
            if (d.a(this, null, msg)) {
                try {
                    mti__extends_V.a(msg, gwb.aT());
                } catch (Throwable th) {
                    obj = msc.a;
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof msb) {
            mti__extends_V.cancel(((msb) obj).a);
        }
        return false;
        d.a(this, msg, obj);
        return true;
    }

    static Object b(mti<?> mti_) {
        if (mti_ instanceof msi) {
            return ((mrz) mti_).value;
        }
        try {
            Object b = msy.b((Future) mti_);
            if (b == null) {
                return c;
            }
            return b;
        } catch (ExecutionException e) {
            return new msc(e.getCause());
        } catch (Throwable e2) {
            return new msb(false, e2);
        } catch (Throwable e22) {
            return new msc(e22);
        }
    }

    static void a(mrz<?> mrz_) {
        mse mse = null;
        while (true) {
            msl msl = mrz_.waiters;
            if (d.a((mrz) mrz_, msl, msl.a)) {
                mse mse2;
                mse mse3;
                while (msl != null) {
                    msl.a();
                    msl = msl.next;
                }
                mrz_.a();
                do {
                    mse2 = mrz_.listeners;
                } while (!d.a((mrz) mrz_, mse2, mse.a));
                mse mse4 = mse;
                mse = mse2;
                mse2 = mse4;
                while (mse != null) {
                    mse3 = mse.next;
                    mse.next = mse2;
                    mse2 = mse;
                    mse = mse3;
                }
                mse3 = mse2;
                while (mse3 != null) {
                    mse2 = mse3.next;
                    Runnable runnable = mse3.b;
                    if (runnable instanceof msg) {
                        Object obj = (msg) runnable;
                        mrz_ = obj.a;
                        if (mrz_.value == obj) {
                            if (d.a((mrz) mrz_, obj, mrz.b(obj.b))) {
                                mse = mse2;
                            }
                        }
                        mse3 = mse2;
                    } else {
                        mrz.b(runnable, mse3.c);
                        mse3 = mse2;
                    }
                }
                return;
            }
        }
    }

    protected void a() {
    }

    final void a(Future<?> future) {
        if (((future != null ? 1 : 0) & isCancelled()) != 0) {
            future.cancel(c());
        }
    }

    private static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Throwable e) {
            Logger logger = b;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            logger.log(level, new StringBuilder((String.valueOf(valueOf).length() + 57) + String.valueOf(valueOf2).length()).append("RuntimeException while executing runnable ").append(valueOf).append(" with executor ").append(valueOf2).toString(), e);
        }
    }
}
