package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.telecom.AudioState;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import com.google.android.apps.hangouts.telephony.TeleConnectionService;
import com.google.api.client.http.HttpStatusCodes;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class gcq extends Connection {
    private static final IntentFilter f14676c = new IntentFilter("com.google.android.intent.action.CALL_STATE_BUTTON_TOUCHED");
    private static int f14677d = 0;
    private int f14678A;
    final gca f14679a;
    gcc f14680b;
    private final Handler f14681e;
    private final List<gcu> f14682f;
    private final gef f14683g;
    private final String f14684h;
    private final long f14685i;
    private gdc f14686j;
    private boolean f14687k;
    private boolean f14688l;
    private String f14689m;
    private String f14690n;
    private int f14691o;
    private String f14692p;
    private String f14693q;
    private String f14694r;
    private StringBuilder f14695s;
    private String f14696t;
    private BroadcastReceiver f14697u;
    private gcs f14698v;
    private boolean f14699w;
    private boolean f14700x;
    private gcw f14701y;
    private gco f14702z;

    public gcq(gef gef) {
        this(gef, null);
    }

    gcq(gef gef, String str) {
        this.f14681e = new Handler();
        this.f14682f = new CopyOnWriteArrayList();
        this.f14685i = glj.m17963b();
        this.f14695s = new StringBuilder();
        this.f14696t = "";
        this.f14683g = gef;
        if (str == null) {
            iub iub = new iub();
            str = iub.m23296a();
        }
        this.f14684h = str;
        setInitializing();
        setAddress(gef.m17146h().getAddress(), 1);
        setConnectionCapabilities(66);
        this.f14679a = new gca(this.f14684h);
        this.f14679a.mo1403a(HttpStatusCodes.STATUS_CODE_OK);
        f14677d++;
        this.f14678A = f14677d;
    }

    gca m16937a() {
        return this.f14679a;
    }

    void m16947b() {
        this.f14683g.m17136a(1);
    }

    void m16952c() {
        this.f14683g.m17136a(2);
    }

    public TeleConnectionService m16955d() {
        return this.f14683g.m17148j();
    }

    ConnectionRequest m16957e() {
        return this.f14683g.m17147i();
    }

    public gef m16959f() {
        return this.f14683g;
    }

    public boolean m16960g() {
        return this.f14683g.m17149k();
    }

    public gec m16961h() {
        return this.f14683g.m17140b();
    }

    public String m16962i() {
        return this.f14684h;
    }

    void m16940a(gcc gcc) {
        m16948b(gcc);
    }

    void m16941a(gcs gcs) {
        this.f14698v = gcs;
    }

    public gcc m16963j() {
        return this.f14680b;
    }

    void m16948b(gcc gcc) {
        String valueOf = String.valueOf(this.f14680b);
        String valueOf2 = String.valueOf(gcc);
        glk.m17979c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 28) + String.valueOf(valueOf2).length()).append("TeleConnection.setCall, ").append(valueOf).append(" -> ").append(valueOf2).toString(), new Object[0]);
        if (this.f14680b != null) {
            this.f14680b.mo2213a(null);
        }
        this.f14680b = gcc;
        if (this.f14680b != null) {
            this.f14680b.mo2213a(this);
            if (this.f14701y != null) {
                this.f14680b.mo2214a(this.f14701y);
            }
        }
        m16935A();
    }

    gdc m16964k() {
        return this.f14686j;
    }

    void m16944a(gdc gdc) {
        String valueOf = String.valueOf(this.f14686j);
        String valueOf2 = String.valueOf(gdc);
        glk.m17979c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 38) + String.valueOf(valueOf2).length()).append("TeleConnection.setPendingHandoff, ").append(valueOf).append(" -> ").append(valueOf2).toString(), new Object[0]);
        this.f14686j = gdc;
        if (this.f14686j != null) {
            setConnectionCapabilities(getConnectionCapabilities() & -3);
        } else {
            setConnectionCapabilities(getConnectionCapabilities() | 2);
        }
    }

    public boolean m16965l() {
        return this.f14687k;
    }

    public void m16946a(boolean z) {
        this.f14687k = true;
    }

    public boolean m16966m() {
        return this.f14688l;
    }

    private void m16936d(boolean z) {
        this.f14688l = true;
    }

    public String m16967n() {
        return this.f14689m;
    }

    void m16945a(String str) {
        this.f14689m = str;
    }

    public String m16968o() {
        return this.f14690n;
    }

    void m16950b(String str) {
        this.f14690n = str;
    }

    int m16969p() {
        return this.f14691o;
    }

    void m16938a(int i) {
        this.f14691o = i;
    }

    public String m16970q() {
        return this.f14692p;
    }

    void m16953c(String str) {
        this.f14692p = str;
    }

    public String m16971r() {
        return this.f14693q;
    }

    void m16956d(String str) {
        this.f14693q = str;
    }

    public String m16972s() {
        return this.f14694r;
    }

    void m16958e(String str) {
        this.f14694r = str;
    }

    void m16943a(gcw gcw) {
        this.f14701y = gcw;
    }

    public gcw m16973t() {
        return this.f14701y;
    }

    public String m16974u() {
        return this.f14695s.toString();
    }

    void m16939a(int i, long j) {
        this.f14695s.append(i == 2 ? "w" : "c");
        this.f14695s.append(j);
    }

    private void m16935A() {
        Context d = m16955d();
        int i = (this.f14680b == null || getState() != 4) ? 0 : 1;
        if (i != 0 && this.f14697u == null) {
            glk.m17979c("Babel_telephony", "TeleConnection.updateHandoffReceiver, registering receiver", new Object[0]);
            this.f14697u = new gct(this);
            d.registerReceiver(this.f14697u, f14676c);
        } else if (i == 0 && this.f14697u != null) {
            glk.m17979c("Babel_telephony", "updateHandoffReceiver, unregistering receiver", new Object[0]);
            d.unregisterReceiver(this.f14697u);
            this.f14697u = null;
        }
    }

    public void onAudioStateChanged(AudioState audioState) {
        String valueOf = String.valueOf(audioState);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 43).append("TeleConnection.onAudioStateChanged, state: ").append(valueOf).toString(), new Object[0]);
        if (this.f14680b != null) {
            this.f14680b.mo2210a(audioState);
        }
    }

    public void onPlayDtmfTone(char c) {
        glk.m17979c("Babel_telephony", "TeleConnection.onPlayDtmfTone, c: " + gwb.m1962b(c), new Object[0]);
        if (this.f14680b != null) {
            this.f14680b.mo2207a(c);
        }
        kae kae = glk.f15572s;
    }

    public void onStopDtmfTone() {
        glk.m17979c("Babel_telephony", "TeleConnection.onStopDtmfTone", new Object[0]);
        if (this.f14680b != null) {
            this.f14680b.mo2222f();
        }
    }

    public void onDisconnect() {
        String valueOf = String.valueOf(this);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 27).append("TeleConnection.onDisconnect").append(valueOf).toString(), new Object[0]);
        m16936d(true);
        if (this.f14686j != null) {
            this.f14686j.m17032e();
        } else if (this.f14680b != null) {
            this.f14680b.mo2223g();
        } else if (this.f14698v != null) {
            this.f14698v.m16980a();
        }
    }

    public void onSeparate() {
        String valueOf = String.valueOf(this);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 25).append("TeleConnection.onSeparate").append(valueOf).toString(), new Object[0]);
        if (this.f14680b != null) {
            this.f14680b.mo2224h();
        }
    }

    public void onAbort() {
        String valueOf = String.valueOf(this);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 22).append("TeleConnection.onAbort").append(valueOf).toString(), new Object[0]);
        if (this.f14680b != null) {
            this.f14680b.mo2225i();
        }
    }

    public void onHold() {
        String valueOf = String.valueOf(this);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 21).append("TeleConnection.onHold").append(valueOf).toString(), new Object[0]);
        if (this.f14680b != null) {
            this.f14680b.mo2226j();
        }
    }

    public void onUnhold() {
        String valueOf = String.valueOf(this);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 23).append("TeleConnection.onUnhold").append(valueOf).toString(), new Object[0]);
        if (this.f14680b != null) {
            this.f14680b.mo2227k();
        }
    }

    public void onAnswer() {
        String valueOf = String.valueOf(this);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 23).append("TeleConnection.onAnswer").append(valueOf).toString(), new Object[0]);
        if (this.f14680b != null) {
            this.f14680b.mo2228l();
        }
    }

    public void onReject() {
        String valueOf = String.valueOf(this);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 23).append("TeleConnection.onReject").append(valueOf).toString(), new Object[0]);
        if (this.f14680b != null) {
            this.f14680b.mo2229m();
        }
    }

    public void onPostDialContinue(boolean z) {
        String valueOf = String.valueOf(this);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 49).append("TeleConnection.onPostDialContinue, proceed: ").append(z).append(valueOf).toString(), new Object[0]);
        if (this.f14680b != null) {
            this.f14680b.mo2218b(z);
        }
    }

    public void onStateChanged(int i) {
        if (i == 6) {
            this.f14681e.postDelayed(new gcr(this), 15000);
        }
        String valueOf = String.valueOf(this);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 29).append("TeleConnection.onStateChanged").append(valueOf).toString(), new Object[0]);
        if (this.f14680b != null) {
            this.f14680b.mo2208a(i);
        }
        for (gcu a : this.f14682f) {
            a.mo2260a(this, i);
        }
        m16935A();
    }

    public void m16942a(gcu gcu) {
        this.f14682f.add(gcu);
    }

    public void m16949b(gcu gcu) {
        this.f14682f.remove(gcu);
    }

    public boolean m16975v() {
        return this.f14699w;
    }

    public void m16951b(boolean z) {
        this.f14699w = z;
    }

    public boolean m16976w() {
        return this.f14700x;
    }

    public void m16954c(boolean z) {
        this.f14700x = z;
    }

    public String toString() {
        int i = this.f14678A;
        String valueOf = String.valueOf(Connection.stateToString(getState()));
        return new StringBuilder(String.valueOf(valueOf).length() + 33).append(" connection: ").append(i).append(" ,state: ").append(valueOf).toString();
    }

    public void m16977x() {
        String valueOf = String.valueOf(this);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 35).append("TeleConnection.startConnectingSound").append(valueOf).toString(), new Object[0]);
        if (this.f14702z == null) {
            int a;
            gco gco;
            Context d = m16955d();
            boolean g = m16960g();
            glk.m17979c("Babel_telephony", "TeleConnectingSoundPlayer.startConnectingSoundIfNecessary", new Object[0]);
            if (g) {
                a = gwb.m1492a(d, "babel_connecting_sound_incoming_delay_millis", 0);
            } else {
                a = gwb.m1492a(d, "babel_connecting_sound_outgoing_delay_millis", -1);
            }
            if (a < 0) {
                glk.m17979c("Babel_telephony", "TeleConnectingSoundPlayer.startConnectingSoundIfNecessary, disabled", new Object[0]);
                gco = null;
            } else {
                gco = new gco(d, a);
                gco.m16932a();
            }
            this.f14702z = gco;
        }
    }

    public void m16978y() {
        String valueOf = String.valueOf(this);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 34).append("TeleConnection.stopConnectingSound").append(valueOf).toString(), new Object[0]);
        if (this.f14702z != null) {
            this.f14702z.m16933b();
            this.f14702z = null;
        }
    }

    public long m16979z() {
        return glj.m17963b() - this.f14685i;
    }
}
