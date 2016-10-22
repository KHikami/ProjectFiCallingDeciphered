/* compiled from: PG */
final class aoh extends Thread {
    volatile boolean a;
    private /* synthetic */ aoe b;

    public aoh(aoe aoe) {
        this.b = aoe;
        super("ContactInfoCache.QueryThread");
        this.a = false;
    }

    public final void run() {
        int i = 0;
        while (!this.a) {
            aoi aoi = null;
            synchronized (this.b.a) {
                if (!this.b.a.isEmpty()) {
                    aoi = (aoi) this.b.a.removeFirst();
                }
            }
            if (aoi != null) {
                i = this.b.a(aoi.a, aoi.b, aoi.c) | i;
            } else {
                int i2;
                if (i != 0) {
                    this.b.f.sendEmptyMessage(1);
                    i2 = 0;
                } else {
                    i2 = i;
                }
                try {
                    synchronized (this.b.a) {
                        this.b.a.wait(1000);
                    }
                } catch (InterruptedException e) {
                }
                i = i2;
            }
        }
    }
}
