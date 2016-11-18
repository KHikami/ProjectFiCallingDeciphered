package defpackage;

import android.util.Log;
import org.chromium.net.impl.CronetUrlRequest;

public final class oxh implements Runnable {
    final /* synthetic */ CronetUrlRequest a;

    public oxh(CronetUrlRequest cronetUrlRequest) {
        this.a = cronetUrlRequest;
    }

    public void run() {
        synchronized (this.a.e) {
            if (this.a.d()) {
                return;
            }
            this.a.a(false);
            try {
                this.a.f.b(this.a, this.a.h);
            } catch (Throwable e) {
                Log.e("ChromiumNetwork", "Exception in onComplete method", e);
            }
        }
    }
}
