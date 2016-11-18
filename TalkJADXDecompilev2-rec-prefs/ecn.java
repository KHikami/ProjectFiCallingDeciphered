package p000;

final class ecn implements Runnable {
    final /* synthetic */ ecm f11175a;

    ecn(ecm ecm) {
        this.f11175a = ecm;
    }

    public void run() {
        boolean z;
        try {
            z = ecm.f11020p;
            Thread.sleep(2000);
            this.f11175a.m13329u();
        } catch (InterruptedException e) {
            z = ecm.f11020p;
        }
    }
}
