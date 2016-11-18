package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

final class mtw<V> extends msi<V> implements RunnableFuture<V> {
    private mtx f28308a;

    static <V> mtw<V> m32898a(Callable<V> callable) {
        return new mtw(callable);
    }

    static <V> mtw<V> m32897a(Runnable runnable, V v) {
        return new mtw(Executors.callable(runnable, v));
    }

    private mtw(Callable<V> callable) {
        this.f28308a = new mtx(this, callable);
    }

    public void run() {
        mtx mtx = this.f28308a;
        if (mtx != null) {
            mtx.run();
        }
    }

    protected void mo3928a() {
        super.mo3928a();
        this.f28308a = null;
    }

    protected final void mo3944b() {
        mte mte = this.f28308a;
        if (mte != null) {
            Thread thread = mte.f28283a;
            if (thread != null) {
                thread.interrupt();
            }
            mte.f28284b = true;
        }
    }

    public String toString() {
        String valueOf = String.valueOf(super.toString());
        String valueOf2 = String.valueOf(this.f28308a);
        return new StringBuilder((String.valueOf(valueOf).length() + 14) + String.valueOf(valueOf2).length()).append(valueOf).append(" (delegate = ").append(valueOf2).append(")").toString();
    }
}
