package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class iya implements ThreadFactory {
    private final ThreadFactory a = Executors.defaultThreadFactory();
    private final AtomicInteger b = new AtomicInteger(1);

    iya() {
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(runnable);
        newThread.setName("Primes-" + this.b.getAndIncrement());
        return newThread;
    }
}
