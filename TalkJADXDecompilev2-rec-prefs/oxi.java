package p000;

import android.util.Log;
import org.chromium.net.impl.CronetUrlRequest;

public final class oxi implements Runnable {
    final /* synthetic */ CronetUrlRequest f34492a;

    public oxi(CronetUrlRequest cronetUrlRequest) {
        this.f34492a = cronetUrlRequest;
    }

    public void run() {
        try {
            this.f34492a.f.m39381a(this.f34492a.h);
        } catch (Throwable e) {
            Log.e("ChromiumNetwork", "Exception in onCanceled method", e);
        }
    }
}
