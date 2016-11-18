package p000;

import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;
import org.chromium.base.ThreadUtils;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

public final class ovz extends NetworkCallback {
    final /* synthetic */ NetworkChangeNotifierAutoDetect f34415a;
    private Network f34416b = null;

    public ovz(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.f34415a = networkChangeNotifierAutoDetect;
    }

    public void m39798a() {
        Network[] a = NetworkChangeNotifierAutoDetect.m39341a(this.f34415a.f33938b, null);
        this.f34416b = null;
        if (a.length == 1) {
            NetworkCapabilities c = this.f34415a.f33938b.m39795c(a[0]);
            if (c != null && c.hasTransport(4)) {
                this.f34416b = a[0];
            }
        }
    }

    private boolean m39796a(Network network) {
        return (this.f34416b == null || this.f34416b.equals(network)) ? false : true;
    }

    private boolean m39797a(Network network, NetworkCapabilities networkCapabilities) {
        if (!m39796a(network)) {
            boolean z;
            if (networkCapabilities == null) {
                networkCapabilities = this.f34415a.f33938b.m39795c(network);
            }
            if (networkCapabilities == null || (networkCapabilities.hasTransport(4) && !ovy.m39787b(network))) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public void onAvailable(Network network) {
        NetworkCapabilities c = this.f34415a.f33938b.m39795c(network);
        if (!m39797a(network, c)) {
            boolean hasTransport = c.hasTransport(4);
            if (hasTransport) {
                this.f34416b = network;
            }
            ThreadUtils.m39318a(new owa(this, NetworkChangeNotifierAutoDetect.m39340a(network), this.f34415a.m39345a(this.f34415a.f33938b.m39790a(network)), hasTransport));
        }
    }

    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        if (!m39797a(network, networkCapabilities)) {
            ThreadUtils.m39318a(new owb(this, NetworkChangeNotifierAutoDetect.m39340a(network), this.f34415a.m39345a(this.f34415a.f33938b.m39790a(network))));
        }
    }

    public void onLosing(Network network, int i) {
        if (!m39797a(network, null)) {
            ThreadUtils.m39318a(new owc(this, NetworkChangeNotifierAutoDetect.m39340a(network)));
        }
    }

    public void onLost(Network network) {
        if (!m39796a(network)) {
            ThreadUtils.m39318a(new owd(this, network));
            if (this.f34416b != null) {
                this.f34416b = null;
                for (Network onAvailable : NetworkChangeNotifierAutoDetect.m39341a(this.f34415a.f33938b, network)) {
                    onAvailable(onAvailable);
                }
                ThreadUtils.m39318a(new owe(this, this.f34415a.m39345a(this.f34415a.f33938b.m39789a())));
            }
        }
    }
}
