import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class jgq implements ThreadFactory {
    private final AtomicInteger a;

    jgq() {
        this.a = new AtomicInteger(1);
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "BackgroundTask #" + this.a.getAndIncrement());
        thread.setPriority(1);
        return thread;
    }
}
