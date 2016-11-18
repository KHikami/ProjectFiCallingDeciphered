package p000;

final class ove implements Runnable {
    final /* synthetic */ ovn f34355a;
    final /* synthetic */ ovw f34356b;
    final /* synthetic */ oup f34357c;

    ove(oup oup, ovn ovn, ovw ovw) {
        this.f34357c = oup;
        this.f34355a = ovn;
        this.f34356b = ovw;
    }

    public void run() {
        try {
            this.f34355a.mo4235a();
        } catch (Throwable th) {
            this.f34357c.m39751b(this.f34356b, th);
        }
    }
}
