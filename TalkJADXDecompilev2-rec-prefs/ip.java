package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class ip implements ThreadFactory {
    private final AtomicInteger f18635a = new AtomicInteger(1);

    ip() {
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, "ModernAsyncTask #" + this.f18635a.getAndIncrement());
    }
}
