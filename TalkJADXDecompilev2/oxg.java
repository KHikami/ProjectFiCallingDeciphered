package defpackage;

import android.os.SystemClock;
import org.chromium.net.impl.CronetUrlRequest;

public final class oxg implements Runnable {
    final /* synthetic */ CronetUrlRequest a;

    public oxg(CronetUrlRequest cronetUrlRequest) {
        this.a = cronetUrlRequest;
    }

    public void run() {
        synchronized (this.a.e) {
            if (this.a.d()) {
                return;
            }
            if (this.a.d != null) {
                oxl oxl = this.a.d;
                if (oxl.a != null && oxl.b == null) {
                    oxl.b = Long.valueOf(SystemClock.elapsedRealtime() - oxl.a.longValue());
                }
            }
            this.a.c = true;
            try {
                this.a.f.a(this.a, this.a.h);
            } catch (Exception e) {
                this.a.a(e);
            }
        }
    }
}
