package p000;

final class csw implements Runnable {
    final /* synthetic */ dli f9014a;
    final /* synthetic */ boolean f9015b;
    final /* synthetic */ csr f9016c;

    csw(csr csr, dli dli, boolean z) {
        this.f9016c = csr;
        this.f9014a = dli;
        this.f9015b = z;
    }

    public void run() {
        this.f9014a.m12187a(this.f9015b);
    }
}
