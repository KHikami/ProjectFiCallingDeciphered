package defpackage;

import org.chromium.net.NetworkQualityRttListener;
import org.chromium.net.impl.CronetUrlRequestContext;

public final class oxn implements Runnable {
    final /* synthetic */ NetworkQualityRttListener a;
    final /* synthetic */ int b;
    final /* synthetic */ long c;
    final /* synthetic */ int d;
    final /* synthetic */ CronetUrlRequestContext e;

    public oxn(CronetUrlRequestContext cronetUrlRequestContext, NetworkQualityRttListener networkQualityRttListener, int i, long j, int i2) {
        this.e = cronetUrlRequestContext;
        this.a = networkQualityRttListener;
        this.b = i;
        this.c = j;
        this.d = i2;
    }

    public void run() {
    }
}
