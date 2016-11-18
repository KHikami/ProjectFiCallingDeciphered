package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class ip implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(1);

    ip() {
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, "ModernAsyncTask #" + this.a.getAndIncrement());
    }
}
