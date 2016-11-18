package p000;

import android.content.Context;
import java.util.List;

public class fiy implements bhf, bhj, bhm {
    private final int f13150a;
    private final bhr f13151b;
    private final long f13152c;
    private long f13153d;

    public fiy(int i, Context context) {
        this.f13150a = i;
        this.f13152c = (long) gwb.m1492a(context, "babel_refresh_participants_renew_period_ms", 86400000);
        this.f13153d = ((jcf) jyn.m25426a(context, jcf.class)).mo3456a(i).mo3434a("refresh_participants_time", 0);
        long j = this.f13153d + this.f13152c;
        long a = glj.m17956a();
        if (this.f13153d == 0 || a >= j || this.f13153d > a) {
            j = 0;
        } else {
            j -= a;
        }
        this.f13151b = new bhs().m5272d(j).m5267a();
    }

    public bhr mo540a() {
        return this.f13151b;
    }

    public void mo541a(Context context) {
    }

    public bhu mo544d() {
        return new bhv().m5277a(true).m5276a();
    }

    public String mo542b() {
        String valueOf = String.valueOf(getClass().getName());
        return new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.f13150a).toString();
    }

    public bhk mo543c() {
        return bhk.USE_OLD;
    }

    public int mo539a(Context context, bhb bhb) {
        Throwable e;
        try {
            List n = new blo(context, this.f13150a).m6092n();
            if (n.size() > 0) {
                ((bhl) jyn.m25426a(context, bhl.class)).mo550a(new feg(new eux(n, null, false, true), this.f13150a));
            }
            this.f13153d = glj.m17956a();
            ((jcf) jyn.m25426a(context, jcf.class)).mo3464b(this.f13150a).m23878b("refresh_participants_time", this.f13153d).m23891d();
            this.f13151b.m5261a(this.f13152c);
            return bhn.f3349b;
        } catch (bmu e2) {
            e = e2;
            glk.m17980d("Babel", String.format("Missing account %d for RefreshParticipantsPeriodicTask", new Object[]{Integer.valueOf(this.f13150a)}), e);
            return bhn.f3350c;
        } catch (jcj e3) {
            e = e3;
            glk.m17980d("Babel", String.format("Missing account %d for RefreshParticipantsPeriodicTask", new Object[]{Integer.valueOf(this.f13150a)}), e);
            return bhn.f3350c;
        }
    }
}
