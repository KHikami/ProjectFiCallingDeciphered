package p000;

import org.chromium.net.NetworkQualityRttListener;
import org.chromium.net.impl.CronetUrlRequestContext;

public final class oxn implements Runnable {
    final /* synthetic */ NetworkQualityRttListener f34504a;
    final /* synthetic */ int f34505b;
    final /* synthetic */ long f34506c;
    final /* synthetic */ int f34507d;
    final /* synthetic */ CronetUrlRequestContext f34508e;

    public oxn(CronetUrlRequestContext cronetUrlRequestContext, NetworkQualityRttListener networkQualityRttListener, int i, long j, int i2) {
        this.f34508e = cronetUrlRequestContext;
        this.f34504a = networkQualityRttListener;
        this.f34505b = i;
        this.f34506c = j;
        this.f34507d = i2;
    }

    public void run() {
    }
}
