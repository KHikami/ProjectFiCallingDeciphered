import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.apps.hangouts.telephony.ui.TeleSetupActivity;
import java.util.Locale;

public final class geu implements fne, gek, ggo, ggy, ghh, gho, ghv, ghy, jcc {//TeleSetupController
    private final gbx A; //new iri(Context)
    private String B;
    final Context a;
    final gcq b; //Phone Connection
    final Handler c;
    final Runnable d;
    public ghc e;
    public ggz f;
    boolean g;//used by gew to do something with geb
    geb h; //used for cell service?
    private final gey i; //TeleOutgoingCallRequeset
    private final ghr j;
    private final int k; //Start Reason: if setupAccountReady true => becomes 2. else becomes 3. default is 1.
    //if 1 => not initialized => results in creation of a new gdz if n is 1
    private jzp l;
    private jmj m;
    private int n; //Setup step code. default value is 1 (gets incremented & modified as it goes through method r())
    //refer to c(int) for codes map to what
    private dr o;
    private String p;
    private boolean q;
    private boolean r;//setup already in progress
    private boolean s;//used wifi for call
    private bko t;
    private String u;
    private gei v;
    private ggn w;
    private ggl x;
    private gcw y;
    private boolean z;//setupAccount is Ready!

    // (protected constructor)
    // given Context, Phone Connection, Outgoing Call Request, iri creator? => new Tele Setup Controller
    geu(Context context, gcq gcq, gey gey, gbx gbx) {
        this.c = gwb.aL(); //related handler
        this.d = new gev(this); //new temp timeout object
        this.n = 1;
        iil.b("Expected non-null", (Object) gcq);
        this.a = context;
        this.b = gcq;
        this.i = gey;
        this.j = null;
        this.k = 1;
        this.A = gbx;
    }

    //public constructor => creates a new Tele Setup Controller (for everyone else)
    //creates a new TeleSetupController given context, (ghr implementer) and a boolean z
    public geu(Context context, ghr ghr, boolean z) {
        this.c = gwb.aL();
        this.d = new gev(this);
        this.n = 1;
        this.a = context;
        this.b = null; //no Phone connection
        this.i = null;//assume no outgoing call request
        this.j = ghr;
        this.k = z ? 3 : 2;
        this.A = null;
    }

    //executes start step of TeleSetupController
    //protected => can be seen within package
    void b() {
        r();
    }

    void c() {
        d(3);
    }

    public boolean d() {//returns true if connection setup step is 1
        return this.k == 1;
    }

    private void n() {
        ba.b(!this.q, (Object) "Create UI after callback invoked.");
        if (this.r) {
            glk.c("Babel_telephony", "TeleSetupController.createSetupActivity, creation already in progress.", new Object[0]);
            return;
        }
        this.r = true;
        Context context = this.a;
        iil.b("Expected non-null", (Object) this);
        Intent intent = new Intent(context, TeleSetupActivity.class); //creates a new TeleSetupActivity Intent
        intent.putExtra("controller", new gkn((Object) this));
        if (d()) { //if k is 1
            intent.addFlags(1342210048);
        }
        if (d()) { //if k is 1
            this.x = new ggl(this.a, this, intent);
            ggk a = this.b.d().a();//gbq.d().a() => runnable.d().a()??? (returns a ggk)
            if (a.a((Object) this)) { //context, method that takes an object???
                this.w = a.a(intent, this.x);//context.a(intent, object)
            }
            if (this.w == null) { //if w not filled
                glk.e("Babel_telephony", "TeleSetupController.createSetupActivity, unable to show dialog on top of in-call UI", new Object[0]);
                this.x.a();//dialog call back error
                return;
            }
            glk.c("Babel_telephony", "TeleSetupController.createSetupActivity, wifi call waiting for dialog", new Object[0]);
            //needs dialog to be created...
            return;
        }
        this.a.startActivity(intent); //start TeleSetupActivity
    }

    public void a(jzp jzp, jmj jmj) {
        if (!this.q) {
            iil.a("Expected null", this.l);
            this.l = jzp;
            this.m = jmj;
            if (this.z) {
                iil.a("Expected null", this.o);
                iil.a("Expected null", this.p);
                this.z = false;
                q();
                return;
            }
            iil.b("Expected non-null", this.o);
            iil.b("Expected non-null", this.p);
            a(this.o, this.p);
        } else if (this.l != null) {
            this.l.finish();
        }
    }

    public void e() {
        glk.c("Babel_telephony", "TeleSetupController.onActivityDestroyed", new Object[0]);
        this.l = null;
        d(3);
    }

    public void f() {
        glk.c("Babel_telephony", "TeleSetupController.onWifiChooserWifiChosen", new Object[0]);
        a(true);
        m();
    }

    public void g() {
        glk.c("Babel_telephony", "TeleSetupController.onWifiChooserCellularChosen", new Object[0]);
        a(false);
        m();
    }

    public void a(bko bko) {
        if (bko != null) {
            String str = "Babel_telephony";
            String str2 = "TeleSetupController.onAccountChooserDone, account: ";
            String valueOf = String.valueOf(gwb.J((Object) bko));
            glk.c(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
            this.t = bko;
            if (fde.j(this.t.g())) {
                m();
                return;
            } else if (this.l == null) {
                this.z = true;
                n();
                return;
            } else {
                q();
                return;
            }
        }
        glk.d("Babel_telephony", "TeleSetupController.onAccountChooserDone, no account.", new Object[0]);
        b(gwb.vv);
    }

    public void h() {
        glk.c("Babel_telephony", "TeleSetupController.onAccountChooserCancelled", new Object[0]);
        d(3);
    }

    public void i() {
        glk.c("Babel_telephony", "TeleSetupController.onTosAccepted", new Object[0]);
        e(gwb.vp);
        this.f = a(this.t.g(), new ghb(this));
        this.f.d();
    }

    private ggz a(int i, ghb ghb) {
        return new ggz(this.a, i, ghb);
    }

    public void j() {
        glk.c("Babel_telephony", "TeleSetupController.onTosDeclined", new Object[0]);
        d(3);
    }

    public void a(boolean z, jcb jcb, jcb jcb2, int i, int i2) {
        glk.c("Babel_telephony", String.format("TeleSetupController.onAccountHandlerStateTransition, %s -> %s", new Object[]{jcb, jcb2}), new Object[0]);
    }

    public void a(int i, fnd fnd, fnf fnf) {
        glk.c("Babel_telephony", "TeleSetupController.onRegistrationStateChange", new Object[0]);
        p();
        if (i == this.t.g()) {
            ((fnc) jyn.a(this.a, fnc.class)).b((fne) this);
            bko bko = this.t;
            gwb.aJ();
            if (bko != null && bko.equals(this.t)) {
                boolean j = fde.j(this.t.g());
                glk.c("Babel_telephony", "TeleSetupController.accountSetupComplete, isReady: " + j, new Object[0]);
                this.c.removeCallbacks(this.d);
                if (j) {
                    o();
                } else {
                    k();
                }
            }
        }
    }

    private void o() {
        String b = gwb.b(this.a, "babel_user_to_allow_wifi_calling_for", "tycho_users");
        String str = "Babel_telephony";
        String str2 = "TeleSetupController.chooseWifiOrCellular, selectedAccount: ";
        String valueOf = String.valueOf(gwb.J(this.t));//grab account for bko
        glk.c(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        if (this.t != null) {
            m();
        } else if ("hangouts_testing_users".equals(b)) {
            a(new ggu(), "account_chooser");
        } else {
            iil.b("Unexpected start reason: " + this.k, this.k == 3);
            a(false);
            d(2);
        }
    }

    void k() {
        if (d()) {
            a(false);
            m();
            return;
        }
        b(gwb.vx);
    }

    public void a(String str) {
        if (!this.g) {
            String str2 = "Babel_telephony";
            String str3 = "TeleSetupController.onGetProxyNumberSucceeded, proxy number: ";
            String valueOf = String.valueOf(gwb.G(str));
            glk.c(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
            iil.b("Expected non-null", (Object) str);
            this.b.f().a(str);
            m();
        }
    }

    public void a(int i) {
        if (!this.g) {
            if (i != 1) {
                glk.c("Babel_telephony", "TeleSetupController.onGetProxyNumberFailed, with error code %d", Integer.valueOf(i));
                m();
                return;
            }
            glk.c("Babel_telephony", "TeleSetupController.onGetProxyNumberFailed, getting proxy number from Tycho not supported, using hangouts", new Object[0]);
            if (gwb.H(this.a)) {
                this.v = new gei(this.t.g(), this.b.f().d(), glq.f(gwb.H()), this, this.b.a());
                this.v.d();
                return;
            }
            glk.d("Babel_telephony", "TeleSetupController.onGetProxyNumberFailed, no internet connection", new Object[0]);
            this.b.a().a(205);
            m();
        }
    }

    public void a() {
        if (!this.g) {
            glk.c("Babel_telephony", "TeleSetupController.onGetProxyNumberFailed", new Object[0]);
            if (a(this.b.f())) {
                String str = "Babel_telephony";
                String str2 = "TeleSetupController.onGetProxyNumberFailed, blocking possible non-free call to avoid paying roaming rates. ";
                String valueOf = String.valueOf(gwb.G(this.b.f().d()));
                glk.c(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                d(3);
                return;
            }
            m();
        }
    }

    private static boolean a(gef gef) {
        return !Locale.US.getCountry().equals(glq.a().a(gef.d()));
    }

    public void l() {
        glk.c("Babel_telephony", "TeleSetupController.onMessageDone", new Object[0]);
        d(3);//runnable (3)
    }

    void b(String str) {
        this.B = str;
    }

    void a(geb geb) {
        boolean z;
        this.h = geb;//save given grouper of network status, cell state, wifi state, etc.
        boolean e = ggc.a(this.a).e();//ggc.a(Context).e() => (new ggc object).e() => grabs the preference for asking each call for network selection
        this.b.b(e);//gcq.b(preference of ask each call) => stores into gcq to ask each call

        if (!gwb.R(this.a)) {//!gwb.R(Context) => I do not have Phone Manager Capabilities or Phone Account is null
            this.b.b(true);//gcq.b(true) => sets to manually do network selection to true
        }

        glk.c("Babel_telephony", "TeleSetupController.isWifiCallPossible", new Object[0]);
        iil.b("Expected non-null", geb.b);//check wifi cell exists else error
        iil.b("Expected non-null", geb.c);//check Network cell exists else error
        if (geb.a == null) { //have cell state?
            glk.c("Babel_telephony", "TeleSetupController.isWifiCallPossible, no cell state, didTimeout: " + geb.g, new Object[0]);
        } else if (!gwb.P(this.a)) { //gwb.P(Context) checks for permissions
            glk.c("Babel_telephony", "TeleSetupController.isWifiCallPossible, no permissions", new Object[0]);
        } else if (ggc.a(this.a).c()) { //new ggc.c() => has tycho account or wifi call allowed for phone
            if ("no_users".equals(gwb.b(this.a, "babel_user_to_allow_wifi_calling_for", "tycho_users"))) {
                glk.c("Babel_telephony", "TeleSetupController.isWifiCallPossible, wifi calls disabled for all users by gservices", new Object[0]);
            } else {
                biw g = gwb.g(this.a);
                if (!g.a("babel_outgoing_wifi_calls_allowed", true)) {
                    glk.c("Babel_telephony", "TeleSetupController.isWifiCallPossible, outgoing wifi calls disabled by gservices", new Object[0]);
                } else if (!gfj.a(this.b.d()) && dgg.a().n()) {//gfj.a(gcq.d()) & dgg.a().n()
                    //=> gfj.a(TeleconnectionService)& dgg.n() => checks if connection already exists successfully & it is a wifi call
                    glk.c("Babel_telephony", "TeleSetupController.isWifiCallPossible, another hangout is in progress", new Object[0]);
                } else if (!this.b.f().l()) { //bad phone number
                    r4 = "Babel_telephony";
                    r5 = "TeleSetupController.isWifiCallPossible, invalid phone number: ";
                    r0 = String.valueOf(gwb.G(this.b.f().e()));
                    glk.c(r4, r0.length() != 0 ? r5.concat(r0) : new String(r5), new Object[0]);
                } else if (this.b.f().m() && !g.a("babel_wifi_call_google_voice_app_integration_enabled", false)) { //no google voice
                    //qcq.f().m() & !biw.a(String,boolean) => gef.m() & check if gservices allow google voice for phone
                    //is google voice request & google voice integration is not allowed
                    glk.c("Babel_telephony", "TeleSetupController.isWifiCallPossible, Google Voice app integration disabled by gservices", new Object[0]);
                } else if (geb.c.b(this.a) && !g.a("babel_international_wifi_call_allowed", true)) {
                    //gec.b(Context) && !biw.a(String,boolean)) =>
                    // is currently receiving cell service from international ISO & check if international wifi calling available by gservices
                    glk.c("Babel_telephony", "TeleSetupController.isWifiCallPossible, wifi calling while international not allowed", new Object[0]);
                } else if (geb.c.a(this.a) && geb.c.a() == 2 && !g.a("babel_roaming_wifi_call_allowed", true)) { //roaming~
                    //gec.a(Context) & gec.a() == 2 & !biw.a(String,boolean)
                    //=>(In the US or babel hutch experience allowed) & (on roaming not on T-mobile or sprint) & !(wifi calling on roaming allowed)
                    glk.c("Babel_telephony", "TeleSetupController.isWifiCallPossible, wifi calling while roaming not allowed", new Object[0]);
                } else if (!this.b.f().n() || g.a("babel_voicemail_wifi_call_allowed", true)) {
                    //!gcq.f().n() or biw.a(String,boolean) => !gef.n() or biw.a(String,boolean)
                    //=> (not calling self if no address provided or not voicemail address) or wifi calling allowed by gservices for phone (or default true)

                    r0 = this.b.f().c();//gef.c() => grab tel specific part of URI address for connection

                    if (geb.c.b(this.a) && glq.d(gwb.H(), r0)) {
                        //gec.b(Context) &glq.d(Context, String) => (in international ISO or babel_hutch is false) & (number is potential emergency number for country)
                        //international and is emergency number w/ preference for no emergency on wifi
                        r4 = "Babel_telephony";
                        r5 = "TeleSetupController.isWifiCallPossible, emergency number cannot be on wifi when outside the US : ";
                        r0 = String.valueOf(r0);
                        glk.c(r4, r0.length() != 0 ? r5.concat(r0) : new String(r5), new Object[0]);
                    } else if (this.b.v()) { //network chosen manually(gcq.v())
                        glk.c("Babel_telephony", "TeleSetupController.shouldAllowRing, network was was choosen manually, only checking for Wi-Fi connection", new Object[0]);
                        if (geb.b.a) { //is connected to wifi (gfv.a)
                            z = true;
                            if (z) {//not too sure what's the point of this if statement if z is just set to true prior...
                                if (e) {//ask each call kick in
                                    glk.c("Babel_telephony", "TeleSetupController.performWifiChooserWithCellState, ask each call is enabled", new Object[0]);
                                    if (geb.a.a()) { //cell state has no service
                                        glk.c("Babel_telephony", "TeleSetupController.performWifiChooserWithCellState, no cell service, forcing wifi", new Object[0]);
                                    } else {
                                        a(new ghw(), "wifi_chooser");//a(dr, String) => draw network selector and exit method
                                        return;
                                    }
                                }
                                a(true);//a(boolean) (can connect)
                                m();//advance to next step
                            }
                            a(false);//a(boolean)
                            m();//advance to next step
                            return;
                        }
                        glk.c("Babel_telephony", "TeleSetupController.isWifiCallPossible, not connected to wifi", new Object[0]);
                    } else { //no issues/special ocnditions so testing normally
                        this.y = gcw.a(this.a, this.b.f().d(), false, geb.b); //experiment if it exists for this
                        if (this.y != null) {//returns true if it is a wifi call experiment
                            glk.c("Babel_telephony", "TeleSetupController.isWifiCallPossible, in Wi-Fi calling experiment", new Object[0]);
                            z = true;
                        } else {
                            r0 = this.b.f().f();//gcq.f().f() => gef.f() => Telephone Number in Country Context

                            if (gwb.a(this.a, geb.c, geb.a, geb.b, r0) || gwb.a(this.a, geb.c, geb.a, geb.b)) {
                                //gwb.a(Context, network cell (gec), gcm (cell state), gfv (wifi), gcg.f().f()) || gwb.a(Contect, gcm, gec, gfv)
                                //allow 3G call or LTE call

                                if (b(geb) || glq.d(this.a, r0)) { //data stream of selected network type was good (according to cache and last recorded ping)
                                    // or glq.d(Context, String) => is potential emergency number
                                    glk.c("Babel_telephony", "TeleSetupController.isWifiCallPossible, falling back to cellular data", new Object[0]);
                                    this.b.c(true);//gcq.c(true) => set LTE fallback call to true
                                    z = true;
                                } else { //bad latency or not potential emergency number
                                    glk.c("Babel_telephony", "TeleSetupController.isWifiCallPossible, data network latency high", new Object[0]);
                                }
                            } else if (gwb.b(this.a, this.b.h(), geb.a, geb.b, r0)) {
                                //gwb.b(Context, glq.h(), gcm, gfv, String)
                                //checks wifi connection for wifi call
                                if (geb.a.a()) { //no cell signal => have to use wifi
                                    glk.c("Babel_telephony", "TeleSetupController.hasNetworkQualityForWifiCall, no cell service, not checking herrevad", new Object[0]);
                                    z = true;
                                } else if (gwb.a(this.a, geb.c, geb.d, geb.a)) {
                                    //gwb.a(Context, gec, predicated Network Quality, gcm) => good predicted wifi
                                    a(2893, -1);
                                    z = true;
                                } else {
                                    //poor predicted wifi
                                    a(2895, -1);
                                    glk.c("Babel_telephony", "TeleSetupController.hasNetworkQualityForWifiCall using cell due to bad herrevad network quality score for the wifi network", new Object[0]);
                                    z = false;
                                }
                                if (z) { //only ran if have wifi :)
                                    if (geb.a.a()) { //no connection => no check of stun ping latency
                                        glk.c("Babel_telephony", "TeleSetupController.shouldCheckStunPingLatency, not checking, no cell service", new Object[0]);
                                        z = false; //now z here means to check stun ping latency???
                                    } else {
                                        z = true;
                                    }
                                    if (!z || b(geb)) { //don't check stun ping latency or b(geb)
                                        glk.c("Babel_telephony", "TeleSetupController.isWifiCallPossible, good network, using Wi-Fi", new Object[0]);
                                        z = true; //z sest to orig value of wifi call allowed
                                    } else { //bad stun ping latency. b(geb) should be stun latency method calculator
                                        glk.c("Babel_telephony", "TeleSetupController.isWifiCallPossible, poor stun latency on Wi-Fi", new Object[0]);
                                    }
                                } else { //overall fail
                                    glk.c("Babel_telephony", "TeleSetupController.isWifiCallPossible, bad network quality score", new Object[0]);
                                }
                            }
                        }
                        if (z) { //wifi pickedd as calling method!
                            if (e) {
                                glk.c("Babel_telephony", "TeleSetupController.performWifiChooserWithCellState, ask each call is enabled", new Object[0]);
                                if (geb.a.a()) {
                                    a(new ghw(), "wifi_chooser");
                                    return;
                                }
                                glk.c("Babel_telephony", "TeleSetupController.performWifiChooserWithCellState, no cell service, forcing wifi", new Object[0]);
                            }
                            a(true);
                            m();
                        }
                        a(false);
                        m();
                        return;
                    }
                } else {
                    glk.a("Babel_telephony", "TeleSetupController.isWifiCallPossible, calling voicemail not allowed", new Object[0]);
                }
            }
        } else {
            glk.c("Babel_telephony", "TeleSetupController.isWifiCallPossible, wifi calling not enabled", new Object[0]);
        }
        z = false;
        if (z) {
            a(false);
            m();
            return;
        }
        if (e) {
            glk.c("Babel_telephony", "TeleSetupController.performWifiChooserWithCellState, ask each call is enabled", new Object[0]);
            if (geb.a.a()) {
                glk.c("Babel_telephony", "TeleSetupController.performWifiChooserWithCellState, no cell service, forcing wifi", new Object[0]);
            } else {
                a(new ghw(), "wifi_chooser");
                return;
            }
        }
        a(true);
        m();
    }

    //calculate ping stun latency
    private boolean b(geb geb) {
        String str;
        if (geb.b.a) {//is connected to WiFi (gfv.a)
            str = "wifi";
        } else {
            str = gwb.v(geb.a.e);//gwb.v(gcm.e) => gwb.v(networkType(int))
            //returns string about how the network works (e.g. CDMA, HSPA, etc.)
        }
        str = String.format(Locale.US, "_network_type_%s", new Object[]{str});
        Context context = this.a;
        String valueOf = String.valueOf("babel_stun_ping_latency_millis");
        str = String.valueOf(str);
        //gwb.a(context, string, int)
        //checks if the previous stun ping for given network type was recorded in cache else return 100
        long a = gwb.a(context, str.length() != 0 ? valueOf.concat(str) : new String(valueOf), 100);
        int i = geb.e ? (int) geb.f : -1;
        //if ping successful => get ping latency else -1
        if (geb.g || !geb.e || geb.f > a) {
            //if did timeout or ping was not successful or if -1 is greater than cache recorded value => Not a good network!
            glk.c("Babel_telephony", "TeleSetupController.hasAcceptableStunPingLatency, not acceptable, didTimeout: " + geb.g + ", wasStunPingSuccessful: " + geb.e + ", latency millis: " + geb.f, new Object[0]);
            a(2897, i);
            return false;
        }
        a(2898, i);//ping good :)
        return true;
    }

    void a(int i, int i2) {
        int g;
        if (this.t != null) {
            g = this.t.g();
        } else {
            g = ggc.a(this.a).b();
        }
        iie e = ((iih) jyn.a(this.a, iih.class)).a(g).b().c().e(this.b.i());
        if (i2 >= 0) {
            e.a(Integer.valueOf(i2));
        }
        e.c(i);
    }

    private void p() {
        ggc a = ggc.a(this.a); //creates a new ggc(Context) (basically account name)
        int b = a.b();//grabs if bko object exists
        if (b == -1) {
            this.u = ggc.a(this.a).i();//sets tycho account name (if exists)
            String str = "Babel_telephony";
            String str2 = "TeleSetupController.setSelectedAccount accountName:";
            String valueOf = String.valueOf(this.u);
            glk.c(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
        if (b != -1) {//otherwise
            this.t = fde.e(b);//fde.e(int) => returns a bko
            if (this.t == null) { //if no bko
                a.a(-1);//remove account from ongoing list of available accounts
            }
        }
    }

    private void q() {
        glk.c("Babel_telephony", "TeleSetupController.loginToAccount", new Object[0]);
        e(gwb.vr);
        this.c.postDelayed(this.d, (long) gwb.a(this.a, "babel_wifi_call_account_setup_timeout", 20000));
        ((fnc) jyn.a(this.a, fnc.class)).a((fne) this);
        this.m.a("active-hangouts-account").b((jcc) this);
        if (this.t != null) {
            glk.c("Babel_telephony", "TeleSetupController.loginToAccount using accountId", new Object[0]);
            this.m.a(new jmu().a().a(this.t.g()));
            return;
        }
        glk.c("Babel_telephony", "TeleSetupController.loginToAccount using accountName", new Object[0]);
        this.m.a(new jmu().a().a(this.u));
    }

    //start setup!
    private void r() {
        int i = 1;
        iil.b("Expected condition to be false", this.q);
        String valueOf;
        int i2;
        switch (this.n) { //based on value of n
            case wi.j /*1*/: //start setup
                //k is start reason
                glk.c("Babel_telephony", "TeleSetupController.performStartStep, startReason: " + this.k, new Object[0]);
                switch (this.k) {
                    case wi.j /*1*/:
                        iil.a("Expected condition to be true", d());
                        new gdz(this.a, new gew(this)).a(); //creates a new TeleNetworkSelectionUtils
                        //using gdz(Context, new gew(context)).a()
                    case wi.l /*2*/:
                        m(); //advance to next step
                    case wi.z /*3*/:
                        a(new ggu(), "account_chooser");//a(dr, String)
                        //checks fragment display? (whatever that means...)
                    default:
                        iil.a("unknown start reason: " + this.k); //bad start reason
                        b(gwb.vv); //b(2131361840)
                        //error code it seems...
                }
            case wi.l /*2*/://n = 2 (account select step)
                p();//account updater
                m();
            case wi.z /*3*/://n = 3 => setup Account
                boolean z = this.t != null && fde.j(this.t.g());
                //z is have bko and fde.j(account id from bko) => account name (for id) and has bko
                glk.c("Babel_telephony", "TeleSetupController.performSetupAccount, isReady: " + z, new Object[0]);
                if (!gwb.H(this.a)) {//can't setup account if not connected to internet
                    glk.c("Babel_telephony", "TeleSetupController.performSetupAccount, not connected to internet", new Object[0]);
                    z = true;//hijacked z to be true
                }
                if (z) { //if have bko & account name or no wifi => setup account done?
                    o(); //advances to next step if all good
                    return;
                }

                //otherwise create account/setup
                valueOf = String.valueOf(this.t);
                String str = this.u;
                glk.c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 65) + String.valueOf(str).length()).append("TeleSetupController.setupOrLogin, selectedAccount:").append(valueOf).append(" , accountName:").append(str).toString(), new Object[0]);
                if (this.t == null && TextUtils.isEmpty(this.u)) {
                    o();
                } else if (this.l == null) {
                    this.z = true;
                    n();
                } else {
                    q();
                }
            case wi.h /*4*/://update google voice status
                if (this.t == null) {//bko exists
                    i2 = 0;
                } else {
                    i2 = this.t.I();//grabs int regarding google voice availability
                }
                glk.c("Babel_telephony", "TeleSetupController.performUpdateGoogleVoiceStatus, status: " + i2, new Object[0]);
                if (i2 != 0 || (d() && !this.s)) {//google voice available? (not 0 or k is 1 and not s)
                    m();//move to next step!
                    return;
                }
                e(gwb.vs);//e given large int again... seems to print the progress???
                this.e = new ghc(this.t.g(), new ghe(this)); //create a new ghc(bko.g(), new ghe(geu))
                this.e.a(this.a);//ghc.a(Context)
            case wi.p /*5*/: //setup google voice tos??? (not too sure what this is)
                if (this.t == null) {//if no bko => status unknown... invalid state
                    i2 = 0;
                } else {
                    i2 = this.t.I(); //grabs int regarding google voice availability... (repeat from case 4?)
                }
                switch (i2) {
                    case wi.w /*0*/:
                        glk.d("Babel_telephony", "TeleSetupController.performGoogleVoiceTos, status is UNKNOWN", new Object[0]);
                        if (d()) {//tries to resolve status? (tests if can skip?)
                            a(false);
                            m();
                            return;
                        }
                        b(gwb.vv);//error
                    case wi.j /*1*/:
                        glk.c("Babel_telephony", "TeleSetupController.performGoogleVoiceTos, status is ALLOWED", new Object[0]);
                        m();//move to next step
                    case wi.l /*2*/://complete other actions on todo list
                        glk.c("Babel_telephony", "TeleSetupController.performGoogleVoiceTos, status is NEED_TOS", new Object[0]);
                        if (d()) {//if k == 1
                            a(false);//modify related gcg
                            m(); //move to next step & quit
                            return;
                        }
                        a(new ghs(), "tos");
                    case wi.z /*3*/:
                        glk.d("Babel_telephony", "TeleSetupController.performGoogleVoiceTos, status is BLOCKED", new Object[0]);
                        if (d()) { //if k == 1
                            a(false);//same logic from i2 == 2
                            m();
                            return;
                        }
                        b(gwb.vw);//a different error
                    default:
                        iil.a("Unknown voice calling status: " + this.t.I());
                        if (d()) { //if k==1
                            a(false);//same logic from i2 == 2
                            m();
                            return;
                        }
                        b(gwb.vv);
                }
            case wi.s /*6*/: //create hangout id
                if (!d()) {//k != 1
                    i = 0;
                } else if (!this.s) {//not use wifi
                    glk.a("Babel_telephony", "TeleSetupController.shouldCreateHangoutId not using wifi for calls", new Object[0]);
                    i = 0;
                } else if (this.h == null || this.h.a == null || this.h.a.a()) {
                    glk.a("Babel_telephony", "TeleSetupController.shouldCreateHangoutId no cell service", new Object[0]);
                    i = 0;
                } else if (glq.d(gwb.H(), this.b.f().f())) {
                    glk.a("Babel_telephony", "TeleSetupController.shouldCreateHangoutId emergency number", new Object[0]);
                    i = 0;
                }
                if (i != 0) {
                    glk.c("Babel_telephony", "TeleSetupController.performCreateHangoutId, Creating hangoutId...", new Object[0]);
                    irl gex = new gex(this);
                    gex.b();
                    this.A.a(this.a).a(this.t.a(), gex);//gbx.a(context).a(bko.a(),gex) => new iri.a(bko.a(),gex)
                    //=> new iri.a(String, irl)
                    return;
                }
                m();//next step
            case wi.q /*7*/: //get proxy number
                if (d()) {
                    gef f = this.b.f();
                    if (f.p()) {
                        int g = this.t.g();
                        String d = f.d();
                        String f2 = glq.f(gwb.H());
                        if (d == null || f2 == null) {
                            glk.e("Babel_telephony", String.format("TeleSetupController.performGetProxyNumber, invalid input, accountId: %d, destination number: %s, from number: %s", new Object[]{Integer.valueOf(g), gwb.G(d), gwb.G(f2)}), new Object[0]);
                            if (a(f)) {
                                String str2 = "Babel_telephony";
                                valueOf = "TeleSetupController.performGetProxyNumber, blocking possible non-free call to avoid paying roaming rates. ";
                                String valueOf2 = String.valueOf(gwb.G(d));
                                glk.c(str2, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), new Object[0]);
                                d(3);
                                return;
                            }
                            m();
                            return;
                        }
                        gwb.a(this.a, d, (ggo) this);
                        return;
                    }
                    m();
                    return;
                }
                m();
            case wi.m /*8*/: //finish!
                if (!this.s) {
                    i = 2;
                }
                d(i);
            default:
                iil.a("unknown step: " + this.n);
                a(false);
                d(2);
        }
    }

    //advance to next step valuator
    //(uses recursion to advance the setup???) r()-> m() -> r() -> m() -> etc.... that's kind of inconvenient...
    public void m() {
        String valueOf = String.valueOf(c(this.n));
        String valueOf2 = String.valueOf(c(this.n + 1));
        glk.c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 41) + String.valueOf(valueOf2).length()).append("TeleSetupController.advanceNextStep, ").append(valueOf).append(" -> ").append(valueOf2).toString(), new Object[0]);
        valueOf = "Babel_telephony";
        valueOf2 = "selectedAccount: ";
        String valueOf3 = String.valueOf(gwb.J(this.t));//gwb.J(Object) => tells logger to print bko to string
        glk.c(valueOf, valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2), new Object[0]);
        this.n++;//advance step code by 1
        r();//call r() again!
    }

    //maps code to step id
    private static String c(int i) {
        switch (i) {
            case wi.j /*1*/:
                return "STEP_START";
            case wi.l /*2*/:
                return "STEP_CHOOSE_ACCOUNT";
            case wi.z /*3*/:
                return "STEP_SETUP_ACCOUNT";
            case wi.h /*4*/:
                return "STEP_UPDATE_GOOGLE_VOICE_STATUS";
            case wi.p /*5*/:
                return "STEP_GOOGLE_VOICE_TOS";
            case wi.s /*6*/:
                return "STEP_CREATE_HANGOUT_ID";
            case wi.q /*7*/:
                return "STEP_GET_PROXY_NUMBER";
            case wi.m /*8*/:
                return "STEP_END";
            default:
                return "STEP_UNKNOWN: " + i;
        }
    }

    private void d(int i) {
        glk.c("Babel_telephony", "TeleSetupController.finishSetupWithResult, result: " + i, new Object[0]);
        if (!this.q) {
            this.q = true;
            if (i == 2 && !gwb.R(this.a)) {
                glk.c("Babel_telephony", "TeleSetupController.finishSetupWithResult, can't make cell calls, cancelling", new Object[0]);
                i = 3;
            }
            switch (this.k) {
                case wi.j /*1*/:
                    if (i != 3) {
                        if (i != 1) {
                            iil.a(Integer.valueOf(this.b.f().a()), Integer.valueOf(1));
                            this.b.y();
                            this.i.a();
                            break;
                        }
                        iil.b("Expected non-null", this.t);
                        iil.a(Integer.valueOf(this.b.f().a()), Integer.valueOf(2));
                        this.b.a(this.y);
                        this.i.a(this.t, this.B);
                        break;
                    }
                    this.b.y();
                    this.i.b();
                    break;
                case wi.l /*2*/:
                case wi.z /*3*/:
                    this.j.a();
                    break;
                default:
                    iil.a("Unknown start reason: " + this.k);
                    break;
            }
        }
        this.g = true;
        if (this.l != null) {
            this.l.finish();
            this.l = null;
        }
        if (this.w != null) {
            this.w.d();
            this.w = null;
        }
        if (this.x != null) {
            this.x.c();
            this.x = null;
        }
        if (this.e != null) {
            this.e.d();
            this.e = null;
        }
        if (this.f != null) {
            this.f.e();
            this.f = null;
        }
        if (this.v != null) {
            this.v.e();
            this.v = null;
        }
        ((fnc) jyn.a(this.a, fnc.class)).b((fne) this);
        this.o = null;
        this.p = null;
        this.c.removeCallbacks(this.d);
    }

    //sets is going to use wifi call
    public void a(boolean z) {
        this.s = z;
        if (!d()) {//not k == 1
            return;
        }
        if (z) {//if true, connect and log time
            this.b.c();//gcq.c() sets connection state to 2
            this.b.x();//gcq.x() log connection time?
            return;
        }
        this.b.b();//not true => gcq.b() (sent connection state to 1 => state new)
        this.b.y();//gcq.y() => stop connecting sound
    }

    private void e(int i) {
        ghi ghi = null;
        if (this.l != null) {
            ghi = (ghi) this.l.J_().a("progress");
        }
        if (ghi == null) {
            String string = this.a.getString(gwb.vq);
            String string2 = this.a.getString(i);
            dr ghi2 = new ghi();
            ghi2.setArguments(new Bundle());
            ghi2.b(string);
            ghi2.c(string2);
            a(ghi2, "progress");
            return;
        }
        ghi.c(this.a.getString(i));
    }

    public void b(int i) {
        int i2 = gwb.vy;//2131361839
        ghf ghf = null;
        if (this.l != null) {//if jzp not null
            ghf = (ghf) this.l.J_().a("message");//grab related message from ed object
        }
        if (ghf == null) {//if first statement did not execute
            String string = this.a.getString(i2);
            String string2 = this.a.getString(i);
            dr ghf2 = new ghf();//creates a new ghf (type casts it to dr)
            ghf2.setArguments(new Bundle());
            ghf2.b(string);// creates extra title intent
            ghf2.c(string2);//creates extra text intent
            a(ghf2, "message");
            return;
        }
        ghf.b(this.a.getString(i2));//grabs Context for string 2131361839 (stored somewhere in the application...)
        ghf.c(this.a.getString(i)); //grabs Context for string 2131361840
    }

    //modifies the display it seems (using a fragment)
    private void a(dr drVar, String str) {
        if (this.l == null) {//not given a jzp
            this.o = drVar; //set o to be passed dr object (ggu)
            this.p = str;//give p given string (account chooser from r())
            n();
            return;
        }
        this.o = null; //reset dr object if l not null
        this.p = null;// reset string
        ed J_ = this.l.J_();//call method J? (no such method => lost name from decompile...)
        //returns some object that implements ed
        dr a = J_.a(16908290);//returns a dr object
        if (a == null || !str.equals(a.getTag())) {//no associated dr object or string doesn't match dr's tag
            String valueOf = String.valueOf(drVar);
            glk.c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 51) + String.valueOf(str).length()).append("TeleSetupController.showFragment, fragment: ").append(valueOf).append(", tag: ").append(str).toString(), new Object[0]);
            ew a2 = J_.a();
            if (a != null) { //so in the case that the string doesn't match dr's tag
                a2.a(17432576, 17432577);
            }
            a2.b(16908290, drVar, str);
            a2.a();
            return;
        }
        //so if there is a dr object and string does match dr tag => fragment already displayed
        String str2 = "Babel_telephony";
        String str3 = "TeleSetupController.showFragment, already displaying fragment: ";
        String valueOf2 = String.valueOf(str);
        glk.c(str2, valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3), new Object[0]);
    }

    public void a(String str, Intent intent) {
        String str2 = "Babel_telephony";
        String str3 = "TeleSetupController.performShowDialogFailedAction, performing action: ";
        String valueOf = String.valueOf(str);
        glk.c(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
        if ("cellular".equals(str)) {
            a(false);
            d(2);
        } else if ("wifi".equals(str)) {
            this.a.startActivity(intent);
        } else if ("cancel".equals(str)) {
            d(3);
        } else {
            str2 = "Babel_telephony";
            str3 = "TeleSetupController.performShowDialogFailedAction, unknown action: ";
            valueOf = String.valueOf(str);
            glk.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
            a(false);
            d(2);
        }
    }
}
