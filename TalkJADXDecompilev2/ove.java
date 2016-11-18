package defpackage;

final class ove implements Runnable {
    final /* synthetic */ ovn a;
    final /* synthetic */ ovw b;
    final /* synthetic */ oup c;

    ove(oup oup, ovn ovn, ovw ovw) {
        this.c = oup;
        this.a = ovn;
        this.b = ovw;
    }

    public void run() {
        try {
            this.a.a();
        } catch (Throwable th) {
            this.c.b(this.b, th);
        }
    }
}
