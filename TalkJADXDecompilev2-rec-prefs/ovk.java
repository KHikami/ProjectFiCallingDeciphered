package p000;

import android.util.Log;
import org.chromium.net.UrlResponseInfo;

final class ovk implements Runnable {
    final /* synthetic */ UrlResponseInfo f34371a;
    final /* synthetic */ ovg f34372b;

    ovk(ovg ovg, UrlResponseInfo urlResponseInfo) {
        this.f34372b = ovg;
        this.f34371a = urlResponseInfo;
    }

    public void run() {
        try {
            this.f34372b.f34361a.m39381a(this.f34371a);
        } catch (Throwable e) {
            Log.e("JavaUrlConnection", "Exception in onCanceled method", e);
        }
    }
}
