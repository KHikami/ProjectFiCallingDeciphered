package p000;

final class dgn implements Runnable {
    final /* synthetic */ dgg f9706a;

    dgn(dgg dgg) {
        this.f9706a = dgg;
    }

    public void run() {
        this.f9706a.f9683f = true;
        for (itg h : this.f9706a.f9678a) {
            h.mo1570h();
        }
        inx.m22408a().m22412a(new dgs(this.f9706a));
    }
}
