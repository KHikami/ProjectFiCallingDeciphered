package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import java.io.IOException;
import org.chromium.base.metrics.RecordHistogram;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

public final class ovy {
    private final ConnectivityManager a;

    public ovy(Context context) {
        this.a = (ConnectivityManager) context.getSystemService("connectivity");
    }

    ovy() {
        this.a = null;
    }

    public owg a() {
        return ovy.a(this.a.getActiveNetworkInfo());
    }

    private NetworkInfo d(Network network) {
        NetworkInfo networkInfo;
        try {
            networkInfo = this.a.getNetworkInfo(network);
            RecordHistogram.a("NCN.getNetInfo1stSuccess", true);
            return networkInfo;
        } catch (NullPointerException e) {
            RecordHistogram.a("NCN.getNetInfo1stSuccess", false);
            try {
                networkInfo = this.a.getNetworkInfo(network);
                RecordHistogram.a("NCN.getNetInfo2ndSuccess", true);
                return networkInfo;
            } catch (NullPointerException e2) {
                RecordHistogram.a("NCN.getNetInfo2ndSuccess", false);
                return null;
            }
        }
    }

    public owg a(Network network) {
        NetworkInfo d = d(network);
        if (d == null || d.getType() != 17) {
            return ovy.a(d);
        }
        return a();
    }

    private static owg a(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnected()) {
            return new owg(false, -1, -1);
        }
        return new owg(true, networkInfo.getType(), networkInfo.getSubtype());
    }

    public Network[] b() {
        return this.a.getAllNetworks();
    }

    public static boolean b(Network network) {
        try {
            network.getSocketFactory().createSocket().close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public NetworkCapabilities c(Network network) {
        return this.a.getNetworkCapabilities(network);
    }

    public void a(NetworkRequest networkRequest, NetworkCallback networkCallback) {
        this.a.registerNetworkCallback(networkRequest, networkCallback);
    }

    public void a(NetworkCallback networkCallback) {
        this.a.unregisterNetworkCallback(networkCallback);
    }

    public long c() {
        long j = -1;
        NetworkInfo activeNetworkInfo = this.a.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            for (Network network : NetworkChangeNotifierAutoDetect.a(this, null)) {
                NetworkInfo d = d(network);
                if (d != null && (d.getType() == activeNetworkInfo.getType() || d.getType() == 17)) {
                    j = NetworkChangeNotifierAutoDetect.a(network);
                }
            }
        }
        return j;
    }
}
