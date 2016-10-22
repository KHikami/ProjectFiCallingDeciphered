import java.util.Locale;

final class gci implements Runnable {
    final /* synthetic */ gch a;

    gci(gch gch) {
        this.a = gch;
    }

    public void run() {
        int i;
        int i2 = 1;
        gce gce = this.a.a;
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
