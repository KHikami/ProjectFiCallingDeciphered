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
    private static final IntentFilter c;
    private static int d;
    private int A;
    final gca a;
    gcc b;
    private final Handler e;
    private final List<gcu> f;
    private final gef g;
    private final String h;
    private final long i;
    private gdc j;
    private boolean k;
    private boolean l;
    private String m;
    private String n;
    private int o;
    private String p;
    private String q;
    private String r;
    private StringBuilder s;
    private String t;
    private BroadcastReceiver u;
    private gcs v;
    private boolean w;
    private boolean x;
    private gcw y;
    private gco z;

    static {
        c = new IntentFilter("com.google.android.intent.action.CALL_STATE_BUTTON_TOUCHED");
        d = 0;
    }

    public gcq(gef gef) {
        this(gef, null);
    }

    gcq(gef gef, String str) {
        this.e = new Handler();
        this.f = new CopyOnWriteArrayList();
        this.i = glj.b();
        this.s = new StringBuilder();
        this.t = "";
        this.g = gef;
        if (str == null) {
            iub iub = new iub();
            str = iub.a();
        }
        this.h = str;
        setInitializing();
        setAddress(gef.h().getAddress(), 1);
        setConnectionCapabilities(66);
        this.a = new gca(this.h);
        this.a.a(HttpStatusCodes.STATUS_CODE_OK);
        d++;
        this.A = d;
    }

    gca a() {
        return this.a;
    }

    void b() {
        this.g.a(1);
    }

    void c() {
        this.g.a(2);
    }

    public TeleConnectionService d() {
        return this.g.j();
    }

    ConnectionRequest e() {
        return this.g.i();
    }

    public gef f() {
        return this.g;
    }

    public boolean g() {
        return this.g.k();
    }

    public gec h() {
        return this.g.b();
    }

    public String i() {
        return this.h;
    }

    void a(gcc gcc) {
        b(gcc);
    }

    void a(gcs gcs) {
        this.v = gcs;
    }

    public gcc j() {
        return this.b;
    }

    void b(gcc gcc) {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(gcc);
        glk.c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 28) + String.valueOf(valueOf2).length()).append("TeleConnection.setCall, ").append(valueOf).append(" -> ").append(valueOf2).toString(), new Object[0]);
        if (this.b != null) {
            this.b.a(null);
        }
        this.b = gcc;
        if (this.b != null) {
            this.b.a(this);
            if (this.y != null) {
                this.b.a(this.y);
            }
        }
        A();
    }

    gdc k() {
        return this.j;
    }

    void a(gdc gdc) {
        String valueOf = String.valueOf(this.j);
        String valueOf2 = String.valueOf(gdc);
        glk.c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 38) + String.valueOf(valueOf2).length()).append("TeleConnection.setPendingHandoff, ").append(valueOf).append(" -> ").append(valueOf2).toString(), new Object[0]);
        this.j = gdc;
        if (this.j != null) {
            setConnectionCapabilities(getConnectionCapabilities() & -3);
        } else {
            setConnectionCapabilities(getConnectionCapabilities() | 2);
        }
    }

    public boolean l() {
        return this.k;
    }

    public void a(boolean z) {
        this.k = true;
    }

    public boolean m() {
        return this.l;
    }

    private void d(boolean z) {
        this.l = true;
    }

    public String n() {
        return this.m;
    }

    void a(String str) {
        this.m = str;
    }

    public String o() {
        return this.n;
    }

    void b(String str) {
        this.n = str;
    }

    int p() {
        return this.o;
    }

    void a(int i) {
        this.o = i;
    }

    public String q() {
        return this.p;
    }

    void c(String str) {
        this.p = str;
    }

    public String r() {
        return this.q;
    }

    void d(String str) {
        this.q = str;
    }

    public String s() {
        return this.r;
    }

    void e(String str) {
        this.r = str;
    }

    void a(gcw gcw) {
        this.y = gcw;
    }

    public gcw t() {
        return this.y;
    }

    public String u() {
        return this.s.toString();
    }

    void a(int i, long j) {
        this.s.append(i == 2 ? "w" : "c");
        this.s.append(j);
    }

    private void A() {
        Context d = d();
        int i = (this.b == null || getState() != 4) ? 0 : 1;
        if (i != 0 && this.u == null) {
            glk.c("Babel_telephony", "TeleConnection.updateHandoffReceiver, registering receiver", new Object[0]);
            this.u = new gct(this);
            d.registerReceiver(this.u, c);
        } else if (i == 0 && this.u != null) {
            glk.c("Babel_telephony", "updateHandoffReceiver, unregistering receiver", new Object[0]);
            d.unregisterReceiver(this.u);
            this.u = null;
        }
    }

    public void onAudioStateChanged(AudioState audioState) {
        String valueOf = String.valueOf(audioState);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 43).append("TeleConnection.onAudioStateChanged, state: ").append(valueOf).toString(), new Object[0]);
        if (this.b != null) {
            this.b.a(audioState);
        }
    }

    public void onPlayDtmfTone(char c) {
        glk.c("Babel_telephony", "TeleConnection.onPlayDtmfTone, c: " + gwb.b(c), new Object[0]);
        if (this.b != null) {
            this.b.a(c);
        }
        kae kae = glk.s;
    }

    public void onStopDtmfTone() {
        glk.c("Babel_telephony", "TeleConnection.onStopDtmfTone", new Object[0]);
        if (this.b != null) {
            this.b.f();
        }
    }

    public void onDisconnect() {
        String valueOf = String.valueOf(this);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 27).append("TeleConnection.onDisconnect").append(valueOf).toString(), new Object[0]);
        d(true);
        if (this.j != null) {
            this.j.e();
        } else if (this.b != null) {
            this.b.g();
        } else if (this.v != null) {
            this.v.a();
        }
    }

    public void onSeparate() {
        String valueOf = String.valueOf(this);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 25).append("TeleConnection.onSeparate").append(valueOf).toString(), new Object[0]);
        if (this.b != null) {
            this.b.h();
        }
    }

    public void onAbort() {
        String valueOf = String.valueOf(this);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 22).append("TeleConnection.onAbort").append(valueOf).toString(), new Object[0]);
        if (this.b != null) {
            this.b.i();
        }
    }

    public void onHold() {
        String valueOf = String.valueOf(this);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 21).append("TeleConnection.onHold").append(valueOf).toString(), new Object[0]);
        if (this.b != null) {
            this.b.j();
        }
    }

    public void onUnhold() {
        String valueOf = String.valueOf(this);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 23).append("TeleConnection.onUnhold").append(valueOf).toString(), new Object[0]);
        if (this.b != null) {
            this.b.k();
        }
    }

    public void onAnswer() {
        String valueOf = String.valueOf(this);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 23).append("TeleConnection.onAnswer").append(valueOf).toString(), new Object[0]);
        if (this.b != null) {
            this.b.l();
        }
    }

    public void onReject() {
        String valueOf = String.valueOf(this);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 23).append("TeleConnection.onReject").append(valueOf).toString(), new Object[0]);
        if (this.b != null) {
            this.b.m();
        }
    }

    public void onPostDialContinue(boolean z) {
        String valueOf = String.valueOf(this);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 49).append("TeleConnection.onPostDialContinue, proceed: ").append(z).append(valueOf).toString(), new Object[0]);
        if (this.b != null) {
            this.b.b(z);
        }
    }

    public void onStateChanged(int i) {
        if (i == 6) {
            this.e.postDelayed(new gcr(this), 15000);
        }
        String valueOf = String.valueOf(this);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 29).append("TeleConnection.onStateChanged").append(valueOf).toString(), new Object[0]);
        if (this.b != null) {
            this.b.a(i);
        }
        for (gcu a : this.f) {
            a.a(this, i);
        }
        A();
    }

    public void a(gcu gcu) {
        this.f.add(gcu);
    }

    public void b(gcu gcu) {
        this.f.remove(gcu);
    }

    public boolean v() {
        return this.w;
    }

    public void b(boolean z) {
        this.w = z;
    }

    public boolean w() {
        return this.x;
    }

    public void c(boolean z) {
        this.x = z;
    }

    public String toString() {
        int i = this.A;
        String valueOf = String.valueOf(Connection.stateToString(getState()));
        return new StringBuilder(String.valueOf(valueOf).length() + 33).append(" connection: ").append(i).append(" ,state: ").append(valueOf).toString();
    }

    public void x() {
        String valueOf = String.valueOf(this);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 35).append("TeleConnection.startConnectingSound").append(valueOf).toString(), new Object[0]);
        if (this.z == null) {
            int a;
            gco gco;
            Context d = d();
            boolean g = g();
            glk.c("Babel_telephony", "TeleConnectingSoundPlayer.startConnectingSoundIfNecessary", new Object[0]);
            if (g) {
                a = gwb.a(d, "babel_connecting_sound_incoming_delay_millis", 0);
            } else {
                a = gwb.a(d, "babel_connecting_sound_outgoing_delay_millis", -1);
            }
            if (a < 0) {
                glk.c("Babel_telephony", "TeleConnectingSoundPlayer.startConnectingSoundIfNecessary, disabled", new Object[0]);
                gco = null;
            } else {
                gco = new gco(d, a);
                gco.a();
            }
            this.z = gco;
        }
    }

    public void y() {
        String valueOf = String.valueOf(this);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 34).append("TeleConnection.stopConnectingSound").append(valueOf).toString(), new Object[0]);
        if (this.z != null) {
            this.z.b();
            this.z = null;
        }
    }

    public long z() {
        return glj.b() - this.i;
    }
}
