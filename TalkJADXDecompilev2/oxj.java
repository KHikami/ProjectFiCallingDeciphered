package defpackage;

import org.chromium.net.UrlRequest.StatusListener;
import org.chromium.net.impl.CronetUrlRequest;

public final class oxj implements Runnable {
    final /* synthetic */ StatusListener a;
    final /* synthetic */ int b;
    final /* synthetic */ CronetUrlRequest c;

    public oxj(CronetUrlRequest cronetUrlRequest, StatusListener statusListener, int i) {
        this.c = cronetUrlRequest;
        this.a = statusListener;
        this.b = i;
    }

    public void run() {
        switch (this.b) {
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
