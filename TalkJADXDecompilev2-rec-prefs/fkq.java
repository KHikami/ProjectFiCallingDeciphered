package p000;

import android.content.Context;

public class fkq implements bhf, bhj, bhm {
    private final bhr f13327a;
    private final int f13328b;
    private final long f13329c;

    public fkq(int i, Context context) {
        this.f13329c = (long) gwb.m1492a(context, "babel_suggested_contact_renew_period_ms", 86400000);
        this.f13328b = i;
        long a = ((jcf) jyn.m25426a(context, jcf.class)).mo3456a(i).mo3434a("last_suggested_contacts_time", 0);
        long j = this.f13329c + a;
        long a2 = glj.m17956a();
        if (a == 0 || a2 >= j || a > a2) {
            a = 0;
        } else {
            a = j - a2;
        }
        this.f13327a = new bhs().m5272d(a).m5267a();
    }

    public int mo539a(Context context, bhb bhb) {
        jyn b = jyn.m25435b(context);
        try {
            ((jcf) b.m25443a(jcf.class)).mo3464b(this.f13328b);
            ((bhl) b.m25443a(bhl.class)).mo550a(new fkr(this.f13328b));
            this.f13327a.m5261a(this.f13329c);
            return bhn.f3349b;
        } catch (jcj e) {
            return bhn.f3350c;
        }
    }

    public bhr mo540a() {
        return this.f13327a;
    }

    public void mo541a(Context context) {
    }

    public bhu mo544d() {
        return new bhv().m5277a(true).m5276a();
    }

    public bhk mo543c() {
        return bhk.REPLACE_OLD;
    }

    public String mo542b() {
        String valueOf = String.valueOf(getClass().getName());
        return new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.f13328b).toString();
    }
}
