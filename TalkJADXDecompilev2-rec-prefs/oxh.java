package p000;

import android.util.Log;
import org.chromium.net.impl.CronetUrlRequest;

public final class oxh implements Runnable {
    final /* synthetic */ CronetUrlRequest f34491a;

    public oxh(CronetUrlRequest cronetUrlRequest) {
        this.f34491a = cronetUrlRequest;
    }

    public void run() {
        synchronized (this.f34491a.e) {
            if (this.f34491a.d()) {
                return;
            }
            this.f34491a.a(false);
            try {
                this.f34491a.f.m39382b(this.f34491a, this.f34491a.h);
            } catch (Throwable e) {
                Log.e("ChromiumNetwork", "Exception in onComplete method", e);
            }
        }
    }
}
