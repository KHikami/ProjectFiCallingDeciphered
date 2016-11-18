package p000;

import android.os.SystemClock;
import org.chromium.net.impl.CronetUrlRequest;

public final class oxg implements Runnable {
    final /* synthetic */ CronetUrlRequest f34490a;

    public oxg(CronetUrlRequest cronetUrlRequest) {
        this.f34490a = cronetUrlRequest;
    }

    public void run() {
        synchronized (this.f34490a.e) {
            if (this.f34490a.d()) {
                return;
            }
            if (this.f34490a.d != null) {
                oxl oxl = this.f34490a.d;
                if (oxl.f34498a != null && oxl.f34499b == null) {
                    oxl.f34499b = Long.valueOf(SystemClock.elapsedRealtime() - oxl.f34498a.longValue());
                }
            }
            this.f34490a.c = true;
            try {
                this.f34490a.f.m39378a(this.f34490a, this.f34490a.h);
            } catch (Exception e) {
                this.f34490a.a(e);
            }
        }
    }
}
