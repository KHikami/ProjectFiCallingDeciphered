package defpackage;

/* renamed from: feu */
public final class feu extends fhb {
    private final String a;
    private final fwy b;

    public feu(bko bko, String str, fwy fwy) {
        super(bko);
        this.a = str;
        this.b = fwy;
    }

    public void w_() {
        blo blo = new blo(gwb.H(), this.c.a);
        blo.a();
        try {
            blo.a(this.a, this.b);
            blo.b();
        } finally {
            blo.c();
        }
    }
}
