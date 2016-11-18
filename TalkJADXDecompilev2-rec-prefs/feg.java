package p000;

import android.content.Context;
import java.util.List;

public final class feg implements bhd, bhf, bhg, bhh, bhj, bhm {
    private static final gma f12883a = gma.m18073a("Babel_ConcNetwork");
    private final int f12884b;
    private final ead f12885c;
    private final int f12886d;
    private final long f12887e = glj.m17963b();
    private final bhr f12888f;
    private final fee f12889g;

    public feg(fok fok, int i) {
        this.f12884b = fok.L_();
        this.f12885c = fok.mo1021a();
        this.f12886d = i;
        this.f12889g = new fee(mo542b(), i);
        f12883a.m18078b(feg.m15146a("REQ_", this.f12885c));
        bhs bhs = new bhs();
        long b = this.f12885c.mo1017b();
        if (b == Long.MAX_VALUE) {
            bhs.m5271c(Long.MAX_VALUE);
        } else if (b == 0) {
            bhs.m5272d(0);
        } else {
            bhs.m5271c(b);
            if (b < bhr.f3369a) {
                bhs.m5270b(b);
            }
        }
        bhs.m5269a(true);
        this.f12888f = bhs.m5267a();
    }

    private static String m15146a(String str, ead ead) {
        String valueOf = String.valueOf(ead.getClass().getCanonicalName());
        String valueOf2 = String.valueOf(ead.K_());
        return new StringBuilder(((String.valueOf(str).length() + 1) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append(str).append(valueOf).append("_").append(valueOf2).toString();
    }

    public bhr mo540a() {
        return this.f12888f;
    }

    public void mo541a(Context context) {
        this.f12885c.a_(context, this.f12886d, fdo.f12752a);
    }

    public bhk mo543c() {
        return bhk.NONE;
    }

    public bhu mo544d() {
        return new bhv().m5277a(this.f12885c.mo1019d()).m5276a();
    }

    public String mo542b() {
        String str = "ConcReq_";
        String valueOf = String.valueOf(this.f12885c.K_());
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public int mo539a(Context context, bhb bhb) {
        long b;
        long b2;
        try {
            f12883a.m18079c(feg.m15146a("REQ_", this.f12885c));
            gma gma = f12883a;
            String valueOf = String.valueOf("RUN_");
            String valueOf2 = String.valueOf(this.f12885c.getClass());
            String b3 = gma.m18078b(new StringBuilder((String.valueOf(valueOf).length() + 0) + String.valueOf(valueOf2).length()).append(valueOf).append(valueOf2).toString());
            b = glj.m17963b();
            b2 = this.f12885c.mo1017b();
            long j = this.f12887e + b2;
            if (b2 != Long.MAX_VALUE && b2 != 0 && b > j) {
                glk.m17982e("Babel_ConcNetwork", "Expired " + b + " > " + j, new Object[0]);
                throw fdo.f12752a;
            } else if (fde.m15018e(this.f12886d) == null) {
                glk.m17982e("Babel_ConcNetwork", "Invalid Account: " + this.f12886d, new Object[0]);
                throw new fdo(139);
            } else {
                this.f12885c.mo1007a(context, this.f12889g);
                f12883a.m18079c(b3);
                return bhn.f3348a;
            }
        } catch (fdo e) {
            b = e.m15082a();
            b2 = this.f12888f.m5265e();
            if (b == 0 || b < b2) {
                this.f12888f.m5260a();
            } else {
                this.f12888f.m5261a(b);
            }
            this.f12889g.m13271e();
            if (gwb.m2308n(e.m15084c())) {
                this.f12889g.m13272f();
            }
            if (gwb.m2317o(e.m15084c()) && this.f12885c.mo1008a(context, this.f12889g, e)) {
                return bhn.f3349b;
            }
            this.f12885c.a_(context, this.f12886d, e);
            return bhn.f3351d;
        } catch (Exception e2) {
            this.f12889g.m13271e();
            this.f12885c.a_(context, this.f12886d, new fdo(139, e2));
            return bhn.f3350c;
        }
    }

    public List<bhc> mo1983e() {
        return this.f12885c.mo1010e();
    }

    public void mo1981b(Context context) {
        this.f12885c.mo1011f();
    }

    public void mo1982c(Context context) {
        this.f12885c.a_(context, this.f12886d, fdo.f12753b);
    }
}
