import android.content.Context;
import java.util.List;

public class fiy implements bhf, bhj, bhm {
    private final int a;
    private final bhr b;
    private final long c;
    private long d;

    public fiy(int i, Context context) {
        this.a = i;
        this.c = (long) gwb.a(context, "babel_refresh_participants_renew_period_ms", 86400000);
        this.d = ((jcf) jyn.a(context, jcf.class)).a(i).a("refresh_participants_time", 0);
        long j = this.d + this.c;
        long a = glj.a();
        if (this.d == 0 || a >= j || this.d > a) {
            j = 0;
        } else {
            j -= a;
        }
        this.b = new bhs().d(j).a();
    }

    public bhr a() {
        return this.b;
    }

    public void a(Context context) {
    }

    public bhu d() {
        return new bhv().a(true).a();
    }

    public String b() {
        String valueOf = String.valueOf(getClass().getName());
        return new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.a).toString();
    }

    public bhk c() {
        return bhk.USE_OLD;
    }

    public int a(Context context, bhb bhb) {
        Throwable e;
        try {
            List n = new blo(context, this.a).n();
            if (n.size() > 0) {
                ((bhl) jyn.a(context, bhl.class)).a(new feg(new eux(n, null, false, true), this.a));
            }
            this.d = glj.a();
            ((jcf) jyn.a(context, jcf.class)).b(this.a).b("refresh_participants_time", this.d).d();
            this.b.a(this.c);
            return bhn.b;
        } catch (bmu e2) {
            e = e2;
            glk.d("Babel", String.format("Missing account %d for RefreshParticipantsPeriodicTask", new Object[]{Integer.valueOf(this.a)}), e);
            return bhn.c;
        } catch (jcj e3) {
            e = e3;
            glk.d("Babel", String.format("Missing account %d for RefreshParticipantsPeriodicTask", new Object[]{Integer.valueOf(this.a)}), e);
            return bhn.c;
        }
    }
}
