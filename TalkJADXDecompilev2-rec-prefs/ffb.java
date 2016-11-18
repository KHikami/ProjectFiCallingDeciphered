package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.List;

public class ffb implements bhd, bhf, bhi, bhj, bhm {
    private final bhr f12952a = new bhs().m5272d(0).m5267a();
    private final List<bhc> f12953b = new ArrayList();

    public static bhc m15180f() {
        String str = "cancel_";
        String valueOf = String.valueOf(ffb.class.getName());
        return new bhc(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public ffb() {
        this.f12953b.add(ffb.m15180f());
    }

    public bhr mo540a() {
        return this.f12952a;
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
        return bhk.REPLACE_OLD;
    }

    public int mo539a(Context context, bhb bhb) {
        if (!((bcr) jyn.m25426a(context, bcr.class)).mo468b()) {
            return bhn.f3350c;
        }
        RealTimeChatService.m9041a(flt.FOREGROUND_SYNC);
        this.f12952a.m5261a(gwb.m1519a(context, "babel_foreground_periodic_warm_sync_interval_ms", fls.f13426c));
        return bhn.f3349b;
    }

    public List<bhc> mo1983e() {
        return this.f12953b;
    }

    public void mo1981b(Context context) {
    }

    public void mo1982c(Context context) {
    }
}
