package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public abstract class msu<V> extends mst<V> implements mti<V> {
    protected abstract mti<? extends V> b();

    protected /* synthetic */ Future a() {
        return b();
    }

    protected /* synthetic */ Object c() {
        return b();
    }

    protected msu() {
    }

    public void a(Runnable runnable, Executor executor) {
        b().a(runnable, executor);
    }
}
