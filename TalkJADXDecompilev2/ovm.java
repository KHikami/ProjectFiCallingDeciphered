package defpackage;

import android.util.Log;
import org.chromium.net.UrlRequestException;
import org.chromium.net.UrlResponseInfo;

final class ovm implements Runnable {
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ UrlRequestException b;
    final /* synthetic */ ovg c;

    ovm(ovg ovg, UrlResponseInfo urlResponseInfo, UrlRequestException urlRequestException) {
        this.c = ovg;
        this.a = urlResponseInfo;
        this.b = urlRequestException;
    }

    public void run() {
        try {
            this.c.a.a(this.c.c, this.a, this.b);
        } catch (Throwable e) {
            Log.e("JavaUrlConnection", "Exception in onFailed method", e);
        }
    }
}
