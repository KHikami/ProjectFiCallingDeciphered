import java.util.ArrayList;
import java.util.List;

public final class ewc extends ewu {
    private static final long serialVersionUID = 1;
    public final List<edo> g;
    private final List<fbv> j;
    private final long k;

    ewc(lnp lnp) {
        super(lnp, lnp.responseHeader, gwb.a(lnp.b.c), gwb.a(lnp.b.o), lnp.b.d);
        this.j = fbv.a(lnp.a);
        this.k = gwb.a(lnp.b.o);
        if (lnp.b.h != null) {
            this.g = gwb.a(gwb.H(), lnp.b.h.b, null);
        } else {
            this.g = null;
        }
        if (evz.a) {
            String valueOf = String.valueOf(lnp);
            new StringBuilder(String.valueOf(valueOf).length() + 21).append("AddUserResponse from:").append(valueOf);
        }
    }

    static boolean a(lnp lnp) {
        if (gwb.a(lnp.responseHeader.a) != 4) {
            return false;
        }
        for (fbv fbv : fbv.a(lnp.a)) {
            if (fbv.b == 4) {
                return true;
            }
        }
        return false;
    }

    public void a(blo blo, fhc fhc) {
        super.a(blo, fhc);
        if (blf.a || evz.a) {
            new StringBuilder(60).append("processAddUserResponse ClientContactError Count: ").append(this.j.size());
        }
        String str = ((eum) this.b).e;
        long j = ((eum) this.b).d;
        blo.a();
        if (str == null) {
            try {
                glk.d("Babel", new StringBuilder(String.valueOf(str).length() + 71).append("attempt to process invite response for a nonexistant conversation id [").append(str).append("]").toString(), new Object[0]);
            } catch (Throwable th) {
                blo.c();
                blf.c(blo, str);
                blf.d(blo);
                a(blo, str);
            }
        } else {
            if (this.g != null) {
                for (edo a : this.g) {
                    blo.a(str, a, true);
                }
            }
            blo.a(str, j, this.d, this.k);
            if (this.j.size() > 0) {
                blf.a(blo, this.j, str, String.valueOf(this.d), this.d, this.k);
            }
        }
        blo.b();
        blo.c();
        blf.c(blo, str);
        blf.d(blo);
        a(blo, str);
    }

    private void a(blo blo, String str) {
        List arrayList = new ArrayList(this.j.size());
        Object obj = null;
        for (fbv fbv : this.j) {
            Object obj2;
            if (fbv.b == 4) {
                arrayList.add(gwb.a(gwb.H(), fbv.a.a, fbv.a.b, fbv.a.c, fbv.a.d, null, null, fbv.a.e, null, null, Boolean.valueOf(false)));
                obj2 = 1;
            } else {
                obj2 = obj;
            }
            obj = obj2;
        }
        if (obj != null) {
            blf.a(blo, str, arrayList);
        }
    }
}
