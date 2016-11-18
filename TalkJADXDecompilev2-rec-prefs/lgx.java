package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

abstract class lgx extends msw implements mtm {
    protected abstract mtm mo3708d();

    protected /* synthetic */ mtl mo3703a() {
        return mo3708d();
    }

    protected /* synthetic */ ExecutorService mo3696b() {
        return mo3708d();
    }

    protected /* synthetic */ Object mo3692c() {
        return mo3708d();
    }

    public /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return mo3701a(runnable, j, timeUnit);
    }

    public /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return mo3702a(callable, j, timeUnit);
    }

    public /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return mo3700a(runnable, j, j2, timeUnit);
    }

    public /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return mo3704b(runnable, j, j2, timeUnit);
    }

    protected lgx() {
    }

    public mtk<?> mo3701a(Runnable runnable, long j, TimeUnit timeUnit) {
        return mo3708d().mo3701a(runnable, j, timeUnit);
    }

    public <V> mtk<V> mo3702a(Callable<V> callable, long j, TimeUnit timeUnit) {
        return mo3708d().mo3702a((Callable) callable, j, timeUnit);
    }

    public mtk<?> mo3700a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return mo3708d().mo3700a(runnable, j, j2, timeUnit);
    }

    public mtk<?> mo3704b(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return mo3708d().mo3704b(runnable, j, j2, timeUnit);
    }
}
