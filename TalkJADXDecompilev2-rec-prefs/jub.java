package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class jub implements ThreadFactory {
    final /* synthetic */ jtz f21051a;
    private final AtomicInteger f21052b = new AtomicInteger(0);

    jub(jtz jtz) {
        this.f21051a = jtz;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        newThread.setName("Resource Decoder Thread #" + this.f21052b.incrementAndGet());
        return newThread;
    }
}
