package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.api.client.http.HttpStatusCodes;

public class fkd implements bhf, bhj, bhm {
    private final int f13307a;
    private final bhr f13308b = new bhs().m5272d(0).m5267a();

    public fkd(int i) {
        this.f13307a = i;
    }

    public int mo539a(Context context, bhb bhb) {
        bko e = fde.m15018e(this.f13307a);
        Object h = fde.m15025h(this.f13307a);
        if (e == null || TextUtils.isEmpty(h)) {
            return bhn.f3351d;
        }
        this.f13308b.m5261a((long) gwb.m1492a(context, "babel_ac_renew_renew_period_ms", 240000));
        if (!((fkb) jyn.m25426a(context, fkb.class)).f13305a || gwb.m1459V(context)) {
            return bhn.f3349b;
        }
        ((bhl) jyn.m25426a(context, bhl.class)).mo550a(new feg(new evk(h, true, gwb.m1492a(context, "babel_ac_renew_cycle_seconds", (int) HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES), true), this.f13307a));
        return bhn.f3349b;
    }

    public bhr mo540a() {
        return this.f13308b;
    }

    public void mo541a(Context context) {
    }

    public bhu mo544d() {
        return new bhv().m5277a(true).m5276a();
    }

    public String mo542b() {
        String valueOf = String.valueOf(getClass().getName());
        return new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.f13307a).toString();
    }

    public bhk mo543c() {
        return bhk.REPLACE_OLD;
    }
}
