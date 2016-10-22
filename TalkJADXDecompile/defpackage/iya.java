package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: iya */
final class iya implements ThreadFactory {
    private final ThreadFactory a;
    private final AtomicInteger b;

    iya() {
        this.a = Executors.defaultThreadFactory();
        this.b = new AtomicInteger(1);
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(runnable);
        newThread.setName("Primes-" + this.b.getAndIncrement());
        return newThread;
    }
}
