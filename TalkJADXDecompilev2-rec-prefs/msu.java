package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public abstract class msu<V> extends mst<V> implements mti<V> {
    protected abstract mti<? extends V> mo3707b();

    protected /* synthetic */ Future mo3705a() {
        return mo3707b();
    }

    protected /* synthetic */ Object mo3692c() {
        return mo3707b();
    }

    protected msu() {
    }

    public void mo3706a(Runnable runnable, Executor executor) {
        mo3707b().mo3706a(runnable, executor);
    }
}
