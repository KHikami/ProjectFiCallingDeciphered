package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Collection;
import java.util.Random;

public final class fjh implements bhf, bhi, bhj, bhm {
    private static final gma f13183a = RealTimeChatService.f6745b;
    private static final Random f13184b = mfo.f27617a;
    private final boolean f13185c;
    private final boolean f13186d;
    private final flt f13187e;
    private final int f13188f;

    public bhr mo540a() {
        return null;
    }

    public void mo541a(Context context) {
    }

    public bhu mo544d() {
        return new bhv().m5277a(true).m5276a();
    }

    public String mo542b() {
        return "WarmSync_Acct_" + this.f13188f;
    }

    fjh(fji fji) {
        this.f13188f = fji.f13189a;
        this.f13185c = fji.f13190b;
        this.f13186d = fji.f13191c;
        this.f13187e = fji.f13192d;
    }

    public bhk mo543c() {
        return bhk.USE_OLD;
    }

    private String m15413e() {
        long a = glj.m17956a() * 1000;
        String valueOf = String.valueOf(this.f13187e.toString());
        String valueOf2 = String.valueOf(Long.toString(a + ((long) f13184b.nextInt(1000))));
        return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append(":").append(valueOf2).toString();
    }

    public int mo539a(Context context, bhb bhb) {
        int i;
        if (fde.m15015d(fde.m15018e(this.f13188f))) {
            return bhn.f3350c;
        }
        String b = f13183a.m18078b("ReqWarmSyncTask");
        jci b2 = ((jcf) jyn.m25426a(context, jcf.class)).mo3464b(this.f13188f);
        long a = gwb.m1519a(context, "babel_warm_sync_cooldown_threshold_ms", fls.f13427d);
        long a2 = glj.m17956a();
        long a3 = b2.mo3434a("last_warm_sync_execution_time_ms", 0);
        if (a2 - a3 >= a || a2 < a3) {
            try {
                b2.m23878b("last_warm_sync_execution_time_ms", a2).m23891d();
                fhc fhc = new fhc();
                try {
                    ((bln) jyn.m25426a(context, bln.class)).mo611a(new blo(context, this.f13188f), fhc, this.f13185c, this.f13186d, m15413e());
                    i = this.f13188f;
                    Collection b3 = fhc.m15311b();
                    if (!b3.isEmpty()) {
                        fde.m15019e(fde.m15018e(i)).m15080a(b3, -1, null);
                        fhc.m15313c();
                    }
                    f13183a.m18079c(b);
                    return bhn.f3348a;
                } catch (bmu e) {
                    i = bhn.f3350c;
                    f13183a.m18079c(b);
                    return i;
                } catch (jcj e2) {
                    i = bhn.f3350c;
                    f13183a.m18079c(b);
                    return i;
                }
            } finally {
                f13183a.m18079c(b);
            }
        } else {
            i = bhn.f3351d;
            return i;
        }
    }
}
