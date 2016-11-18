package defpackage;

import android.content.Context;
import java.util.Locale;

final class gex implements irl, Runnable {
    final /* synthetic */ geu a;
    private boolean b;
    private long c;

    gex(geu geu) {
        this.a = geu;
    }

    public void a(String str) {
        int b = (int) (glj.b() - this.c);
        glk.c("Babel_telephony", "HangoutIdCreatorListener.onSuccess, time taken to create hangoutId : " + b + " millis", new Object[0]);
        boolean z = this.b;
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(str).length() + 105).append("HangoutIdCreatorListener.onSuccess, Received hangoutId : ").append(str).append(" responseReceived : ").append(z).append(", setupFinished : ").append(this.a.g).toString(), new Object[0]);
        if (((long) b) < a(this.a.h)) {
            this.a.a(2890, b);
            a(str, true);
            return;
        }
        c();
    }

    public void a() {
        boolean z = this.b;
        glk.c("Babel_telephony", "HangoutIdCreatorListener.onFailure, Failed to create hangoutId\n responseReceived : " + z + ", setupFinished : " + this.a.g, new Object[0]);
        this.a.a(2889, -1);
        a(null, false);
    }

    public void run() {
        boolean z = this.b;
        glk.c("Babel_telephony", "HangoutIdCreatorListener.run, timed out when creating hangoutId\n responseReceived : " + z + ", setupFinished : " + this.a.g, new Object[0]);
        c();
    }

    private void c() {
        this.a.a(2889, (int) (glj.b() - this.c));
        glk.c("Babel_telephony", "HangoutIdCreatorListener.handleSlowHangoutIdCreation, latency too high. Using cell", new Object[0]);
        a(null, false);
    }

    void b() {
        gwb.aL().postDelayed(this, a(this.a.h));
        this.c = glj.b();
    }

    private long a(geb geb) {
        String str;
        if (geb.b.a) {
            str = "wifi";
        } else {
            str = gwb.v(geb.a.e);
        }
        str = String.format(Locale.US, "_network_type_%s", new Object[]{str});
        Context context = this.a.a;
        String valueOf = String.valueOf("babel_data_calls_create_hangout_id_timeout_millis");
        str = String.valueOf(str);
        return gwb.a(context, str.length() != 0 ? valueOf.concat(str) : new String(valueOf), gda.c);
    }

    private void a(String str, boolean z) {
        gwb.aL().removeCallbacks(this);
        if (!this.b && !this.a.g) {
            if (str != null) {
                this.a.b(str);
            }
            if (!z) {
                this.a.a(z);
            }
            this.b = true;
            this.a.m();
        }
    }
}
