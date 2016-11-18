package p000;

import android.content.Context;
import java.util.Locale;

final class gex implements irl, Runnable {
    final /* synthetic */ geu f15119a;
    private boolean f15120b;
    private long f15121c;

    gex(geu geu) {
        this.f15119a = geu;
    }

    public void mo2250a(String str) {
        int b = (int) (glj.m17963b() - this.f15121c);
        glk.m17979c("Babel_telephony", "HangoutIdCreatorListener.onSuccess, time taken to create hangoutId : " + b + " millis", new Object[0]);
        boolean z = this.f15120b;
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(str).length() + 105).append("HangoutIdCreatorListener.onSuccess, Received hangoutId : ").append(str).append(" responseReceived : ").append(z).append(", setupFinished : ").append(this.f15119a.f15097g).toString(), new Object[0]);
        if (((long) b) < m17472a(this.f15119a.f15098h)) {
            this.f15119a.m17446a(2890, b);
            m17473a(str, true);
            return;
        }
        m17474c();
    }

    public void mo2249a() {
        boolean z = this.f15120b;
        glk.m17979c("Babel_telephony", "HangoutIdCreatorListener.onFailure, Failed to create hangoutId\n responseReceived : " + z + ", setupFinished : " + this.f15119a.f15097g, new Object[0]);
        this.f15119a.m17446a(2889, -1);
        m17473a(null, false);
    }

    public void run() {
        boolean z = this.f15120b;
        glk.m17979c("Babel_telephony", "HangoutIdCreatorListener.run, timed out when creating hangoutId\n responseReceived : " + z + ", setupFinished : " + this.f15119a.f15097g, new Object[0]);
        m17474c();
    }

    private void m17474c() {
        this.f15119a.m17446a(2889, (int) (glj.m17963b() - this.f15121c));
        glk.m17979c("Babel_telephony", "HangoutIdCreatorListener.handleSlowHangoutIdCreation, latency too high. Using cell", new Object[0]);
        m17473a(null, false);
    }

    void m17477b() {
        gwb.aL().postDelayed(this, m17472a(this.f15119a.f15098h));
        this.f15121c = glj.m17963b();
    }

    private long m17472a(geb geb) {
        String str;
        if (geb.f14824b.f15184a) {
            str = "wifi";
        } else {
            str = gwb.m2372v(geb.f14823a.f14663e);
        }
        str = String.format(Locale.US, "_network_type_%s", new Object[]{str});
        Context context = this.f15119a.f15091a;
        String valueOf = String.valueOf("babel_data_calls_create_hangout_id_timeout_millis");
        str = String.valueOf(str);
        return gwb.m1519a(context, str.length() != 0 ? valueOf.concat(str) : new String(valueOf), gda.f14722c);
    }

    private void m17473a(String str, boolean z) {
        gwb.aL().removeCallbacks(this);
        if (!this.f15120b && !this.f15119a.f15097g) {
            if (str != null) {
                this.f15119a.m17457b(str);
            }
            if (!z) {
                this.f15119a.m17453a(z);
            }
            this.f15120b = true;
            this.f15119a.m17468m();
        }
    }
}
