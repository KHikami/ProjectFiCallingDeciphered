package p000;

public final class fjb extends fhb {
    private final String f13173a;
    private final int f13174b;
    private final int[] f13175g;

    public fjb(bko bko, String str, boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        super(bko);
        this.f13173a = str;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        this.f13174b = i;
        if (z3) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        if (z2) {
            i = 1;
        } else {
            i = 0;
        }
        this.f13175g = new int[]{i2, i};
    }

    public void w_() {
        blo blo = new blo(gwb.m1400H(), this.f5736c.f12721a);
        if (this.f13174b == 1) {
            blo.m5934Z(this.f13173a);
        } else {
            blf.m5780a(blo, this.f13173a);
        }
        m8039a(new evh(this.f13173a, this.f13174b, this.f13175g));
    }
}
