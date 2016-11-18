package p000;

import android.content.Context;
import java.util.concurrent.TimeUnit;

public class fnt implements bhf, bhh, bhj, bhm {
    private final bhr f13545a;
    private final bhu f13546b = new bhv().m5277a(true).m5276a();

    public fnt(Context context) {
        this.f13545a = new bhs().m5272d(TimeUnit.MILLISECONDS.convert(gwb.m1519a(context, "babel_ac_registration_renew_window_seconds", fls.f13424a), TimeUnit.SECONDS)).m5267a();
    }

    public bhr mo540a() {
        return this.f13545a;
    }

    public void mo541a(Context context) {
    }

    public bhk mo543c() {
        return bhk.USE_OLD;
    }

    public bhu mo544d() {
        return this.f13546b;
    }

    public int mo539a(Context context, bhb bhb) {
        fnc fnc = (fnc) jyn.m25426a(context, fnc.class);
        for (int a : fde.m15024g()) {
            fnc.mo2044a(a);
        }
        return bhn.f3349b;
    }

    public String mo542b() {
        return "account_reg_renewal";
    }
}
