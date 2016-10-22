public final class cop extends evz {
    private static final long serialVersionUID = 1;
    private final String g;

    private cop(luj luj) {
        super(luj, luj.responseHeader, gwb.a(luj.a.c));
        this.g = luj.a.d;
    }

    public static evz a(luj luj) {
        if (evz.a(luj.responseHeader)) {
            return new ewv((nzf) luj, luj.responseHeader);
        }
        return new cop(luj);
    }

    public void a(blo blo, fhc fhc) {
        super.a(blo, fhc);
        if (glk.a("Babel", 3)) {
            int i = this.c.b;
            String str = this.c.a;
            glk.b("Babel", new StringBuilder(String.valueOf(str).length() + 67).append("processEventResponse response status: ").append(i).append(" error description").append(str).toString(), new Object[0]);
        }
        String d = ((coo) this.b).d();
        blo.g(d, this.d);
        ((ect) jyn.a(gwb.H(), ect.class)).d(blo.g().g(), true);
        ayo bow = new bow(d, blo.h(), box.REMOVE_PARTICIPANT_FROM_CONVERSATION);
        gid gid = (gid) jyn.a(blo.f(), gid.class);
        if (this.c.b == 1) {
            gid.a(bow, bow.a());
            lqg lqg = new lqg();
            lqg.u = Integer.valueOf(5);
            lqg.a = euk.a(d);
            lqg.h = new lta();
            lqg.h.a = Integer.valueOf(2);
            lqg.h.c = Integer.valueOf(0);
            ltr[] ltrArr = new ltr[]{gwb.c(r0.e())};
            lqg.h.b = ltrArr;
            blf.a(blo, new fpr(lqg, 1, this.c.d, lqg.h), fhc, true);
            blf.c(blo, d);
            return;
        }
        gid.a(bow, new Exception("Remove user request failed"), bow.a());
    }
}
