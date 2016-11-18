package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

public final class mtj<V> extends FutureTask<V> implements mti<V> {
    private final msq f28286a = new msq();

    public mtj(Callable<V> callable) {
        super(callable);
    }

    public mtj(Runnable runnable, V v) {
        super(runnable, v);
    }

    public void mo3706a(Runnable runnable, Executor executor) {
        this.f28286a.m32867a(runnable, executor);
    }

    protected void done() {
        this.f28286a.m32866a();
    }
}
