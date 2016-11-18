package p000;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

final class mtv implements ThreadFactory {
    final /* synthetic */ ThreadFactory f28302a;
    final /* synthetic */ String f28303b;
    final /* synthetic */ AtomicLong f28304c;
    final /* synthetic */ Boolean f28305d;
    final /* synthetic */ Integer f28306e;
    final /* synthetic */ UncaughtExceptionHandler f28307f;

    mtv(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f28302a = threadFactory;
        this.f28303b = str;
        this.f28304c = atomicLong;
        this.f28305d = bool;
        this.f28306e = num;
        this.f28307f = uncaughtExceptionHandler;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f28302a.newThread(runnable);
        if (this.f28303b != null) {
            newThread.setName(mtu.m32891a(this.f28303b, Long.valueOf(this.f28304c.getAndIncrement())));
        }
        if (this.f28305d != null) {
            newThread.setDaemon(this.f28305d.booleanValue());
        }
        if (this.f28306e != null) {
            newThread.setPriority(this.f28306e.intValue());
        }
        if (this.f28307f != null) {
            newThread.setUncaughtExceptionHandler(this.f28307f);
        }
        return newThread;
    }
}
