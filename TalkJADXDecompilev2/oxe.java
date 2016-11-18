package defpackage;

import android.util.Log;
import org.chromium.net.UrlRequestException;
import org.chromium.net.impl.CronetUrlRequest;

public final class oxe implements Runnable {
    final /* synthetic */ UrlRequestException a;
    final /* synthetic */ CronetUrlRequest b;

    public oxe(CronetUrlRequest cronetUrlRequest, UrlRequestException urlRequestException) {
        this.b = cronetUrlRequest;
        this.a = urlRequestException;
    }

    public void run() {
        synchronized (this.b.e) {
            if (this.b.d()) {
                return;
            }
            this.b.a(false);
            try {
                this.b.f.a(this.b, this.b.h, this.a);
            } catch (Throwable e) {
                Log.e("ChromiumNetwork", "Exception in onError method", e);
            }
        }
    }
}
