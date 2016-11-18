package p000;

final class ikb implements Runnable {
    final /* synthetic */ ika f17849a;

    ikb(ika ika) {
        this.f17849a = ika;
    }

    public void run() {
        if (!this.f17849a.f17847a) {
            itx.m23277a(4, "vclib", "We still don't have a connection after 10 seconds. Terminate the call");
            ijt ijt = this.f17849a.f17848b;
            if (ijt.m22022a(ijt.f17804c)) {
                ijt.f17804c.m22126c(3);
                ijt.m22031a(11003);
            }
        }
    }
}
