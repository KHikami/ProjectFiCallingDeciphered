package p000;

final class iph implements Runnable {
    final /* synthetic */ ipg f18656a;

    iph(ipg ipg) {
        this.f18656a = ipg;
    }

    public void run() {
        itx.m23277a(3, "vclib", "Fetching new token...");
        if (this.f18656a.f18653j != null) {
            this.f18656a.f18647d.m21903b(this.f18656a.f18645b, this.f18656a.f18653j);
        }
        if (this.f18656a.f18652i != null) {
            itx.m23277a(5, "vclib", "Cancelling prior AuthenticationTask!");
            this.f18656a.f18652i.cancel(true);
        }
        this.f18656a.f18652i = new ipj(this.f18656a);
        this.f18656a.f18652i.m4950b(new Void[0]);
        gwb.m1864a((Runnable) this, ipg.f18644a);
    }
}
