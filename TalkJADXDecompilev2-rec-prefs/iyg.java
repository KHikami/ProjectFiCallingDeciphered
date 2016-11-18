package p000;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class iyg implements ScheduledExecutorService {
    private final iyj f19393a;
    private final ScheduledExecutorService f19394b;

    iyg(ScheduledExecutorService scheduledExecutorService, iyj iyj) {
        this.f19394b = (ScheduledExecutorService) ba.m4536a((Object) scheduledExecutorService);
        this.f19393a = (iyj) ba.m4536a((Object) iyj);
    }

    private final Runnable m23485a(Runnable runnable) {
        return new iyh(this, runnable);
    }

    private final <V> Callable<V> m23487a(Callable<V> callable) {
        return new iyi(this, callable);
    }

    private final <V> List<? extends Callable<V>> m23486a(Collection<? extends Callable<V>> collection) {
        List<? extends Callable<V>> linkedList = new LinkedList();
        for (Callable a : collection) {
            linkedList.add(m23487a(a));
        }
        return linkedList;
    }

    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f19394b.schedule(m23485a(runnable), j, timeUnit);
    }

    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        return this.f19394b.schedule(m23487a((Callable) callable), j, timeUnit);
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f19394b.scheduleAtFixedRate(m23485a(runnable), j, j2, timeUnit);
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f19394b.scheduleWithFixedDelay(m23485a(runnable), j, j2, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f19394b.execute(m23485a(runnable));
    }

    public Future<?> submit(Runnable runnable) {
        return this.f19394b.submit(m23485a(runnable));
    }

    public <V> Future<V> submit(Runnable runnable, V v) {
        return this.f19394b.submit(m23485a(runnable), v);
    }

    public <V> Future<V> submit(Callable<V> callable) {
        return this.f19394b.submit(m23487a((Callable) callable));
    }

    public void shutdown() {
        this.f19394b.shutdown();
    }

    public List<Runnable> shutdownNow() {
        return this.f19394b.shutdownNow();
    }

    public boolean isShutdown() {
        return this.f19394b.isShutdown();
    }

    public boolean isTerminated() {
        return this.f19394b.isTerminated();
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f19394b.awaitTermination(j, timeUnit);
    }

    public <V> V invokeAny(Collection<? extends Callable<V>> collection) {
        return this.f19394b.invokeAny(m23486a((Collection) collection));
    }

    public <V> V invokeAny(Collection<? extends Callable<V>> collection, long j, TimeUnit timeUnit) {
        return this.f19394b.invokeAny(m23486a((Collection) collection), j, timeUnit);
    }

    public <V> List<Future<V>> invokeAll(Collection<? extends Callable<V>> collection) {
        return this.f19394b.invokeAll(m23486a((Collection) collection));
    }

    public <V> List<Future<V>> invokeAll(Collection<? extends Callable<V>> collection, long j, TimeUnit timeUnit) {
        return this.f19394b.invokeAll(m23486a((Collection) collection), j, timeUnit);
    }
}
