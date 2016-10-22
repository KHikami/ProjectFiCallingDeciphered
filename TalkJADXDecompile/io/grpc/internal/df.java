package io.grpc.internal;

import java.util.logging.Level;

final class df implements Runnable {
    final /* synthetic */ ag a;
    final /* synthetic */ dd b;

    df(dd ddVar, ag agVar) {
        this.b = ddVar;
        this.a = agVar;
    }

    public void run() {
        Runnable runnable = null;
        try {
            this.a.d();
            Object obj = null;
            synchronized (this.b.b) {
                this.b.j = null;
                if (this.a.b()) {
                    runnable = this.b.a(this.a);
                } else {
                    this.b.p = null;
                    obj = 1;
                }
            }
            if (runnable != null) {
                runnable.run();
            }
            if (obj != null) {
                this.a.a(new dg(this));
                this.a.a();
            }
        } catch (Throwable th) {
            dd.a.log(Level.WARNING, "Exception handling end of backoff", th);
        }
    }
}
