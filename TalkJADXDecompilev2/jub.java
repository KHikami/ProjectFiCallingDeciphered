package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class jub implements ThreadFactory {
    final /* synthetic */ jtz a;
    private final AtomicInteger b = new AtomicInteger(0);

    jub(jtz jtz) {
        this.a = jtz;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        newThread.setName("Resource Decoder Thread #" + this.b.incrementAndGet());
        return newThread;
    }
}
