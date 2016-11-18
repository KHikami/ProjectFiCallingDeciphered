package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.NetworkRequest;
import android.net.NetworkRequest.Builder;
import android.telephony.TelephonyManager;

final class gce {
    static final boolean a = false;
    final Context b;
    gcf c;
    gcm d;
    boolean e;
    private BroadcastReceiver f;
    private gcg g;
    private NetworkCallback h;

    static {
        kae kae = glk.s;
    }

    gce(Context context) {
        this.b = context;
        this.e = gwb.H(context);
    }

    void a(gcf gcf) {
        glk.c("Babel_telephony", "TeleCellMonitor.register", new Object[0]);
        iil.a();
        this.c = gcf;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.f = new gcj(this);
        this.b.registerReceiver(this.f, intentFilter);
        TelephonyManager telephonyManager = (TelephonyManager) this.b.getSystemService("phone");
        this.g = new gcg(this);
        telephonyManager.listen(this.g, 257);
        NetworkRequest build = new Builder().addTransportType(0).build();
        this.h = new gch(this);
        ((ConnectivityManager) this.b.getSystemService("connectivity")).registerNetworkCallback(build, this.h);
    }

    void a() {
        this.c = null;
        ((TelephonyManager) this.b.getSystemService("phone")).listen(this.g, 0);
        try {
            this.b.unregisterReceiver(this.f);
            ((ConnectivityManager) this.b.getSystemService("connectivity")).unregisterNetworkCallback(this.h);
        } catch (IllegalArgumentException e) {
            String valueOf = String.valueOf(e);
            glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 27).append("unregisterReceiver failed, ").append(valueOf).toString(), new Object[0]);
        }
    }

    public gcm b() {
        return this.d;
    }
}
