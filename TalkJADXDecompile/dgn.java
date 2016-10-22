final class dgn implements Runnable {
    final /* synthetic */ dgg a;

    dgn(dgg dgg) {
        this.a = dgg;
    }

    public void run() {
        this.a.f = true;
        for (itg h : this.a.a) {
            h.h();
        }
        inx.a().a(new dgs(this.a));
    }
}
