package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: mtq */
public final class mtq extends msm implements mtm {
    final ScheduledExecutorService b;

    public /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return a(runnable, j, timeUnit);
    }

    public /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return a(callable, j, timeUnit);
    }

    public /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return a(runnable, j, j2, timeUnit);
    }

    public /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return b(runnable, j, j2, timeUnit);
    }

    public mtq(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = (ScheduledExecutorService) bm.a((Object) scheduledExecutorService);
    }

    public mtk<?> a(Runnable runnable, long j, TimeUnit timeUnit) {
        Object a = mtw.a(runnable, null);
        return new mtr(a, this.b.schedule(a, j, timeUnit));
    }

    public <V> mtk<V> a(Callable<V> callable, long j, TimeUnit timeUnit) {
        Object a = mtw.a(callable);
        return new mtr(a, this.b.schedule(a, j, timeUnit));
    }

    public mtk<?> a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Object mts = new mts(runnable);
        return new mtr(mts, this.b.scheduleAtFixedRate(mts, j, j2, timeUnit));
    }

    public mtk<?> b(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Object mts = new mts(runnable);
        return new mtr(mts, this.b.scheduleWithFixedDelay(mts, j, j2, timeUnit));
    }
}
