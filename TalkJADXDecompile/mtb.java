import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class mtb<V> implements mti<V> {
    private static final Logger a;

    public abstract V get();

    mtb() {
    }

    static {
        a = Logger.getLogger(mtb.class.getName());
    }

    public void a(Runnable runnable, Executor executor) {
        bm.a((Object) runnable, (Object) "Runnable was null.");
        bm.a((Object) executor, (Object) "Executor was null.");
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

    public boolean cancel(boolean z) {
        return false;
    }

    public V get(long j, TimeUnit timeUnit) {
        bm.a((Object) timeUnit);
        return get();
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }
}
