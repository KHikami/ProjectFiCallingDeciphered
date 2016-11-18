package p000;

import java.util.ArrayList;
import java.util.List;

public final class fpr extends fpl {
    private static final boolean f13707d = false;
    private static final long serialVersionUID = 1;
    private final int f13708u;
    private final int f13709v;
    private final List<edo> f13710w;

    static {
        kae kae = glk.f15565l;
    }

    public fpr(lqg lqg, int i, long j, lta lta) {
        super(lqg, i, j);
        this.f13708u = gwb.m1507a(lta.f26358a);
        this.f13709v = gwb.m1507a(lta.f26360c);
        this.f13710w = gwb.m1694a(gwb.m1400H(), lta.f26359b, null);
    }

    public List<edo> mo2063f() {
        List<edo> arrayList = new ArrayList(this.f13710w);
        arrayList.add(this.b);
        return arrayList;
    }

    public int m15925d() {
        return this.f13708u;
    }

    public int m15926e() {
        return this.f13709v;
    }

    public List<edo> m15928g() {
        return this.f13710w;
    }

    protected void mo2062b(blo blo, fhc fhc) {
        String a = m15827a();
        if (f13707d) {
            String str = "processMembershipChange conversationId: ";
            String valueOf = String.valueOf(a);
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        blo.m5958a();
        try {
            blf.m5779a(blo, this, fhc, true);
            blo.m6015b();
            glk.m17970a("Babel", "updating conversation (name/avatars) because of a memebership change.", new Object[0]);
            blf.m5813b(blo, a);
            blf.m5820d(blo);
            blf.m5821d(blo, a);
            blf.m5818c(blo, a);
        } finally {
            blo.m6028c();
        }
    }
}
