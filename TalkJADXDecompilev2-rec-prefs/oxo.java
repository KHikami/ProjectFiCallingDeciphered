package p000;

import org.chromium.net.NetworkQualityThroughputListener;
import org.chromium.net.impl.CronetUrlRequestContext;

public final class oxo implements Runnable {
    final /* synthetic */ NetworkQualityThroughputListener f34509a;
    final /* synthetic */ int f34510b;
    final /* synthetic */ long f34511c;
    final /* synthetic */ int f34512d;
    final /* synthetic */ CronetUrlRequestContext f34513e;

    public oxo(CronetUrlRequestContext cronetUrlRequestContext, NetworkQualityThroughputListener networkQualityThroughputListener, int i, long j, int i2) {
        this.f34513e = cronetUrlRequestContext;
        this.f34509a = networkQualityThroughputListener;
        this.f34510b = i;
        this.f34511c = j;
        this.f34512d = i2;
    }

    public void run() {
    }
}
