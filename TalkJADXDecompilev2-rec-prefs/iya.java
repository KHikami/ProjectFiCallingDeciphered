package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class iya implements ThreadFactory {
    private final ThreadFactory f19385a = Executors.defaultThreadFactory();
    private final AtomicInteger f19386b = new AtomicInteger(1);

    iya() {
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f19385a.newThread(runnable);
        newThread.setName("Primes-" + this.f19386b.getAndIncrement());
        return newThread;
    }
}
