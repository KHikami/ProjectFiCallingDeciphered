import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Locale;

final class gcj extends BroadcastReceiver {
    final /* synthetic */ gce a;

    gcj(gce gce) {
        this.a = gce;
    }

    public void onReceive(Context context, Intent intent) {
        int i;
        int i2 = 1;
        if (gce.a) {
            String str = "TeleCellMonitor.Receiver.onReceive, action: ";
            String valueOf = String.valueOf(intent.getAction());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        gce gce = this.a;
        gcm gcm = null;
        iil.a();
        boolean H = gwb.H(gce.b);
        if (H != gce.e) {
            glk.c("Babel_telephony", String.format(Locale.US, "TeleCellMonitor.updateState, (%b) -> (%b)", new Object[]{Boolean.valueOf(gce.e), Boolean.valueOf(H)}), new Object[0]);
            gce.e = H;
            i = 1;
        } else {
            i = 0;
        }
        if (gcm == null || gcm.equals(gce.d)) {
            i2 = i;
        } else {
            glk.c("Babel_telephony", String.format(Locale.US, "TeleCellMonitor.updateState, (%s) -> (%s)", new Object[]{gce.d, gcm}), new Object[0]);
            gce.d = gcm;
        }
        if (i2 != 0 && gce.c != null) {
            gce.c.a(gce.d, gce.e);
        }
    }
}
