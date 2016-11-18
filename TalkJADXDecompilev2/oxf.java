package defpackage;

import org.chromium.net.UrlResponseInfo;
import org.chromium.net.impl.CronetUrlRequest;

public final class oxf implements Runnable {
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ String b;
    final /* synthetic */ CronetUrlRequest c;

    public oxf(CronetUrlRequest cronetUrlRequest, UrlResponseInfo urlResponseInfo, String str) {
        this.c = cronetUrlRequest;
        this.a = urlResponseInfo;
        this.b = str;
    }

    public void run() {
        synchronized (this.c.e) {
            if (this.c.d()) {
                return;
            }
            this.c.b = true;
            try {
                this.c.f.a(this.c, this.b);
            } catch (Exception e) {
                this.c.a(e);
            }
        }
    }
}
