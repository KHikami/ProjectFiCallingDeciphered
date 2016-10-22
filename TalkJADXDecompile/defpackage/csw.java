package defpackage;

/* renamed from: csw */
final class csw implements Runnable {
    final /* synthetic */ dli a;
    final /* synthetic */ boolean b;
    final /* synthetic */ csr c;

    csw(csr csr, dli dli, boolean z) {
        this.c = csr;
        this.a = dli;
        this.b = z;
    }

    public void run() {
        this.a.a(this.b);
    }
}
