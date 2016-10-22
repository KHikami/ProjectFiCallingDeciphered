package defpackage;

/* renamed from: fjb */
public final class fjb extends fhb {
    private final String a;
    private final int b;
    private final int[] g;

    public fjb(bko bko, String str, boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        super(bko);
        this.a = str;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        this.b = i;
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
        this.g = new int[]{i2, i};
    }

    public void w_() {
        blo blo = new blo(gwb.H(), this.c.a);
        if (this.b == 1) {
            blo.Z(this.a);
        } else {
            blf.a(blo, this.a);
        }
        a(new evh(this.a, this.b, this.g));
    }
}
