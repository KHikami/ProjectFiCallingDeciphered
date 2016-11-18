package p000;

import java.util.concurrent.Callable;

final class mtx extends mte {
    final /* synthetic */ mtw f28309c;
    private final Callable<V> f28310d;

    mtx(mtw mtw, Callable<V> callable) {
        this.f28309c = mtw;
        this.f28310d = (Callable) bm.m6122a((Object) callable);
    }

    void mo3945a() {
        if (!this.f28309c.isDone()) {
            try {
                this.f28309c.mo3943b(this.f28310d.call());
            } catch (Throwable th) {
                this.f28309c.mo3941a(th);
            }
        }
    }

    boolean mo3946b() {
        return this.f28309c.m32824c();
    }

    public String toString() {
        return this.f28310d.toString();
    }
}
