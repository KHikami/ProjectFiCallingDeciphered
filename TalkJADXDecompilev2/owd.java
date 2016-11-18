package defpackage;

import android.net.Network;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

final class owd implements Runnable {
    final /* synthetic */ Network a;
    final /* synthetic */ ovz b;

    owd(ovz ovz, Network network) {
        this.b = ovz;
        this.a = network;
    }

    public void run() {
        this.b.a.a.b(NetworkChangeNotifierAutoDetect.a(this.a));
    }
}
