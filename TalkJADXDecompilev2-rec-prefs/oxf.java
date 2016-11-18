package p000;

import org.chromium.net.UrlResponseInfo;
import org.chromium.net.impl.CronetUrlRequest;

public final class oxf implements Runnable {
    final /* synthetic */ UrlResponseInfo f34487a;
    final /* synthetic */ String f34488b;
    final /* synthetic */ CronetUrlRequest f34489c;

    public oxf(CronetUrlRequest cronetUrlRequest, UrlResponseInfo urlResponseInfo, String str) {
        this.f34489c = cronetUrlRequest;
        this.f34487a = urlResponseInfo;
        this.f34488b = str;
    }

    public void run() {
        synchronized (this.f34489c.e) {
            if (this.f34489c.d()) {
                return;
            }
            this.f34489c.b = true;
            try {
                this.f34489c.f.m39377a(this.f34489c, this.f34488b);
            } catch (Exception e) {
                this.f34489c.a(e);
            }
        }
    }
}
