package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class msi<V> extends mrz<V> {
    msi() {
    }

    public final V get() {
        return super.get();
    }

    public final V get(long j, TimeUnit timeUnit) {
        return super.get(j, timeUnit);
    }

    public final boolean isDone() {
        return super.isDone();
    }

    public final boolean isCancelled() {
        return super.isCancelled();
    }

    public final void a(Runnable runnable, Executor executor) {
        super.a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return super.cancel(z);
    }
}