import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

final class mtw<V> extends msi<V> implements RunnableFuture<V> {
    private mtx a;

    static <V> mtw<V> a(Callable<V> callable) {
        return new mtw(callable);
    }

    static <V> mtw<V> a(Runnable runnable, V v) {
        return new mtw(Executors.callable(runnable, v));
    }

    private mtw(Callable<V> callable) {
        this.a = new mtx(this, callable);
    }

    public void run() {
        mtx mtx = this.a;
        if (mtx != null) {
            mtx.run();
        }
    }

    protected void a() {
        super.a();
        this.a = null;
    }

    protected final void b() {
        mte mte = this.a;
        if (mte != null) {
            Thread thread = mte.a;
            if (thread != null) {
                thread.interrupt();
            }
            mte.b = true;
        }
    }

    public String toString() {
        String valueOf = String.valueOf(super.toString());
        String valueOf2 = String.valueOf(this.a);
        return new StringBuilder((String.valueOf(valueOf).length() + 14) + String.valueOf(valueOf2).length()).append(valueOf).append(" (delegate = ").append(valueOf2).append(")").toString();
    }
}
