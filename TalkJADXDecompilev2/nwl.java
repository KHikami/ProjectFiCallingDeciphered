package defpackage;

final class nwl implements nwt {
    static final nwl a = new nwl();
    static final nwm b = new nwm();

    private nwl() {
    }

    public boolean a(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z == z3 && z2 == z4) {
            return z2;
        }
        throw b;
    }

    public int a(boolean z, int i, boolean z2, int i2) {
        if (z == z2 && i == i2) {
            return i;
        }
        throw b;
    }

    public double a(boolean z, double d, boolean z2, double d2) {
        if (z == z2 && d == d2) {
            return d;
        }
        throw b;
    }

    public long a(boolean z, long j, boolean z2, long j2) {
        if (z == z2 && j == j2) {
            return j;
        }
        throw b;
    }

    public String a(boolean z, String str, boolean z2, String str2) {
        if (z == z2 && str.equals(str2)) {
            return str;
        }
        throw b;
    }

    public <T extends nxi> T a(T t, T t2) {
        if (t == null && t2 == null) {
            return null;
        }
        if (t == null || t2 == null) {
            throw b;
        }
        ((nwi) t).a(this, t2);
        return t;
    }

    public <T> nxb<T> a(nxb<T> nxb_T, nxb<T> nxb_T2) {
        if (nxb_T.equals(nxb_T2)) {
            return nxb_T;
        }
        throw b;
    }

    public nwy a(nwy nwy, nwy nwy2) {
        if (nwy.equals(nwy2)) {
            return nwy;
        }
        throw b;
    }

    public nwf<nwh> a(nwf<nwh> nwf_nwh, nwf<nwh> nwf_nwh2) {
        if (nwf_nwh.equals(nwf_nwh2)) {
            return nwf_nwh;
        }
        throw b;
    }

    public nxy a(nxy nxy, nxy nxy2) {
        if (nxy.equals(nxy2)) {
            return nxy;
        }
        throw b;
    }
}
