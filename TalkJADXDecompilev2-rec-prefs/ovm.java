package p000;

import android.util.Log;
import org.chromium.net.UrlRequestException;
import org.chromium.net.UrlResponseInfo;

final class ovm implements Runnable {
    final /* synthetic */ UrlResponseInfo f34375a;
    final /* synthetic */ UrlRequestException f34376b;
    final /* synthetic */ ovg f34377c;

    ovm(ovg ovg, UrlResponseInfo urlResponseInfo, UrlRequestException urlRequestException) {
        this.f34377c = ovg;
        this.f34375a = urlResponseInfo;
        this.f34376b = urlRequestException;
    }

    public void run() {
        try {
            this.f34377c.f34361a.m39380a(this.f34377c.f34363c, this.f34375a, this.f34376b);
        } catch (Throwable e) {
            Log.e("JavaUrlConnection", "Exception in onFailed method", e);
        }
    }
}
