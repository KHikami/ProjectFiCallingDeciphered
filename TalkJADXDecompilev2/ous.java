package defpackage;

final class ous implements Runnable {
    final /* synthetic */ ovn a;
    final /* synthetic */ oup b;

    ous(oup oup, ovn ovn) {
        this.b = oup;
        this.a = ovn;
    }

    public void run() {
        try {
            this.a.a();
        } catch (Throwable th) {
            this.b.a(th);
        }
    }
}
