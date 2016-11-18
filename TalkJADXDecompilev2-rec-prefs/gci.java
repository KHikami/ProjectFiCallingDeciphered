package p000;

import java.util.Locale;

final class gci implements Runnable {
    final /* synthetic */ gch f14656a;

    gci(gch gch) {
        this.f14656a = gch;
    }

    public void run() {
        int i;
        int i2 = 1;
        gce gce = this.f14656a.f14654a;
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
