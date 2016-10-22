package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.os.Build.VERSION;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;

/* renamed from: fnx */
public final class fnx extends BroadcastReceiver implements Runnable {
    private final fyb a;
    private long b;
    private volatile long c;
    private final RequestWriter d;
    private final jyn e;

    public fnx(jyn jyn, RequestWriter requestWriter) {
        this.b = 0;
        this.d = requestWriter;
        this.e = jyn;
        this.a = new fyb();
        this.c = ((biw) this.e.a(biw.class)).a("babel_retry_on_network_connectivity_ms", 300000);
        gwb.g(gwb.H()).a(this);
    }

    public void run() {
        this.c = ((biw) this.e.a(biw.class)).a("babel_retry_on_network_connectivity_ms", 300000);
    }

    public void onReceive(Context context, Intent intent) {
        String valueOf;
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            int intExtra;
            NetworkInfo networkInfo;
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (VERSION.SDK_INT >= 17) {
                intExtra = intent.getIntExtra("networkType", -1);
            } else {
                networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                intExtra = networkInfo != null ? networkInfo.getType() : -1;
            }
            if (intExtra == 2) {
                synchronized (fxz.b) {
                    if (fxz.b.a <= 0) {
                        glk.c("Babel_SMS", "MmsSendReceiveManager: no sender, skip checking", new Object[0]);
                        return;
                    }
                    networkInfo = connectivityManager.getNetworkInfo(2);
                    if (networkInfo != null) {
                        String valueOf2 = String.valueOf(networkInfo);
                        glk.c("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 47).append("MmsSendReceiveManager: MMS connectivity change ").append(valueOf2).toString(), new Object[0]);
                        if ("2GVoiceCallEnded".equals(networkInfo.getReason())) {
                            try {
                                synchronized (fxz.b) {
                                    fxz.a(context);
                                }
                            } catch (ahz e) {
                                valueOf = String.valueOf(e);
                                glk.e("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 53).append("MmsSendReceiveManager.ConnectivityBroadcastReceiver: ").append(valueOf).toString(), new Object[0]);
                            }
                        } else if (networkInfo.getState() == State.CONNECTED) {
                            fzo a = fzo.a(context, networkInfo.getExtraInfo());
                            if (a.b()) {
                                synchronized (fxz.b) {
                                    fxz.b.b();
                                    fxz.b.d = a;
                                }
                            }
                        } else if (networkInfo.getState() == State.DISCONNECTED && !fxz.a(connectivityManager)) {
                            synchronized (fxz.b) {
                                fyc fyc = fxz.b;
                                fyc.a(false, new fxy(123, "Mobile data is disabled and can not connect MMS"));
                                fxz.b.d = null;
                            }
                        } else if (networkInfo.isAvailable()) {
                            try {
                                synchronized (fxz.b) {
                                    fxz.a(context);
                                }
                            } catch (ahz e2) {
                                valueOf = String.valueOf(e2);
                                glk.e("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 53).append("MmsSendReceiveManager.ConnectivityBroadcastReceiver: ").append(valueOf).toString(), new Object[0]);
                            }
                        }
                    }
                }
            } else if (this.b + this.c < glj.b()) {
                NetworkInfo networkInfo2 = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                if (networkInfo2.isConnected()) {
                    valueOf = String.valueOf(networkInfo2.getDetailedState());
                    new StringBuilder(String.valueOf(valueOf).length() + 43).append("Connected Type: ").append(intExtra).append(" detailedState: ").append(valueOf);
                    this.d.a(500);
                    this.b = glj.b();
                }
            }
        }
    }
}
