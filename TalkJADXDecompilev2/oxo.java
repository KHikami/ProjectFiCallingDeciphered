package defpackage;

import org.chromium.net.NetworkQualityThroughputListener;
import org.chromium.net.impl.CronetUrlRequestContext;

public final class oxo implements Runnable {
    final /* synthetic */ NetworkQualityThroughputListener a;
    final /* synthetic */ int b;
    final /* synthetic */ long c;
    final /* synthetic */ int d;
    final /* synthetic */ CronetUrlRequestContext e;

    public oxo(CronetUrlRequestContext cronetUrlRequestContext, NetworkQualityThroughputListener networkQualityThroughputListener, int i, long j, int i2) {
        this.e = cronetUrlRequestContext;
        this.a = networkQualityThroughputListener;
        this.b = i;
        this.c = j;
        this.d = i2;
    }

    public void run() {
    }
}
