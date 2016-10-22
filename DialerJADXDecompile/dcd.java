import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
public class dcd implements dcs {
    static final dce a;
    private static final boolean b;
    private static final Logger c;
    private static final Object d;
    volatile dci listeners;
    volatile Object value;
    volatile dcp waiters;

    static {
        dce dcn;
        Throwable th;
        b = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        c = Logger.getLogger(dcd.class.getName());
        try {
            dcn = new dcn();
        } catch (Throwable th2) {
            c.log(Level.SEVERE, "UnsafeAtomicHelper is broken!", th);
            c.log(Level.SEVERE, "SafeAtomicHelper is broken!", th2);
            dcn = new dcl();
        }
        a = dcn;
        d = new Object();
    }

    private final void a(dcp dcp) {
        dcp.thread = null;
        while (true) {
            dcp dcp2 = this.waiters;
            if (dcp2 != dcp.a) {
                dcp dcp3 = null;
                while (dcp2 != null) {
                    dcp dcp4 = dcp2.next;
                    if (dcp2.thread == null) {
                        if (dcp3 != null) {
                            dcp3.next = dcp4;
                            if (dcp3.thread == null) {
                            }
                        } else if (a.a(this, dcp2, dcp4)) {
                        }
                        dcp2 = dcp3;
                    }
                    dcp3 = dcp2;
                    dcp2 = dcp4;
                }
                return;
            }
            return;
        }
    }

    protected dcd() {
    }

    public Object get(long j, TimeUnit timeUnit) {
        long toNanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if (((obj != null ? 1 : 0) & (!(obj instanceof dck) ? 1 : 0)) != 0) {
            return b(obj);
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
            dcp dcp = this.waiters;
            if (dcp != dcp.a) {
                dcp dcp2 = new dcp((byte) 0);
                do {
                    dcp2.a(dcp);
                    if (a.a(this, dcp, dcp2)) {
                        j2 = toNanos;
                        do {
                            LockSupport.parkNanos(this, j2);
                            if (Thread.interrupted()) {
                                a(dcp2);
                                throw new InterruptedException();
                            }
                            obj2 = this.value;
                            if (((obj2 != null ? 1 : 0) & (!(obj2 instanceof dck) ? 1 : 0)) != 0) {
                                return b(obj2);
                            }
                            j2 = nanoTime - System.nanoTime();
                        } while (j2 >= 1000);
                        a(dcp2);
                    } else {
                        dcp = this.waiters;
                    }
                } while (dcp != dcp.a);
            }
            return b(this.value);
        }
        j2 = toNanos;
        while (j2 > 0) {
            obj2 = this.value;
            if (((obj2 != null ? 1 : 0) & (!(obj2 instanceof dck) ? 1 : 0)) != 0) {
                return b(obj2);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            j2 = nanoTime - System.nanoTime();
        }
        throw new TimeoutException();
    }

    public Object get() {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if (((obj != null ? 1 : 0) & (!(obj instanceof dck) ? 1 : 0)) != 0) {
            return b(obj);
        }
        dcp dcp = this.waiters;
        if (dcp != dcp.a) {
            dcp dcp2 = new dcp((byte) 0);
            do {
                dcp2.a(dcp);
                if (a.a(this, dcp, dcp2)) {
                    Object obj2;
                    int i;
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            a(dcp2);
                            throw new InterruptedException();
                        }
                        obj2 = this.value;
                        if (obj2 != null) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                    } while ((i & (!(obj2 instanceof dck) ? 1 : 0)) == 0);
                    return b(obj2);
                }
                dcp = this.waiters;
            } while (dcp != dcp.a);
        }
        return b(this.value);
    }

    private static Object b(Object obj) {
        if (obj instanceof dcf) {
            Throwable th = ((dcf) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof dcg) {
            throw new ExecutionException(((dcg) obj).b);
        } else if (obj == d) {
            return null;
        } else {
            return obj;
        }
    }

    public boolean isDone() {
        int i = 1;
        Object obj = this.value;
        int i2 = obj != null ? 1 : 0;
        if (obj instanceof dck) {
            i = 0;
        }
        return i2 & i;
    }

    public boolean isCancelled() {
        return this.value instanceof dcf;
    }

    public boolean cancel(boolean z) {
        Object obj = this.value;
        if (((obj == null ? 1 : 0) | (obj instanceof dck)) != 0) {
            Throwable cancellationException;
            if (b) {
                cancellationException = new CancellationException("Future.cancel() was called.");
            } else {
                cancellationException = null;
            }
            Object dcf = new dcf(z, cancellationException);
            Object obj2 = obj;
            while (!a.a(this, obj2, dcf)) {
                obj2 = this.value;
                if (!(obj2 instanceof dck)) {
                }
            }
            a();
            if (!(obj2 instanceof dck)) {
                return true;
            }
            ((dck) obj2).a.cancel(z);
            return true;
        }
        return false;
    }

    protected boolean a(Object obj) {
        if (obj == null) {
            obj = d;
        }
        if (!a.a(this, null, obj)) {
            return false;
        }
        a();
        return true;
    }

    final boolean a(dcs dcs, Object obj) {
        Object obj2;
        if (dcs instanceof dcm) {
            obj2 = ((dcd) dcs).value;
        } else {
            try {
                obj2 = dcr.b(dcs);
                if (obj2 == null) {
                    obj2 = d;
                }
            } catch (ExecutionException e) {
                obj2 = new dcg(e.getCause());
            } catch (Throwable e2) {
                obj2 = new dcf(false, e2);
            } catch (Throwable e22) {
                obj2 = new dcg(e22);
            }
        }
        if (!a.a(this, obj, obj2)) {
            return false;
        }
        a();
        return true;
    }

    private final void a() {
        dcp dcp;
        dci dci;
        dci dci2 = null;
        do {
            dcp = this.waiters;
        } while (!a.a(this, dcp, dcp.a));
        while (dcp != null) {
            Thread thread = dcp.thread;
            if (thread != null) {
                dcp.thread = null;
                LockSupport.unpark(thread);
            }
            dcp = dcp.next;
        }
        do {
            dci = this.listeners;
        } while (!a.a(this, dci, dci.a));
        while (dci != null) {
            dci dci3 = dci.next;
            dci.next = dci2;
            dci2 = dci;
            dci = dci3;
        }
        while (dci2 != null) {
            Runnable runnable = dci2.b;
            Executor executor = dci2.c;
            try {
                executor.execute(runnable);
            } catch (Throwable e) {
                Logger logger = c;
                Level level = Level.SEVERE;
                String valueOf = String.valueOf(runnable);
                String valueOf2 = String.valueOf(executor);
                logger.log(level, new StringBuilder((String.valueOf(valueOf).length() + 57) + String.valueOf(valueOf2).length()).append("RuntimeException while executing runnable ").append(valueOf).append(" with executor ").append(valueOf2).toString(), e);
            }
            dci2 = dci2.next;
        }
    }
}
