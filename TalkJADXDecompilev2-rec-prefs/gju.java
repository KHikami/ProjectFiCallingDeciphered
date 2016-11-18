package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class gju implements ThreadFactory {
    private final AtomicInteger f15458a = new AtomicInteger(1);

    gju() {
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AsyncTask #" + this.f15458a.getAndIncrement());
    }
}
