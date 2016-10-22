package defpackage;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: iyg */
final class iyg implements ScheduledExecutorService {
    private final iyj a;
    private final ScheduledExecutorService b;

    iyg(ScheduledExecutorService scheduledExecutorService, iyj iyj) {
        this.b = (ScheduledExecutorService) ba.a((Object) scheduledExecutorService);
        this.a = (iyj) ba.a((Object) iyj);
    }

    private final Runnable a(Runnable runnable) {
        return new iyh(this, runnable);
    }

    private final <V> Callable<V> a(Callable<V> callable) {
        return new iyi(this, callable);
    }

    private final <V> List<? extends Callable<V>> a(Collection<? extends Callable<V>> collection) {
        List<? extends Callable<V>> linkedList = new LinkedList();
        for (Callable a : collection) {
            linkedList.add(a(a));
        }
        return linkedList;
    }

    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.b.schedule(a(runnable), j, timeUnit);
    }

    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        return this.b.schedule(a((Callable) callable), j, timeUnit);
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.b.scheduleAtFixedRate(a(runnable), j, j2, timeUnit);
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.b.scheduleWithFixedDelay(a(runnable), j, j2, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.b.execute(a(runnable));
    }

    public Future<?> submit(Runnable runnable) {
        return this.b.submit(a(runnable));
    }

    public <V> Future<V> submit(Runnable runnable, V v) {
        return this.b.submit(a(runnable), v);
    }

    public <V> Future<V> submit(Callable<V> callable) {
        return this.b.submit(a((Callable) callable));
    }

    public void shutdown() {
        this.b.shutdown();
    }

    public List<Runnable> shutdownNow() {
        return this.b.shutdownNow();
    }

    public boolean isShutdown() {
        return this.b.isShutdown();
    }

    public boolean isTerminated() {
        return this.b.isTerminated();
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.b.awaitTermination(j, timeUnit);
    }

    public <V> V invokeAny(Collection<? extends Callable<V>> collection) {
        return this.b.invokeAny(a((Collection) collection));
    }

    public <V> V invokeAny(Collection<? extends Callable<V>> collection, long j, TimeUnit timeUnit) {
        return this.b.invokeAny(a((Collection) collection), j, timeUnit);
    }

    public <V> List<Future<V>> invokeAll(Collection<? extends Callable<V>> collection) {
        return this.b.invokeAll(a((Collection) collection));
    }

    public <V> List<Future<V>> invokeAll(Collection<? extends Callable<V>> collection, long j, TimeUnit timeUnit) {
        return this.b.invokeAll(a((Collection) collection), j, timeUnit);
    }
}
