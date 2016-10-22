package defpackage;

/* renamed from: fjn */
public final class fjn extends fhb {
    public static final boolean a;
    private final String b;
    private final byte[] g;
    private final long h;
    private final boolean i;

    static {
        kae kae = glk.o;
        a = false;
    }

    public fjn(bko bko, String str, byte[] bArr, long j, boolean z) {
        super(bko);
        this.b = str;
        this.g = bArr;
        this.h = j;
        this.i = z;
    }

    public void w_() {
        blo blo = new blo(gwb.H(), this.c.a);
        if (!this.i && this.h > 0) {
            bme b = blo.b(this.h);
            if (b == null || b.f != fwx.SENDING) {
                blo.b(this.h, fwx.SENDING, glj.a());
                blf.b(blo, this.h);
            } else {
                return;
            }
        }
        a(new fjo(this.b, this.g, this.h, this.i));
    }
}
