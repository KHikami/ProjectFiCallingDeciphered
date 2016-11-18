package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class gju implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(1);

    gju() {
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AsyncTask #" + this.a.getAndIncrement());
    }
}
