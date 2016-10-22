package defpackage;

import java.util.concurrent.Executor;

/* renamed from: mtn */
public final class mtn implements Executor {
    volatile boolean a;
    final /* synthetic */ Executor b;
    final /* synthetic */ mrz c;

    public mtn(Executor executor, mrz mrz) {
        this.b = executor;
        this.c = mrz;
        this.a = true;
    }

    public void execute(Runnable runnable) {
        try {
            this.b.execute(new mto(this, runnable));
        } catch (Throwable e) {
            if (this.a) {
                this.c.a(e);
            }
        }
    }
}
