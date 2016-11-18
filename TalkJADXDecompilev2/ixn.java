package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

final class ixn implements ThreadFactory {
    final /* synthetic */ ixm a;

    ixn(ixm ixm) {
        this.a = ixm;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        newThread.setName("Primes-Init");
        return newThread;
    }
}
