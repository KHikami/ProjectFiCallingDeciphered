package p000;

import android.util.Log;
import org.chromium.net.UrlRequestException;
import org.chromium.net.impl.CronetUrlRequest;

public final class oxe implements Runnable {
    final /* synthetic */ UrlRequestException f34485a;
    final /* synthetic */ CronetUrlRequest f34486b;

    public oxe(CronetUrlRequest cronetUrlRequest, UrlRequestException urlRequestException) {
        this.f34486b = cronetUrlRequest;
        this.f34485a = urlRequestException;
    }

    public void run() {
        synchronized (this.f34486b.e) {
            if (this.f34486b.d()) {
                return;
            }
            this.f34486b.a(false);
            try {
                this.f34486b.f.m39380a(this.f34486b, this.f34486b.h, this.f34485a);
            } catch (Throwable e) {
                Log.e("ChromiumNetwork", "Exception in onError method", e);
            }
        }
    }
}
