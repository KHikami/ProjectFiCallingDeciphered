package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class jgq implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(1);

    jgq() {
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "BackgroundTask #" + this.a.getAndIncrement());
        thread.setPriority(1);
        return thread;
    }
}
