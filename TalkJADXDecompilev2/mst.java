package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class mst<V> extends mjd implements Future<V> {
    protected abstract Future<? extends V> a();

    protected /* synthetic */ Object c() {
        return a();
    }

    protected mst() {
    }

    public boolean cancel(boolean z) {
        return a().cancel(z);
    }

    public boolean isCancelled() {
        return a().isCancelled();
    }

    public boolean isDone() {
        return a().isDone();
    }

    public V get() {
        return a().get();
    }

    public V get(long j, TimeUnit timeUnit) {
        return a().get(j, timeUnit);
    }
}
