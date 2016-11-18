package p000;

import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.RequestFinishedInfo.Listener;
import org.chromium.net.impl.CronetUrlRequestContext;

public final class oxp implements Runnable {
    final /* synthetic */ Listener f34514a;
    final /* synthetic */ RequestFinishedInfo f34515b;
    final /* synthetic */ CronetUrlRequestContext f34516c;

    public oxp(CronetUrlRequestContext cronetUrlRequestContext, Listener listener, RequestFinishedInfo requestFinishedInfo) {
        this.f34516c = cronetUrlRequestContext;
        this.f34514a = listener;
        this.f34515b = requestFinishedInfo;
    }

    public void run() {
    }
}
