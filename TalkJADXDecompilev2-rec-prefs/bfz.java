package p000;

import android.content.Context;

public final class bfz extends hv<beq> {
    private final Context f3241f;
    private final int f3242g;
    private final boolean f3243h = false;

    public /* synthetic */ Object mo213d() {
        return m5086h();
    }

    public bfz(Context context, boolean z) {
        super(context);
        this.f3241f = context.getApplicationContext();
        this.f3242g = ((jca) jyn.m25426a(context, jca.class)).mo2317a();
    }

    private beq m5086h() {
        if (!gwb.m2222g(this.f3241f, this.f3242g)) {
            return null;
        }
        beq a = bes.m5025a(this.f3241f, this.f3242g);
        if (this.f3243h && a != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - a.m5010b() < ((biw) jyn.m25426a(this.f3241f, biw.class)).mo561a("babel_dialer_callerid_dialer_redisplay_interval_ms", bew.f3166b)) {
                return null;
            }
            a.m5008a(currentTimeMillis);
        }
        return a;
    }
}
