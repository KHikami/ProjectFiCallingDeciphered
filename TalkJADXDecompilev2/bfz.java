package defpackage;

import android.content.Context;

public final class bfz extends hv<beq> {
    private final Context f;
    private final int g;
    private final boolean h = false;

    public /* synthetic */ Object d() {
        return h();
    }

    public bfz(Context context, boolean z) {
        super(context);
        this.f = context.getApplicationContext();
        this.g = ((jca) jyn.a(context, jca.class)).a();
    }

    private beq h() {
        if (!gwb.g(this.f, this.g)) {
            return null;
        }
        beq a = bes.a(this.f, this.g);
        if (this.h && a != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - a.b() < ((biw) jyn.a(this.f, biw.class)).a("babel_dialer_callerid_dialer_redisplay_interval_ms", bew.b)) {
                return null;
            }
            a.a(currentTimeMillis);
        }
        return a;
    }
}
