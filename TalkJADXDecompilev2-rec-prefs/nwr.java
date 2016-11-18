package p000;

public final class nwr implements nwt {
    public static final nwr f31185a = new nwr();

    private nwr() {
    }

    public boolean mo4052a(boolean z, boolean z2, boolean z3, boolean z4) {
        return z3 ? z4 : z2;
    }

    public int mo4044a(boolean z, int i, boolean z2, int i2) {
        return z2 ? i2 : i;
    }

    public double mo4043a(boolean z, double d, boolean z2, double d2) {
        return z2 ? d2 : d;
    }

    public long mo4045a(boolean z, long j, boolean z2, long j2) {
        return z2 ? j2 : j;
    }

    public String mo4046a(boolean z, String str, boolean z2, String str2) {
        return z2 ? str2 : str;
    }

    public <T extends nxi> T mo4050a(T t, T t2) {
        if (t == null || t2 == null) {
            return t == null ? t2 : t;
        } else {
            return t.f().mo3976b(t2).mo4042i();
        }
    }

    public <T> nxb<T> mo4049a(nxb<T> nxb_T, nxb<T> nxb_T2) {
        int size = nxb_T.size();
        int size2 = nxb_T2.size();
        if (size > 0 && size2 > 0) {
            if (!nxb_T.mo3980a()) {
                nxb_T = nxb_T.mo4061d(size2 + size);
            }
            nxb_T.addAll(nxb_T2);
        }
        return size > 0 ? nxb_T : nxb_T2;
    }

    public nwy mo4048a(nwy nwy, nwy nwy2) {
        int size = nwy.size();
        int size2 = nwy2.size();
        if (size > 0 && size2 > 0) {
            if (!nwy.mo3980a()) {
                nwy = nwy.mo4056a(size2 + size);
            }
            nwy.addAll(nwy2);
        }
        return size > 0 ? nwy : nwy2;
    }

    public nwf<nwh> mo4047a(nwf<nwh> nwf_nwh, nwf<nwh> nwf_nwh2) {
        if (nwf_nwh.b()) {
            nwf_nwh = nwf_nwh.c();
        }
        nwf_nwh.a(nwf_nwh2);
        return nwf_nwh;
    }

    public nxy mo4051a(nxy nxy, nxy nxy2) {
        return nxy2 == nxy.a ? nxy : nxy.a(nxy, nxy2);
    }
}
