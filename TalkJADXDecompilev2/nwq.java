package defpackage;

final class nwq implements nwt {
    int a = 0;

    nwq() {
    }

    public boolean a(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = (this.a * 53) + nwv.a(z2);
        return z2;
    }

    public int a(boolean z, int i, boolean z2, int i2) {
        this.a = (this.a * 53) + i;
        return i;
    }

    public double a(boolean z, double d, boolean z2, double d2) {
        this.a = (this.a * 53) + nwv.a(Double.doubleToLongBits(d));
        return d;
    }

    public long a(boolean z, long j, boolean z2, long j2) {
        this.a = (this.a * 53) + nwv.a(j);
        return j;
    }

    public String a(boolean z, String str, boolean z2, String str2) {
        this.a = (this.a * 53) + str.hashCode();
        return str;
    }

    public <T extends nxi> T a(T t, T t2) {
        int i;
        if (t == null) {
            i = 37;
        } else if (t instanceof nwi) {
            i = ((nwi) t).a(this);
        } else {
            i = t.hashCode();
        }
        this.a = i + (this.a * 53);
        return t;
    }

    public <T> nxb<T> a(nxb<T> nxb_T, nxb<T> nxb_T2) {
        this.a = (this.a * 53) + nxb_T.hashCode();
        return nxb_T;
    }

    public nwy a(nwy nwy, nwy nwy2) {
        this.a = (this.a * 53) + nwy.hashCode();
        return nwy;
    }

    public nwf<nwh> a(nwf<nwh> nwf_nwh, nwf<nwh> nwf_nwh2) {
        this.a = (this.a * 53) + nwf_nwh.hashCode();
        return nwf_nwh;
    }

    public nxy a(nxy nxy, nxy nxy2) {
        this.a = (this.a * 53) + nxy.hashCode();
        return nxy;
    }
}
