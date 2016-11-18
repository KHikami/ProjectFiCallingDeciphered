package p000;

import android.content.Context;
import java.util.concurrent.CountDownLatch;

public final class gcy implements iea, ieb, iee<ied> {
    public static gcy f14712d;
    final CountDownLatch f14713a = new CountDownLatch(1);
    final idx f14714b;
    final ifi f14715c;
    private final Context f14716e;

    public /* synthetic */ void mo1921a(ied ied) {
        m17002b(ied);
    }

    public gcy(Context context) {
        this.f14716e = context;
        this.f14714b = ((idy) jyn.m25426a(context, idy.class)).mo3153a(((ifj) jyn.m25426a(context, ifj.class)).mo3175a()).mo3154a((iea) this).mo3155a((ieb) this).mo3152a();
        this.f14714b.mo3165a();
        this.f14715c = (ifi) jyn.m25426a(context, ifi.class);
    }

    public void m17007a(ifk ifk) {
        long a = (long) gwb.m1492a(this.f14716e, "babel_telephony_feedback_api_timeout_millis", 5000);
        String valueOf = String.valueOf(ifk);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 79).append("TeleFeedbackSender.sendFeedback, options: ").append(valueOf).append(", timeoutMillis: ").append(a).toString(), new Object[0]);
        new gcz(this, a, ifk).execute(new Void[0]);
    }

    public void mo2183a() {
        glk.m17979c("Babel_telephony", "TeleFeedbackSender.onConnected", new Object[0]);
        this.f14713a.countDown();
    }

    public void mo2184a(int i) {
        glk.m17979c("Babel_telephony", "TeleFeedbackSender.onConnectionSuspended, code: " + i, new Object[0]);
    }

    public void mo2185a(idr idr) {
        String valueOf = String.valueOf(idr);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 47).append("TeleFeedbackSender.onConnectionFailed, result: ").append(valueOf).toString(), new Object[0]);
        this.f14713a.countDown();
    }

    private void m17002b(ied ied) {
        String valueOf = String.valueOf(ied);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 29).append("TeleFeedbackSender.onResult: ").append(valueOf).toString(), new Object[0]);
        this.f14714b.mo3168b();
    }
}
