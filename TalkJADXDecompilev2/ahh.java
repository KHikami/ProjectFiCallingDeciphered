package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

final class ahh extends BroadcastReceiver {
    final /* synthetic */ ahg a;

    ahh(ahg ahg) {
        this.a = ahg;
    }

    public void onReceive(Context context, Intent intent) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            this.a.at = false;
        } else if (!this.a.at && !this.a.s()) {
            if (!this.a.as) {
                this.a.getLoaderManager().b(2, null, this.a);
            }
            this.a.getLoaderManager().b(3, null, this.a);
            this.a.at = true;
            this.a.al.a(0);
        }
    }
}
