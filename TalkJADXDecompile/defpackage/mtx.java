package defpackage;

import java.util.concurrent.Callable;

/* renamed from: mtx */
final class mtx extends mte {
    final /* synthetic */ mtw c;
    private final Callable<V> d;

    mtx(mtw mtw, Callable<V> callable) {
        this.c = mtw;
        this.d = (Callable) bm.a((Object) callable);
    }

    void a() {
        if (!this.c.isDone()) {
            try {
                this.c.b(this.d.call());
            } catch (Throwable th) {
                this.c.a(th);
            }
        }
    }

    boolean b() {
        return this.c.c();
    }

    public String toString() {
        return this.d.toString();
    }
}
