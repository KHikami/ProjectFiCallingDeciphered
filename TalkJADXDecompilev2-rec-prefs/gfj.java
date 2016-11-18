package p000;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;
import android.telecom.AudioState;
import android.telecom.Connection;
import android.telecom.DisconnectCause;
import android.telecom.StatusHints;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.telephony.TeleConnectionService;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class gfj implements gcc, gcf, gfg, gfr {
    final Context f15141a;
    final String f15142b;
    gcq f15143c;
    did f15144d;
    int f15145e;
    boolean f15146f;
    String f15147g;
    gcw f15148h;
    gfl f15149i;
    int f15150j;
    Runnable f15151k;
    private final List<gcd> f15152l = new CopyOnWriteArrayList();
    private gfn f15153m;
    private gfm f15154n;
    private long f15155o;
    private long f15156p;
    private gfq f15157q;
    private gce f15158r;
    private geg f15159s;
    private boolean f15160t;
    private gfe f15161u;
    private Boolean f15162v;
    private Integer f15163w;

    static boolean m17505a(TeleConnectionService teleConnectionService) {
        for (Connection connection : teleConnectionService.getAllConnections()) {
            if (gfj.m17507b((gcq) connection)) {
                return true;
            }
        }
        return false;
    }

    static void m17504a(TeleConnectionService teleConnectionService, gcq gcq) {
        for (Connection connection : teleConnectionService.getAllConnections()) {
            gcq gcq2 = (gcq) connection;
            if (gcq2 == gcq || gfj.m17507b(gcq2)) {
                gcq2.onHold();
            }
        }
    }

    private static void m17506b(TeleConnectionService teleConnectionService, gcq gcq) {
        for (Connection connection : teleConnectionService.getAllConnections()) {
            gcq gcq2 = (gcq) connection;
            if (gcq2 == gcq || gfj.m17507b(gcq2)) {
                gcq2.onUnhold();
            }
        }
    }

    public static boolean m17507b(gcq gcq) {
        return gcq.m16963j() != null && gcq.m16963j().mo2220d() == 2;
    }

    gfj(Context context, gfn gfn, String str, boolean z) {
        this.f15141a = context;
        this.f15153m = gfn;
        this.f15142b = str;
        if (!z && TextUtils.isEmpty(str)) {
            this.f15159s = new geg(this);
            mo2212a(this.f15159s);
        }
    }

    public Boolean m17550n() {
        return this.f15162v;
    }

    public Integer m17551o() {
        return this.f15163w;
    }

    void m17531b(int i) {
        String valueOf = String.valueOf(this.f15143c);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 61).append("TeleWifiCall.cancelIncomingCall, dismissReason: ").append(i).append(", ").append(valueOf).toString(), new Object[0]);
        int i2 = i == 1 ? 4 : 5;
        String str = "cancel ring, dismiss reason: ";
        valueOf = String.valueOf(gwb.m2345s(i));
        m17521a(new DisconnectCause(i2, valueOf.length() != 0 ? str.concat(valueOf) : new String(str)));
    }

    void m17522a(did did) {
        String valueOf = String.valueOf(did);
        String valueOf2 = String.valueOf(this.f15143c);
        glk.m17979c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 46) + String.valueOf(valueOf2).length()).append("TeleWifiCall.setHangoutState, hangoutState: ").append(valueOf).append(", ").append(valueOf2).toString(), new Object[0]);
        this.f15144d = did;
        this.f15146f = this.f15144d.m11940C();
        if (this.f15154n == null) {
            this.f15154n = new gfm(this);
            dgg.m11692a().m11701a(this.f15154n);
        }
        if (TextUtils.isEmpty(this.f15142b) && this.f15143c != null && this.f15143c.m16955d().getAllConnections().size() == 1) {
            gwb.m1433O(this.f15141a);
        }
    }

    public did m17552p() {
        return this.f15144d;
    }

    private void m17511r() {
        if (this.f15143c != null && TextUtils.isEmpty(this.f15143c.m16970q()) && this.f15144d != null && this.f15144d == dgg.m11692a().m11727s()) {
            this.f15143c.m16953c(this.f15144d.m11981e().m11897g());
        }
    }

    void m17537c(boolean z) {
        m17509e(false);
    }

    void m17521a(DisconnectCause disconnectCause) {
        String valueOf = String.valueOf(disconnectCause);
        String valueOf2 = String.valueOf(this.f15143c);
        glk.m17979c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 29) + String.valueOf(valueOf2).length()).append("TeleWifiCall.close, cause: ").append(valueOf).append(", ").append(valueOf2).toString(), new Object[0]);
        m17511r();
        if (this.f15151k != null) {
            gwb.m2042b(this.f15151k);
            this.f15151k = null;
        }
        if (this.f15154n != null) {
            dgg.m11692a().m11705b(this.f15154n);
            this.f15154n = null;
        }
        if (this.f15153m != null) {
            this.f15153m.mo2197c();
            this.f15153m = null;
        }
        if (this.f15157q != null) {
            this.f15157q.m17571a();
            this.f15157q = null;
        }
        if (this.f15161u != null) {
            this.f15161u.m17497a();
            this.f15161u = null;
        }
        if (this.f15158r != null) {
            this.f15158r.m16917a();
            this.f15158r = null;
        }
        if (this.f15159s != null) {
            mo2217b(this.f15159s);
            this.f15159s = null;
        }
        if (this.f15149i != null) {
            RealTimeChatService.m9077b(this.f15149i);
            this.f15149i = null;
        }
        if (this.f15143c != null) {
            this.f15143c.m16939a(mo2220d(), m17515v());
            if (this.f15143c.m16964k() == null) {
                this.f15143c.m16978y();
                if (this.f15143c.getConference() != null) {
                    this.f15143c.getConference().removeConnection(this.f15143c);
                }
                if (disconnectCause != null) {
                    this.f15143c.setDisconnected(disconnectCause);
                    gwb.m1839a(this.f15143c, disconnectCause);
                }
                this.f15143c.destroy();
            }
        }
        this.f15143c = null;
        this.f15144d = null;
        for (gcd a : this.f15152l) {
            a.mo2189a((gcc) this, disconnectCause);
        }
    }

    public void mo2212a(gcd gcd) {
        this.f15152l.add(gcd);
    }

    public void mo2217b(gcd gcd) {
        this.f15152l.remove(gcd);
    }

    public gcq mo2206a() {
        return this.f15143c;
    }

    public void mo2213a(gcq gcq) {
        if (this.f15143c != null && gcq == null) {
            this.f15143c.m16939a(mo2220d(), m17515v());
        }
        this.f15143c = gcq;
        if (this.f15143c != null) {
            this.f15143c.setAudioModeIsVoip(true);
            m17514u();
            mo2216b();
            if (this.f15155o == 0) {
                this.f15155o = glj.m17963b();
            }
            if (this.f15157q == null) {
                this.f15157q = new gfq(this.f15143c.m16955d());
                this.f15157q.m17572a((gfr) this);
            }
            if (this.f15158r == null) {
                this.f15158r = new gce(this.f15141a);
                this.f15158r.m16918a(this);
            }
            if (this.f15161u == null && VERSION.SDK_INT >= 23) {
                this.f15161u = new gfe(this.f15141a);
                this.f15161u.m17500a((gfg) this);
            }
        }
    }

    public void mo2209a(int i, int i2) {
        glk.m17979c("Babel_telephony", "TeleWifiCall.disconnectForHandoff, handoffReason + " + i + ", new call code: " + i2, new Object[0]);
        if (i2 == 0) {
            m17510f(11015);
        } else if (i == 3) {
            glk.m17979c("Babel_telephony", "TeleWifiCall.setHandoffEventCode, code: " + i2, new Object[0]);
            if (!(this.f15144d == null || this.f15144d.m11994p() == null)) {
                this.f15144d.m11994p().m22137i().m22167c(i2);
            }
            m17510f(11018);
        } else {
            m17510f(11004);
        }
    }

    public void mo2216b() {
        if (this.f15143c != null) {
            int i;
            String string;
            Object obj;
            String valueOf = String.valueOf(this.f15143c);
            glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 32).append("TeleWifiCall.updateStatusHints, ").append(valueOf).toString(), new Object[0]);
            Context d = this.f15143c.m16955d();
            ComponentName componentName = new ComponentName(d, TeleConnectionService.class);
            if (this.f15143c.m16964k() == null || this.f15143c.getState() == 3) {
                if (this.f15143c.m16976w()) {
                    int i2 = gwb.uY;
                    int networkType = ((TelephonyManager) d.getSystemService("phone")).getNetworkType();
                    if (gwb.m2381w(networkType)) {
                        i = gwb.vB;
                    } else {
                        i = gwb.vm;
                    }
                    string = d.getString(i, new Object[]{gwb.m1392F(d), gwb.m2372v(networkType)});
                    this.f15163w = Integer.valueOf(networkType);
                    int i3 = i2;
                    valueOf = string;
                    i = i3;
                }
                i = 0;
                obj = null;
            } else {
                if (!TextUtils.isEmpty(gwb.m1392F(d))) {
                    obj = d.getString(gwb.vt, new Object[]{gwb.m1392F(d)});
                    i = gwb.uX;
                }
                i = 0;
                obj = null;
            }
            if (obj == null) {
                obj = gwb.m1396G(d);
                if (i == 0 && !TextUtils.isEmpty(obj)) {
                    if (this.f15160t) {
                        i = gwb.uV;
                    } else {
                        i = gwb.uZ;
                    }
                }
                this.f15162v = Boolean.valueOf(true);
            }
            StatusHints statusHints = new StatusHints(componentName, obj, i, null);
            if (!statusHints.equals(this.f15143c.getStatusHints())) {
                String str = "Babel_telephony";
                string = i == 0 ? "0" : d.getResources().getResourceName(i);
                glk.m17979c(str, new StringBuilder((String.valueOf(obj).length() + 47) + String.valueOf(string).length()).append("TeleWifiCall.updateStatusHints, label: ").append(obj).append(", icon: ").append(string).toString(), new Object[0]);
                this.f15143c.setStatusHints(statusHints);
            }
        }
    }

    public int mo2220d() {
        return 2;
    }

    public String mo2221e() {
        return this.f15147g;
    }

    public void mo2219c() {
        String valueOf = String.valueOf(this.f15143c);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 35).append("TeleWifiCall.performManualHandoff, ").append(valueOf).toString(), new Object[0]);
        m17536c(2);
        gdc.m17020a(this.f15141a, this.f15143c, 2);
    }

    public void mo2215a(boolean z) {
        this.f15160t = z;
    }

    public void mo2214a(gcw gcw) {
        String valueOf = String.valueOf(gcw);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 45).append("TeleWifiCall.maybeAddExperiment, experiment: ").append(valueOf).toString(), new Object[0]);
        this.f15148h = gcw;
    }

    public void mo2211a(gcc gcc) {
        String valueOf = String.valueOf(gcc);
        String valueOf2 = String.valueOf(this.f15143c);
        glk.m17979c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 39) + String.valueOf(valueOf2).length()).append("TeleWifiCall.performConferenceWith : ").append(valueOf).append(", ").append(valueOf2).toString(), new Object[0]);
    }

    public void mo2210a(AudioState audioState) {
        boolean z = false;
        String valueOf = String.valueOf(audioState);
        String valueOf2 = String.valueOf(this.f15143c);
        glk.m17979c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 43) + String.valueOf(valueOf2).length()).append("TeleWifiCall.onAudioStateChanged, state: ").append(valueOf).append(", ").append(valueOf2).toString(), new Object[0]);
        if (audioState != null && audioState.isMuted()) {
            z = true;
        }
        m17509e(z);
    }

    public void mo2207a(char c) {
        char b = gwb.m1962b(c);
        String valueOf = String.valueOf(this.f15143c);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 35).append("TeleWifiCall.onPlayDtmfTone, c: ").append(b).append(", ").append(valueOf).toString(), new Object[0]);
        if (this.f15144d != null) {
            this.f15144d.m11956a(c);
        }
    }

    public void mo2222f() {
        String valueOf = String.valueOf(this.f15143c);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 29).append("TeleWifiCall.onStopDtmfTone, ").append(valueOf).toString(), new Object[0]);
    }

    public void mo2223g() {
        String valueOf = String.valueOf(this.f15143c);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 27).append("TeleWifiCall.onDisconnect, ").append(valueOf).toString(), new Object[0]);
        m17510f(11004);
    }

    public void mo2224h() {
        String valueOf = String.valueOf(this.f15143c);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 25).append("TeleWifiCall.onSeparate, ").append(valueOf).toString(), new Object[0]);
    }

    public void mo2225i() {
        String valueOf = String.valueOf(this.f15143c);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 22).append("TeleWifiCall.onAbort, ").append(valueOf).toString(), new Object[0]);
        mo2223g();
    }

    public void mo2226j() {
        String valueOf = String.valueOf(this.f15143c);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 21).append("TeleWifiCall.onHold, ").append(valueOf).toString(), new Object[0]);
        if (this.f15143c.getState() != 5) {
            this.f15143c.setOnHold();
            m17509e(true);
        }
    }

    public void mo2227k() {
        String valueOf = String.valueOf(this.f15143c);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 23).append("TeleWifiCall.onUnhold, ").append(valueOf).toString(), new Object[0]);
        if (this.f15143c.getState() != 4) {
            this.f15143c.setActive();
            m17509e(false);
        }
    }

    public void mo2228l() {
        String valueOf = String.valueOf(this.f15143c);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 23).append("TeleWifiCall.onAnswer, ").append(valueOf).toString(), new Object[0]);
        if (this.f15153m != null) {
            this.f15153m.mo2196b();
            this.f15153m = null;
        }
    }

    public void mo2229m() {
        String valueOf = String.valueOf(this.f15143c);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 23).append("TeleWifiCall.onReject, ").append(valueOf).toString(), new Object[0]);
        if (this.f15153m != null) {
            this.f15153m.mo2197c();
            this.f15153m = null;
        }
        m17521a(new DisconnectCause(6, "incoming request ignored"));
    }

    public void mo2218b(boolean z) {
        String valueOf = String.valueOf(this.f15143c);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 33).append("TeleWifiCall.onPostDialContinue, ").append(valueOf).toString(), new Object[0]);
        this.f15159s.m17161a(z);
    }

    public void mo2208a(int i) {
        String valueOf = String.valueOf(this.f15143c);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 29).append("TeleWifiCall.onStateChanged, ").append(valueOf).toString(), new Object[0]);
        if (i == 6 && this.f15156p == 0) {
            this.f15156p = glj.m17963b();
        }
        for (gcd a : this.f15152l) {
            a.mo2188a((gcc) this, i);
        }
        m17514u();
        if (!(i == 3 || i == 2 || i == 1 || i == 0)) {
            this.f15143c.m16978y();
        }
        if (i == 4) {
            gfj.m17506b(this.f15143c.m16955d(), this.f15143c);
        }
    }

    public void mo2253a(gcm gcm, boolean z) {
        if (m17512s()) {
            String valueOf = String.valueOf(gcm);
            glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 65).append("TeleWifiCall.onCellStateChanged, ").append(valueOf).append(" , isConnectedToInternet : ").append(z).toString(), new Object[0]);
            m17513t();
        }
    }

    public void mo2255b(int i, int i2) {
        String str = "Babel_telephony";
        String str2 = "TeleWifiCall.onActivityTypeChanged, activityType: ";
        String valueOf = String.valueOf(gfe.m17496b(i));
        if (valueOf.length() != 0) {
            valueOf = str2.concat(valueOf);
        } else {
            valueOf = new String(str2);
        }
        glk.m17979c(str, valueOf, new Object[0]);
        boolean a = gwb.m1906a(this.f15141a, "babel_activity_handoff_allowed", true);
        int a2 = gwb.m1492a(this.f15141a, "babel_biking_handoff_confidence_percentage_threshold", 75);
        int a3 = gwb.m1492a(this.f15141a, "babel_driving_handoff_confidence_percentage_threshold", 75);
        int i3;
        if (i == 1 && i2 >= a2) {
            if (a) {
                i3 = 2973;
            } else {
                i3 = 2974;
            }
            gwb.m2198f(i3);
            m17508e(10);
        } else if (i == 0 && i2 >= a3) {
            if (a) {
                i3 = 2975;
            } else {
                i3 = 2976;
            }
            gwb.m2198f(i3);
            m17508e(10);
        }
    }

    public void mo2254a(gfv gfv) {
        if (m17512s()) {
            String valueOf = String.valueOf(gfv);
            glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 33).append("TeleWifiCall.onWifiStateChanged, ").append(valueOf).toString(), new Object[0]);
            m17513t();
            return;
        }
        int networkType = ((TelephonyManager) this.f15141a.getSystemService("phone")).getNetworkType();
        if (this.f15143c == null) {
            valueOf = String.valueOf(this.f15143c);
            glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 48).append("TeleWifiCall.onWifiStateChanged, no connection, ").append(valueOf).toString(), new Object[0]);
        } else if (!gfv.f15184a) {
            m17536c(3);
            gdc.m17020a(this.f15141a, this.f15143c, 3);
        } else if (!gwb.m1905a(this.f15141a, this.f15143c.m16961h(), gfv, networkType)) {
            m17536c(1);
            gdc.m17020a(this.f15141a, this.f15143c, 1);
        }
    }

    public String m17553q() {
        if (this.f15144d == null || this.f15144d.m11994p() == null) {
            return null;
        }
        return this.f15144d.m11994p().m22134f();
    }

    private boolean m17512s() {
        if (this.f15144d == null || this.f15143c == null) {
            return false;
        }
        if (gwb.m1897a(this.f15141a, this.f15143c.m16961h().m17121c(), this.f15143c.m16960g()) || gwb.m2051b(this.f15141a, this.f15143c.m16961h().m17121c(), this.f15143c.m16960g())) {
            return true;
        }
        if (this.f15143c.m16960g()) {
            return gwb.m1906a(this.f15141a, "babel_lte_incoming_call_allowed", false);
        }
        return gwb.m1906a(this.f15141a, "babel_lte_outgoing_call_allowed", false);
    }

    private void m17513t() {
        if (!m17540d(false)) {
            int a = gwb.m1492a(this.f15141a, "babel_handoff_lte_reconnect_timeout_millis", 5000);
            if (this.f15151k == null) {
                this.f15151k = new gfk(this);
            }
            gwb.m1864a(this.f15151k, (long) a);
        }
    }

    boolean m17540d(boolean z) {
        glk.m17979c("Babel_telephony", "TeleWifiCall.triggerNetworkSwitch, disconnectCall " + z, new Object[0]);
        if (this.f15143c == null || this.f15144d == null) {
            glk.m17979c("Babel_telephony", "TeleWifiCall.triggerNetworkSwitch, call not ongoing", new Object[0]);
            return true;
        }
        boolean H = gwb.m1403H(this.f15141a);
        gcm b = this.f15158r.m16919b();
        String valueOf = String.valueOf(b);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 64).append("TeleWifiCall.triggerNetworkSwitch, connectedToInternet : ").append(H).append(", ").append(valueOf).toString(), new Object[0]);
        if (H) {
            boolean z2;
            int networkType = ((TelephonyManager) this.f15141a.getSystemService("phone")).getNetworkType();
            gfv a = gfq.m17570a(this.f15141a);
            if (!a.f15184a || !gwb.m1905a(this.f15141a, this.f15143c.m16961h(), a, networkType)) {
                z2 = false;
            } else if (this.f15143c.m16976w()) {
                glk.m17979c("Babel_telephony", "TeleWifiCall.triggerWifiSwitch, falling back to wifi", new Object[0]);
                this.f15143c.m16954c(false);
                mo2216b();
                gwb.m2198f(2903);
                z2 = true;
            } else {
                z2 = true;
            }
            if (z2) {
                return true;
            }
            if (!a.f15184a) {
                Context context = this.f15141a;
                int c = this.f15143c.m16961h().m17121c();
                boolean g = this.f15143c.m16960g();
                if ((networkType == 13 && gwb.m1897a(context, c, g)) || (gwb.m2381w(networkType) && gwb.m2051b(context, c, g))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!(!z2 || b == null || b.m16929a())) {
                    if (this.f15143c.m16976w()) {
                        z2 = true;
                    } else {
                        glk.m17979c("Babel_telephony", "TeleWifiCall.onWifiStateChanged, falling back to Data", new Object[0]);
                        this.f15143c.m16954c(true);
                        mo2216b();
                        gwb.m2198f(2902);
                        this.f15163w = Integer.valueOf(networkType);
                        z2 = true;
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
            z2 = false;
            if (z2) {
                return true;
            }
        }
        if (z || !H) {
            if (b == null || b.m16929a() || !gdc.m17022a(this.f15141a, this.f15143c.m16963j(), false, 3, this.f15143c.m16975v())) {
                glk.m17979c("Babel_telephony", "TeleWifiCall.triggerNetworkSwitch, cannot handoff to ciruit switched", new Object[0]);
            } else {
                glk.m17979c("Babel_telephony", "TeleWifiCall.triggerNetworkSwitch, handing off to circuit switched", new Object[0]);
                m17508e(3);
                return true;
            }
        }
        if (!z) {
            return false;
        }
        glk.m17979c("Babel_telephony", "TeleWifiCall.triggerNetworkSwitch, calling exitHangout", new Object[0]);
        m17510f(11003);
        return true;
    }

    private void m17508e(int i) {
        if (this.f15143c == null) {
            String valueOf = String.valueOf(this.f15143c);
            glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 51).append("TeleWifiCall.handoffToCircuitSwitched, connection: ").append(valueOf).toString(), new Object[0]);
            return;
        }
        glk.m17979c("Babel_telephony", "TeleWifiCall.handoffToCircuitSwitched, handoffReason: " + i, new Object[0]);
        if (this.f15143c.m16976w()) {
            gwb.m2198f(2904);
        } else {
            gwb.m2198f(2901);
        }
        m17536c(i);
        gdc.m17020a(this.f15141a, this.f15143c, i);
    }

    private void m17509e(boolean z) {
        if (this.f15144d != null) {
            boolean z2 = this.f15143c.getState() == 5;
            String valueOf = String.valueOf(this.f15143c);
            glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 80).append("TeleWifiCall.updateHangoutAudioState, muteMic: ").append(z).append(", shouldMuteSpeaker: ").append(z2).append(", ").append(valueOf).toString(), new Object[0]);
            dgg.m11692a().m11703a(z);
            dgg.m11692a().m11708b(z2);
        }
    }

    private void m17510f(int i) {
        String valueOf = String.valueOf(this.f15143c);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 46).append("TeleWifiCall.exitHangout, cause: ").append(i).append(", ").append(valueOf).toString(), new Object[0]);
        if (this.f15144d == null || this.f15144d != dgg.m11692a().m11727s()) {
            valueOf = String.valueOf(this.f15143c);
            glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 72).append("TeleWifiCall.exitHangout, hangout has already exited, short circuiting, ").append(valueOf).toString(), new Object[0]);
            m17521a(m17539d(i));
            return;
        }
        m17511r();
        this.f15144d.m11973b(i);
    }

    private void m17514u() {
        int i = 66;
        if (this.f15143c.getState() == 4 || this.f15143c.getState() == 5) {
            i = 67;
        }
        if (this.f15143c.getConnectionCapabilities() != i) {
            this.f15143c.setConnectionCapabilities(i);
        }
    }

    void m17536c(int i) {
        if (this.f15144d != null && this.f15144d.m11994p() != null) {
            this.f15144d.m11994p().m22137i().m22164b(i);
        }
    }

    private long m17515v() {
        if (this.f15155o == 0) {
            return -1;
        }
        long j = this.f15156p;
        if (j == 0) {
            j = glj.m17963b();
        }
        return j - this.f15155o;
    }

    DisconnectCause m17539d(int i) {
        return new DisconnectCause(gwb.m2328q(i), gwb.m2325p(this.f15141a, i), null, gwb.m2324p(i), gwb.m2360u(i));
    }
}
