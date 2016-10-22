package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: cqr */
final class cqr implements ThreadFactory {
    private static final AtomicInteger a;

    static {
        a = new AtomicInteger();
    }

    cqr() {
    }

    public final Thread newThread(Runnable runnable) {
        return new cqs(runnable, "measurement-" + a.incrementAndGet());
    }
}
