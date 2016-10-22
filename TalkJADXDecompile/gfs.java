import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.os.Handler;

final class gfs extends NetworkCallback {
    final /* synthetic */ gfq a;
    private final Handler b;

    gfs(gfq gfq) {
        this.a = gfq;
        this.b = new Handler();
    }

    public void onAvailable(Network network) {
        glk.c("Babel_telephony", "TeleWifiMonitor.NetworkCallback.onAvailable", new Object[0]);
        a();
    }

    public void onLosing(Network network, int i) {
        glk.c("Babel_telephony", "TeleWifiMonitor.NetworkCallback.onLosing", new Object[0]);
        a();
    }

    public void onLost(Network network) {
        glk.c("Babel_telephony", "TeleWifiMonitor.NetworkCallback.onLost", new Object[0]);
        a();
    }

    private void a() {
        this.b.post(new gft(this));
    }
}
