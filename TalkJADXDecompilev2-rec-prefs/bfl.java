package p000;

final class bfl implements Runnable {
    final /* synthetic */ beq f3213a;
    final /* synthetic */ bfk f3214b;

    bfl(bfk bfk, beq beq) {
        this.f3214b = bfk;
        this.f3213a = beq;
    }

    public void run() {
        bfj bfj = this.f3214b.f3212b;
        beq beq = this.f3213a;
        if (beq == null) {
            bfj.f3206e.mo2102b(bfj.f3203b.getString(ba.gE));
            bfj.f3206e.m5122a(new bfm(bfj));
            return;
        }
        bfj.f3206e.a_(true);
        bfj.f3206e.mo2102b(bfj.f3203b.getString(ba.gF, new Object[]{glq.m18033h(bfj.f3203b, beq.m5011c())}));
        bfj.f3206e.m5122a(new bfo(bfj, beq, gwb.m1530a(bfj.f3203b, bfj.f3210i, bfj, beq.m5011c())));
    }
}
