package defpackage;

/* renamed from: cfc */
final class cfc implements Runnable {
    final /* synthetic */ cdr a;

    cfc(cdr cdr) {
        this.a = cdr;
    }

    public void run() {
        cdr cdr = this.a;
        if (cdr.T()) {
            cdr.a(new cfa(cdr));
            cdr.ba.removeCallbacks(cdr.bF);
            cdr.ba.postDelayed(cdr.bF, (long) gwb.a(cdr.context, "babel_focusrenewperiodmillis", 270000));
        }
    }
}
