package defpackage;

import android.util.Log;
import org.chromium.net.UrlResponseInfo;

final class ovk implements Runnable {
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ ovg b;

    ovk(ovg ovg, UrlResponseInfo urlResponseInfo) {
        this.b = ovg;
        this.a = urlResponseInfo;
    }

    public void run() {
        try {
            this.b.a.a(this.a);
        } catch (Throwable e) {
            Log.e("JavaUrlConnection", "Exception in onCanceled method", e);
        }
    }
}
