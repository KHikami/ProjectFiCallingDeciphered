package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

final class bgk implements bhf, bhj, bhm {
    private final int f3318a;
    private final List<String> f3319b;
    private blo f3320c;
    private final bhk f3321d;
    private final bhr f3322e;

    bgk(int i, long j) {
        this.f3318a = i;
        this.f3319b = new ArrayList();
        this.f3321d = bhk.USE_OLD;
        this.f3322e = new bhs().m5272d(j).m5267a();
    }

    bgk(int i, long j, List<String> list) {
        this.f3318a = i;
        this.f3319b = list;
        this.f3321d = bhk.REPLACE_OLD;
        this.f3322e = new bhs().m5272d(j).m5267a();
    }

    public bhr mo540a() {
        return this.f3322e;
    }

    public void mo541a(Context context) {
    }

    public String mo542b() {
        return getClass().getName();
    }

    public bhk mo543c() {
        return this.f3321d;
    }

    public bhu mo544d() {
        return new bhv().m5276a();
    }

    public int mo539a(Context context, bhb bhb) {
        if (this.f3320c == null) {
            try {
                this.f3320c = new blo(context, this.f3318a);
            } catch (bmu e) {
                glk.m17970a("Babel_CMTRLogTask", "AccountId is no longer valid: %d.", Integer.valueOf(this.f3318a));
                return bhn.f3348a;
            }
        }
        List v = this.f3320c.m6109v();
        iid a = ((iih) jyn.m25426a(context, iih.class)).mo1979a(this.f3318a);
        for (String contains : this.f3319b) {
            if (!v.contains(contains)) {
                a.mo1693b().mo1714c(2925);
            }
        }
        if (!v.isEmpty() && this.f3319b.isEmpty()) {
            glk.m17970a("Babel_CMTRLogTask", "Found %d ongoing hangouts.", Integer.valueOf(v.size()));
            long a2 = gwb.m1519a(context, "babel_call_media_type_refresh_max_delay_ms", fls.f13445v);
            long a3 = gwb.m1519a(context, "babel_call_media_type_refresh_min_delay_ms", fls.f13446w);
            ((bhl) jyn.m25426a(context, bhl.class)).mo550a(new bgj(this.f3318a, ((long) mfo.f27617a.nextInt((int) (a2 - a3))) + a3, v));
            glk.m17970a("Babel_CMTRLogTask", "call_media_type refresh task scheduled with a delay of %d ms and %d conversations for account %d.", Long.valueOf(a2), Integer.valueOf(v.size()), Integer.valueOf(this.f3318a));
        }
        return bhn.f3348a;
    }
}
