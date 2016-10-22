import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

final class mtv implements ThreadFactory {
    final /* synthetic */ ThreadFactory a;
    final /* synthetic */ String b;
    final /* synthetic */ AtomicLong c;
    final /* synthetic */ Boolean d;
    final /* synthetic */ Integer e;
    final /* synthetic */ UncaughtExceptionHandler f;

    mtv(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = threadFactory;
        this.b = str;
        this.c = atomicLong;
        this.d = bool;
        this.e = num;
        this.f = uncaughtExceptionHandler;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(runnable);
        if (this.b != null) {
            newThread.setName(mtu.a(this.b, Long.valueOf(this.c.getAndIncrement())));
        }
        if (this.d != null) {
            newThread.setDaemon(this.d.booleanValue());
        }
        if (this.e != null) {
            newThread.setPriority(this.e.intValue());
        }
        if (this.f != null) {
            newThread.setUncaughtExceptionHandler(this.f);
        }
        return newThread;
    }
}
