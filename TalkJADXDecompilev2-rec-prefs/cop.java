package p000;

public final class cop extends evz {
    private static final long serialVersionUID = 1;
    private final String f8725g;

    private cop(luj luj) {
        super(luj, luj.responseHeader, gwb.m1523a(luj.f26487a.f26108c));
        this.f8725g = luj.f26487a.f26109d;
    }

    public static evz m10544a(luj luj) {
        if (evz.m8120a(luj.responseHeader)) {
            return new ewv((nzf) luj, luj.responseHeader);
        }
        return new cop(luj);
    }

    public void mo1047a(blo blo, fhc fhc) {
        super.mo1047a(blo, fhc);
        if (glk.m17973a("Babel", 3)) {
            int i = this.c.f12529b;
            String str = this.c.f12528a;
            glk.m17976b("Babel", new StringBuilder(String.valueOf(str).length() + 67).append("processEventResponse response status: ").append(i).append(" error description").append(str).toString(), new Object[0]);
        }
        String d = ((coo) this.b).m10542d();
        blo.m6060g(d, this.d);
        ((ect) jyn.m25426a(gwb.m1400H(), ect.class)).mo1838d(blo.m6056g().m5638g(), true);
        ayo bow = new bow(d, blo.m6061h(), box.REMOVE_PARTICIPANT_FROM_CONVERSATION);
        gid gid = (gid) jyn.m25426a(blo.m6049f(), gid.class);
        if (this.c.f12529b == 1) {
            gid.mo2276a(bow, bow.m6328a());
            lqg lqg = new lqg();
            lqg.f26126u = Integer.valueOf(5);
            lqg.f26106a = euk.m14555a(d);
            lqg.f26113h = new lta();
            lqg.f26113h.f26358a = Integer.valueOf(2);
            lqg.f26113h.f26360c = Integer.valueOf(0);
            ltr[] ltrArr = new ltr[]{gwb.m2092c(r0.m10543e())};
            lqg.f26113h.f26359b = ltrArr;
            blf.m5779a(blo, new fpr(lqg, 1, this.c.f12531d, lqg.f26113h), fhc, true);
            blf.m5818c(blo, d);
            return;
        }
        gid.mo2277a(bow, new Exception("Remove user request failed"), bow.m6328a());
    }
}
