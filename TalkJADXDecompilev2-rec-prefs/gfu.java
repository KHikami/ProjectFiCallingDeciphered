package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Locale;

final class gfu extends BroadcastReceiver {
    final /* synthetic */ gfq f15183a;

    gfu(gfq gfq) {
        this.f15183a = gfq;
    }

    public void onReceive(Context context, Intent intent) {
        if (gfq.f15174a) {
            String str = "TeleWifiMonitor.Receiver.onReceive, action: ";
            String valueOf = String.valueOf(intent.getAction());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        gfq gfq = this.f15183a;
        iil.m21867a();
        gfv a = gfq.m17570a(gfq.f15175b);
        if (!a.equals(gfq.f15177d)) {
            glk.m17979c("Babel_telephony", String.format(Locale.US, "TeleWifiMonitor.updateSignalState, (%s) -> (%s)", new Object[]{gfq.f15177d, a}), new Object[0]);
            gfq.f15177d = a;
            if (gfq.f15176c != null) {
                gfq.f15176c.mo2254a(gfq.f15177d);
            }
        }
    }
}
