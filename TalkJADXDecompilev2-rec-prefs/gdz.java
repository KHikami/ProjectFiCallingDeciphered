package p000;

import android.content.Context;
import com.google.android.gms.herrevad.PredictedNetworkQuality;

final class gdz implements gcl, gfb, ggq, guq<haw>, Runnable {
    private final Context f14808a;
    private gea f14809b;
    private gui f14810c;
    private gcm f14811d;
    private boolean f14812e;
    private gfv f14813f;
    private gec f14814g;
    private boolean f14815h;
    private PredictedNetworkQuality f14816i;
    private boolean f14817j;
    private gfa f14818k;
    private boolean f14819l;
    private long f14820m;
    private boolean f14821n;
    private boolean f14822o;

    gdz(Context context, gea gea) {
        this.f14808a = context;
        this.f14809b = gea;
    }

    void m17104a() {
        glk.m17979c("Babel_telephony", "TeleNetworkSelectionUtils.fetchState", new Object[0]);
        this.f14814g = new gec(this.f14808a, get.m17420a(this.f14808a));
        this.f14813f = gfq.m17570a(this.f14808a);
        gck.m16927a(this.f14808a, this);
        gwb.m1752a(this.f14808a, (ggq) this);
        this.f14810c = new guj(this.f14808a).m18639a(hat.f16480b).m18645b();
        this.f14810c.mo2518b();
        hat.f16481c.m19113a(this.f14810c).mo2419a(this);
        this.f14818k = new gfa(this.f14808a, this);
        this.f14818k.m17490a();
        gwb.m1864a((Runnable) this, (long) gwb.m1492a(this.f14808a, "babel_network_selection_state_fetch_timeout_millis", 1000));
    }

    private geb m17102b() {
        return new geb(this.f14811d, this.f14813f, this.f14814g, this.f14816i, this.f14819l, this.f14820m, this.f14822o);
    }

    public void mo2190a(gcm gcm) {
        String valueOf = String.valueOf(gcm);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 50).append("TeleNetworkSelectionUtils.onCellState, cellState: ").append(valueOf).toString(), new Object[0]);
        this.f14811d = gcm;
        this.f14812e = true;
        m17103c();
    }

    public void mo2202a(boolean z, boolean z2) {
        glk.m17979c("Babel_telephony", "TeleNetworkSelectionUtils.onHomeVoiceNetworkResult, success: " + z + ", isOnHomeVoiceNetwork: " + z2, new Object[0]);
        int a = z ? z2 ? 2 : 1 : get.m17420a(this.f14808a);
        this.f14814g = new gec(this.f14808a, a);
        this.f14815h = true;
        m17103c();
    }

    private void m17101a(haw haw) {
        String valueOf = String.valueOf(haw.m19114a());
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 53).append("TeleNetworkSelectionUtils.onResult, network quality: ").append(valueOf).toString(), new Object[0]);
        this.f14816i = haw.m19114a();
        this.f14817j = true;
        this.f14810c.mo2523d();
        m17103c();
    }

    public void run() {
        if (this.f14809b != null) {
            glk.m17979c("Babel_telephony", "TeleNetworkSelectionUtils.run, fetching state timeout", new Object[0]);
            this.f14822o = true;
            m17103c();
        }
    }

    public void mo2201a(boolean z, long j) {
        glk.m17979c("Babel_telephony", "TeleNetworkSelectionUtils.onPingComplete, wasSuccessful: " + z + ", latencyMillis: " + j, new Object[0]);
        this.f14821n = true;
        this.f14818k = null;
        this.f14819l = z;
        this.f14820m = j;
        m17103c();
    }

    private void m17103c() {
        gwb.aJ();
        Object obj = (this.f14812e && this.f14815h && this.f14817j && this.f14821n) ? 1 : null;
        if (this.f14809b == null) {
            return;
        }
        if (obj != null || this.f14822o) {
            gwb.m2042b((Runnable) this);
            gea gea = this.f14809b;
            this.f14809b = null;
            if (this.f14818k != null) {
                this.f14818k.m17491b();
                this.f14818k = null;
            }
            gea.mo2195a(m17102b());
        }
    }
}
