/* compiled from: PG */
final class bdu implements Runnable {
    private /* synthetic */ bdt a;

    bdu(bdt bdt) {
        this.a = bdt;
    }

    public final void run() {
        if (this.a.m && !bcj.b().l() && bdt.a) {
            bdf.b((Object) this, "Automatically entering fullscreen mode.");
            bcj.b().a(true, false);
            this.a.m = false;
            return;
        }
        bdf.b((Object) this, "Skipping scheduled fullscreen mode.");
    }
}
