package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: lgx */
abstract class lgx extends msw implements mtm {
    protected abstract mtm d();

    protected /* synthetic */ mtl a() {
        return d();
    }

    protected /* synthetic */ ExecutorService b() {
        return d();
    }

    protected /* synthetic */ Object c() {
        return d();
    }

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

    protected lgx() {
    }

    public mtk<?> a(Runnable runnable, long j, TimeUnit timeUnit) {
        return d().a(runnable, j, timeUnit);
    }

    public <V> mtk<V> a(Callable<V> callable, long j, TimeUnit timeUnit) {
        return d().a((Callable) callable, j, timeUnit);
    }

    public mtk<?> a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return d().a(runnable, j, j2, timeUnit);
    }

    public mtk<?> b(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return d().b(runnable, j, j2, timeUnit);
    }
}
