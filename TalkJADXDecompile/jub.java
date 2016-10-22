import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class jub implements ThreadFactory {
    final /* synthetic */ jtz a;
    private final AtomicInteger b;

    jub(jtz jtz) {
        this.a = jtz;
        this.b = new AtomicInteger(0);
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        newThread.setName("Resource Decoder Thread #" + this.b.incrementAndGet());
        return newThread;
    }
}
