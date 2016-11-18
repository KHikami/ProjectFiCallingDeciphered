package p000;

import android.os.AsyncTask;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class fii extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ RealTimeChatService f13117a;

    public fii(RealTimeChatService realTimeChatService) {
        this.f13117a = realTimeChatService;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m15340a();
    }

    private Void m15340a() {
        long a = gwb.m1519a(gwb.m1400H(), "babel_rtcs_watchdog_warning", 0);
        long a2 = gwb.m1519a(gwb.m1400H(), "babel_rtcs_watchdog_error", 0);
        if (a > 0 || a2 > 0) {
            this.f13117a.f6767m = new fij(this, "RTCS-watchdog", a, a2);
        }
        return null;
    }
}
