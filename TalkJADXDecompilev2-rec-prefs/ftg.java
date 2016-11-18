package p000;

import android.content.Context;

public class ftg implements bhj, bhm {
    private final boolean f13957a;

    public ftg(boolean z) {
        this.f13957a = z;
    }

    public int mo539a(Context context, bhb bhb) {
        try {
            ((jmq) jyn.m25426a(context, jmq.class)).mo3575a(new jmt().m24728a(this.f13957a).m24726a());
            return bhn.f3348a;
        } catch (Throwable e) {
            glk.m17978c("Babel_AccountRefresh", "Loading device accounts failed", e);
            return bhn.f3351d;
        }
    }

    public String mo542b() {
        return "LoginManagerAccountRefreshTask";
    }

    public bhk mo543c() {
        if (this.f13957a) {
            return bhk.USE_OLD;
        }
        return bhk.REPLACE_OLD;
    }
}
