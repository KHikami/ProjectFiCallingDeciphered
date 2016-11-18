package defpackage;

import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;
import org.chromium.base.ThreadUtils;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

public final class ovz extends NetworkCallback {
    final /* synthetic */ NetworkChangeNotifierAutoDetect a;
    private Network b = null;

    public ovz(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.a = networkChangeNotifierAutoDetect;
    }

    public void a() {
        Network[] a = NetworkChangeNotifierAutoDetect.a(this.a.b, null);
        this.b = null;
        if (a.length == 1) {
            NetworkCapabilities c = this.a.b.c(a[0]);
            if (c != null && c.hasTransport(4)) {
                this.b = a[0];
            }
        }
    }

    private boolean a(Network network) {
        return (this.b == null || this.b.equals(network)) ? false : true;
    }

    private boolean a(Network network, NetworkCapabilities networkCapabilities) {
        if (!a(network)) {
            boolean z;
            if (networkCapabilities == null) {
                networkCapabilities = this.a.b.c(network);
            }
            if (networkCapabilities == null || (networkCapabilities.hasTransport(4) && !ovy.b(network))) {
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
        NetworkCapabilities c = this.a.b.c(network);
        if (!a(network, c)) {
            boolean hasTransport = c.hasTransport(4);
            if (hasTransport) {
                this.b = network;
            }
            ThreadUtils.a(new owa(this, NetworkChangeNotifierAutoDetect.a(network), this.a.a(this.a.b.a(network)), hasTransport));
        }
    }

    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        if (!a(network, networkCapabilities)) {
            ThreadUtils.a(new owb(this, NetworkChangeNotifierAutoDetect.a(network), this.a.a(this.a.b.a(network))));
        }
    }

    public void onLosing(Network network, int i) {
        if (!a(network, null)) {
            ThreadUtils.a(new owc(this, NetworkChangeNotifierAutoDetect.a(network)));
        }
    }

    public void onLost(Network network) {
        if (!a(network)) {
            ThreadUtils.a(new owd(this, network));
            if (this.b != null) {
                this.b = null;
                for (Network onAvailable : NetworkChangeNotifierAutoDetect.a(this.a.b, network)) {
                    onAvailable(onAvailable);
                }
                ThreadUtils.a(new owe(this, this.a.a(this.a.b.a())));
            }
        }
    }
}
