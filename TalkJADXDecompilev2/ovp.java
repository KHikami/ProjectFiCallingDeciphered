package defpackage;

import java.util.concurrent.Executor;

final class ovp implements Executor {
    final /* synthetic */ oup a;
    final /* synthetic */ Executor b;
    final /* synthetic */ ovo c;

    ovp(ovo ovo, oup oup, Executor executor) {
        this.c = ovo;
        this.a = oup;
        this.b = executor;
    }

    public void execute(Runnable runnable) {
        try {
            this.b.execute(runnable);
        } catch (Throwable e) {
            this.c.j.a(e);
        }
    }
}
