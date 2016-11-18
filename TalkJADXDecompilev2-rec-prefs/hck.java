package p000;

public abstract class hck<M extends hck<M>> extends hcq {
    public hcm f16575o;

    protected int mo2448a() {
        int i = 0;
        if (this.f16575o == null) {
            return 0;
        }
        int i2 = 0;
        while (i < this.f16575o.m19325a()) {
            i2 += this.f16575o.m19328b(i).m19332a();
            i++;
        }
        return i2;
    }

    public void mo2449a(hcj hcj) {
        if (this.f16575o != null) {
            for (int i = 0; i < this.f16575o.m19325a(); i++) {
                this.f16575o.m19328b(i).m19333a(hcj);
            }
        }
    }

    protected final boolean m19212a(hci hci, int i) {
        int m = hci.m19265m();
        if (!hci.m19251b(i)) {
            return false;
        }
        int i2 = i >>> 3;
        hcr hcr = new hcr(i, hci.m19249a(m, hci.m19265m() - m));
        hcn hcn = null;
        if (this.f16575o == null) {
            this.f16575o = new hcm();
        } else {
            hcn = this.f16575o.m19326a(i2);
        }
        if (hcn == null) {
            hcn = new hcn();
            this.f16575o.m19327a(i2, hcn);
        }
        hcn.m19334a(hcr);
        return true;
    }

    public M m19213c() {
        hck hck = (hck) super.mo2451d();
        hco.m19340a(this, hck);
        return hck;
    }

    public /* synthetic */ Object clone() {
        return m19213c();
    }

    public /* synthetic */ hcq mo2451d() {
        return (hck) clone();
    }
}
