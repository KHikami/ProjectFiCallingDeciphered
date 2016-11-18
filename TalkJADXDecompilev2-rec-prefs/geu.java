package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.apps.hangouts.telephony.ui.TeleSetupActivity;
import java.util.Locale;

public final class geu implements fne, gek, ggo, ggy, ghh, gho, ghv, ghy, jcc {
    private final gbx f15089A;
    private String f15090B;
    final Context f15091a;
    final gcq f15092b;
    final Handler f15093c = gwb.aL();
    final Runnable f15094d = new gev(this);
    public ghc f15095e;
    public ggz f15096f;
    boolean f15097g;
    geb f15098h;
    private final gey f15099i;
    private final ghr f15100j;
    private final int f15101k;
    private jzp f15102l;
    private jmj f15103m;
    private int f15104n = 1;
    private dr f15105o;
    private String f15106p;
    private boolean f15107q;
    private boolean f15108r;
    private boolean f15109s;
    private bko f15110t;
    private String f15111u;
    private gei f15112v;
    private ggn f15113w;
    private ggl f15114x;
    private gcw f15115y;
    private boolean f15116z;

    geu(Context context, gcq gcq, gey gey, gbx gbx) {
        iil.m21875b("Expected non-null", (Object) gcq);
        this.f15091a = context;
        this.f15092b = gcq;
        this.f15099i = gey;
        this.f15100j = null;
        this.f15101k = 1;
        this.f15089A = gbx;
    }

    public geu(Context context, ghr ghr, boolean z) {
        this.f15091a = context;
        this.f15092b = null;
        this.f15099i = null;
        this.f15100j = ghr;
        this.f15101k = z ? 3 : 2;
        this.f15089A = null;
    }

    void m17455b() {
        m17443r();
    }

    void m17458c() {
        m17437d(3);
    }

    public boolean m17459d() {
        return this.f15101k == 1;
    }

    private void m17439n() {
        ba.m4610b(!this.f15107q, (Object) "Create UI after callback invoked.");
        if (this.f15108r) {
            glk.m17979c("Babel_telephony", "TeleSetupController.createSetupActivity, creation already in progress.", new Object[0]);
            return;
        }
        this.f15108r = true;
        Context context = this.f15091a;
        iil.m21875b("Expected non-null", (Object) this);
        Intent intent = new Intent(context, TeleSetupActivity.class);
        intent.putExtra("controller", new gkn((Object) this));
        if (m17459d()) {
            intent.addFlags(1342210048);
        }
        if (m17459d()) {
            this.f15114x = new ggl(this.f15091a, this, intent);
            ggk a = this.f15092b.m16955d().m9200a();
            if (a.m17651a((Object) this)) {
                this.f15113w = a.m17648a(intent, this.f15114x);
            }
            if (this.f15113w == null) {
                glk.m17982e("Babel_telephony", "TeleSetupController.createSetupActivity, unable to show dialog on top of in-call UI", new Object[0]);
                this.f15114x.m17653a();
                return;
            }
            glk.m17979c("Babel_telephony", "TeleSetupController.createSetupActivity, wifi call waiting for dialog", new Object[0]);
            return;
        }
        this.f15091a.startActivity(intent);
    }

    public void mo2241a(jzp jzp, jmj jmj) {
        if (!this.f15107q) {
            iil.m21872a("Expected null", this.f15102l);
            this.f15102l = jzp;
            this.f15103m = jmj;
            if (this.f15116z) {
                iil.m21872a("Expected null", this.f15105o);
                iil.m21872a("Expected null", this.f15106p);
                this.f15116z = false;
                m17442q();
                return;
            }
            iil.m21875b("Expected non-null", this.f15105o);
            iil.m21875b("Expected non-null", this.f15106p);
            m17433a(this.f15105o, this.f15106p);
        } else if (this.f15102l != null) {
            this.f15102l.finish();
        }
    }

    public void mo2242e() {
        glk.m17979c("Babel_telephony", "TeleSetupController.onActivityDestroyed", new Object[0]);
        this.f15102l = null;
        m17437d(3);
    }

    public void mo2243f() {
        glk.m17979c("Babel_telephony", "TeleSetupController.onWifiChooserWifiChosen", new Object[0]);
        m17453a(true);
        m17468m();
    }

    public void mo2244g() {
        glk.m17979c("Babel_telephony", "TeleSetupController.onWifiChooserCellularChosen", new Object[0]);
        m17453a(false);
        m17468m();
    }

    public void mo2239a(bko bko) {
        if (bko != null) {
            String str = "Babel_telephony";
            String str2 = "TeleSetupController.onAccountChooserDone, account: ";
            String valueOf = String.valueOf(gwb.m1410J((Object) bko));
            glk.m17979c(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
            this.f15110t = bko;
            if (fde.m15030j(this.f15110t.m5638g())) {
                m17468m();
                return;
            } else if (this.f15102l == null) {
                this.f15116z = true;
                m17439n();
                return;
            } else {
                m17442q();
                return;
            }
        }
        glk.m17981d("Babel_telephony", "TeleSetupController.onAccountChooserDone, no account.", new Object[0]);
        m17456b(gwb.vv);
    }

    public void mo2245h() {
        glk.m17979c("Babel_telephony", "TeleSetupController.onAccountChooserCancelled", new Object[0]);
        m17437d(3);
    }

    public void mo2246i() {
        glk.m17979c("Babel_telephony", "TeleSetupController.onTosAccepted", new Object[0]);
        m17438e(gwb.vp);
        this.f15096f = m17432a(this.f15110t.m5638g(), new ghb(this));
        this.f15096f.m17686d();
    }

    private ggz m17432a(int i, ghb ghb) {
        return new ggz(this.f15091a, i, ghb);
    }

    public void mo2247j() {
        glk.m17979c("Babel_telephony", "TeleSetupController.onTosDeclined", new Object[0]);
        m17437d(3);
    }

    public void mo1133a(boolean z, jcb jcb, jcb jcb2, int i, int i2) {
        glk.m17979c("Babel_telephony", String.format("TeleSetupController.onAccountHandlerStateTransition, %s -> %s", new Object[]{jcb, jcb2}), new Object[0]);
    }

    public void mo500a(int i, fnd fnd, fnf fnf) {
        glk.m17979c("Babel_telephony", "TeleSetupController.onRegistrationStateChange", new Object[0]);
        m17441p();
        if (i == this.f15110t.m5638g()) {
            ((fnc) jyn.m25426a(this.f15091a, fnc.class)).mo2049b((fne) this);
            bko bko = this.f15110t;
            gwb.aJ();
            if (bko != null && bko.equals(this.f15110t)) {
                boolean j = fde.m15030j(this.f15110t.m5638g());
                glk.m17979c("Babel_telephony", "TeleSetupController.accountSetupComplete, isReady: " + j, new Object[0]);
                this.f15093c.removeCallbacks(this.f15094d);
                if (j) {
                    m17440o();
                } else {
                    m17466k();
                }
            }
        }
    }

    private void m17440o() {
        String b = gwb.m1998b(this.f15091a, "babel_user_to_allow_wifi_calling_for", "tycho_users");
        String str = "Babel_telephony";
        String str2 = "TeleSetupController.chooseWifiOrCellular, selectedAccount: ";
        String valueOf = String.valueOf(gwb.m1410J(this.f15110t));
        glk.m17979c(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        if (this.f15110t != null) {
            m17468m();
        } else if ("hangouts_testing_users".equals(b)) {
            m17433a(new ggu(), "account_chooser");
        } else {
            iil.m21879b("Unexpected start reason: " + this.f15101k, this.f15101k == 3);
            m17453a(false);
            m17437d(2);
        }
    }

    void m17466k() {
        if (m17459d()) {
            m17453a(false);
            m17468m();
            return;
        }
        m17456b(gwb.vx);
    }

    public void mo2240a(String str) {
        if (!this.f15097g) {
            String str2 = "Babel_telephony";
            String str3 = "TeleSetupController.onGetProxyNumberSucceeded, proxy number: ";
            String valueOf = String.valueOf(gwb.m1397G(str));
            glk.m17979c(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
            iil.m21875b("Expected non-null", (Object) str);
            this.f15092b.m16959f().m17138a(str);
            m17468m();
        }
    }

    public void mo2238a(int i) {
        if (!this.f15097g) {
            if (i != 1) {
                glk.m17979c("Babel_telephony", "TeleSetupController.onGetProxyNumberFailed, with error code %d", Integer.valueOf(i));
                m17468m();
                return;
            }
            glk.m17979c("Babel_telephony", "TeleSetupController.onGetProxyNumberFailed, getting proxy number from Tycho not supported, using hangouts", new Object[0]);
            if (gwb.m1403H(this.f15091a)) {
                this.f15112v = new gei(this.f15110t.m5638g(), this.f15092b.m16959f().m17142d(), glq.m18025f(gwb.m1400H()), this, this.f15092b.m16937a());
                this.f15112v.m17165d();
                return;
            }
            glk.m17981d("Babel_telephony", "TeleSetupController.onGetProxyNumberFailed, no internet connection", new Object[0]);
            this.f15092b.m16937a().mo1403a(205);
            m17468m();
        }
    }

    public void mo2237a() {
        if (!this.f15097g) {
            glk.m17979c("Babel_telephony", "TeleSetupController.onGetProxyNumberFailed", new Object[0]);
            if (geu.m17434a(this.f15092b.m16959f())) {
                String str = "Babel_telephony";
                String str2 = "TeleSetupController.onGetProxyNumberFailed, blocking possible non-free call to avoid paying roaming rates. ";
                String valueOf = String.valueOf(gwb.m1397G(this.f15092b.m16959f().m17142d()));
                glk.m17979c(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                m17437d(3);
                return;
            }
            m17468m();
        }
    }

    private static boolean m17434a(gef gef) {
        return !Locale.US.getCountry().equals(glq.m18000a().m18046a(gef.m17142d()));
    }

    public void mo2248l() {
        glk.m17979c("Babel_telephony", "TeleSetupController.onMessageDone", new Object[0]);
        m17437d(3);
    }

    void m17457b(String str) {
        this.f15090B = str;
    }

    void m17449a(geb geb) {
        boolean z;
        this.f15098h = geb;
        boolean e = ggc.m17608a(this.f15091a).m17629e();
        this.f15092b.m16951b(e);
        if (!gwb.m1446R(this.f15091a)) {
            this.f15092b.m16951b(true);
        }
        glk.m17979c("Babel_telephony", "TeleSetupController.isWifiCallPossible", new Object[0]);
        iil.m21875b("Expected non-null", geb.f14824b);
        iil.m21875b("Expected non-null", geb.f14825c);
        if (geb.f14823a == null) {
            glk.m17979c("Babel_telephony", "TeleSetupController.isWifiCallPossible, no cell state, didTimeout: " + geb.f14829g, new Object[0]);
        } else if (!gwb.m1438P(this.f15091a)) {
            glk.m17979c("Babel_telephony", "TeleSetupController.isWifiCallPossible, no permissions", new Object[0]);
        } else if (ggc.m17608a(this.f15091a).m17626c()) {
            if ("no_users".equals(gwb.m1998b(this.f15091a, "babel_user_to_allow_wifi_calling_for", "tycho_users"))) {
                glk.m17979c("Babel_telephony", "TeleSetupController.isWifiCallPossible, wifi calls disabled for all users by gservices", new Object[0]);
            } else {
                biw g = gwb.m2214g(this.f15091a);
                if (!g.mo564a("babel_outgoing_wifi_calls_allowed", true)) {
                    glk.m17979c("Babel_telephony", "TeleSetupController.isWifiCallPossible, outgoing wifi calls disabled by gservices", new Object[0]);
                } else if (!gfj.m17505a(this.f15092b.m16955d()) && dgg.m11692a().m11722n()) {
                    glk.m17979c("Babel_telephony", "TeleSetupController.isWifiCallPossible, another hangout is in progress", new Object[0]);
                } else if (!this.f15092b.m16959f().m17150l()) {
                    r4 = "Babel_telephony";
                    r5 = "TeleSetupController.isWifiCallPossible, invalid phone number: ";
                    r0 = String.valueOf(gwb.m1397G(this.f15092b.m16959f().m17143e()));
                    glk.m17979c(r4, r0.length() != 0 ? r5.concat(r0) : new String(r5), new Object[0]);
                } else if (this.f15092b.m16959f().m17151m() && !g.mo564a("babel_wifi_call_google_voice_app_integration_enabled", false)) {
                    glk.m17979c("Babel_telephony", "TeleSetupController.isWifiCallPossible, Google Voice app integration disabled by gservices", new Object[0]);
                } else if (geb.f14825c.m17120b(this.f15091a) && !g.mo564a("babel_international_wifi_call_allowed", true)) {
                    glk.m17979c("Babel_telephony", "TeleSetupController.isWifiCallPossible, wifi calling while international not allowed", new Object[0]);
                } else if (geb.f14825c.m17118a(this.f15091a) && geb.f14825c.m17117a() == 2 && !g.mo564a("babel_roaming_wifi_call_allowed", true)) {
                    glk.m17979c("Babel_telephony", "TeleSetupController.isWifiCallPossible, wifi calling while roaming not allowed", new Object[0]);
                } else if (!this.f15092b.m16959f().m17152n() || g.mo564a("babel_voicemail_wifi_call_allowed", true)) {
                    r0 = this.f15092b.m16959f().m17141c();
                    if (geb.f14825c.m17120b(this.f15091a) && glq.m18019d(gwb.m1400H(), r0)) {
                        r4 = "Babel_telephony";
                        r5 = "TeleSetupController.isWifiCallPossible, emergency number cannot be on wifi when outside the US : ";
                        r0 = String.valueOf(r0);
                        glk.m17979c(r4, r0.length() != 0 ? r5.concat(r0) : new String(r5), new Object[0]);
                    } else if (this.f15092b.m16975v()) {
                        glk.m17979c("Babel_telephony", "TeleSetupController.shouldAllowRing, network was was choosen manually, only checking for Wi-Fi connection", new Object[0]);
                        if (geb.f14824b.f15184a) {
                            z = true;
                            if (z) {
                                if (e) {
                                    glk.m17979c("Babel_telephony", "TeleSetupController.performWifiChooserWithCellState, ask each call is enabled", new Object[0]);
                                    if (geb.f14823a.m16929a()) {
                                        glk.m17979c("Babel_telephony", "TeleSetupController.performWifiChooserWithCellState, no cell service, forcing wifi", new Object[0]);
                                    } else {
                                        m17433a(new ghw(), "wifi_chooser");
                                        return;
                                    }
                                }
                                m17453a(true);
                                m17468m();
                            }
                            m17453a(false);
                            m17468m();
                            return;
                        }
                        glk.m17979c("Babel_telephony", "TeleSetupController.isWifiCallPossible, not connected to wifi", new Object[0]);
                    } else {
                        this.f15115y = gcw.m16990a(this.f15091a, this.f15092b.m16959f().m17142d(), false, geb.f14824b);
                        if (this.f15115y != null) {
                            glk.m17979c("Babel_telephony", "TeleSetupController.isWifiCallPossible, in Wi-Fi calling experiment", new Object[0]);
                            z = true;
                        } else {
                            r0 = this.f15092b.m16959f().m17144f();
                            if (gwb.m1904a(this.f15091a, geb.f14825c, geb.f14823a, geb.f14824b, r0) || gwb.m1903a(this.f15091a, geb.f14825c, geb.f14823a, geb.f14824b)) {
                                if (m17435b(geb) || glq.m18019d(this.f15091a, r0)) {
                                    glk.m17979c("Babel_telephony", "TeleSetupController.isWifiCallPossible, falling back to cellular data", new Object[0]);
                                    this.f15092b.m16954c(true);
                                    z = true;
                                } else {
                                    glk.m17979c("Babel_telephony", "TeleSetupController.isWifiCallPossible, data network latency high", new Object[0]);
                                }
                            } else if (gwb.m2056b(this.f15091a, this.f15092b.m16961h(), geb.f14823a, geb.f14824b, r0)) {
                                if (geb.f14823a.m16929a()) {
                                    glk.m17979c("Babel_telephony", "TeleSetupController.hasNetworkQualityForWifiCall, no cell service, not checking herrevad", new Object[0]);
                                    z = true;
                                } else if (gwb.m1902a(this.f15091a, geb.f14825c, geb.f14826d, geb.f14823a)) {
                                    m17446a(2893, -1);
                                    z = true;
                                } else {
                                    m17446a(2895, -1);
                                    glk.m17979c("Babel_telephony", "TeleSetupController.hasNetworkQualityForWifiCall using cell due to bad herrevad network quality score for the wifi network", new Object[0]);
                                    z = false;
                                }
                                if (z) {
                                    if (geb.f14823a.m16929a()) {
                                        glk.m17979c("Babel_telephony", "TeleSetupController.shouldCheckStunPingLatency, not checking, no cell service", new Object[0]);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (!z || m17435b(geb)) {
                                        glk.m17979c("Babel_telephony", "TeleSetupController.isWifiCallPossible, good network, using Wi-Fi", new Object[0]);
                                        z = true;
                                    } else {
                                        glk.m17979c("Babel_telephony", "TeleSetupController.isWifiCallPossible, poor stun latency on Wi-Fi", new Object[0]);
                                    }
                                } else {
                                    glk.m17979c("Babel_telephony", "TeleSetupController.isWifiCallPossible, bad network quality score", new Object[0]);
                                }
                            }
                        }
                        if (z) {
                            if (e) {
                                glk.m17979c("Babel_telephony", "TeleSetupController.performWifiChooserWithCellState, ask each call is enabled", new Object[0]);
                                if (geb.f14823a.m16929a()) {
                                    m17433a(new ghw(), "wifi_chooser");
                                    return;
                                }
                                glk.m17979c("Babel_telephony", "TeleSetupController.performWifiChooserWithCellState, no cell service, forcing wifi", new Object[0]);
                            }
                            m17453a(true);
                            m17468m();
                        }
                        m17453a(false);
                        m17468m();
                        return;
                    }
                } else {
                    glk.m17970a("Babel_telephony", "TeleSetupController.isWifiCallPossible, calling voicemail not allowed", new Object[0]);
                }
            }
        } else {
            glk.m17979c("Babel_telephony", "TeleSetupController.isWifiCallPossible, wifi calling not enabled", new Object[0]);
        }
        z = false;
        if (z) {
            m17453a(false);
            m17468m();
            return;
        }
        if (e) {
            glk.m17979c("Babel_telephony", "TeleSetupController.performWifiChooserWithCellState, ask each call is enabled", new Object[0]);
            if (geb.f14823a.m16929a()) {
                glk.m17979c("Babel_telephony", "TeleSetupController.performWifiChooserWithCellState, no cell service, forcing wifi", new Object[0]);
            } else {
                m17433a(new ghw(), "wifi_chooser");
                return;
            }
        }
        m17453a(true);
        m17468m();
    }

    private boolean m17435b(geb geb) {
        String str;
        if (geb.f14824b.f15184a) {
            str = "wifi";
        } else {
            str = gwb.m2372v(geb.f14823a.f14663e);
        }
        str = String.format(Locale.US, "_network_type_%s", new Object[]{str});
        Context context = this.f15091a;
        String valueOf = String.valueOf("babel_stun_ping_latency_millis");
        str = String.valueOf(str);
        long a = gwb.m1519a(context, str.length() != 0 ? valueOf.concat(str) : new String(valueOf), 100);
        int i = geb.f14827e ? (int) geb.f14828f : -1;
        if (geb.f14829g || !geb.f14827e || geb.f14828f > a) {
            glk.m17979c("Babel_telephony", "TeleSetupController.hasAcceptableStunPingLatency, not acceptable, didTimeout: " + geb.f14829g + ", wasStunPingSuccessful: " + geb.f14827e + ", latency millis: " + geb.f14828f, new Object[0]);
            m17446a(2897, i);
            return false;
        }
        m17446a(2898, i);
        return true;
    }

    void m17446a(int i, int i2) {
        int g;
        if (this.f15110t != null) {
            g = this.f15110t.m5638g();
        } else {
            g = ggc.m17608a(this.f15091a).m17618b();
        }
        iie e = ((iih) jyn.m25426a(this.f15091a, iih.class)).mo1979a(g).mo1693b().mo1712c().mo1716e(this.f15092b.m16962i());
        if (i2 >= 0) {
            e.mo1698a(Integer.valueOf(i2));
        }
        e.mo1714c(i);
    }

    private void m17441p() {
        ggc a = ggc.m17608a(this.f15091a);
        int b = a.m17618b();
        if (b == -1) {
            this.f15111u = ggc.m17608a(this.f15091a).m17633i();
            String str = "Babel_telephony";
            String str2 = "TeleSetupController.setSelectedAccount accountName:";
            String valueOf = String.valueOf(this.f15111u);
            glk.m17979c(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
        if (b != -1) {
            this.f15110t = fde.m15018e(b);
            if (this.f15110t == null) {
                a.m17613a(-1);
            }
        }
    }

    private void m17442q() {
        glk.m17979c("Babel_telephony", "TeleSetupController.loginToAccount", new Object[0]);
        m17438e(gwb.vr);
        this.f15093c.postDelayed(this.f15094d, (long) gwb.m1492a(this.f15091a, "babel_wifi_call_account_setup_timeout", 20000));
        ((fnc) jyn.m25426a(this.f15091a, fnc.class)).mo2046a((fne) this);
        this.f15103m.m24696a("active-hangouts-account").m24702b((jcc) this);
        if (this.f15110t != null) {
            glk.m17979c("Babel_telephony", "TeleSetupController.loginToAccount using accountId", new Object[0]);
            this.f15103m.m24700a(new jmu().m24731a().m24732a(this.f15110t.m5638g()));
            return;
        }
        glk.m17979c("Babel_telephony", "TeleSetupController.loginToAccount using accountName", new Object[0]);
        this.f15103m.m24700a(new jmu().m24731a().m24736a(this.f15111u));
    }

    private void m17443r() {
        int i = 1;
        iil.m21879b("Expected condition to be false", this.f15107q);
        String valueOf;
        int i2;
        switch (this.f15104n) {
            case 1:
                glk.m17979c("Babel_telephony", "TeleSetupController.performStartStep, startReason: " + this.f15101k, new Object[0]);
                switch (this.f15101k) {
                    case 1:
                        iil.m21874a("Expected condition to be true", m17459d());
                        new gdz(this.f15091a, new gew(this)).m17104a();
                        return;
                    case 2:
                        m17468m();
                        return;
                    case 3:
                        m17433a(new ggu(), "account_chooser");
                        return;
                    default:
                        iil.m21870a("unknown start reason: " + this.f15101k);
                        m17456b(gwb.vv);
                        return;
                }
            case 2:
                m17441p();
                m17468m();
                return;
            case 3:
                boolean z = this.f15110t != null && fde.m15030j(this.f15110t.m5638g());
                glk.m17979c("Babel_telephony", "TeleSetupController.performSetupAccount, isReady: " + z, new Object[0]);
                if (!gwb.m1403H(this.f15091a)) {
                    glk.m17979c("Babel_telephony", "TeleSetupController.performSetupAccount, not connected to internet", new Object[0]);
                    z = true;
                }
                if (z) {
                    m17440o();
                    return;
                }
                valueOf = String.valueOf(this.f15110t);
                String str = this.f15111u;
                glk.m17979c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 65) + String.valueOf(str).length()).append("TeleSetupController.setupOrLogin, selectedAccount:").append(valueOf).append(" , accountName:").append(str).toString(), new Object[0]);
                if (this.f15110t == null && TextUtils.isEmpty(this.f15111u)) {
                    m17440o();
                    return;
                } else if (this.f15102l == null) {
                    this.f15116z = true;
                    m17439n();
                    return;
                } else {
                    m17442q();
                    return;
                }
            case 4:
                if (this.f15110t == null) {
                    i2 = 0;
                } else {
                    i2 = this.f15110t.m5622I();
                }
                glk.m17979c("Babel_telephony", "TeleSetupController.performUpdateGoogleVoiceStatus, status: " + i2, new Object[0]);
                if (i2 != 0 || (m17459d() && !this.f15109s)) {
                    m17468m();
                    return;
                }
                m17438e(gwb.vs);
                this.f15095e = new ghc(this.f15110t.m5638g(), new ghe(this));
                this.f15095e.m17693a(this.f15091a);
                return;
            case 5:
                if (this.f15110t == null) {
                    i2 = 0;
                } else {
                    i2 = this.f15110t.m5622I();
                }
                switch (i2) {
                    case 0:
                        glk.m17981d("Babel_telephony", "TeleSetupController.performGoogleVoiceTos, status is UNKNOWN", new Object[0]);
                        if (m17459d()) {
                            m17453a(false);
                            m17468m();
                            return;
                        }
                        m17456b(gwb.vv);
                        return;
                    case 1:
                        glk.m17979c("Babel_telephony", "TeleSetupController.performGoogleVoiceTos, status is ALLOWED", new Object[0]);
                        m17468m();
                        return;
                    case 2:
                        glk.m17979c("Babel_telephony", "TeleSetupController.performGoogleVoiceTos, status is NEED_TOS", new Object[0]);
                        if (m17459d()) {
                            m17453a(false);
                            m17468m();
                            return;
                        }
                        m17433a(new ghs(), "tos");
                        return;
                    case 3:
                        glk.m17981d("Babel_telephony", "TeleSetupController.performGoogleVoiceTos, status is BLOCKED", new Object[0]);
                        if (m17459d()) {
                            m17453a(false);
                            m17468m();
                            return;
                        }
                        m17456b(gwb.vw);
                        return;
                    default:
                        iil.m21870a("Unknown voice calling status: " + this.f15110t.m5622I());
                        if (m17459d()) {
                            m17453a(false);
                            m17468m();
                            return;
                        }
                        m17456b(gwb.vv);
                        return;
                }
            case 6:
                if (!m17459d()) {
                    i = 0;
                } else if (!this.f15109s) {
                    glk.m17970a("Babel_telephony", "TeleSetupController.shouldCreateHangoutId not using wifi for calls", new Object[0]);
                    i = 0;
                } else if (this.f15098h == null || this.f15098h.f14823a == null || this.f15098h.f14823a.m16929a()) {
                    glk.m17970a("Babel_telephony", "TeleSetupController.shouldCreateHangoutId no cell service", new Object[0]);
                    i = 0;
                } else if (glq.m18019d(gwb.m1400H(), this.f15092b.m16959f().m17144f())) {
                    glk.m17970a("Babel_telephony", "TeleSetupController.shouldCreateHangoutId emergency number", new Object[0]);
                    i = 0;
                }
                if (i != 0) {
                    glk.m17979c("Babel_telephony", "TeleSetupController.performCreateHangoutId, Creating hangoutId...", new Object[0]);
                    irl gex = new gex(this);
                    gex.m17477b();
                    this.f15089A.m16877a(this.f15091a).m23044a(this.f15110t.m5629a(), gex);
                    return;
                }
                m17468m();
                return;
            case 7:
                if (m17459d()) {
                    gef f = this.f15092b.m16959f();
                    if (f.m17154p()) {
                        int g = this.f15110t.m5638g();
                        String d = f.m17142d();
                        String f2 = glq.m18025f(gwb.m1400H());
                        if (d == null || f2 == null) {
                            glk.m17982e("Babel_telephony", String.format("TeleSetupController.performGetProxyNumber, invalid input, accountId: %d, destination number: %s, from number: %s", new Object[]{Integer.valueOf(g), gwb.m1397G(d), gwb.m1397G(f2)}), new Object[0]);
                            if (geu.m17434a(f)) {
                                String str2 = "Babel_telephony";
                                valueOf = "TeleSetupController.performGetProxyNumber, blocking possible non-free call to avoid paying roaming rates. ";
                                String valueOf2 = String.valueOf(gwb.m1397G(d));
                                glk.m17979c(str2, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), new Object[0]);
                                m17437d(3);
                                return;
                            }
                            m17468m();
                            return;
                        }
                        gwb.m1754a(this.f15091a, d, (ggo) this);
                        return;
                    }
                    m17468m();
                    return;
                }
                m17468m();
                return;
            case 8:
                if (!this.f15109s) {
                    i = 2;
                }
                m17437d(i);
                return;
            default:
                iil.m21870a("unknown step: " + this.f15104n);
                m17453a(false);
                m17437d(2);
                return;
        }
    }

    public void m17468m() {
        String valueOf = String.valueOf(geu.m17436c(this.f15104n));
        String valueOf2 = String.valueOf(geu.m17436c(this.f15104n + 1));
        glk.m17979c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 41) + String.valueOf(valueOf2).length()).append("TeleSetupController.advanceNextStep, ").append(valueOf).append(" -> ").append(valueOf2).toString(), new Object[0]);
        valueOf = "Babel_telephony";
        valueOf2 = "selectedAccount: ";
        String valueOf3 = String.valueOf(gwb.m1410J(this.f15110t));
        glk.m17979c(valueOf, valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2), new Object[0]);
        this.f15104n++;
        m17443r();
    }

    private static String m17436c(int i) {
        switch (i) {
            case 1:
                return "STEP_START";
            case 2:
                return "STEP_CHOOSE_ACCOUNT";
            case 3:
                return "STEP_SETUP_ACCOUNT";
            case 4:
                return "STEP_UPDATE_GOOGLE_VOICE_STATUS";
            case 5:
                return "STEP_GOOGLE_VOICE_TOS";
            case 6:
                return "STEP_CREATE_HANGOUT_ID";
            case 7:
                return "STEP_GET_PROXY_NUMBER";
            case 8:
                return "STEP_END";
            default:
                return "STEP_UNKNOWN: " + i;
        }
    }

    private void m17437d(int i) {
        glk.m17979c("Babel_telephony", "TeleSetupController.finishSetupWithResult, result: " + i, new Object[0]);
        if (!this.f15107q) {
            this.f15107q = true;
            if (i == 2 && !gwb.m1446R(this.f15091a)) {
                glk.m17979c("Babel_telephony", "TeleSetupController.finishSetupWithResult, can't make cell calls, cancelling", new Object[0]);
                i = 3;
            }
            switch (this.f15101k) {
                case 1:
                    if (i != 3) {
                        if (i != 1) {
                            iil.m21869a(Integer.valueOf(this.f15092b.m16959f().m17135a()), Integer.valueOf(1));
                            this.f15092b.m16978y();
                            this.f15099i.m17478a();
                            break;
                        }
                        iil.m21875b("Expected non-null", this.f15110t);
                        iil.m21869a(Integer.valueOf(this.f15092b.m16959f().m17135a()), Integer.valueOf(2));
                        this.f15092b.m16943a(this.f15115y);
                        this.f15099i.m17479a(this.f15110t, this.f15090B);
                        break;
                    }
                    this.f15092b.m16978y();
                    this.f15099i.m17480b();
                    break;
                case 2:
                case 3:
                    this.f15100j.mo2273a();
                    break;
                default:
                    iil.m21870a("Unknown start reason: " + this.f15101k);
                    break;
            }
        }
        this.f15097g = true;
        if (this.f15102l != null) {
            this.f15102l.finish();
            this.f15102l = null;
        }
        if (this.f15113w != null) {
            this.f15113w.mo2263d();
            this.f15113w = null;
        }
        if (this.f15114x != null) {
            this.f15114x.m17655c();
            this.f15114x = null;
        }
        if (this.f15095e != null) {
            this.f15095e.m17695d();
            this.f15095e = null;
        }
        if (this.f15096f != null) {
            this.f15096f.m17687e();
            this.f15096f = null;
        }
        if (this.f15112v != null) {
            this.f15112v.m17166e();
            this.f15112v = null;
        }
        ((fnc) jyn.m25426a(this.f15091a, fnc.class)).mo2049b((fne) this);
        this.f15105o = null;
        this.f15106p = null;
        this.f15093c.removeCallbacks(this.f15094d);
    }

    public void m17453a(boolean z) {
        this.f15109s = z;
        if (!m17459d()) {
            return;
        }
        if (z) {
            this.f15092b.m16952c();
            this.f15092b.m16977x();
            return;
        }
        this.f15092b.m16947b();
        this.f15092b.m16978y();
    }

    private void m17438e(int i) {
        ghi ghi = null;
        if (this.f15102l != null) {
            ghi = (ghi) this.f15102l.J_().mo1844a("progress");
        }
        if (ghi == null) {
            String string = this.f15091a.getString(gwb.vq);
            String string2 = this.f15091a.getString(i);
            dr ghi2 = new ghi();
            ghi2.setArguments(new Bundle());
            ghi2.m17700b(string);
            ghi2.m17701c(string2);
            m17433a(ghi2, "progress");
            return;
        }
        ghi.m17701c(this.f15091a.getString(i));
    }

    public void m17456b(int i) {
        int i2 = gwb.vy;
        ghf ghf = null;
        if (this.f15102l != null) {
            ghf = (ghf) this.f15102l.J_().mo1844a("message");
        }
        if (ghf == null) {
            String string = this.f15091a.getString(i2);
            String string2 = this.f15091a.getString(i);
            dr ghf2 = new ghf();
            ghf2.setArguments(new Bundle());
            ghf2.m17698b(string);
            ghf2.m17699c(string2);
            m17433a(ghf2, "message");
            return;
        }
        ghf.m17698b(this.f15091a.getString(i2));
        ghf.m17699c(this.f15091a.getString(i));
    }

    private void m17433a(dr drVar, String str) {
        if (this.f15102l == null) {
            this.f15105o = drVar;
            this.f15106p = str;
            m17439n();
            return;
        }
        this.f15105o = null;
        this.f15106p = null;
        ed J_ = this.f15102l.J_();
        dr a = J_.mo1843a(16908290);
        if (a == null || !str.equals(a.getTag())) {
            String valueOf = String.valueOf(drVar);
            glk.m17979c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 51) + String.valueOf(str).length()).append("TeleSetupController.showFragment, fragment: ").append(valueOf).append(", tag: ").append(str).toString(), new Object[0]);
            ew a2 = J_.mo1845a();
            if (a != null) {
                a2.mo1524a(17432576, 17432577);
            }
            a2.mo1531b(16908290, drVar, str);
            a2.mo1522a();
            return;
        }
        String str2 = "Babel_telephony";
        String str3 = "TeleSetupController.showFragment, already displaying fragment: ";
        String valueOf2 = String.valueOf(str);
        glk.m17979c(str2, valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3), new Object[0]);
    }

    public void m17451a(String str, Intent intent) {
        String str2 = "Babel_telephony";
        String str3 = "TeleSetupController.performShowDialogFailedAction, performing action: ";
        String valueOf = String.valueOf(str);
        glk.m17979c(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
        if ("cellular".equals(str)) {
            m17453a(false);
            m17437d(2);
        } else if ("wifi".equals(str)) {
            this.f15091a.startActivity(intent);
        } else if ("cancel".equals(str)) {
            m17437d(3);
        } else {
            str2 = "Babel_telephony";
            str3 = "TeleSetupController.performShowDialogFailedAction, unknown action: ";
            valueOf = String.valueOf(str);
            glk.m17982e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
            m17453a(false);
            m17437d(2);
        }
    }
}
