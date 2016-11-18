package p000;

public final class ewo extends evz {
    private static final long serialVersionUID = 1;
    private String[] f12416g;

    ewo(lps lps) {
        super(lps, lps.responseHeader, -1);
        this.f12416g = new String[lps.f26024a.length];
        for (int i = 0; i < this.f12416g.length; i++) {
            this.f12416g[i] = lps.f26024a[i].f26403b;
        }
        if (glk.m17973a("Babel", 3)) {
            String str = "Babel";
            String str2 = "DismissSuggestedContactsResponse debugUrl: ";
            String valueOf = String.valueOf(lps.responseHeader.f26517c);
            glk.m17976b(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
    }

    public void mo1047a(blo blo, fhc fhc) {
        super.mo1047a(blo, fhc);
        blo.m5958a();
        try {
            for (String K : this.f12416g) {
                blo.m5919K(K);
            }
            blo.m6015b();
            bkq.m5676b(gwb.m1400H(), blo.m6056g().m5638g(), "hash_people_you_hangout_with");
            bkq.m5676b(gwb.m1400H(), blo.m6056g().m5638g(), "hash_favorites");
        } finally {
            blo.m6028c();
        }
    }
}
