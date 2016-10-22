package defpackage;

/* renamed from: cut */
final class cut implements Runnable {
    final /* synthetic */ cus a;

    cut(cus cus) {
        this.a = cus;
    }

    public void run() {
        boolean z = true;
        this.a.k.removeCallbacks(this.a.m);
        boolean z2 = this.a.a > 0 && !this.a.b;
        ito s = this.a.s();
        if (this.a.j.p() == s && s.g() != z2 && this.a.g() && this.a.m()) {
            s.a(z2);
        }
        if (!this.a.b || z2) {
            z = false;
        }
        if (this.a.c != z) {
            this.a.c = z;
            for (cuz a : this.a.l) {
                a.a(z);
            }
        }
    }
}
