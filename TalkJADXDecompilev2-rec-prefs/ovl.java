package p000;

import android.util.Log;
import org.chromium.net.UrlResponseInfo;

final class ovl implements Runnable {
    final /* synthetic */ UrlResponseInfo f34373a;
    final /* synthetic */ ovg f34374b;

    ovl(ovg ovg, UrlResponseInfo urlResponseInfo) {
        this.f34374b = ovg;
        this.f34373a = urlResponseInfo;
    }

    public void run() {
        try {
            this.f34374b.f34361a.m39382b(this.f34374b.f34363c, this.f34373a);
        } catch (Throwable e) {
            Log.e("JavaUrlConnection", "Exception in onSucceeded method", e);
        }
    }
}
