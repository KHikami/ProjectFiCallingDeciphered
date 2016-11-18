package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.api.client.http.HttpStatusCodes;

public class fkh implements bhf, bhj, bhm {
    private final int f13315a;

    public fkh(int i) {
        this.f13315a = i;
    }

    public int mo539a(Context context, bhb bhb) {
        bko e = fde.m15018e(this.f13315a);
        Object h = fde.m15025h(this.f13315a);
        if (e == null || TextUtils.isEmpty(h)) {
            return bhn.f3351d;
        }
        ((bhl) jyn.m25426a(context, bhl.class)).mo550a(new feg(new evk(h, false, gwb.m1492a(context, "babel_ac_renew_cycle_seconds", (int) HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES), true), this.f13315a));
        return bhn.f3348a;
    }

    public bhr mo540a() {
        return null;
    }

    public void mo541a(Context context) {
    }

    public bhu mo544d() {
        return new bhv().m5277a(true).m5276a();
    }

    public String mo542b() {
        return getClass().getName();
    }

    public bhk mo543c() {
        return bhk.USE_OLD;
    }
}
