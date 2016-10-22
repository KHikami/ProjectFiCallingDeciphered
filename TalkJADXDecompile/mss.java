import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class mss extends mjd implements ExecutorService {
    public abstract ExecutorService b();

    public /* synthetic */ Object c() {
        return b();
    }

    protected mss() {
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return b().awaitTermination(j, timeUnit);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return b().invokeAll(collection);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return b().invokeAll(collection, j, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return b().invokeAny(collection);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return b().invokeAny(collection, j, timeUnit);
    }

    public boolean isShutdown() {
        return b().isShutdown();
    }

    public boolean isTerminated() {
        return b().isTerminated();
    }

    public void shutdown() {
        b().shutdown();
    }

    public List<Runnable> shutdownNow() {
        return b().shutdownNow();
    }

    public void execute(Runnable runnable) {
        b().execute(runnable);
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return b().submit(callable);
    }

    public Future<?> submit(Runnable runnable) {
        return b().submit(runnable);
    }

    public <T> Future<T> submit(Runnable runnable, T t) {
        return b().submit(runnable, t);
    }
}
