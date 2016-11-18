package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.NetworkRequest;
import android.net.NetworkRequest.Builder;
import android.telephony.TelephonyManager;

final class gce {
    static final boolean f14643a = false;
    final Context f14644b;
    gcf f14645c;
    gcm f14646d;
    boolean f14647e;
    private BroadcastReceiver f14648f;
    private gcg f14649g;
    private NetworkCallback f14650h;

    static {
        kae kae = glk.f15572s;
    }

    gce(Context context) {
        this.f14644b = context;
        this.f14647e = gwb.m1403H(context);
    }

    void m16918a(gcf gcf) {
        glk.m17979c("Babel_telephony", "TeleCellMonitor.register", new Object[0]);
        iil.m21867a();
        this.f14645c = gcf;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.f14648f = new gcj(this);
        this.f14644b.registerReceiver(this.f14648f, intentFilter);
        TelephonyManager telephonyManager = (TelephonyManager) this.f14644b.getSystemService("phone");
        this.f14649g = new gcg(this);
        telephonyManager.listen(this.f14649g, 257);
        NetworkRequest build = new Builder().addTransportType(0).build();
        this.f14650h = new gch(this);
        ((ConnectivityManager) this.f14644b.getSystemService("connectivity")).registerNetworkCallback(build, this.f14650h);
    }

    void m16917a() {
        this.f14645c = null;
        ((TelephonyManager) this.f14644b.getSystemService("phone")).listen(this.f14649g, 0);
        try {
            this.f14644b.unregisterReceiver(this.f14648f);
            ((ConnectivityManager) this.f14644b.getSystemService("connectivity")).unregisterNetworkCallback(this.f14650h);
        } catch (IllegalArgumentException e) {
            String valueOf = String.valueOf(e);
            glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 27).append("unregisterReceiver failed, ").append(valueOf).toString(), new Object[0]);
        }
    }

    public gcm m16919b() {
        return this.f14646d;
    }
}
