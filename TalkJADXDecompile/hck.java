public abstract class hck<M extends hck<M>> extends hcq {
    public hcm o;

    protected int a() {
        int i = 0;
        if (this.o == null) {
            return 0;
        }
        int i2 = 0;
        while (i < this.o.a()) {
            i2 += this.o.b(i).a();
            i++;
        }
        return i2;
    }

    public void a(hcj hcj) {
        if (this.o != null) {
            for (int i = 0; i < this.o.a(); i++) {
                this.o.b(i).a(hcj);
            }
        }
    }

    protected final boolean a(hci hci, int i) {
        int m = hci.m();
        if (!hci.b(i)) {
            return false;
        }
        int i2 = i >>> 3;
        hcr hcr = new hcr(i, hci.a(m, hci.m() - m));
        hcn hcn = null;
        if (this.o == null) {
            this.o = new hcm();
        } else {
            hcn = this.o.a(i2);
        }
        if (hcn == null) {
            hcn = new hcn();
            this.o.a(i2, hcn);
        }
        hcn.a(hcr);
        return true;
    }

    public M c() {
        hck hck = (hck) super.d();
        hco.a(this, hck);
        return hck;
    }

    public /* synthetic */ Object clone() {
        return c();
    }

    public /* synthetic */ hcq d() {
        return (hck) clone();
    }
}
