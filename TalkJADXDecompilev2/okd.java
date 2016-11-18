package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Level;

final class okd implements Runnable {
    final okc a;
    final /* synthetic */ ojz b;
    private final Executor c;

    okd(ojz ojz, Executor executor, okc okc) {
        this.b = ojz;
        this.c = executor;
        this.a = okc;
    }

    void a() {
        try {
            this.c.execute(this);
        } catch (Throwable th) {
            ojz.a.log(Level.INFO, "Exception notifying context listener", th);
        }
    }

    public void run() {
        this.a.a(this.b);
    }
}
