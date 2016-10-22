public final class ewo extends evz {
    private static final long serialVersionUID = 1;
    private String[] g;

    ewo(lps lps) {
        super(lps, lps.responseHeader, -1);
        this.g = new String[lps.a.length];
        for (int i = 0; i < this.g.length; i++) {
            this.g[i] = lps.a[i].b;
        }
        if (glk.a("Babel", 3)) {
            String str = "Babel";
            String str2 = "DismissSuggestedContactsResponse debugUrl: ";
            String valueOf = String.valueOf(lps.responseHeader.c);
            glk.b(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
    }

    public void a(blo blo, fhc fhc) {
        super.a(blo, fhc);
        blo.a();
        try {
            for (String K : this.g) {
                blo.K(K);
            }
            blo.b();
            bkq.b(gwb.H(), blo.g().g(), "hash_people_you_hangout_with");
            bkq.b(gwb.H(), blo.g().g(), "hash_favorites");
        } finally {
            blo.c();
        }
    }
}
