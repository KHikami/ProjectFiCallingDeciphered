import java.util.Locale;

final class gft implements Runnable {
    final /* synthetic */ gfs a;

    gft(gfs gfs) {
        this.a = gfs;
    }

    public void run() {
        gfq gfq = this.a.a;
        iil.a();
        gfv a = gfq.a(gfq.b);
        if (!a.equals(gfq.d)) {
            glk.c("Babel_telephony", String.format(Locale.US, "TeleWifiMonitor.updateSignalState, (%s) -> (%s)", new Object[]{gfq.d, a}), new Object[0]);
            gfq.d = a;
            if (gfq.c != null) {
                gfq.c.a(gfq.d);
            }
        }
    }
}
