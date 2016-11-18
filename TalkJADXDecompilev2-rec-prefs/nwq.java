package p000;

final class nwq implements nwt {
    int f31184a = 0;

    nwq() {
    }

    public boolean mo4052a(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f31184a = (this.f31184a * 53) + nwv.m37009a(z2);
        return z2;
    }

    public int mo4044a(boolean z, int i, boolean z2, int i2) {
        this.f31184a = (this.f31184a * 53) + i;
        return i;
    }

    public double mo4043a(boolean z, double d, boolean z2, double d2) {
        this.f31184a = (this.f31184a * 53) + nwv.m37008a(Double.doubleToLongBits(d));
        return d;
    }

    public long mo4045a(boolean z, long j, boolean z2, long j2) {
        this.f31184a = (this.f31184a * 53) + nwv.m37008a(j);
        return j;
    }

    public String mo4046a(boolean z, String str, boolean z2, String str2) {
        this.f31184a = (this.f31184a * 53) + str.hashCode();
        return str;
    }

    public <T extends nxi> T mo4050a(T t, T t2) {
        int i;
        if (t == null) {
            i = 37;
        } else if (t instanceof nwi) {
            i = ((nwi) t).a(this);
        } else {
            i = t.hashCode();
        }
        this.f31184a = i + (this.f31184a * 53);
        return t;
    }

    public <T> nxb<T> mo4049a(nxb<T> nxb_T, nxb<T> nxb_T2) {
        this.f31184a = (this.f31184a * 53) + nxb_T.hashCode();
        return nxb_T;
    }

    public nwy mo4048a(nwy nwy, nwy nwy2) {
        this.f31184a = (this.f31184a * 53) + nwy.hashCode();
        return nwy;
    }

    public nwf<nwh> mo4047a(nwf<nwh> nwf_nwh, nwf<nwh> nwf_nwh2) {
        this.f31184a = (this.f31184a * 53) + nwf_nwh.hashCode();
        return nwf_nwh;
    }

    public nxy mo4051a(nxy nxy, nxy nxy2) {
        this.f31184a = (this.f31184a * 53) + nxy.hashCode();
        return nxy;
    }
}
