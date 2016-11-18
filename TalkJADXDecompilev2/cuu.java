package defpackage;

final class cuu implements Runnable {
    final /* synthetic */ cus a;

    cuu(cus cus) {
        this.a = cus;
    }

    public void run() {
        boolean z = true;
        this.a.k.removeCallbacks(this.a.n);
        boolean z2 = this.a.e > 0 && !this.a.g;
        itc t = this.a.t();
        if (this.a.j.q() == t && t.b() != z2) {
            t.a(z2);
        }
        if (!this.a.g || z2) {
            z = false;
        }
        if (this.a.h != z) {
            this.a.h = z;
            for (cuz b : this.a.l) {
                b.b(z);
            }
        }
    }
}
