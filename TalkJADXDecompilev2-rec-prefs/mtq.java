package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class mtq extends msm implements mtm {
    final ScheduledExecutorService f28294b;

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

    public mtq(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f28294b = (ScheduledExecutorService) bm.m6122a((Object) scheduledExecutorService);
    }

    public mtk<?> mo3701a(Runnable runnable, long j, TimeUnit timeUnit) {
        Object a = mtw.m32897a(runnable, null);
        return new mtr(a, this.f28294b.schedule(a, j, timeUnit));
    }

    public <V> mtk<V> mo3702a(Callable<V> callable, long j, TimeUnit timeUnit) {
        Object a = mtw.m32898a(callable);
        return new mtr(a, this.f28294b.schedule(a, j, timeUnit));
    }

    public mtk<?> mo3700a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Object mts = new mts(runnable);
        return new mtr(mts, this.f28294b.scheduleAtFixedRate(mts, j, j2, timeUnit));
    }

    public mtk<?> mo3704b(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Object mts = new mts(runnable);
        return new mtr(mts, this.f28294b.scheduleWithFixedDelay(mts, j, j2, timeUnit));
    }
}
