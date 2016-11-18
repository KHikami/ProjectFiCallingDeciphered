package p000;

final class fix implements Runnable {
    final /* synthetic */ fiw f13149a;

    fix(fiw fiw) {
        this.f13149a = fiw;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        synchronized (this.f13149a.f6777d) {
            if (fiw.f6774a) {
                this.f13149a.m9128a("Shutdown Runnable");
            }
            if (this.f13149a.f6775b > 0) {
            } else if (this.f13149a.stopSelfResult(this.f13149a.f6776c)) {
                if (fiw.f6774a) {
                    this.f13149a.m9128a("StopSelf Succeeded");
                }
                this.f13149a.m9131h();
            } else if (fiw.f6774a) {
                this.f13149a.m9128a("StopSelf Cancelled");
            }
        }
    }
}
