import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

public final class mtj<V> extends FutureTask<V> implements mti<V> {
    private final msq a;

    public mtj(Callable<V> callable) {
        super(callable);
        this.a = new msq();
    }

    public mtj(Runnable runnable, V v) {
        super(runnable, v);
        this.a = new msq();
    }

    public void a(Runnable runnable, Executor executor) {
        this.a.a(runnable, executor);
    }

    protected void done() {
        this.a.a();
    }
}
