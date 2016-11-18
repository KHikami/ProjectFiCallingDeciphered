package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

final class ixn implements ThreadFactory {
    final /* synthetic */ ixm f19355a;

    ixn(ixm ixm) {
        this.f19355a = ixm;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        newThread.setName("Primes-Init");
        return newThread;
    }
}
