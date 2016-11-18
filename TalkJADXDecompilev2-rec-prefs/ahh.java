package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

final class ahh extends BroadcastReceiver {
    final /* synthetic */ ahg f773a;

    ahh(ahg ahg) {
        this.f773a = ahg;
    }

    public void onReceive(Context context, Intent intent) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            this.f773a.at = false;
        } else if (!this.f773a.at && !this.f773a.m1268s()) {
            if (!this.f773a.as) {
                this.f773a.getLoaderManager().mo1998b(2, null, this.f773a);
            }
            this.f773a.getLoaderManager().mo1998b(3, null, this.f773a);
            this.f773a.at = true;
            this.f773a.al.m1361a(0);
        }
    }
}
