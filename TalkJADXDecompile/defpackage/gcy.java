package defpackage;

import android.content.Context;
import java.util.concurrent.CountDownLatch;

/* renamed from: gcy */
public final class gcy implements iea, ieb, iee<ied> {
    public static gcy d;
    final CountDownLatch a;
    final idx b;
    final ifi c;
    private final Context e;

    public /* synthetic */ void a(ied ied) {
        b(ied);
    }

    public gcy(Context context) {
        this.a = new CountDownLatch(1);
        this.e = context;
        this.b = ((idy) jyn.a(context, idy.class)).a(((ifj) jyn.a(context, ifj.class)).a()).a((iea) this).a((ieb) this).a();
        this.b.a();
        this.c = (ifi) jyn.a(context, ifi.class);
    }

    public void a(ifk ifk) {
        long a = (long) gwb.a(this.e, "babel_telephony_feedback_api_timeout_millis", 5000);
        String valueOf = String.valueOf(ifk);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 79).append("TeleFeedbackSender.sendFeedback, options: ").append(valueOf).append(", timeoutMillis: ").append(a).toString(), new Object[0]);
        new gcz(this, a, ifk).execute(new Void[0]);
    }

    public void a() {
        glk.c("Babel_telephony", "TeleFeedbackSender.onConnected", new Object[0]);
        this.a.countDown();
    }

    public void a(int i) {
        glk.c("Babel_telephony", "TeleFeedbackSender.onConnectionSuspended, code: " + i, new Object[0]);
    }

    public void a(idr idr) {
        String valueOf = String.valueOf(idr);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 47).append("TeleFeedbackSender.onConnectionFailed, result: ").append(valueOf).toString(), new Object[0]);
        this.a.countDown();
    }

    private void b(ied ied) {
        String valueOf = String.valueOf(ied);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 29).append("TeleFeedbackSender.onResult: ").append(valueOf).toString(), new Object[0]);
        this.b.b();
    }
}
