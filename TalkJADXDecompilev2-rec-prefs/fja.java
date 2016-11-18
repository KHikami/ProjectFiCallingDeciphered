package p000;

public final class fja extends fhb {
    String f13171a;
    private final String f13172b;

    public fja(bko bko, String str, String str2) {
        super(bko);
        this.f13171a = str;
        this.f13172b = str2;
    }

    public void w_() {
        blo blo = new blo(gwb.m1400H(), this.f5736c.f12721a);
        blo.m5958a();
        try {
            Long i = blo.m6068i(this.f13171a, this.f13172b);
            if (i != null) {
                blf.m5771a(blo, gwb.m1523a(i));
            }
            blo.m6015b();
        } finally {
            blo.m6028c();
        }
    }
}
