package p000;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class mst<V> extends mjd implements Future<V> {
    protected abstract Future<? extends V> mo3705a();

    protected /* synthetic */ Object mo3692c() {
        return mo3705a();
    }

    protected mst() {
    }

    public boolean cancel(boolean z) {
        return mo3705a().cancel(z);
    }

    public boolean isCancelled() {
        return mo3705a().isCancelled();
    }

    public boolean isDone() {
        return mo3705a().isDone();
    }

    public V get() {
        return mo3705a().get();
    }

    public V get(long j, TimeUnit timeUnit) {
        return mo3705a().get(j, timeUnit);
    }
}
