package defpackage;

import android.content.Context;
import com.google.android.gms.herrevad.PredictedNetworkQuality;

final class gdz implements gcl, gfb, ggq, guq<haw>, Runnable {
    private final Context a;
    private gea b;
    private gui c;
    private gcm d;
    private boolean e;
    private gfv f;
    private gec g;
    private boolean h;
    private PredictedNetworkQuality i;
    private boolean j;
    private gfa k;
    private boolean l;
    private long m;
    private boolean n;
    private boolean o;

    gdz(Context context, gea gea) {
        this.a = context;
        this.b = gea;
    }

    void a() {
        glk.c("Babel_telephony", "TeleNetworkSelectionUtils.fetchState", new Object[0]);
        this.g = new gec(this.a, get.a(this.a));
        this.f = gfq.a(this.a);
        gck.a(this.a, this);
        gwb.a(this.a, (ggq) this);
        this.c = new guj(this.a).a(hat.b).b();
        this.c.b();
        hat.c.a(this.c).a(this);
        this.k = new gfa(this.a, this);
        this.k.a();
        gwb.a((Runnable) this, (long) gwb.a(this.a, "babel_network_selection_state_fetch_timeout_millis", 1000));
    }

    private geb b() {
        return new geb(this.d, this.f, this.g, this.i, this.l, this.m, this.o);
    }

    public void a(gcm gcm) {
        String valueOf = String.valueOf(gcm);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 50).append("TeleNetworkSelectionUtils.onCellState, cellState: ").append(valueOf).toString(), new Object[0]);
        this.d = gcm;
        this.e = true;
        c();
    }

    public void a(boolean z, boolean z2) {
        glk.c("Babel_telephony", "TeleNetworkSelectionUtils.onHomeVoiceNetworkResult, success: " + z + ", isOnHomeVoiceNetwork: " + z2, new Object[0]);
        int a = z ? z2 ? 2 : 1 : get.a(this.a);
        this.g = new gec(this.a, a);
        this.h = true;
        c();
    }

    private void a(haw haw) {
        String valueOf = String.valueOf(haw.a());
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 53).append("TeleNetworkSelectionUtils.onResult, network quality: ").append(valueOf).toString(), new Object[0]);
        this.i = haw.a();
        this.j = true;
        this.c.d();
        c();
    }

    public void run() {
        if (this.b != null) {
            glk.c("Babel_telephony", "TeleNetworkSelectionUtils.run, fetching state timeout", new Object[0]);
            this.o = true;
            c();
        }
    }

    public void a(boolean z, long j) {
        glk.c("Babel_telephony", "TeleNetworkSelectionUtils.onPingComplete, wasSuccessful: " + z + ", latencyMillis: " + j, new Object[0]);
        this.n = true;
        this.k = null;
        this.l = z;
        this.m = j;
        c();
    }

    private void c() {
        gwb.aJ();
        Object obj = (this.e && this.h && this.j && this.n) ? 1 : null;
        if (this.b == null) {
            return;
        }
        if (obj != null || this.o) {
            gwb.b((Runnable) this);
            gea gea = this.b;
            this.b = null;
            if (this.k != null) {
                this.k.b();
                this.k = null;
            }
            gea.a(b());
        }
    }
}
