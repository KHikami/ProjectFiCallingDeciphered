package p000;

final class fru implements Runnable {
    final /* synthetic */ frq f13853a;

    fru(frq frq) {
        this.f13853a = frq;
    }

    public void run() {
        synchronized (this.f13853a.f13834f) {
            if (this.f13853a.f13831c) {
                return;
            }
            this.f13853a.m16067a(true);
        }
    }
}
