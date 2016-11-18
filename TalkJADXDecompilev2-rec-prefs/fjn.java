package p000;

public final class fjn extends fhb {
    public static final boolean f13210a = false;
    private final String f13211b;
    private final byte[] f13212g;
    private final long f13213h;
    private final boolean f13214i;

    static {
        kae kae = glk.f15568o;
    }

    public fjn(bko bko, String str, byte[] bArr, long j, boolean z) {
        super(bko);
        this.f13211b = str;
        this.f13212g = bArr;
        this.f13213h = j;
        this.f13214i = z;
    }

    public void w_() {
        blo blo = new blo(gwb.m1400H(), this.f5736c.f12721a);
        if (!this.f13214i && this.f13213h > 0) {
            bme b = blo.m6009b(this.f13213h);
            if (b == null || b.f3932f != fwx.SENDING) {
                blo.m6016b(this.f13213h, fwx.SENDING, glj.m17956a());
                blf.m5812b(blo, this.f13213h);
            } else {
                return;
            }
        }
        m8039a(new fjo(this.f13211b, this.f13212g, this.f13213h, this.f13214i));
    }
}
