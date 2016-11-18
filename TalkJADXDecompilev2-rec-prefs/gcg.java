package p000;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import java.util.Locale;

final class gcg extends PhoneStateListener {
    final /* synthetic */ gce f14651a;
    private ServiceState f14652b;
    private SignalStrength f14653c;

    gcg(gce gce) {
        this.f14651a = gce;
    }

    private void m16921a() {
        int i = 1;
        if (this.f14652b != null && this.f14653c != null) {
            int i2;
            gce gce = this.f14651a;
            gcm a = gck.m16926a(this.f14651a.f14644b, this.f14652b.getState(), gck.m16924a(this.f14653c));
            iil.m21867a();
            boolean H = gwb.m1403H(gce.f14644b);
            if (H != gce.f14647e) {
                glk.m17979c("Babel_telephony", String.format(Locale.US, "TeleCellMonitor.updateState, (%b) -> (%b)", new Object[]{Boolean.valueOf(gce.f14647e), Boolean.valueOf(H)}), new Object[0]);
                gce.f14647e = H;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (a == null || a.equals(gce.f14646d)) {
                i = i2;
            } else {
                glk.m17979c("Babel_telephony", String.format(Locale.US, "TeleCellMonitor.updateState, (%s) -> (%s)", new Object[]{gce.f14646d, a}), new Object[0]);
                gce.f14646d = a;
            }
            if (i != 0 && gce.f14645c != null) {
                gce.f14645c.mo2253a(gce.f14646d, gce.f14647e);
            }
        }
    }

    public void onServiceStateChanged(ServiceState serviceState) {
        if (gce.f14643a) {
            String valueOf = String.valueOf(serviceState);
            new StringBuilder(String.valueOf(valueOf).length() + 57).append("TeleCellMonitor.CellStateListener.onServiceStateChanged: ").append(valueOf);
        }
        this.f14652b = serviceState;
        m16921a();
    }

    public void onSignalStrengthsChanged(SignalStrength signalStrength) {
        if (gce.f14643a) {
            String valueOf = String.valueOf(signalStrength);
            new StringBuilder(String.valueOf(valueOf).length() + 60).append("TeleCellMonitor.CellStateListener.onSignalStrengthsChanged: ").append(valueOf);
        }
        this.f14653c = signalStrength;
        m16921a();
    }
}
