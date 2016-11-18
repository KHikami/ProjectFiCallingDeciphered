package defpackage;

import android.util.Log;
import org.chromium.net.impl.CronetUrlRequest;

public final class oxi implements Runnable {
    final /* synthetic */ CronetUrlRequest a;

    public oxi(CronetUrlRequest cronetUrlRequest) {
        this.a = cronetUrlRequest;
    }

    public void run() {
        try {
            this.a.f.a(this.a.h);
        } catch (Throwable e) {
            Log.e("ChromiumNetwork", "Exception in onCanceled method", e);
        }
    }
}
