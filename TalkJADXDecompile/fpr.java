import java.util.ArrayList;
import java.util.List;

public final class fpr extends fpl {
    private static final boolean d;
    private static final long serialVersionUID = 1;
    private final int u;
    private final int v;
    private final List<edo> w;

    static {
        kae kae = glk.l;
        d = d;
    }

    public fpr(lqg lqg, int i, long j, lta lta) {
        super(lqg, i, j);
        this.u = gwb.a(lta.a);
        this.v = gwb.a(lta.c);
        this.w = gwb.a(gwb.H(), lta.b, null);
    }

    public List<edo> f() {
        List<edo> arrayList = new ArrayList(this.w);
        arrayList.add(this.b);
        return arrayList;
    }

    public int d() {
        return this.u;
    }

    public int e() {
        return this.v;
    }

    public List<edo> g() {
        return this.w;
    }

    protected void b(blo blo, fhc fhc) {
        String a = a();
        if (d) {
            String str = "processMembershipChange conversationId: ";
            String valueOf = String.valueOf(a);
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        blo.a();
        try {
            blf.a(blo, this, fhc, true);
            blo.b();
            glk.a("Babel", "updating conversation (name/avatars) because of a memebership change.", new Object[0]);
            blf.b(blo, a);
            blf.d(blo);
            blf.d(blo, a);
            blf.c(blo, a);
        } finally {
            blo.c();
        }
    }
}
