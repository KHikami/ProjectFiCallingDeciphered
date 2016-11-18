package p000;

import org.chromium.net.impl.CronetUrlRequest;

public final class oxd implements Runnable {
    final /* synthetic */ CronetUrlRequest f34484a;

    public oxd(CronetUrlRequest cronetUrlRequest) {
        this.f34484a = cronetUrlRequest;
    }

    public void run() {
        this.f34484a.g.a(this.f34484a);
        synchronized (this.f34484a.e) {
            if (this.f34484a.d()) {
                return;
            }
            this.f34484a.g.a(this.f34484a.a);
            this.f34484a.c();
        }
    }
}
