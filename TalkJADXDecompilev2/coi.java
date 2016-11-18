package defpackage;

final class coi extends evz {
    private static final long serialVersionUID = 1;
    private final int g;
    private final edo h;
    private final String i;
    private final long j;

    private coi(ltf ltf) {
        super(ltf, ltf.responseHeader, gwb.a(ltf.a.c));
        this.i = ltf.a.d;
        this.j = gwb.a(ltf.a.o);
        this.h = new edo(ltf.a.b.b, ltf.a.b.a);
        this.g = gwb.a(ltf.a.k.b);
    }

    public static evz a(ltf ltf) {
        if (evz.a(ltf.responseHeader)) {
            return new ewv((nzf) ltf, ltf.responseHeader);
        }
        return new coi(ltf);
    }

    public void a(blo blo, fhc fhc) {
        String str;
        super.a(blo, fhc);
        if (glk.a("Babel", 3)) {
            int i = this.c.b;
            str = this.c.a;
            glk.b("Babel", new StringBuilder(String.valueOf(str).length() + 67).append("processEventResponse response status: ").append(i).append(" error description").append(str).toString(), new Object[0]);
        }
        coh coh = (coh) this.b;
        String c = coh.c();
        str = coh.d();
        if (!(c == null || this.i == null)) {
            blo.a();
            try {
                blo.a(c, str, this.i, this.d, this.j);
                blo.b();
            } finally {
                blo.c();
            }
        }
        blo.g(str, this.d);
        ((ect) jyn.a(gwb.H(), ect.class)).d(blo.g().g(), true);
        new flh(str, this.h, this.d, this.j, this.i, c, this.g, fwx.ON_SERVER).b(blo);
    }
}
