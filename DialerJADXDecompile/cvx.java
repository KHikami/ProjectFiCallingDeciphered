import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
final class cvx implements ThreadFactory {
    private final ThreadFactory a;
    private final AtomicInteger b;

    cvx() {
        this.a = Executors.defaultThreadFactory();
        this.b = new AtomicInteger(1);
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(runnable);
        newThread.setName("Primes-" + this.b.getAndIncrement());
        return newThread;
    }
}
