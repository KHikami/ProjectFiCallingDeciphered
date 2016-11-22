import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.NetworkRequest;
import android.net.NetworkRequest.Builder;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

final class gfq {//Wifi Cell creator?
    static final boolean a;
    final Context b;
    gfr c; //gfj.a called if not null, which means connected to wifi
    gfv d;
    private BroadcastReceiver e;
    private NetworkCallback f;

    static {
        kae kae = glk.s;
        a = false;
    }

    static gfv a(Context context) {
        if (!gwb.I(context)) {//if not have wifi network and wifi network info => create new default wifi cell
            return new gfv(false, 0, 0);
        }
        WifiInfo connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();

        //uses wifiManager to create new wifi cell
        return new gfv(true, WifiManager.calculateSignalLevel(connectionInfo.getRssi(), 100), connectionInfo.getLinkSpeed());
    }

    gfq(Context context) {
        this.b = context;
    }

    // binds the TeleWiFiMonitor receiver!!!!!
    void a(gfr gfr) {
        iil.a();
        this.c = gfr;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.net.wifi.RSSI_CHANGED");
        this.e = new gfu(this);
        this.b.registerReceiver(this.e, intentFilter);  // bound TeleWifiMonitor BR
        NetworkRequest build = new Builder().addTransportType(1).build();
        this.f = new gfs(this);
        try {
            ((ConnectivityManager) this.b.getSystemService("connectivity")).registerNetworkCallback(build, this.f);
        } catch (NoSuchMethodError e) {
            String valueOf = String.valueOf(e);
            glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 32).append("registerNetworkCallback failed, ").append(valueOf).toString(), new Object[0]);
        }
    }

    void a() {
        String valueOf;
        this.c = null;
        try {
            this.b.unregisterReceiver(this.e);
            ((ConnectivityManager) this.b.getSystemService("connectivity")).unregisterNetworkCallback(this.f);
        } catch (IllegalArgumentException e) {
            valueOf = String.valueOf(e);
            glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 27).append("unregisterReceiver failed, ").append(valueOf).toString(), new Object[0]);
        } catch (NoSuchMethodError e2) {
            valueOf = String.valueOf(e2);
            glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 34).append("unregisterNetworkCallback failed, ").append(valueOf).toString(), new Object[0]);
        }
    }
}
