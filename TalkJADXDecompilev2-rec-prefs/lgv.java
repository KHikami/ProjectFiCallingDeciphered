package p000;

import java.util.concurrent.ExecutorService;

final class lgv extends lgx {
    final /* synthetic */ mtm f24983a;

    lgv(mtm mtm) {
        this.f24983a = mtm;
    }

    public /* synthetic */ mtl mo3703a() {
        return mo3708d();
    }

    public /* synthetic */ ExecutorService mo3696b() {
        return mo3708d();
    }

    public /* synthetic */ Object mo3692c() {
        return mo3708d();
    }

    public void execute(Runnable runnable) {
        this.f24983a.execute(new lgw(this, runnable));
    }

    public mtm mo3708d() {
        return this.f24983a;
    }
}
