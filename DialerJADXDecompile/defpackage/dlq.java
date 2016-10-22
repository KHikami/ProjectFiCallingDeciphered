package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;

/* compiled from: PG */
/* renamed from: dlq */
public class dlq extends dmi {
    private static dlq a;
    private boolean b;
    private dlq c;
    private long d;

    public final void a() {
        if (this.b) {
            throw new IllegalStateException("Unbalanced enter/exit");
        } else if (0 != 0) {
            this.b = true;
            dlq.a(this, 0, false);
        }
    }

    private static synchronized void a(dlq dlq, long j, boolean z) {
        synchronized (dlq.class) {
            if (a == null) {
                a = new dlq();
                new dlt().start();
            }
            long nanoTime = System.nanoTime();
            if (j != 0 && z) {
                dlq.d = Math.min(j, dlq.d() - nanoTime) + nanoTime;
            } else if (j != 0) {
                dlq.d = nanoTime + j;
            } else if (z) {
                dlq.d = dlq.d();
            } else {
                throw new AssertionError();
            }
            long j2 = dlq.d - nanoTime;
            dlq dlq2 = a;
            while (dlq2.c != null && j2 >= dlq2.c.d - nanoTime) {
                dlq2 = dlq2.c;
            }
            dlq.c = dlq2.c;
            dlq2.c = dlq;
            if (dlq2 == a) {
                dlq.class.notify();
            }
        }
    }

    private boolean f() {
        if (!this.b) {
            return false;
        }
        this.b = false;
        return dlq.a(this);
    }

    private static synchronized boolean a(dlq dlq) {
        boolean z;
        synchronized (dlq.class) {
            for (dlq dlq2 = a; dlq2 != null; dlq2 = dlq2.c) {
                if (dlq2.c == dlq) {
                    dlq2.c = dlq.c;
                    dlq.c = null;
                    z = false;
                    break;
                }
            }
            z = true;
        }
        return z;
    }

    protected void b() {
    }

    final void a(boolean z) {
        if (f() && z) {
            throw b(null);
        }
    }

    final IOException a(IOException iOException) {
        return !f() ? iOException : b(iOException);
    }

    protected IOException b(IOException iOException) {
        IOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    static synchronized dlq c() {
        dlq dlq = null;
        synchronized (dlq.class) {
            dlq dlq2 = a.c;
            if (dlq2 == null) {
                dlq.class.wait();
            } else {
                long nanoTime = dlq2.d - System.nanoTime();
                if (nanoTime > 0) {
                    long j = nanoTime / 1000000;
                    dlq.class.wait(j, (int) (nanoTime - (1000000 * j)));
                } else {
                    a.c = dlq2.c;
                    dlq2.c = null;
                    dlq = dlq2;
                }
            }
        }
        return dlq;
    }
}
