package p000;

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
    private static final boolean f28238a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger f28239b = Logger.getLogger(mrz.class.getName());
    private static final Object f28240c = new Object();
    static final msa f28241d;
    volatile mse listeners;
    volatile Object value;
    volatile msl waiters;

    static {
        msa msj;
        Throwable th;
        try {
            msj = new msj();
        } catch (Throwable th2) {
            f28239b.log(Level.SEVERE, "UnsafeAtomicHelper is broken!", th);
            f28239b.log(Level.SEVERE, "SafeAtomicHelper is broken!", th2);
            msj = new msh();
        }
        f28241d = msj;
    }

    private void m32814a(msl msl) {
        msl.thread = null;
        while (true) {
            msl msl2 = this.waiters;
            if (msl2 != msl.f28265a) {
                msl msl3 = null;
                while (msl2 != null) {
                    msl msl4 = msl2.next;
                    if (msl2.thread == null) {
                        if (msl3 != null) {
                            msl3.next = msl4;
                            if (msl3.thread == null) {
                            }
                        } else if (f28241d.mo3936a(this, msl2, msl4)) {
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
            return mrz.mo3929a(obj);
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
            if (msl != msl.f28265a) {
                msl msl2 = new msl((byte) 0);
                do {
                    msl2.m32855a(msl);
                    if (f28241d.mo3936a(this, msl, msl2)) {
                        j2 = toNanos;
                        do {
                            LockSupport.parkNanos(this, j2);
                            if (Thread.interrupted()) {
                                m32814a(msl2);
                                throw new InterruptedException();
                            }
                            obj2 = this.value;
                            if (((obj2 != null ? 1 : 0) & (!(obj2 instanceof msg) ? 1 : 0)) != 0) {
                                return mrz.mo3929a(obj2);
                            }
                            j2 = nanoTime - System.nanoTime();
                        } while (j2 >= 1000);
                        m32814a(msl2);
                    } else {
                        msl = this.waiters;
                    }
                } while (msl != msl.f28265a);
            }
            return mrz.mo3929a(this.value);
        }
        j2 = toNanos;
        while (j2 > 0) {
            obj2 = this.value;
            if (((obj2 != null ? 1 : 0) & (!(obj2 instanceof msg) ? 1 : 0)) != 0) {
                return mrz.mo3929a(obj2);
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
            return mrz.mo3929a(obj);
        }
        msl msl = this.waiters;
        if (msl != msl.f28265a) {
            msl msl2 = new msl((byte) 0);
            do {
                msl2.m32855a(msl);
                if (f28241d.mo3936a(this, msl, msl2)) {
                    Object obj2;
                    int i;
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m32814a(msl2);
                            throw new InterruptedException();
                        }
                        obj2 = this.value;
                        if (obj2 != null) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                    } while ((i & (!(obj2 instanceof msg) ? 1 : 0)) == 0);
                    return mrz.mo3929a(obj2);
                }
                msl = this.waiters;
            } while (msl != msl.f28265a);
        }
        return mrz.mo3929a(this.value);
    }

    private static V mo3929a(Object obj) {
        if (obj instanceof msb) {
            Throwable th = ((msb) obj).f28246b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof msc) {
            throw new ExecutionException(((msc) obj).f28248b);
        } else if (obj == f28240c) {
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
        if (f28238a) {
            cancellationException = new CancellationException("Future.cancel() was called.");
        } else {
            cancellationException = null;
        }
        Object msb = new msb(z, cancellationException);
        Object obj2 = obj;
        boolean z2 = false;
        while (true) {
            if (f28241d.mo3934a(this, obj2, msb)) {
                if (z) {
                    mo3944b();
                }
                mrz.m32813a(this);
                if (!(obj2 instanceof msg)) {
                    return true;
                }
                mti mti = ((msg) obj2).f28258b;
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

    public void mo3944b() {
    }

    protected final boolean m32824c() {
        Object obj = this.value;
        return (obj instanceof msb) && ((msb) obj).f28245a;
    }

    public void mo3706a(Runnable runnable, Executor executor) {
        bm.m6123a((Object) runnable, (Object) "Runnable was null.");
        bm.m6123a((Object) executor, (Object) "Executor was null.");
        mse mse = this.listeners;
        if (mse != mse.f28249a) {
            mse mse2 = new mse(runnable, executor);
            do {
                mse2.next = mse;
                if (!f28241d.mo3935a(this, mse, mse2)) {
                    mse = this.listeners;
                } else {
                    return;
                }
            } while (mse != mse.f28249a);
        }
        mrz.m32816b(runnable, executor);
    }

    public boolean mo3943b(V v) {
        if (v == null) {
            Object obj = f28240c;
        }
        if (!f28241d.mo3934a(this, null, obj)) {
            return false;
        }
        mrz.m32813a(this);
        return true;
    }

    public boolean mo3941a(Throwable th) {
        if (!f28241d.mo3934a(this, null, new msc((Throwable) bm.m6122a((Object) th)))) {
            return false;
        }
        mrz.m32813a(this);
        return true;
    }

    protected boolean mo3942a(mti<? extends V> mti__extends_V) {
        Object msg;
        bm.m6122a((Object) mti__extends_V);
        Object obj = this.value;
        if (obj == null) {
            if (mti__extends_V.isDone()) {
                if (!f28241d.mo3934a(this, null, mrz.m32815b((mti) mti__extends_V))) {
                    return false;
                }
                mrz.m32813a(this);
                return true;
            }
            msg = new msg(this, mti__extends_V);
            if (f28241d.mo3934a(this, null, msg)) {
                try {
                    mti__extends_V.mo3706a(msg, gwb.aT());
                } catch (Throwable th) {
                    obj = msc.f28247a;
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof msb) {
            mti__extends_V.cancel(((msb) obj).f28245a);
        }
        return false;
        f28241d.mo3934a(this, msg, obj);
        return true;
    }

    static Object m32815b(mti<?> mti_) {
        if (mti_ instanceof msi) {
            return ((mrz) mti_).value;
        }
        try {
            Object b = msy.m32872b((Future) mti_);
            if (b == null) {
                return f28240c;
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

    static void m32813a(mrz<?> mrz_) {
        mse mse = null;
        while (true) {
            msl msl = mrz_.waiters;
            if (f28241d.mo3936a((mrz) mrz_, msl, msl.f28265a)) {
                mse mse2;
                mse mse3;
                while (msl != null) {
                    msl.m32854a();
                    msl = msl.next;
                }
                mrz_.mo3928a();
                do {
                    mse2 = mrz_.listeners;
                } while (!f28241d.mo3935a((mrz) mrz_, mse2, mse.f28249a));
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
                    Runnable runnable = mse3.f28250b;
                    if (runnable instanceof msg) {
                        Object obj = (msg) runnable;
                        mrz_ = obj.f28257a;
                        if (mrz_.value == obj) {
                            if (f28241d.mo3934a((mrz) mrz_, obj, mrz.m32815b(obj.f28258b))) {
                                mse = mse2;
                            }
                        }
                        mse3 = mse2;
                    } else {
                        mrz.m32816b(runnable, mse3.f28251c);
                        mse3 = mse2;
                    }
                }
                return;
            }
        }
    }

    protected void mo3928a() {
    }

    final void m32819a(Future<?> future) {
        if (((future != null ? 1 : 0) & isCancelled()) != 0) {
            future.cancel(m32824c());
        }
    }

    private static void m32816b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Throwable e) {
            Logger logger = f28239b;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            logger.log(level, new StringBuilder((String.valueOf(valueOf).length() + 57) + String.valueOf(valueOf2).length()).append("RuntimeException while executing runnable ").append(valueOf).append(" with executor ").append(valueOf2).toString(), e);
        }
    }
}
