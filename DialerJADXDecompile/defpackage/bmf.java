package defpackage;

/* renamed from: bmf */
final class bmf implements Runnable {
    private /* synthetic */ bme a;

    bmf(bme bme) {
        this.a = bme;
    }

    public final void run() {
        if (!this.a.d.stopSelfResult(this.a.a)) {
            return;
        }
        if (btq.a) {
            this.a.c.b("Device AnalyticsService processed last dispatch request");
        } else {
            this.a.c.b("Local AnalyticsService processed last dispatch request");
        }
    }
}
