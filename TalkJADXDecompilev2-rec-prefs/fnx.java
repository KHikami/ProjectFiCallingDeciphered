package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;

public final class fnx extends BroadcastReceiver implements Runnable {
    private final fyb f13549a;
    private long f13550b = 0;
    private volatile long f13551c;
    private final RequestWriter f13552d;
    private final jyn f13553e;

    public fnx(jyn jyn, RequestWriter requestWriter) {
        this.f13552d = requestWriter;
        this.f13553e = jyn;
        this.f13549a = new fyb();
        this.f13551c = ((biw) this.f13553e.m25443a(biw.class)).mo561a("babel_retry_on_network_connectivity_ms", 300000);
        gwb.m2214g(gwb.m1400H()).mo563a(this);
    }

    public void run() {
        this.f13551c = ((biw) this.f13553e.m25443a(biw.class)).mo561a("babel_retry_on_network_connectivity_ms", 300000);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            int intExtra;
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (VERSION.SDK_INT >= 17) {
                intExtra = intent.getIntExtra("networkType", -1);
            } else {
                NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                intExtra = networkInfo != null ? networkInfo.getType() : -1;
            }
            if (intExtra == 2) {
                synchronized (fxz.f14346b) {
                    if (fxz.f14346b.f14349a <= 0) {
                        glk.m17979c("Babel_SMS", "MmsSendReceiveManager: no sender, skip checking", new Object[0]);
                    }
                }
            } else if (this.f13550b + this.f13551c < glj.m17963b()) {
                NetworkInfo networkInfo2 = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                if (networkInfo2.isConnected()) {
                    String valueOf = String.valueOf(networkInfo2.getDetailedState());
                    new StringBuilder(String.valueOf(valueOf).length() + 43).append("Connected Type: ").append(intExtra).append(" detailedState: ").append(valueOf);
                    this.f13552d.m9151a(500);
                    this.f13550b = glj.m17963b();
                }
            }
        }
    }
}
