package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class hhd implements ThreadFactory {
    private final String f16961a;
    private final int f16962b;
    private final AtomicInteger f16963c;
    private final ThreadFactory f16964d;

    public hhd(String str) {
        this(str, 0);
    }

    private hhd(String str, int i) {
        this.f16963c = new AtomicInteger();
        this.f16964d = Executors.defaultThreadFactory();
        this.f16961a = (String) gwb.m2195f((Object) str, (Object) "Name must not be null");
        this.f16962b = 0;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f16964d.newThread(new hhe(runnable, this.f16962b));
        String str = this.f16961a;
        newThread.setName(new StringBuilder(String.valueOf(str).length() + 13).append(str).append("[").append(this.f16963c.getAndIncrement()).append("]").toString());
        return newThread;
    }
}
