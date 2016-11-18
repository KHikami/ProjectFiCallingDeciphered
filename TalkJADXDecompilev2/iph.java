package defpackage;

final class iph implements Runnable {
    final /* synthetic */ ipg a;

    iph(ipg ipg) {
        this.a = ipg;
    }

    public void run() {
        itx.a(3, "vclib", "Fetching new token...");
        if (this.a.j != null) {
            this.a.d.b(this.a.b, this.a.j);
        }
        if (this.a.i != null) {
            itx.a(5, "vclib", "Cancelling prior AuthenticationTask!");
            this.a.i.cancel(true);
        }
        this.a.i = new ipj(this.a);
        this.a.i.b(new Void[0]);
        gwb.a((Runnable) this, ipg.a);
    }
}
