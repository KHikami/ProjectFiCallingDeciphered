package p000;

final class cfc implements Runnable {
    final /* synthetic */ cdr f5162a;

    cfc(cdr cdr) {
        this.f5162a = cdr;
    }

    public void run() {
        cdr cdr = this.f5162a;
        if (cdr.m7366T()) {
            cdr.m7381a(new cfa(cdr));
            cdr.ba.removeCallbacks(cdr.bF);
            cdr.ba.postDelayed(cdr.bF, (long) gwb.m1492a(cdr.context, "babel_focusrenewperiodmillis", 270000));
        }
    }
}
