package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

public final class mtj<V> extends FutureTask<V> implements mti<V> {
    private final msq a = new msq();

    public mtj(Callable<V> callable) {
        super(callable);
    }

    public mtj(Runnable runnable, V v) {
        super(runnable, v);
    }

    public void a(Runnable runnable, Executor executor) {
        this.a.a(runnable, executor);
    }

    protected void done() {
        this.a.a();
    }
}
