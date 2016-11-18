package p000;

public final class drq extends evz {
    private static final long serialVersionUID = 1;
    private final int f10404g;
    private final long f10405h;
    private final edo f10406i;
    private final String f10407j;

    private drq(lvq lvq) {
        super(lvq, lvq.responseHeader, gwb.m1523a(lvq.f26610a.f26108c));
        this.f10407j = lvq.f26610a.f26109d;
        this.f10406i = new edo(lvq.f26610a.f26107b.f26403b, lvq.f26610a.f26107b.f26402a);
        this.f10405h = gwb.m1523a(lvq.f26610a.f26120o);
        this.f10404g = gwb.m1507a(lvq.f26610a.f26119n.f26276a);
    }

    public static evz m12565a(lvq lvq) {
        if (evz.m8120a(lvq.responseHeader)) {
            return new ewv((nzf) lvq, lvq.responseHeader);
        }
        return new drq(lvq);
    }

    public void mo1047a(blo blo, fhc fhc) {
        String valueOf;
        super.mo1047a(blo, fhc);
        if (glk.m17973a("Babel", 3)) {
            int i = this.c.f12529b;
            valueOf = String.valueOf(this.c.f12528a);
            glk.m17976b("Babel", new StringBuilder(String.valueOf(valueOf).length() + 67).append("processEventResponse response status: ").append(i).append(" error description").append(valueOf).toString(), new Object[0]);
        }
        drp drp = (drp) this.b;
        valueOf = drp.m12564e();
        String d = drp.m12563d();
        blo.m6060g(valueOf, this.d);
        ((ect) jyn.m25426a(gwb.m1400H(), ect.class)).mo1838d(blo.m6056g().m5638g(), true);
        new flf(valueOf, this.f10406i, this.d, this.f10405h, this.f10407j, d, this.f10404g, fwx.ON_SERVER).m15629b(blo);
    }
}
