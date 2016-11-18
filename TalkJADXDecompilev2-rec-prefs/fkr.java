package p000;

import android.content.Context;

public class fkr implements bhf, bhj, bhm {
    private final int f13330a;

    public fkr(int i) {
        this.f13330a = i;
    }

    public String mo542b() {
        String valueOf = String.valueOf(getClass().getName());
        return new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.f13330a).toString();
    }

    public bhk mo543c() {
        return bhk.REPLACE_OLD;
    }

    public int mo539a(Context context, bhb bhb) {
        try {
            ((bhl) jyn.m25426a(context, bhl.class)).mo550a(new feg(new evb(gwb.m1492a(context, "babel_sc_max_pinned", 500), gwb.m1492a(context, "babel_sc_max_favorites", 15), gwb.m1492a(context, "babel_sc_max_you_hangout_with", 500), gwb.m1492a(context, "babel_sc_max_other_contacts_on_hangouts", 500), gwb.m1492a(context, "babel_sc_max_dismissed", 500), bkq.m5689c(context, this.f13330a, "hash_pinned"), bkq.m5689c(context, this.f13330a, "hash_favorites"), bkq.m5689c(context, this.f13330a, "hash_people_you_hangout_with"), bkq.m5689c(context, this.f13330a, "hash_other_people_on_hangout"), bkq.m5689c(context, this.f13330a, "hash_dismissed_contacts")), this.f13330a));
            bkq.m5677b(context, this.f13330a, "last_suggested_contacts_time", glj.m17956a());
            return bhn.f3348a;
        } catch (jcj e) {
            return bhn.f3350c;
        }
    }

    public bhr mo540a() {
        return null;
    }

    public void mo541a(Context context) {
    }

    public bhu mo544d() {
        return new bhv().m5277a(true).m5276a();
    }
}
