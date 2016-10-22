package defpackage;

/* renamed from: fix */
final class fix implements Runnable {
    final /* synthetic */ fiw a;

    fix(fiw fiw) {
        this.a = fiw;
    }

    public void run() {
        synchronized (this.a.d) {
            if (fiw.a) {
                this.a.a("Shutdown Runnable");
            }
            if (this.a.b > 0) {
                return;
            }
            if (this.a.stopSelfResult(this.a.c)) {
                if (fiw.a) {
                    this.a.a("StopSelf Succeeded");
                }
                this.a.h();
            } else if (fiw.a) {
                this.a.a("StopSelf Cancelled");
            }
        }
    }
}
