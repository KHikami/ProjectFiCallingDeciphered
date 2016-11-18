package p000;

import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.os.Handler;

final class gch extends NetworkCallback {
    final /* synthetic */ gce f14654a;
    private final Handler f14655b = new Handler();

    gch(gce gce) {
        this.f14654a = gce;
    }

    public void onAvailable(Network network) {
        glk.m17979c("Babel_telephony", "TeleCellMonitor.NetworkCallback.onAvailable", new Object[0]);
        m16922a();
    }

    public void onLosing(Network network, int i) {
        glk.m17979c("Babel_telephony", "TeleCellMonitor.NetworkCallback.onLosing", new Object[0]);
        m16922a();
    }

    public void onLost(Network network) {
        glk.m17979c("Babel_telephony", "TeleCellMonitor.NetworkCallback.onLost", new Object[0]);
        m16922a();
    }

    private void m16922a() {
        this.f14655b.post(new gci(this));
    }
}
