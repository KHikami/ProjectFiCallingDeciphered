package p000;

import java.util.Locale;

final class gft implements Runnable {
    final /* synthetic */ gfs f15182a;

    gft(gfs gfs) {
        this.f15182a = gfs;
    }

    public void run() {
        gfq gfq = this.f15182a.f15180a;
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
