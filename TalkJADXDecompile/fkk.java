public final class fkk extends fhb {
    private final String a;
    private final String b;
    private final int g;

    public fkk(bko bko, String str, String str2, int i) {
        super(bko);
        this.a = str;
        this.b = str2;
        this.g = i;
    }

    public void w_() {
        String str = this.a;
        String str2 = this.b;
        new StringBuilder((String.valueOf(str).length() + 40) + String.valueOf(str2).length()).append("SetMessageFailedOperation: ").append(str).append(" ").append(str2).append(" ").append(this.g);
        blo blo = new blo(gwb.H(), this.c.a);
        blo.a();
        try {
            if (blo.n(this.a, this.b) != fwx.PENDING_DELETE) {
                blf.a(blo, this.a, this.b, fwx.FAILED_TO_SEND, this.g);
                blo.b(this.a, this.b);
                blo.b();
            }
            blo.c();
        } catch (Throwable th) {
            blo.c();
        }
    }
}
