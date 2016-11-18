package p000;

import java.util.concurrent.Executor;
import java.util.logging.Level;

final class okd implements Runnable {
    final okc f33119a;
    final /* synthetic */ ojz f33120b;
    private final Executor f33121c;

    okd(ojz ojz, Executor executor, okc okc) {
        this.f33120b = ojz;
        this.f33121c = executor;
        this.f33119a = okc;
    }

    void m38623a() {
        try {
            this.f33121c.execute(this);
        } catch (Throwable th) {
            ojz.a.log(Level.INFO, "Exception notifying context listener", th);
        }
    }

    public void run() {
        this.f33119a.mo4159a(this.f33120b);
    }
}
