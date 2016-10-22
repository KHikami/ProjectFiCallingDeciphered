/* compiled from: PG */
final class dgg implements Runnable {
    private /* synthetic */ dge a;

    dgg(dge dge) {
        this.a = dge;
    }

    public final void run() {
        synchronized (this.a) {
            dge dge = this.a;
            this.a.d.execute(this.a.h);
        }
    }
}
