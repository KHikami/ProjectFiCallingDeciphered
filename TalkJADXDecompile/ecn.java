final class ecn implements Runnable {
    final /* synthetic */ ecm a;

    ecn(ecm ecm) {
        this.a = ecm;
    }

    public void run() {
        boolean z;
        try {
            z = ecm.p;
            Thread.sleep(2000);
            this.a.u();
        } catch (InterruptedException e) {
            z = ecm.p;
        }
    }
}
