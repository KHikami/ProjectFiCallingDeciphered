package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.NetworkRequest;
import android.net.NetworkRequest.Builder;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

final class gfq {
    static final boolean f15174a = false;
    final Context f15175b;
    gfr f15176c;
    gfv f15177d;
    private BroadcastReceiver f15178e;
    private NetworkCallback f15179f;

    static {
        kae kae = glk.f15572s;
    }

    static gfv m17570a(Context context) {
        if (!gwb.m1407I(context)) {
            return new gfv(false, 0, 0);
        }
        WifiInfo connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
        return new gfv(true, WifiManager.calculateSignalLevel(connectionInfo.getRssi(), 100), connectionInfo.getLinkSpeed());
    }

    gfq(Context context) {
        this.f15175b = context;
    }

    void m17572a(gfr gfr) {
        iil.m21867a();
        this.f15176c = gfr;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.net.wifi.RSSI_CHANGED");
        this.f15178e = new gfu(this);
        this.f15175b.registerReceiver(this.f15178e, intentFilter);
        NetworkRequest build = new Builder().addTransportType(1).build();
        this.f15179f = new gfs(this);
        try {
            ((ConnectivityManager) this.f15175b.getSystemService("connectivity")).registerNetworkCallback(build, this.f15179f);
        } catch (NoSuchMethodError e) {
            String valueOf = String.valueOf(e);
            glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 32).append("registerNetworkCallback failed, ").append(valueOf).toString(), new Object[0]);
        }
    }

    void m17571a() {
        String valueOf;
        this.f15176c = null;
        try {
            this.f15175b.unregisterReceiver(this.f15178e);
            ((ConnectivityManager) this.f15175b.getSystemService("connectivity")).unregisterNetworkCallback(this.f15179f);
        } catch (IllegalArgumentException e) {
            valueOf = String.valueOf(e);
            glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 27).append("unregisterReceiver failed, ").append(valueOf).toString(), new Object[0]);
        } catch (NoSuchMethodError e2) {
            valueOf = String.valueOf(e2);
            glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 34).append("unregisterNetworkCallback failed, ").append(valueOf).toString(), new Object[0]);
        }
    }
}
