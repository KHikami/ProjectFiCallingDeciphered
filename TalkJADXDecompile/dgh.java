final class dgh implements Runnable {
    final /* synthetic */ dgg a;

    dgh(dgg dgg) {
        this.a = dgg;
    }

    public void run() {
        int i;
        dgg dgg = this.a;
        if (dgg.q != null && dgg.q.G() && dgg.q.H() == 0) {
            i = 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            glk.d("Babel_calls", "Leaving empty hangout on timeout.", new Object[0]);
            this.a.q.b(11012);
        }
    }
}
