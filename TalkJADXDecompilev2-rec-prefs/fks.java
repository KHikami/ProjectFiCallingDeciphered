package p000;

import android.content.Context;

public class fks implements bhf, bhj, bhm {
    private final int f13331a;
    private final long f13332b;
    private final bhr f13333c;
    private long f13334d;

    public fks(int i, Context context) {
        ba.m4609b(((fzw) jyn.m25426a(context, fzw.class)).mo2161i());
        this.f13331a = i;
        this.f13332b = gwb.m1519a(context, "babel_sms_background_sync_refresh_period_ms", fls.f13436m);
        this.f13334d = bkq.m5659a(context, i, "sms_last_full_sync_time_millis", 0);
        long j = this.f13334d + this.f13332b;
        long a = glj.m17956a();
        if (this.f13334d == 0 || a >= j || this.f13334d > a) {
            j = 0;
        } else {
            j -= a;
        }
        this.f13333c = new bhs().m5272d(j).m5267a();
    }

    public int mo539a(Context context, bhb bhb) {
        bko e = fde.m15018e(this.f13331a);
        fzw fzw = (fzw) jyn.m25426a(context, fzw.class);
        if (!fde.m15028i() || e == null || !fzw.mo2148b(this.f13331a)) {
            return bhn.f3350c;
        }
        fzb.m16669a(e, true);
        this.f13333c.m5261a(this.f13332b);
        return bhn.f3349b;
    }

    public bhr mo540a() {
        return this.f13333c;
    }

    public void mo541a(Context context) {
    }

    public bhu mo544d() {
        return new bhv().m5276a();
    }

    public String mo542b() {
        String valueOf = String.valueOf(getClass().getName());
        return new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.f13331a).toString();
    }

    public bhk mo543c() {
        return bhk.USE_OLD;
    }
}
