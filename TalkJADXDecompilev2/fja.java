package defpackage;

public final class fja extends fhb {
    String a;
    private final String b;

    public fja(bko bko, String str, String str2) {
        super(bko);
        this.a = str;
        this.b = str2;
    }

    public void w_() {
        blo blo = new blo(gwb.H(), this.c.a);
        blo.a();
        try {
            Long i = blo.i(this.a, this.b);
            if (i != null) {
                blf.a(blo, gwb.a(i));
            }
            blo.b();
        } finally {
            blo.c();
        }
    }
}
