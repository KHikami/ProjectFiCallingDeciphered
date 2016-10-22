import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
final class dcw implements ThreadFactory {
    private /* synthetic */ ThreadFactory a;
    private /* synthetic */ String b;
    private /* synthetic */ AtomicLong c;
    private /* synthetic */ Boolean d;
    private /* synthetic */ Integer e;
    private /* synthetic */ UncaughtExceptionHandler f;

    dcw(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = threadFactory;
        this.b = str;
        this.c = atomicLong;
        this.d = bool;
        this.e = num;
        this.f = uncaughtExceptionHandler;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(runnable);
        if (this.b != null) {
            newThread.setName(dcv.a(this.b, Long.valueOf(this.c.getAndIncrement())));
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
