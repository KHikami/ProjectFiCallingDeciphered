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

// Connection represents a phone call or connection to a remote endpoint that
// caries voice and/or video traffic
// https://developer.android.com/reference/android/telecom/Connection.html
public final class gcq extends Connection {
    private static final IntentFilter c;
    private static int d;
    private int A;
    final gca a;
    gcc b;
    private final Handler e;
    private final List<gcu> f;
    private final gef g;
    private final String h; // participant_log_id
    private final long i;
    private gdc j;      // Handoff object
    private boolean k;
    private boolean l;  // local_disconnect
    private String m;   // handoff_number
    private String n;   // wifi_calling_account
    private int o;
    private String p;   // hangout_id
    private String q;   // callgrok_session_id
    private String r;   // participant_id
    private StringBuilder s;    // call_log
    private String t;
    private BroadcastReceiver u;
    private gcs v;
    private boolean w; // need to perform manual_network_selection flag
    private boolean x; // LTE_fallback_call
    private gcw y; // waat is this?
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
        this.h = str;   // participant_log_id
        setInitializing();
        setAddress(gef.h().getAddress(), 1); //returns connection request address and calls own method setAddress
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
        this.g.a(1);//gef.a(1) => set connection state to 1 for PhoneNumber
    }

    void c() {
        this.g.a(2);//gef.a(2) (set connection state to phone number to 2 (Connected?)
    }

    public TeleConnectionService d() {
        return this.g.j();//gef.j() (returns the teleconnection service related to the TelePhoneNumber)
    }

    ConnectionRequest e() {
        return this.g.i();
    }

    // gef.c() gets remote_party_number
    public gef f() {
        return this.g;
    }

    // call_direction
    //   true: incoming
    //   false: outgoing
    public boolean g() {
        return this.g.k();
    }

    // gec.toString gets roaming_status
    public gec h() {
        return this.g.b();
    }

    // Get participant_log_id
    public String i() {
        return this.h;
    }

    void a(gcc gcc) {
        b(gcc);
    }

    void a(gcs gcs) {
        this.v = gcs;
    }

    // gcc.e() gets call_id
    public gcc j() {
        return this.b;
    } // return class that implements gcc (e.g. gel/gfj)

    // part of handoff procedure
    void b(gcc gcc) {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(gcc);
        glk.c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 28) + String.valueOf(valueOf2).length()).append("TeleConnection.setCall, ").append(valueOf).append(" -> ").append(valueOf2).toString(), new Object[0]);
        if (this.b != null) {
            this.b.a(null); // if gcc (gel) is not null, pass null as gcw
        }
        this.b = gcc;
        if (this.b != null) {
            this.b.a(this);
            if (this.y != null) {
                this.b.a(this.y); // pass gwc
            }
        }
        A();
    }

    // Return the handoff object of this class
    gdc k() {
        return this.j; // type gdc
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

    // Get local_disconnect
    public boolean m() {
        return this.l;
    }

    private void d(boolean z) {
        this.l = true;
    }

    // Get handoff_number
    public String n() {
        return this.m;
    }

    // Set handoff_number (called by gfl.a(int, string))
    void a(String str) {
        this.m = str;
    }

    // Get wifi_calling_account (seen in gdb.a() or gwb.a(gcq, DisconnectCause, int))
    public String o() {
        return this.n;
    }

    // Set wifi_calling_account
    void b(String str) {
        this.n = str;
    }

    int p() {
        return this.o;
    }

    void a(int i) {
        this.o = i;
    }

    // Get hangout_id
    public String q() {
        return this.p;
    }

    // Set hangout_id
    void c(String str) {
        this.p = str;
    }

    // Get callgrok_session_id
    public String r() {
        return this.q;
    }

    // Set callgrok_session_id
    void d(String str) {
        this.q = str;
    }

    // Get participant_id
    public String s() {
        return this.r;
    }

    // Set participant_id
    void e(String str) {
        this.r = str;
    }

    void a(gcw gcw) {
        this.y = gcw;
    }

    // gcw.toString() gets experiment_code
    public gcw t() {
        return this.y;
    }

    // Get call_log
    public String u() {
        return this.s.toString();
    }

    // Adds to call_log
    //   i: gel (1)  or gfj (2) identifier
    //   j: some kind of time (comes from geo.b())
    void a(int i, long j) {
        this.s.append(i == 2 ? "w" : "c");  // Appends 'w' (wifi) if gjf obj or 'c' (cell) if gel obj
        this.s.append(j);                   // Append time value
    }

    // register and unregister receiver with context
    // the receiver here is linked to manual handoff
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
            this.b.a(i);//gcc.a(i)
        }
        for (gcu a : this.f) {//for every gcu, run a(gcq,int)
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
    } // returns do manual network selection

    //sets manually do network selection per call flag to passed boolean. Called by geu
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

    public void y() {//give up on connecting
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
