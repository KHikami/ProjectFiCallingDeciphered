package defpackage;

final class fru implements Runnable {
    final /* synthetic */ frq a;

    fru(frq frq) {
        this.a = frq;
    }

    public void run() {
        synchronized (this.a.f) {
            if (this.a.c) {
                return;
            }
            this.a.a(true);
        }
    }
}
