package p000;

final class hgd implements Runnable {
    final /* synthetic */ hga f16897a;
    final /* synthetic */ String f16898b;
    final /* synthetic */ hgc f16899c;

    hgd(hgc hgc, hga hga, String str) {
        this.f16899c = hgc;
        this.f16897a = hga;
        this.f16898b = str;
    }

    public void run() {
        if (this.f16899c.f16895c > 0) {
            this.f16897a.mo2472a(this.f16899c.f16896d != null ? this.f16899c.f16896d.getBundle(this.f16898b) : null);
        }
        if (this.f16899c.f16895c >= 2) {
            this.f16897a.mo2470a();
        }
        if (this.f16899c.f16895c >= 3) {
            this.f16897a.mo2473b();
        }
    }
}
