package defpackage;

import android.util.Log;
import org.chromium.net.UrlResponseInfo;

final class ovl implements Runnable {
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ ovg b;

    ovl(ovg ovg, UrlResponseInfo urlResponseInfo) {
        this.b = ovg;
        this.a = urlResponseInfo;
    }

    public void run() {
        try {
            this.b.a.b(this.b.c, this.a);
        } catch (Throwable e) {
            Log.e("JavaUrlConnection", "Exception in onSucceeded method", e);
        }
    }
}
