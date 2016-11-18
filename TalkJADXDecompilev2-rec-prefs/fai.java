package p000;

public final class fai extends evz {
    private static final long serialVersionUID = 1;
    private String[] f12576g;

    fai(lwv lwv) {
        super(lwv, lwv.responseHeader, -1);
        this.f12576g = new String[lwv.f26729a.length];
        for (int i = 0; i < this.f12576g.length; i++) {
            this.f12576g[i] = lwv.f26729a[i].f26403b;
        }
        if (glk.m17973a("Babel", 3)) {
            String str = "Babel";
            String str2 = "UndismissSuggestedContactsResponse debugUrl: ";
            String valueOf = String.valueOf(lwv.responseHeader.f26517c);
            glk.m17976b(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
    }

    public void mo1047a(blo blo, fhc fhc) {
        super.mo1047a(blo, fhc);
        blo.m5958a();
        try {
            for (String E : this.f12576g) {
                blo.m5913E(E);
            }
            blo.m6015b();
            int h = blo.m6061h();
            bkq.m5676b(gwb.m1400H(), h, "hash_dismissed_contacts");
            jyn b = jyn.m25435b(blo.m6049f());
            ((bhl) b.m25443a(bhl.class)).mo550a(new fkr(blo.m6056g().m5638g()));
            ((gid) b.m25443a(gid.class)).mo2276a(new dcx((evu) m8129c(), this), dcx.m11463a(h));
        } finally {
            blo.m6028c();
        }
    }
}
