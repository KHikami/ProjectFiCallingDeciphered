package defpackage;

public final class drq extends evz {
    private static final long serialVersionUID = 1;
    private final int g;
    private final long h;
    private final edo i;
    private final String j;

    private drq(lvq lvq) {
        super(lvq, lvq.responseHeader, gwb.a(lvq.a.c));
        this.j = lvq.a.d;
        this.i = new edo(lvq.a.b.b, lvq.a.b.a);
        this.h = gwb.a(lvq.a.o);
        this.g = gwb.a(lvq.a.n.a);
    }

    public static evz a(lvq lvq) {
        if (evz.a(lvq.responseHeader)) {
            return new ewv((nzf) lvq, lvq.responseHeader);
        }
        return new drq(lvq);
    }

    public void a(blo blo, fhc fhc) {
        String valueOf;
        super.a(blo, fhc);
        if (glk.a("Babel", 3)) {
            int i = this.c.b;
            valueOf = String.valueOf(this.c.a);
            glk.b("Babel", new StringBuilder(String.valueOf(valueOf).length() + 67).append("processEventResponse response status: ").append(i).append(" error description").append(valueOf).toString(), new Object[0]);
        }
        drp drp = (drp) this.b;
        valueOf = drp.e();
        String d = drp.d();
        blo.g(valueOf, this.d);
        ((ect) jyn.a(gwb.H(), ect.class)).d(blo.g().g(), true);
        new flf(valueOf, this.i, this.d, this.h, this.j, d, this.g, fwx.ON_SERVER).b(blo);
    }
}
