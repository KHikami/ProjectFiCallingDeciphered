package p000;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class mss extends mjd implements ExecutorService {
    public abstract ExecutorService mo3696b();

    public /* synthetic */ Object mo3692c() {
        return mo3696b();
    }

    protected mss() {
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return mo3696b().awaitTermination(j, timeUnit);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return mo3696b().invokeAll(collection);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return mo3696b().invokeAll(collection, j, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return mo3696b().invokeAny(collection);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return mo3696b().invokeAny(collection, j, timeUnit);
    }

    public boolean isShutdown() {
        return mo3696b().isShutdown();
    }

    public boolean isTerminated() {
        return mo3696b().isTerminated();
    }

    public void shutdown() {
        mo3696b().shutdown();
    }

    public List<Runnable> shutdownNow() {
        return mo3696b().shutdownNow();
    }

    public void execute(Runnable runnable) {
        mo3696b().execute(runnable);
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return mo3696b().submit(callable);
    }

    public Future<?> submit(Runnable runnable) {
        return mo3696b().submit(runnable);
    }

    public <T> Future<T> submit(Runnable runnable, T t) {
        return mo3696b().submit(runnable, t);
    }
}
