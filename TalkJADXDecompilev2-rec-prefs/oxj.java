package p000;

import org.chromium.net.UrlRequest.StatusListener;
import org.chromium.net.impl.CronetUrlRequest;

public final class oxj implements Runnable {
    final /* synthetic */ StatusListener f34493a;
    final /* synthetic */ int f34494b;
    final /* synthetic */ CronetUrlRequest f34495c;

    public oxj(CronetUrlRequest cronetUrlRequest, StatusListener statusListener, int i) {
        this.f34495c = cronetUrlRequest;
        this.f34493a = statusListener;
        this.f34494b = i;
    }

    public void run() {
        switch (this.f34494b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return;
            default:
                throw new IllegalArgumentException("No request status found.");
        }
    }
}
