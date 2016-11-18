package p000;

public final class fkk extends fhb {
    private final String f13319a;
    private final String f13320b;
    private final int f13321g;

    public fkk(bko bko, String str, String str2, int i) {
        super(bko);
        this.f13319a = str;
        this.f13320b = str2;
        this.f13321g = i;
    }

    public void w_() {
        String str = this.f13319a;
        String str2 = this.f13320b;
        new StringBuilder((String.valueOf(str).length() + 40) + String.valueOf(str2).length()).append("SetMessageFailedOperation: ").append(str).append(" ").append(str2).append(" ").append(this.f13321g);
        blo blo = new blo(gwb.m1400H(), this.f5736c.f12721a);
        blo.m5958a();
        try {
            if (blo.m6090n(this.f13319a, this.f13320b) != fwx.PENDING_DELETE) {
                blf.m5785a(blo, this.f13319a, this.f13320b, fwx.FAILED_TO_SEND, this.f13321g);
                blo.m6023b(this.f13319a, this.f13320b);
                blo.m6015b();
            }
            blo.m6028c();
        } catch (Throwable th) {
            blo.m6028c();
        }
    }
}
