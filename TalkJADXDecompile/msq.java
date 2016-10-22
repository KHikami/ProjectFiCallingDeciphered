import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class msq {
    private static final Logger a;
    private msr b;
    private boolean c;

    static {
        a = Logger.getLogger(msq.class.getName());
    }

    public void a(Runnable runnable, Executor executor) {
        bm.a((Object) runnable, (Object) "Runnable was null.");
        bm.a((Object) executor, (Object) "Executor was null.");
        synchronized (this) {
            if (this.c) {
                b(runnable, executor);
                return;
            }
            this.b = new msr(runnable, executor, this.b);
        }
    }

    public void a() {
        msr msr = null;
        synchronized (this) {
            if (this.c) {
                return;
            }
            this.c = true;
            msr msr2 = this.b;
            this.b = null;
            while (msr2 != null) {
                msr msr3 = msr2.c;
                msr2.c = msr;
                msr = msr2;
                msr2 = msr3;
            }
            while (msr != null) {
                b(msr.a, msr.b);
                msr = msr.c;
            }
        }
    }

    private static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Throwable e) {
            Logger logger = a;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            logger.log(level, new StringBuilder((String.valueOf(valueOf).length() + 57) + String.valueOf(valueOf2).length()).append("RuntimeException while executing runnable ").append(valueOf).append(" with executor ").append(valueOf2).toString(), e);
        }
    }
}
