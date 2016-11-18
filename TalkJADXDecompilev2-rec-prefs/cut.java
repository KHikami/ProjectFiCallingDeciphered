package p000;

final class cut implements Runnable {
    final /* synthetic */ cus f9143a;

    cut(cus cus) {
        this.f9143a = cus;
    }

    public void run() {
        boolean z = true;
        this.f9143a.f9134k.removeCallbacks(this.f9143a.f9136m);
        boolean z2 = this.f9143a.f9124a > 0 && !this.f9143a.f9125b;
        ito s = this.f9143a.m11074s();
        if (this.f9143a.f9133j.mo3225p() == s && s.mo1322g() != z2 && this.f9143a.m11062g() && this.f9143a.m11068m()) {
            s.m23059a(z2);
        }
        if (!this.f9143a.f9125b || z2) {
            z = false;
        }
        if (this.f9143a.f9126c != z) {
            this.f9143a.f9126c = z;
            for (cuz a : this.f9143a.f9135l) {
                a.mo1421a(z);
            }
        }
    }
}
