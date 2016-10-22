public final class fai extends evz {
    private static final long serialVersionUID = 1;
    private String[] g;

    fai(lwv lwv) {
        super(lwv, lwv.responseHeader, -1);
        this.g = new String[lwv.a.length];
        for (int i = 0; i < this.g.length; i++) {
            this.g[i] = lwv.a[i].b;
        }
        if (glk.a("Babel", 3)) {
            String str = "Babel";
            String str2 = "UndismissSuggestedContactsResponse debugUrl: ";
            String valueOf = String.valueOf(lwv.responseHeader.c);
            glk.b(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
    }

    public void a(blo blo, fhc fhc) {
        super.a(blo, fhc);
        blo.a();
        try {
            for (String E : this.g) {
                blo.E(E);
            }
            blo.b();
            int h = blo.h();
            bkq.b(gwb.H(), h, "hash_dismissed_contacts");
            jyn b = jyn.b(blo.f());
            ((bhl) b.a(bhl.class)).a(new fkr(blo.g().g()));
            ((gid) b.a(gid.class)).a(new dcx((evu) c(), this), dcx.a(h));
        } finally {
            blo.c();
        }
    }
}
