package p000;

final class hdd implements Runnable {
    final /* synthetic */ hdc f16686a;

    hdd(hdc hdc) {
        this.f16686a = hdc;
    }

    public void run() {
        synchronized (this.f16686a.f16680g) {
            if (this.f16686a.f16681h <= this.f16686a.f16678e.mo2413b() && this.f16686a.f16684k != null) {
                this.f16686a.f16684k.mo2523d();
                this.f16686a.f16684k = null;
            }
        }
    }
}
