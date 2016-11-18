package defpackage;

import android.content.Context;

public class fks implements bhf, bhj, bhm {
    private final int a;
    private final long b;
    private final bhr c;
    private long d;

    public fks(int i, Context context) {
        ba.b(((fzw) jyn.a(context, fzw.class)).i());
        this.a = i;
        this.b = gwb.a(context, "babel_sms_background_sync_refresh_period_ms", fls.m);
        this.d = bkq.a(context, i, "sms_last_full_sync_time_millis", 0);
        long j = this.d + this.b;
        long a = glj.a();
        if (this.d == 0 || a >= j || this.d > a) {
            j = 0;
        } else {
            j -= a;
        }
        this.c = new bhs().d(j).a();
    }

    public int a(Context context, bhb bhb) {
        bko e = fde.e(this.a);
        fzw fzw = (fzw) jyn.a(context, fzw.class);
        if (!fde.i() || e == null || !fzw.b(this.a)) {
            return bhn.c;
        }
        fzb.a(e, true);
        this.c.a(this.b);
        return bhn.b;
    }

    public bhr a() {
        return this.c;
    }

    public void a(Context context) {
    }

    public bhu d() {
        return new bhv().a();
    }

    public String b() {
        String valueOf = String.valueOf(getClass().getName());
        return new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.a).toString();
    }

    public bhk c() {
        return bhk.USE_OLD;
    }
}
