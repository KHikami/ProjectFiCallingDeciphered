package p000;

import java.util.concurrent.Executor;

public final class mtn implements Executor {
    volatile boolean f28287a = true;
    final /* synthetic */ Executor f28288b;
    final /* synthetic */ mrz f28289c;

    public mtn(Executor executor, mrz mrz) {
        this.f28288b = executor;
        this.f28289c = mrz;
    }

    public void execute(Runnable runnable) {
        try {
            this.f28288b.execute(new mto(this, runnable));
        } catch (Throwable e) {
            if (this.f28287a) {
                this.f28289c.mo3941a(e);
            }
        }
    }
}
