package defpackage;

import android.content.IntentFilter;

public final class owf extends IntentFilter {
    public owf(boolean z) {
        addAction("android.net.conn.CONNECTIVITY_CHANGE");
        if (z) {
            addAction("android.net.wifi.RSSI_CHANGED");
        }
    }
}
