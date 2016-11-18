package p000;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class msq {
    private static final Logger f28269a = Logger.getLogger(msq.class.getName());
    private msr f28270b;
    private boolean f28271c;

    public void m32867a(Runnable runnable, Executor executor) {
        bm.m6123a((Object) runnable, (Object) "Runnable was null.");
        bm.m6123a((Object) executor, (Object) "Executor was null.");
        synchronized (this) {
            if (this.f28271c) {
                msq.m32865b(runnable, executor);
                return;
            }
            this.f28270b = new msr(runnable, executor, this.f28270b);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m32866a() {
        msr msr = null;
        synchronized (this) {
            if (this.f28271c) {
                return;
            }
            this.f28271c = true;
            msr msr2 = this.f28270b;
            this.f28270b = null;
        }
    }

    private static void m32865b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Throwable e) {
            Logger logger = f28269a;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            logger.log(level, new StringBuilder((String.valueOf(valueOf).length() + 57) + String.valueOf(valueOf2).length()).append("RuntimeException while executing runnable ").append(valueOf).append(" with executor ").append(valueOf2).toString(), e);
        }
    }
}
