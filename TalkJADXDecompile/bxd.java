final class bxd implements Runnable {
    final /* synthetic */ edo a;
    final /* synthetic */ bxb b;

    bxd(bxb bxb, edo edo) {
        this.b = bxb;
        this.a = edo;
    }

    public void run() {
        bxh d = this.b.d(this.a);
        d.c = null;
        if (d.b) {
            boolean z;
            d.b = false;
            bxb bxb = this.b;
            if (d.a) {
                z = false;
            } else {
                z = true;
            }
            long j = d.d;
            bxb.b.d(false);
            if (z) {
                int a = bxb.a(j);
                if (a > 0) {
                    bxb.b.f(a);
                }
            }
        }
    }
}
