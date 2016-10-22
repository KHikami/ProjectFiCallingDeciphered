package defpackage;

import android.os.AsyncTask;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

/* renamed from: fii */
public final class fii extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ RealTimeChatService a;

    public fii(RealTimeChatService realTimeChatService) {
        this.a = realTimeChatService;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    private Void a() {
        long a = gwb.a(gwb.H(), "babel_rtcs_watchdog_warning", 0);
        long a2 = gwb.a(gwb.H(), "babel_rtcs_watchdog_error", 0);
        if (a > 0 || a2 > 0) {
            this.a.m = new fij(this, "RTCS-watchdog", a, a2);
        }
        return null;
    }
}
