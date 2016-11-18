package p000;

final class ovf implements Runnable {
    final /* synthetic */ ovn f34358a;
    final /* synthetic */ ovw f34359b;
    final /* synthetic */ oup f34360c;

    ovf(oup oup, ovn ovn, ovw ovw) {
        this.f34360c = oup;
        this.f34358a = ovn;
        this.f34359b = ovw;
    }

    public void run() {
        try {
            this.f34358a.mo4235a();
        } catch (Throwable th) {
            this.f34360c.m39748a(this.f34359b, th);
        }
    }
}
