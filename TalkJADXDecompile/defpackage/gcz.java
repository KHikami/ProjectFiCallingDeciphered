package defpackage;

import android.os.AsyncTask;
import java.util.concurrent.TimeUnit;

/* renamed from: gcz */
final class gcz extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ long a;
    final /* synthetic */ ifk b;
    final /* synthetic */ gcy c;

    gcz(gcy gcy, long j, ifk ifk) {
        this.c = gcy;
        this.a = j;
        this.b = ifk;
    }

    public /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    public /* synthetic */ void onPostExecute(Object obj) {
        b();
    }

    private Void a() {
        try {
            this.c.a.await(this.a, TimeUnit.MILLISECONDS);
        } catch (Throwable e) {
            glk.d("Babel_telephony", "TeleFeedbackSender.sendFeedback, exception", e);
        }
        return null;
    }

    private void b() {
        if (this.c.b.c()) {
            glk.c("Babel_telephony", "TeleFeedbackSender.sendFeedback, calling startFeedback", new Object[0]);
            this.c.c.a(this.c.b).b(this.b).a(this.c);
            return;
        }
        glk.c("Babel_telephony", "TeleFeedbackSender.sendFeedback, API not connected, skipping", new Object[0]);
    }
}
