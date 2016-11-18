package p000;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

public class msm extends AbstractExecutorService implements mtl {
    final ExecutorService f28266a;

    public /* synthetic */ Future submit(Runnable runnable) {
        return mo3693a(runnable);
    }

    public /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return mo3694a(runnable, obj);
    }

    public /* synthetic */ Future submit(Callable callable) {
        return mo3695a(callable);
    }

    protected final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return mtw.m32897a(runnable, t);
    }

    protected final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return mtw.m32898a(callable);
    }

    public mti<?> mo3693a(Runnable runnable) {
        return (mti) super.submit(runnable);
    }

    public <T> mti<T> mo3694a(Runnable runnable, T t) {
        return (mti) super.submit(runnable, t);
    }

    public <T> mti<T> mo3695a(Callable<T> callable) {
        return (mti) super.submit(callable);
    }

    public msm(ExecutorService executorService) {
        this();
        this.f28266a = (ExecutorService) bm.m6122a((Object) executorService);
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f28266a.awaitTermination(j, timeUnit);
    }

    public boolean isShutdown() {
        return this.f28266a.isShutdown();
    }

    public boolean isTerminated() {
        return this.f28266a.isTerminated();
    }

    public void shutdown() {
        this.f28266a.shutdown();
    }

    public List<Runnable> shutdownNow() {
        return this.f28266a.shutdownNow();
    }

    public void execute(Runnable runnable) {
        this.f28266a.execute(runnable);
    }
}
