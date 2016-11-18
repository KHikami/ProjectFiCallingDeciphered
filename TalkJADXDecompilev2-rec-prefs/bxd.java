package p000;

final class bxd implements Runnable {
    final /* synthetic */ edo f4720a;
    final /* synthetic */ bxb f4721b;

    bxd(bxb bxb, edo edo) {
        this.f4721b = bxb;
        this.f4720a = edo;
    }

    public void run() {
        bxh d = this.f4721b.m6871d(this.f4720a);
        d.f4727c = null;
        if (d.f4726b) {
            boolean z;
            d.f4726b = false;
            bxb bxb = this.f4721b;
            if (d.f4725a) {
                z = false;
            } else {
                z = true;
            }
            long j = d.f4728d;
            bxb.f4712b.m6691d(false);
            if (z) {
                int a = bxb.m6864a(j);
                if (a > 0) {
                    bxb.f4712b.m6693f(a);
                }
            }
        }
    }
}
