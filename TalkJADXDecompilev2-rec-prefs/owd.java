package p000;

import android.net.Network;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

final class owd implements Runnable {
    final /* synthetic */ Network f34427a;
    final /* synthetic */ ovz f34428b;

    owd(ovz ovz, Network network) {
        this.f34428b = ovz;
        this.f34427a = network;
    }

    public void run() {
        this.f34428b.f34415a.f33937a.mo4243b(NetworkChangeNotifierAutoDetect.m39340a(this.f34427a));
    }
}
