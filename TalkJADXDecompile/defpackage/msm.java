package defpackage;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: msm */
public class msm extends AbstractExecutorService implements mtl {
    final ExecutorService a;

    public /* synthetic */ Future submit(Runnable runnable) {
        return a(runnable);
    }

    public /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return a(runnable, obj);
    }

    public /* synthetic */ Future submit(Callable callable) {
        return a(callable);
    }

    protected final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return mtw.a(runnable, t);
    }

    protected final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return mtw.a(callable);
    }

    public mti<?> a(Runnable runnable) {
        return (mti) super.submit(runnable);
    }

    public <T> mti<T> a(Runnable runnable, T t) {
        return (mti) super.submit(runnable, t);
    }

    public <T> mti<T> a(Callable<T> callable) {
        return (mti) super.submit(callable);
    }

    public msm(ExecutorService executorService) {
        this();
        this.a = (ExecutorService) bm.a((Object) executorService);
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    public boolean isShutdown() {
        return this.a.isShutdown();
    }

    public boolean isTerminated() {
        return this.a.isTerminated();
    }

    public void shutdown() {
        this.a.shutdown();
    }

    public List<Runnable> shutdownNow() {
        return this.a.shutdownNow();
    }

    public void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
