package defpackage;

import java.util.concurrent.Executor;

final class ouq implements Executor {
    final /* synthetic */ Executor a;
    final /* synthetic */ oup b;

    ouq(oup oup, Executor executor) {
        this.b = oup;
        this.a = executor;
    }

    public void execute(Runnable runnable) {
        this.a.execute(new our(this, runnable));
    }
}
