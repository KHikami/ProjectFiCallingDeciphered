package p000;

import java.util.ArrayList;
import java.util.List;

public final class ewc extends ewu {
    private static final long serialVersionUID = 1;
    public final List<edo> f12407g;
    private final List<fbv> f12408j;
    private final long f12409k;

    ewc(lnp lnp) {
        super(lnp, lnp.responseHeader, gwb.m1523a(lnp.f25798b.f26108c), gwb.m1523a(lnp.f25798b.f26120o), lnp.f25798b.f26109d);
        this.f12408j = fbv.m14926a(lnp.f25797a);
        this.f12409k = gwb.m1523a(lnp.f25798b.f26120o);
        if (lnp.f25798b.f26113h != null) {
            this.f12407g = gwb.m1694a(gwb.m1400H(), lnp.f25798b.f26113h.f26359b, null);
        } else {
            this.f12407g = null;
        }
        if (evz.f5798a) {
            String valueOf = String.valueOf(lnp);
            new StringBuilder(String.valueOf(valueOf).length() + 21).append("AddUserResponse from:").append(valueOf);
        }
    }

    static boolean m14705a(lnp lnp) {
        if (gwb.m1507a(lnp.responseHeader.f26515a) != 4) {
            return false;
        }
        for (fbv fbv : fbv.m14926a(lnp.f25797a)) {
            if (fbv.f12664b == 4) {
                return true;
            }
        }
        return false;
    }

    public void mo1047a(blo blo, fhc fhc) {
        super.mo1047a(blo, fhc);
        if (blf.f3692a || evz.f5798a) {
            new StringBuilder(60).append("processAddUserResponse ClientContactError Count: ").append(this.f12408j.size());
        }
        String str = ((eum) this.b).e;
        long j = ((eum) this.b).f12302d;
        blo.m5958a();
        if (str == null) {
            try {
                glk.m17981d("Babel", new StringBuilder(String.valueOf(str).length() + 71).append("attempt to process invite response for a nonexistant conversation id [").append(str).append("]").toString(), new Object[0]);
            } catch (Throwable th) {
                blo.m6028c();
                blf.m5818c(blo, str);
                blf.m5820d(blo);
                m14704a(blo, str);
            }
        } else {
            if (this.f12407g != null) {
                for (edo a : this.f12407g) {
                    blo.m5982a(str, a, true);
                }
            }
            blo.m5976a(str, j, this.d, this.f12409k);
            if (this.f12408j.size() > 0) {
                blf.m5793a(blo, this.f12408j, str, String.valueOf(this.d), this.d, this.f12409k);
            }
        }
        blo.m6015b();
        blo.m6028c();
        blf.m5818c(blo, str);
        blf.m5820d(blo);
        m14704a(blo, str);
    }

    private void m14704a(blo blo, String str) {
        List arrayList = new ArrayList(this.f12408j.size());
        Object obj = null;
        for (fbv fbv : this.f12408j) {
            Object obj2;
            if (fbv.f12664b == 4) {
                arrayList.add(gwb.m1598a(gwb.m1400H(), fbv.f12663a.f12666a, fbv.f12663a.f12667b, fbv.f12663a.f12668c, fbv.f12663a.f12669d, null, null, fbv.f12663a.f12670e, null, null, Boolean.valueOf(false)));
                obj2 = 1;
            } else {
                obj2 = obj;
            }
            obj = obj2;
        }
        if (obj != null) {
            blf.m5787a(blo, str, arrayList);
        }
    }
}
