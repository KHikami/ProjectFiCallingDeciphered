package p000;

import java.util.concurrent.Executor;

final class ovp implements Executor {
    final /* synthetic */ oup f34388a;
    final /* synthetic */ Executor f34389b;
    final /* synthetic */ ovo f34390c;

    ovp(ovo ovo, oup oup, Executor executor) {
        this.f34390c = ovo;
        this.f34388a = oup;
        this.f34389b = executor;
    }

    public void execute(Runnable runnable) {
        try {
            this.f34389b.execute(runnable);
        } catch (Throwable e) {
            this.f34390c.f34387j.m39745a(e);
        }
    }
}
