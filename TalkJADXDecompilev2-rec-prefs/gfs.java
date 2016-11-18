package p000;

import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.os.Handler;

final class gfs extends NetworkCallback {
    final /* synthetic */ gfq f15180a;
    private final Handler f15181b = new Handler();

    gfs(gfq gfq) {
        this.f15180a = gfq;
    }

    public void onAvailable(Network network) {
        glk.m17979c("Babel_telephony", "TeleWifiMonitor.NetworkCallback.onAvailable", new Object[0]);
        m17573a();
    }

    public void onLosing(Network network, int i) {
        glk.m17979c("Babel_telephony", "TeleWifiMonitor.NetworkCallback.onLosing", new Object[0]);
        m17573a();
    }

    public void onLost(Network network) {
        glk.m17979c("Babel_telephony", "TeleWifiMonitor.NetworkCallback.onLost", new Object[0]);
        m17573a();
    }

    private void m17573a() {
        this.f15181b.post(new gft(this));
    }
}
