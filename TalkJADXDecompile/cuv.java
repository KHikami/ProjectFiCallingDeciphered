import java.util.Iterator;

final class cuv implements Runnable {
    final /* synthetic */ cus a;

    cuv(cus cus) {
        this.a = cus;
    }

    public void run() {
        this.a.k.removeCallbacks(this.a.o);
        boolean z = this.a.f > 0;
        itd t = this.a.t();
        if (z && this.a.j.r() != t) {
            this.a.j.a(t);
        }
        if (t.Q_() != z) {
            t.c_(z);
        }
        if (this.a.i != z) {
            this.a.i = z;
            Iterator it = this.a.l.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
