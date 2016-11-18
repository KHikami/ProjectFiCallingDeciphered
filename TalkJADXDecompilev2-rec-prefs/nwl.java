package p000;

final class nwl implements nwt {
    static final nwl f31178a = new nwl();
    static final nwm f31179b = new nwm();

    private nwl() {
    }

    public boolean mo4052a(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z == z3 && z2 == z4) {
            return z2;
        }
        throw f31179b;
    }

    public int mo4044a(boolean z, int i, boolean z2, int i2) {
        if (z == z2 && i == i2) {
            return i;
        }
        throw f31179b;
    }

    public double mo4043a(boolean z, double d, boolean z2, double d2) {
        if (z == z2 && d == d2) {
            return d;
        }
        throw f31179b;
    }

    public long mo4045a(boolean z, long j, boolean z2, long j2) {
        if (z == z2 && j == j2) {
            return j;
        }
        throw f31179b;
    }

    public String mo4046a(boolean z, String str, boolean z2, String str2) {
        if (z == z2 && str.equals(str2)) {
            return str;
        }
        throw f31179b;
    }

    public <T extends nxi> T mo4050a(T t, T t2) {
        if (t == null && t2 == null) {
            return null;
        }
        if (t == null || t2 == null) {
            throw f31179b;
        }
        ((nwi) t).a(this, t2);
        return t;
    }

    public <T> nxb<T> mo4049a(nxb<T> nxb_T, nxb<T> nxb_T2) {
        if (nxb_T.equals(nxb_T2)) {
            return nxb_T;
        }
        throw f31179b;
    }

    public nwy mo4048a(nwy nwy, nwy nwy2) {
        if (nwy.equals(nwy2)) {
            return nwy;
        }
        throw f31179b;
    }

    public nwf<nwh> mo4047a(nwf<nwh> nwf_nwh, nwf<nwh> nwf_nwh2) {
        if (nwf_nwh.equals(nwf_nwh2)) {
            return nwf_nwh;
        }
        throw f31179b;
    }

    public nxy mo4051a(nxy nxy, nxy nxy2) {
        if (nxy.equals(nxy2)) {
            return nxy;
        }
        throw f31179b;
    }
}
