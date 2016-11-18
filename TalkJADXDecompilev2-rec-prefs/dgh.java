package p000;

final class dgh implements Runnable {
    final /* synthetic */ dgg f9699a;

    dgh(dgg dgg) {
        this.f9699a = dgg;
    }

    public void run() {
        int i;
        dgg dgg = this.f9699a;
        if (dgg.f9694q != null && dgg.f9694q.m11942G() && dgg.f9694q.m11943H() == 0) {
            i = 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            glk.m17981d("Babel_calls", "Leaving empty hangout on timeout.", new Object[0]);
            this.f9699a.f9694q.m11973b(11012);
        }
    }
}
