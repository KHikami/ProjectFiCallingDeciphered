package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;

final class ika extends BroadcastReceiver {
    boolean f17847a = true;
    final /* synthetic */ ijt f17848b;

    ika(ijt ijt) {
        this.f17848b = ijt;
    }

    public void onReceive(Context context, Intent intent) {
        gwb.aJ();
        if (((NetworkInfo) intent.getParcelableExtra("networkInfo")) != null && this.f17848b.m22067c()) {
            NetworkInfo activeNetworkInfo = this.f17848b.f17803b.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                this.f17847a = true;
            } else if (this.f17847a) {
                itx.m23277a(4, "vclib", "We lost our connection. Give it some time to recover then  terminate the call if it can't.");
                this.f17847a = false;
                gwb.m1864a(new ikb(this), 10000);
            }
        }
    }
}
