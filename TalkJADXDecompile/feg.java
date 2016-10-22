import android.content.Context;
import java.util.List;

public final class feg implements bhd, bhf, bhg, bhh, bhj, bhm {
    private static final gma a;
    private final int b;
    private final ead c;
    private final int d;
    private final long e;
    private final bhr f;
    private final fee g;

    static {
        a = gma.a("Babel_ConcNetwork");
    }

    public feg(fok fok, int i) {
        this.b = fok.L_();
        this.c = fok.a();
        this.d = i;
        this.g = new fee(b(), i);
        this.e = glj.b();
        a.b(a("REQ_", this.c));
        bhs bhs = new bhs();
        long b = this.c.b();
        if (b == Long.MAX_VALUE) {
            bhs.c(Long.MAX_VALUE);
        } else if (b == 0) {
            bhs.d(0);
        } else {
            bhs.c(b);
            if (b < bhr.a) {
                bhs.b(b);
            }
        }
        bhs.a(true);
        this.f = bhs.a();
    }

    private static String a(String str, ead ead) {
        String valueOf = String.valueOf(ead.getClass().getCanonicalName());
        String valueOf2 = String.valueOf(ead.K_());
        return new StringBuilder(((String.valueOf(str).length() + 1) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append(str).append(valueOf).append("_").append(valueOf2).toString();
    }

    public bhr a() {
        return this.f;
    }

    public void a(Context context) {
        this.c.a_(context, this.d, fdo.a);
    }

    public bhk c() {
        return bhk.NONE;
    }

    public bhu d() {
        return new bhv().a(this.c.d()).a();
    }

    public String b() {
        String str = "ConcReq_";
        String valueOf = String.valueOf(this.c.K_());
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public int a(Context context, bhb bhb) {
        long b;
        long b2;
        try {
            a.c(a("REQ_", this.c));
            gma gma = a;
            String valueOf = String.valueOf("RUN_");
            String valueOf2 = String.valueOf(this.c.getClass());
            String b3 = gma.b(new StringBuilder((String.valueOf(valueOf).length() + 0) + String.valueOf(valueOf2).length()).append(valueOf).append(valueOf2).toString());
            b = glj.b();
            b2 = this.c.b();
            long j = this.e + b2;
            if (b2 != Long.MAX_VALUE && b2 != 0 && b > j) {
                glk.e("Babel_ConcNetwork", "Expired " + b + " > " + j, new Object[0]);
                throw fdo.a;
            } else if (fde.e(this.d) == null) {
                glk.e("Babel_ConcNetwork", "Invalid Account: " + this.d, new Object[0]);
                throw new fdo(139);
            } else {
                this.c.a(context, this.g);
                a.c(b3);
                return bhn.a;
            }
        } catch (fdo e) {
            b = e.a();
            b2 = this.f.e();
            if (b == 0 || b < b2) {
                this.f.a();
            } else {
                this.f.a(b);
            }
            this.g.e();
            if (gwb.n(e.c())) {
                this.g.f();
            }
            if (gwb.o(e.c()) && this.c.a(context, this.g, e)) {
                return bhn.b;
            }
            this.c.a_(context, this.d, e);
            return bhn.d;
        } catch (Exception e2) {
            this.g.e();
            this.c.a_(context, this.d, new fdo(139, e2));
            return bhn.c;
        }
    }

    public List<bhc> e() {
        return this.c.e();
    }

    public void b(Context context) {
        this.c.f();
    }

    public void c(Context context) {
        this.c.a_(context, this.d, fdo.b);
    }
}
