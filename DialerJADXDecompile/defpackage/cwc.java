package defpackage;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: cwc */
final class cwc implements ScheduledExecutorService {
    final cwf a;
    private final ScheduledExecutorService b;

    cwc(ScheduledExecutorService scheduledExecutorService, cwf cwf) {
        this.b = (ScheduledExecutorService) buf.B((Object) scheduledExecutorService);
        this.a = (cwf) buf.B((Object) cwf);
    }

    private final Runnable a(Runnable runnable) {
        return new cwd(this, runnable);
    }

    private final Callable a(Callable callable) {
        return new cwe(this, callable);
    }

    private final List a(Collection collection) {
        List linkedList = new LinkedList();
        for (Callable a : collection) {
            linkedList.add(a(a));
        }
        return linkedList;
    }

    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.b.schedule(a(runnable), j, timeUnit);
    }

    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return this.b.schedule(a(callable), j, timeUnit);
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.b.scheduleAtFixedRate(a(runnable), j, j2, timeUnit);
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.b.scheduleWithFixedDelay(a(runnable), j, j2, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.b.execute(a(runnable));
    }

    public final Future submit(Runnable runnable) {
        return this.b.submit(a(runnable));
    }

    public final Future submit(Runnable runnable, Object obj) {
        return this.b.submit(a(runnable), obj);
    }

    public final Future submit(Callable callable) {
        return this.b.submit(a(callable));
    }

    public final void shutdown() {
        this.b.shutdown();
    }

    public final List shutdownNow() {
        return this.b.shutdownNow();
    }

    public final boolean isShutdown() {
        return this.b.isShutdown();
    }

    public final boolean isTerminated() {
        return this.b.isTerminated();
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.b.awaitTermination(j, timeUnit);
    }

    public final Object invokeAny(Collection collection) {
        return this.b.invokeAny(a(collection));
    }

    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.b.invokeAny(a(collection), j, timeUnit);
    }

    public final List invokeAll(Collection collection) {
        return this.b.invokeAll(a(collection));
    }

    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.b.invokeAll(a(collection), j, timeUnit);
    }
}
