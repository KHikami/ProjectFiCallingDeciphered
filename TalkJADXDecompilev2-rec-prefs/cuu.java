package p000;

final class cuu implements Runnable {
    final /* synthetic */ cus f9144a;

    cuu(cus cus) {
        this.f9144a = cus;
    }

    public void run() {
        boolean z = true;
        this.f9144a.f9134k.removeCallbacks(this.f9144a.f9137n);
        boolean z2 = this.f9144a.f9128e > 0 && !this.f9144a.f9130g;
        itc t = this.f9144a.m11075t();
        if (this.f9144a.f9133j.mo3226q() == t && t.mo3397b() != z2) {
            t.mo3396a(z2);
        }
        if (!this.f9144a.f9130g || z2) {
            z = false;
        }
        if (this.f9144a.f9131h != z) {
            this.f9144a.f9131h = z;
            for (cuz b : this.f9144a.f9135l) {
                b.mo1440b(z);
            }
        }
    }
}
