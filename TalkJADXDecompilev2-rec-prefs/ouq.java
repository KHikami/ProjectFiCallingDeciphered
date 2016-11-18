package p000;

import java.util.concurrent.Executor;

final class ouq implements Executor {
    final /* synthetic */ Executor f34335a;
    final /* synthetic */ oup f34336b;

    ouq(oup oup, Executor executor) {
        this.f34336b = oup;
        this.f34335a = executor;
    }

    public void execute(Runnable runnable) {
        this.f34335a.execute(new our(this, runnable));
    }
}
