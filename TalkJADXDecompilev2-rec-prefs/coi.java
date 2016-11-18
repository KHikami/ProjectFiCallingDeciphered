package p000;

final class coi extends evz {
    private static final long serialVersionUID = 1;
    private final int f5824g;
    private final edo f5825h;
    private final String f5826i;
    private final long f5827j;

    private coi(ltf ltf) {
        super(ltf, ltf.responseHeader, gwb.m1523a(ltf.f26372a.f26108c));
        this.f5826i = ltf.f26372a.f26109d;
        this.f5827j = gwb.m1523a(ltf.f26372a.f26120o);
        this.f5825h = new edo(ltf.f26372a.f26107b.f26403b, ltf.f26372a.f26107b.f26402a);
        this.f5824g = gwb.m1507a(ltf.f26372a.f26116k.f26398b);
    }

    public static evz m8160a(ltf ltf) {
        if (evz.m8120a(ltf.responseHeader)) {
            return new ewv((nzf) ltf, ltf.responseHeader);
        }
        return new coi(ltf);
    }

    public void mo1047a(blo blo, fhc fhc) {
        String str;
        super.mo1047a(blo, fhc);
        if (glk.m17973a("Babel", 3)) {
            int i = this.c.f12529b;
            str = this.c.f12528a;
            glk.m17976b("Babel", new StringBuilder(String.valueOf(str).length() + 67).append("processEventResponse response status: ").append(i).append(" error description").append(str).toString(), new Object[0]);
        }
        coh coh = (coh) this.b;
        String c = coh.m8157c();
        str = coh.m8158d();
        if (!(c == null || this.f5826i == null)) {
            blo.m5958a();
            try {
                blo.m5993a(c, str, this.f5826i, this.d, this.f5827j);
                blo.m6015b();
            } finally {
                blo.m6028c();
            }
        }
        blo.m6060g(str, this.d);
        ((ect) jyn.m25426a(gwb.m1400H(), ect.class)).mo1838d(blo.m6056g().m5638g(), true);
        new flh(str, this.f5825h, this.d, this.f5827j, this.f5826i, c, this.f5824g, fwx.ON_SERVER).m15635b(blo);
    }
}
