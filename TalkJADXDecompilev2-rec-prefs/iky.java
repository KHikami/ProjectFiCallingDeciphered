package p000;

final class iky implements Runnable {
    final /* synthetic */ mat f17964a;
    final /* synthetic */ ikx f17965b;

    iky(ikx ikx, mat mat) {
        this.f17965b = ikx;
        this.f17964a = mat;
    }

    public void run() {
        itx.m23279a(3, "vclib", "Got stream request %s", this.f17964a);
        mau mau = this.f17964a.f27152c;
        iud a = iko.m22186a(mau.f27155a.intValue() * mau.f27156b.intValue());
        this.f17965b.f17963a.f17949e = a.m23303b();
        if (this.f17965b.f17963a.f17951g != null) {
            this.f17965b.f17963a.mo1313a(this.f17965b.f17963a.f17951g.f19032a, this.f17965b.f17963a.f17951g.f19033b, this.f17965b.f17963a.f17950f);
        }
    }
}
