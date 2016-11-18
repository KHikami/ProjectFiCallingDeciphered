package defpackage;

import org.chromium.net.impl.CronetUrlRequest;

public final class oxd implements Runnable {
    final /* synthetic */ CronetUrlRequest a;

    public oxd(CronetUrlRequest cronetUrlRequest) {
        this.a = cronetUrlRequest;
    }

    public void run() {
        this.a.g.a(this.a);
        synchronized (this.a.e) {
            if (this.a.d()) {
                return;
            }
            this.a.g.a(this.a.a);
            this.a.c();
        }
    }
}
