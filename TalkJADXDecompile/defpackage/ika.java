package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;

/* renamed from: ika */
final class ika extends BroadcastReceiver {
    boolean a;
    final /* synthetic */ ijt b;

    ika(ijt ijt) {
        this.b = ijt;
        this.a = true;
    }

    public void onReceive(Context context, Intent intent) {
        gwb.aJ();
        if (((NetworkInfo) intent.getParcelableExtra("networkInfo")) != null && this.b.c()) {
            NetworkInfo activeNetworkInfo = this.b.b.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                this.a = true;
            } else if (this.a) {
                itx.a(4, "vclib", "We lost our connection. Give it some time to recover then  terminate the call if it can't.");
                this.a = false;
                gwb.a(new ikb(this), 10000);
            }
        }
    }
}
