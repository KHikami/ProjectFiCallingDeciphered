package p000;

import android.os.AsyncTask;
import java.util.concurrent.TimeUnit;

final class gcz extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ long f14717a;
    final /* synthetic */ ifk f14718b;
    final /* synthetic */ gcy f14719c;

    gcz(gcy gcy, long j, ifk ifk) {
        this.f14719c = gcy;
        this.f14717a = j;
        this.f14718b = ifk;
    }

    public /* synthetic */ Object doInBackground(Object[] objArr) {
        return m17008a();
    }

    public /* synthetic */ void onPostExecute(Object obj) {
        m17009b();
    }

    private Void m17008a() {
        try {
            this.f14719c.f14713a.await(this.f14717a, TimeUnit.MILLISECONDS);
        } catch (Throwable e) {
            glk.m17980d("Babel_telephony", "TeleFeedbackSender.sendFeedback, exception", e);
        }
        return null;
    }

    private void m17009b() {
        if (this.f14719c.f14714b.mo3171c()) {
            glk.m17979c("Babel_telephony", "TeleFeedbackSender.sendFeedback, calling startFeedback", new Object[0]);
            this.f14719c.f14715c.mo3174a(this.f14719c.f14714b).mo3177b(this.f14718b).m21645a(this.f14719c);
            return;
        }
        glk.m17979c("Babel_telephony", "TeleFeedbackSender.sendFeedback, API not connected, skipping", new Object[0]);
    }
}
