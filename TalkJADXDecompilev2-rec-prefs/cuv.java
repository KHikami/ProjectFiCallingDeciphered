package p000;

import java.util.Iterator;

final class cuv implements Runnable {
    final /* synthetic */ cus f9145a;

    cuv(cus cus) {
        this.f9145a = cus;
    }

    public void run() {
        this.f9145a.f9134k.removeCallbacks(this.f9145a.f9138o);
        boolean z = this.f9145a.f9129f > 0;
        itd t = this.f9145a.m11075t();
        if (z && this.f9145a.f9133j.mo3227r() != t) {
            this.f9145a.f9133j.mo3215a(t);
        }
        if (t.Q_() != z) {
            t.c_(z);
        }
        if (this.f9145a.f9132i != z) {
            this.f9145a.f9132i = z;
            Iterator it = this.f9145a.f9135l.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
