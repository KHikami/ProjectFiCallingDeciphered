import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.os.Handler;

final class gch extends NetworkCallback {
    final /* synthetic */ gce a;
    private final Handler b;

    gch(gce gce) {
        this.a = gce;
        this.b = new Handler();
    }

    public void onAvailable(Network network) {
        glk.c("Babel_telephony", "TeleCellMonitor.NetworkCallback.onAvailable", new Object[0]);
        a();
    }

    public void onLosing(Network network, int i) {
        glk.c("Babel_telephony", "TeleCellMonitor.NetworkCallback.onLosing", new Object[0]);
        a();
    }

    public void onLost(Network network) {
        glk.c("Babel_telephony", "TeleCellMonitor.NetworkCallback.onLost", new Object[0]);
        a();
    }

    private void a() {
        this.b.post(new gci(this));
    }
}
