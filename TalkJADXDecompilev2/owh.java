package defpackage;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import org.chromium.base.metrics.RecordHistogram;
import org.chromium.net.AndroidNetworkLibrary;

public final class owh {
    private final Context a;
    private final WifiManager b;
    private final boolean c;

    public owh(Context context) {
        this.a = context;
        this.c = this.a.getPackageManager().checkPermission("android.permission.ACCESS_WIFI_STATE", this.a.getPackageName()) == 0;
        this.b = this.c ? (WifiManager) this.a.getSystemService("wifi") : null;
    }

    owh() {
        this.a = null;
        this.b = null;
        this.c = false;
    }

    public String a() {
        return AndroidNetworkLibrary.getWifiSSID(this.a);
    }

    private WifiInfo d() {
        WifiInfo connectionInfo;
        try {
            connectionInfo = this.b.getConnectionInfo();
            RecordHistogram.a("NCN.getWifiInfo1stSuccess", true);
            return connectionInfo;
        } catch (NullPointerException e) {
            RecordHistogram.a("NCN.getWifiInfo1stSuccess", false);
            try {
                connectionInfo = this.b.getConnectionInfo();
                RecordHistogram.a("NCN.getWifiInfo2ndSuccess", true);
                return connectionInfo;
            } catch (NullPointerException e2) {
                RecordHistogram.a("NCN.getWifiInfo2ndSuccess", false);
                return null;
            }
        }
    }

    public int b() {
        if (!this.c || this.b == null) {
            return -1;
        }
        WifiInfo d = d();
        if (d != null) {
            return d.getLinkSpeed();
        }
        return -1;
    }

    public boolean c() {
        return this.c;
    }
}
