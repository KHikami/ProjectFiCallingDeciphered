package p000;

final class hgl implements Runnable {
    final /* synthetic */ hga f16910a;
    final /* synthetic */ String f16911b;
    final /* synthetic */ hgk f16912c;

    hgl(hgk hgk, hga hga, String str) {
        this.f16912c = hgk;
        this.f16910a = hga;
        this.f16911b = str;
    }

    public void run() {
        if (this.f16912c.f16908c > 0) {
            this.f16910a.mo2472a(this.f16912c.f16909d != null ? this.f16912c.f16909d.getBundle(this.f16911b) : null);
        }
        if (this.f16912c.f16908c >= 2) {
            this.f16910a.mo2470a();
        }
        if (this.f16912c.f16908c >= 3) {
            this.f16910a.mo2473b();
        }
    }
}
