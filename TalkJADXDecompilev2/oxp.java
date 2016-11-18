package defpackage;

import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.RequestFinishedInfo.Listener;
import org.chromium.net.impl.CronetUrlRequestContext;

public final class oxp implements Runnable {
    final /* synthetic */ Listener a;
    final /* synthetic */ RequestFinishedInfo b;
    final /* synthetic */ CronetUrlRequestContext c;

    public oxp(CronetUrlRequestContext cronetUrlRequestContext, Listener listener, RequestFinishedInfo requestFinishedInfo) {
        this.c = cronetUrlRequestContext;
        this.a = listener;
        this.b = requestFinishedInfo;
    }

    public void run() {
    }
}
