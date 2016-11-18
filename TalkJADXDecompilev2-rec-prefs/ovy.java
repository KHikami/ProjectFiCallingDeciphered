package p000;

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
    private final ConnectivityManager f34414a;

    public ovy(Context context) {
        this.f34414a = (ConnectivityManager) context.getSystemService("connectivity");
    }

    ovy() {
        this.f34414a = null;
    }

    public owg m39789a() {
        return ovy.m39786a(this.f34414a.getActiveNetworkInfo());
    }

    private NetworkInfo m39788d(Network network) {
        NetworkInfo networkInfo;
        try {
            networkInfo = this.f34414a.getNetworkInfo(network);
            RecordHistogram.a("NCN.getNetInfo1stSuccess", true);
            return networkInfo;
        } catch (NullPointerException e) {
            RecordHistogram.a("NCN.getNetInfo1stSuccess", false);
            try {
                networkInfo = this.f34414a.getNetworkInfo(network);
                RecordHistogram.a("NCN.getNetInfo2ndSuccess", true);
                return networkInfo;
            } catch (NullPointerException e2) {
                RecordHistogram.a("NCN.getNetInfo2ndSuccess", false);
                return null;
            }
        }
    }

    public owg m39790a(Network network) {
        NetworkInfo d = m39788d(network);
        if (d == null || d.getType() != 17) {
            return ovy.m39786a(d);
        }
        return m39789a();
    }

    private static owg m39786a(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnected()) {
            return new owg(false, -1, -1);
        }
        return new owg(true, networkInfo.getType(), networkInfo.getSubtype());
    }

    public Network[] m39793b() {
        return this.f34414a.getAllNetworks();
    }

    public static boolean m39787b(Network network) {
        try {
            network.getSocketFactory().createSocket().close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public NetworkCapabilities m39795c(Network network) {
        return this.f34414a.getNetworkCapabilities(network);
    }

    public void m39792a(NetworkRequest networkRequest, NetworkCallback networkCallback) {
        this.f34414a.registerNetworkCallback(networkRequest, networkCallback);
    }

    public void m39791a(NetworkCallback networkCallback) {
        this.f34414a.unregisterNetworkCallback(networkCallback);
    }

    public long m39794c() {
        long j = -1;
        NetworkInfo activeNetworkInfo = this.f34414a.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            for (Network network : NetworkChangeNotifierAutoDetect.m39341a(this, null)) {
                NetworkInfo d = m39788d(network);
                if (d != null && (d.getType() == activeNetworkInfo.getType() || d.getType() == 17)) {
                    j = NetworkChangeNotifierAutoDetect.m39340a(network);
                }
            }
        }
        return j;
    }
}
