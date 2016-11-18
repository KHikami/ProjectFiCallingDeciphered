package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Locale;

final class gcj extends BroadcastReceiver {
    final /* synthetic */ gce f14657a;

    gcj(gce gce) {
        this.f14657a = gce;
    }

    public void onReceive(Context context, Intent intent) {
        int i;
        int i2 = 1;
        if (gce.f14643a) {
            String str = "TeleCellMonitor.Receiver.onReceive, action: ";
            String valueOf = String.valueOf(intent.getAction());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        gce gce = this.f14657a;
        gcm gcm = null;
        iil.m21867a();
        boolean H = gwb.m1403H(gce.f14644b);
        if (H != gce.f14647e) {
            glk.m17979c("Babel_telephony", String.format(Locale.US, "TeleCellMonitor.updateState, (%b) -> (%b)", new Object[]{Boolean.valueOf(gce.f14647e), Boolean.valueOf(H)}), new Object[0]);
            gce.f14647e = H;
            i = 1;
        } else {
            i = 0;
        }
        if (gcm == null || gcm.equals(gce.f14646d)) {
            i2 = i;
        } else {
            glk.m17979c("Babel_telephony", String.format(Locale.US, "TeleCellMonitor.updateState, (%s) -> (%s)", new Object[]{gce.f14646d, gcm}), new Object[0]);
            gce.f14646d = gcm;
        }
        if (i2 != 0 && gce.f14645c != null) {
            gce.f14645c.mo2253a(gce.f14646d, gce.f14647e);
        }
    }
}
