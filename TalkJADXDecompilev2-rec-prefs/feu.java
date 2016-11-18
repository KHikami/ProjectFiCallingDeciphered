package p000;

public final class feu extends fhb {
    private final String f12939a;
    private final fwy f12940b;

    public feu(bko bko, String str, fwy fwy) {
        super(bko);
        this.f12939a = str;
        this.f12940b = fwy;
    }

    public void w_() {
        blo blo = new blo(gwb.m1400H(), this.f5736c.f12721a);
        blo.m5958a();
        try {
            blo.m5935a(this.f12939a, this.f12940b);
            blo.m6015b();
        } finally {
            blo.m6028c();
        }
    }
}
