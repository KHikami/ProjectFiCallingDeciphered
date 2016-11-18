package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import java.util.Locale;

final class gcg extends PhoneStateListener {
    final /* synthetic */ gce a;
    private ServiceState b;
    private SignalStrength c;

    gcg(gce gce) {
        this.a = gce;
    }

    private void a() {
        int i = 1;
        if (this.b != null && this.c != null) {
            int i2;
            gce gce = this.a;
            gcm a = gck.a(this.a.b, this.b.getState(), gck.a(this.c));
            iil.a();
            boolean H = gwb.H(gce.b);
            if (H != gce.e) {
                glk.c("Babel_telephony", String.format(Locale.US, "TeleCellMonitor.updateState, (%b) -> (%b)", new Object[]{Boolean.valueOf(gce.e), Boolean.valueOf(H)}), new Object[0]);
                gce.e = H;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (a == null || a.equals(gce.d)) {
                i = i2;
            } else {
                glk.c("Babel_telephony", String.format(Locale.US, "TeleCellMonitor.updateState, (%s) -> (%s)", new Object[]{gce.d, a}), new Object[0]);
                gce.d = a;
            }
            if (i != 0 && gce.c != null) {
                gce.c.a(gce.d, gce.e);
            }
        }
    }

    public void onServiceStateChanged(ServiceState serviceState) {
        if (gce.a) {
            String valueOf = String.valueOf(serviceState);
            new StringBuilder(String.valueOf(valueOf).length() + 57).append("TeleCellMonitor.CellStateListener.onServiceStateChanged: ").append(valueOf);
        }
        this.b = serviceState;
        a();
    }

    public void onSignalStrengthsChanged(SignalStrength signalStrength) {
        if (gce.a) {
            String valueOf = String.valueOf(signalStrength);
            new StringBuilder(String.valueOf(valueOf).length() + 60).append("TeleCellMonitor.CellStateListener.onSignalStrengthsChanged: ").append(valueOf);
        }
        this.c = signalStrength;
        a();
    }
}
