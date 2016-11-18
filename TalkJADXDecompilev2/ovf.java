package defpackage;

final class ovf implements Runnable {
    final /* synthetic */ ovn a;
    final /* synthetic */ ovw b;
    final /* synthetic */ oup c;

    ovf(oup oup, ovn ovn, ovw ovw) {
        this.c = oup;
        this.a = ovn;
        this.b = ovw;
    }

    public void run() {
        try {
            this.a.a();
        } catch (Throwable th) {
            this.c.a(this.b, th);
        }
    }
}
