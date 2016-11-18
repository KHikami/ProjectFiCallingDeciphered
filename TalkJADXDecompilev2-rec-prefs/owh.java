package p000;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import org.chromium.base.metrics.RecordHistogram;
import org.chromium.net.AndroidNetworkLibrary;

public final class owh {
    private final Context f34434a;
    private final WifiManager f34435b;
    private final boolean f34436c;

    public owh(Context context) {
        this.f34434a = context;
        this.f34436c = this.f34434a.getPackageManager().checkPermission("android.permission.ACCESS_WIFI_STATE", this.f34434a.getPackageName()) == 0;
        this.f34435b = this.f34436c ? (WifiManager) this.f34434a.getSystemService("wifi") : null;
    }

    owh() {
        this.f34434a = null;
        this.f34435b = null;
        this.f34436c = false;
    }

    public String m39803a() {
        return AndroidNetworkLibrary.getWifiSSID(this.f34434a);
    }

    private WifiInfo m39802d() {
        WifiInfo connectionInfo;
        try {
            connectionInfo = this.f34435b.getConnectionInfo();
            RecordHistogram.a("NCN.getWifiInfo1stSuccess", true);
            return connectionInfo;
        } catch (NullPointerException e) {
            RecordHistogram.a("NCN.getWifiInfo1stSuccess", false);
            try {
                connectionInfo = this.f34435b.getConnectionInfo();
                RecordHistogram.a("NCN.getWifiInfo2ndSuccess", true);
                return connectionInfo;
            } catch (NullPointerException e2) {
                RecordHistogram.a("NCN.getWifiInfo2ndSuccess", false);
                return null;
            }
        }
    }

    public int m39804b() {
        if (!this.f34436c || this.f34435b == null) {
            return -1;
        }
        WifiInfo d = m39802d();
        if (d != null) {
            return d.getLinkSpeed();
        }
        return -1;
    }

    public boolean m39805c() {
        return this.f34436c;
    }
}
