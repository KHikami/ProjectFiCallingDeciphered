package defpackage;

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
    final Context a;
    final String b;
    gcq c;
    did d;
    int e;
    boolean f;
    String g;
    gcw h;
    gfl i;
    int j;
    Runnable k;
    private final List<gcd> l = new CopyOnWriteArrayList();
    private gfn m;
    private gfm n;
    private long o;
    private long p;
    private gfq q;
    private gce r;
    private geg s;
    private boolean t;
    private gfe u;
    private Boolean v;
    private Integer w;

    static boolean a(TeleConnectionService teleConnectionService) {
        for (Connection connection : teleConnectionService.getAllConnections()) {
            if (gfj.b((gcq) connection)) {
                return true;
            }
        }
        return false;
    }

    static void a(TeleConnectionService teleConnectionService, gcq gcq) {
        for (Connection connection : teleConnectionService.getAllConnections()) {
            gcq gcq2 = (gcq) connection;
            if (gcq2 == gcq || gfj.b(gcq2)) {
                gcq2.onHold();
            }
        }
    }

    private static void b(TeleConnectionService teleConnectionService, gcq gcq) {
        for (Connection connection : teleConnectionService.getAllConnections()) {
            gcq gcq2 = (gcq) connection;
            if (gcq2 == gcq || gfj.b(gcq2)) {
                gcq2.onUnhold();
            }
        }
    }

    public static boolean b(gcq gcq) {
        return gcq.j() != null && gcq.j().d() == 2;
    }

    gfj(Context context, gfn gfn, String str, boolean z) {
        this.a = context;
        this.m = gfn;
        this.b = str;
        if (!z && TextUtils.isEmpty(str)) {
            this.s = new geg(this);
            a(this.s);
        }
    }

    public Boolean n() {
        return this.v;
    }

    public Integer o() {
        return this.w;
    }

    void b(int i) {
        String valueOf = String.valueOf(this.c);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 61).append("TeleWifiCall.cancelIncomingCall, dismissReason: ").append(i).append(", ").append(valueOf).toString(), new Object[0]);
        int i2 = i == 1 ? 4 : 5;
        String str = "cancel ring, dismiss reason: ";
        valueOf = String.valueOf(gwb.s(i));
        a(new DisconnectCause(i2, valueOf.length() != 0 ? str.concat(valueOf) : new String(str)));
    }

    void a(did did) {
        String valueOf = String.valueOf(did);
        String valueOf2 = String.valueOf(this.c);
        glk.c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 46) + String.valueOf(valueOf2).length()).append("TeleWifiCall.setHangoutState, hangoutState: ").append(valueOf).append(", ").append(valueOf2).toString(), new Object[0]);
        this.d = did;
        this.f = this.d.C();
        if (this.n == null) {
            this.n = new gfm(this);
            dgg.a().a(this.n);
        }
        if (TextUtils.isEmpty(this.b) && this.c != null && this.c.d().getAllConnections().size() == 1) {
            gwb.O(this.a);
        }
    }

    public did p() {
        return this.d;
    }

    private void r() {
        if (this.c != null && TextUtils.isEmpty(this.c.q()) && this.d != null && this.d == dgg.a().s()) {
            this.c.c(this.d.e().g());
        }
    }

    void c(boolean z) {
        e(false);
    }

    void a(DisconnectCause disconnectCause) {
        String valueOf = String.valueOf(disconnectCause);
        String valueOf2 = String.valueOf(this.c);
        glk.c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 29) + String.valueOf(valueOf2).length()).append("TeleWifiCall.close, cause: ").append(valueOf).append(", ").append(valueOf2).toString(), new Object[0]);
        r();
        if (this.k != null) {
            gwb.b(this.k);
            this.k = null;
        }
        if (this.n != null) {
            dgg.a().b(this.n);
            this.n = null;
        }
        if (this.m != null) {
            this.m.c();
            this.m = null;
        }
        if (this.q != null) {
            this.q.a();
            this.q = null;
        }
        if (this.u != null) {
            this.u.a();
            this.u = null;
        }
        if (this.r != null) {
            this.r.a();
            this.r = null;
        }
        if (this.s != null) {
            b(this.s);
            this.s = null;
        }
        if (this.i != null) {
            RealTimeChatService.b(this.i);
            this.i = null;
        }
        if (this.c != null) {
            this.c.a(d(), v());
            if (this.c.k() == null) {
                this.c.y();
                if (this.c.getConference() != null) {
                    this.c.getConference().removeConnection(this.c);
                }
                if (disconnectCause != null) {
                    this.c.setDisconnected(disconnectCause);
                    gwb.a(this.c, disconnectCause);
                }
                this.c.destroy();
            }
        }
        this.c = null;
        this.d = null;
        for (gcd a : this.l) {
            a.a((gcc) this, disconnectCause);
        }
    }

    public void a(gcd gcd) {
        this.l.add(gcd);
    }

    public void b(gcd gcd) {
        this.l.remove(gcd);
    }

    public gcq a() {
        return this.c;
    }

    public void a(gcq gcq) {
        if (this.c != null && gcq == null) {
            this.c.a(d(), v());
        }
        this.c = gcq;
        if (this.c != null) {
            this.c.setAudioModeIsVoip(true);
            u();
            b();
            if (this.o == 0) {
                this.o = glj.b();
            }
            if (this.q == null) {
                this.q = new gfq(this.c.d());
                this.q.a((gfr) this);
            }
            if (this.r == null) {
                this.r = new gce(this.a);
                this.r.a(this);
            }
            if (this.u == null && VERSION.SDK_INT >= 23) {
                this.u = new gfe(this.a);
                this.u.a((gfg) this);
            }
        }
    }

    public void a(int i, int i2) {
        glk.c("Babel_telephony", "TeleWifiCall.disconnectForHandoff, handoffReason + " + i + ", new call code: " + i2, new Object[0]);
        if (i2 == 0) {
            f(11015);
        } else if (i == 3) {
            glk.c("Babel_telephony", "TeleWifiCall.setHandoffEventCode, code: " + i2, new Object[0]);
            if (!(this.d == null || this.d.p() == null)) {
                this.d.p().i().c(i2);
            }
            f(11018);
        } else {
            f(11004);
        }
    }

    public void b() {
        if (this.c != null) {
            int i;
            String string;
            Object obj;
            String valueOf = String.valueOf(this.c);
            glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 32).append("TeleWifiCall.updateStatusHints, ").append(valueOf).toString(), new Object[0]);
            Context d = this.c.d();
            ComponentName componentName = new ComponentName(d, TeleConnectionService.class);
            if (this.c.k() == null || this.c.getState() == 3) {
                if (this.c.w()) {
                    int i2 = gwb.uY;
                    int networkType = ((TelephonyManager) d.getSystemService("phone")).getNetworkType();
                    if (gwb.w(networkType)) {
                        i = gwb.vB;
                    } else {
                        i = gwb.vm;
                    }
                    string = d.getString(i, new Object[]{gwb.F(d), gwb.v(networkType)});
                    this.w = Integer.valueOf(networkType);
                    int i3 = i2;
                    valueOf = string;
                    i = i3;
                }
                i = 0;
                obj = null;
            } else {
                if (!TextUtils.isEmpty(gwb.F(d))) {
                    obj = d.getString(gwb.vt, new Object[]{gwb.F(d)});
                    i = gwb.uX;
                }
                i = 0;
                obj = null;
            }
            if (obj == null) {
                obj = gwb.G(d);
                if (i == 0 && !TextUtils.isEmpty(obj)) {
                    if (this.t) {
                        i = gwb.uV;
                    } else {
                        i = gwb.uZ;
                    }
                }
                this.v = Boolean.valueOf(true);
            }
            StatusHints statusHints = new StatusHints(componentName, obj, i, null);
            if (!statusHints.equals(this.c.getStatusHints())) {
                String str = "Babel_telephony";
                string = i == 0 ? "0" : d.getResources().getResourceName(i);
                glk.c(str, new StringBuilder((String.valueOf(obj).length() + 47) + String.valueOf(string).length()).append("TeleWifiCall.updateStatusHints, label: ").append(obj).append(", icon: ").append(string).toString(), new Object[0]);
                this.c.setStatusHints(statusHints);
            }
        }
    }

    public int d() {
        return 2;
    }

    public String e() {
        return this.g;
    }

    public void c() {
        String valueOf = String.valueOf(this.c);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 35).append("TeleWifiCall.performManualHandoff, ").append(valueOf).toString(), new Object[0]);
        c(2);
        gdc.a(this.a, this.c, 2);
    }

    public void a(boolean z) {
        this.t = z;
    }

    public void a(gcw gcw) {
        String valueOf = String.valueOf(gcw);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 45).append("TeleWifiCall.maybeAddExperiment, experiment: ").append(valueOf).toString(), new Object[0]);
        this.h = gcw;
    }

    public void a(gcc gcc) {
        String valueOf = String.valueOf(gcc);
        String valueOf2 = String.valueOf(this.c);
        glk.c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 39) + String.valueOf(valueOf2).length()).append("TeleWifiCall.performConferenceWith : ").append(valueOf).append(", ").append(valueOf2).toString(), new Object[0]);
    }

    public void a(AudioState audioState) {
        boolean z = false;
        String valueOf = String.valueOf(audioState);
        String valueOf2 = String.valueOf(this.c);
        glk.c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 43) + String.valueOf(valueOf2).length()).append("TeleWifiCall.onAudioStateChanged, state: ").append(valueOf).append(", ").append(valueOf2).toString(), new Object[0]);
        if (audioState != null && audioState.isMuted()) {
            z = true;
        }
        e(z);
    }

    public void a(char c) {
        char b = gwb.b(c);
        String valueOf = String.valueOf(this.c);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 35).append("TeleWifiCall.onPlayDtmfTone, c: ").append(b).append(", ").append(valueOf).toString(), new Object[0]);
        if (this.d != null) {
            this.d.a(c);
        }
    }

    public void f() {
        String valueOf = String.valueOf(this.c);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 29).append("TeleWifiCall.onStopDtmfTone, ").append(valueOf).toString(), new Object[0]);
    }

    public void g() {
        String valueOf = String.valueOf(this.c);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 27).append("TeleWifiCall.onDisconnect, ").append(valueOf).toString(), new Object[0]);
        f(11004);
    }

    public void h() {
        String valueOf = String.valueOf(this.c);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 25).append("TeleWifiCall.onSeparate, ").append(valueOf).toString(), new Object[0]);
    }

    public void i() {
        String valueOf = String.valueOf(this.c);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 22).append("TeleWifiCall.onAbort, ").append(valueOf).toString(), new Object[0]);
        g();
    }

    public void j() {
        String valueOf = String.valueOf(this.c);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 21).append("TeleWifiCall.onHold, ").append(valueOf).toString(), new Object[0]);
        if (this.c.getState() != 5) {
            this.c.setOnHold();
            e(true);
        }
    }

    public void k() {
        String valueOf = String.valueOf(this.c);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 23).append("TeleWifiCall.onUnhold, ").append(valueOf).toString(), new Object[0]);
        if (this.c.getState() != 4) {
            this.c.setActive();
            e(false);
        }
    }

    public void l() {
        String valueOf = String.valueOf(this.c);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 23).append("TeleWifiCall.onAnswer, ").append(valueOf).toString(), new Object[0]);
        if (this.m != null) {
            this.m.b();
            this.m = null;
        }
    }

    public void m() {
        String valueOf = String.valueOf(this.c);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 23).append("TeleWifiCall.onReject, ").append(valueOf).toString(), new Object[0]);
        if (this.m != null) {
            this.m.c();
            this.m = null;
        }
        a(new DisconnectCause(6, "incoming request ignored"));
    }

    public void b(boolean z) {
        String valueOf = String.valueOf(this.c);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 33).append("TeleWifiCall.onPostDialContinue, ").append(valueOf).toString(), new Object[0]);
        this.s.a(z);
    }

    public void a(int i) {
        String valueOf = String.valueOf(this.c);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 29).append("TeleWifiCall.onStateChanged, ").append(valueOf).toString(), new Object[0]);
        if (i == 6 && this.p == 0) {
            this.p = glj.b();
        }
        for (gcd a : this.l) {
            a.a((gcc) this, i);
        }
        u();
        if (!(i == 3 || i == 2 || i == 1 || i == 0)) {
            this.c.y();
        }
        if (i == 4) {
            gfj.b(this.c.d(), this.c);
        }
    }

    public void a(gcm gcm, boolean z) {
        if (s()) {
            String valueOf = String.valueOf(gcm);
            glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 65).append("TeleWifiCall.onCellStateChanged, ").append(valueOf).append(" , isConnectedToInternet : ").append(z).toString(), new Object[0]);
            t();
        }
    }

    public void b(int i, int i2) {
        String str = "Babel_telephony";
        String str2 = "TeleWifiCall.onActivityTypeChanged, activityType: ";
        String valueOf = String.valueOf(gfe.b(i));
        if (valueOf.length() != 0) {
            valueOf = str2.concat(valueOf);
        } else {
            valueOf = new String(str2);
        }
        glk.c(str, valueOf, new Object[0]);
        boolean a = gwb.a(this.a, "babel_activity_handoff_allowed", true);
        int a2 = gwb.a(this.a, "babel_biking_handoff_confidence_percentage_threshold", 75);
        int a3 = gwb.a(this.a, "babel_driving_handoff_confidence_percentage_threshold", 75);
        int i3;
        if (i == 1 && i2 >= a2) {
            if (a) {
                i3 = 2973;
            } else {
                i3 = 2974;
            }
            gwb.f(i3);
            e(10);
        } else if (i == 0 && i2 >= a3) {
            if (a) {
                i3 = 2975;
            } else {
                i3 = 2976;
            }
            gwb.f(i3);
            e(10);
        }
    }

    public void a(gfv gfv) {
        if (s()) {
            String valueOf = String.valueOf(gfv);
            glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 33).append("TeleWifiCall.onWifiStateChanged, ").append(valueOf).toString(), new Object[0]);
            t();
            return;
        }
        int networkType = ((TelephonyManager) this.a.getSystemService("phone")).getNetworkType();
        if (this.c == null) {
            valueOf = String.valueOf(this.c);
            glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 48).append("TeleWifiCall.onWifiStateChanged, no connection, ").append(valueOf).toString(), new Object[0]);
        } else if (!gfv.a) {
            c(3);
            gdc.a(this.a, this.c, 3);
        } else if (!gwb.a(this.a, this.c.h(), gfv, networkType)) {
            c(1);
            gdc.a(this.a, this.c, 1);
        }
    }

    public String q() {
        if (this.d == null || this.d.p() == null) {
            return null;
        }
        return this.d.p().f();
    }

    private boolean s() {
        if (this.d == null || this.c == null) {
            return false;
        }
        if (gwb.a(this.a, this.c.h().c(), this.c.g()) || gwb.b(this.a, this.c.h().c(), this.c.g())) {
            return true;
        }
        if (this.c.g()) {
            return gwb.a(this.a, "babel_lte_incoming_call_allowed", false);
        }
        return gwb.a(this.a, "babel_lte_outgoing_call_allowed", false);
    }

    private void t() {
        if (!d(false)) {
            int a = gwb.a(this.a, "babel_handoff_lte_reconnect_timeout_millis", 5000);
            if (this.k == null) {
                this.k = new gfk(this);
            }
            gwb.a(this.k, (long) a);
        }
    }

    boolean d(boolean z) {
        glk.c("Babel_telephony", "TeleWifiCall.triggerNetworkSwitch, disconnectCall " + z, new Object[0]);
        if (this.c == null || this.d == null) {
            glk.c("Babel_telephony", "TeleWifiCall.triggerNetworkSwitch, call not ongoing", new Object[0]);
            return true;
        }
        boolean H = gwb.H(this.a);
        gcm b = this.r.b();
        String valueOf = String.valueOf(b);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 64).append("TeleWifiCall.triggerNetworkSwitch, connectedToInternet : ").append(H).append(", ").append(valueOf).toString(), new Object[0]);
        if (H) {
            boolean z2;
            int networkType = ((TelephonyManager) this.a.getSystemService("phone")).getNetworkType();
            gfv a = gfq.a(this.a);
            if (!a.a || !gwb.a(this.a, this.c.h(), a, networkType)) {
                z2 = false;
            } else if (this.c.w()) {
                glk.c("Babel_telephony", "TeleWifiCall.triggerWifiSwitch, falling back to wifi", new Object[0]);
                this.c.c(false);
                b();
                gwb.f(2903);
                z2 = true;
            } else {
                z2 = true;
            }
            if (z2) {
                return true;
            }
            if (!a.a) {
                Context context = this.a;
                int c = this.c.h().c();
                boolean g = this.c.g();
                if ((networkType == 13 && gwb.a(context, c, g)) || (gwb.w(networkType) && gwb.b(context, c, g))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!(!z2 || b == null || b.a())) {
                    if (this.c.w()) {
                        z2 = true;
                    } else {
                        glk.c("Babel_telephony", "TeleWifiCall.onWifiStateChanged, falling back to Data", new Object[0]);
                        this.c.c(true);
                        b();
                        gwb.f(2902);
                        this.w = Integer.valueOf(networkType);
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
            if (b == null || b.a() || !gdc.a(this.a, this.c.j(), false, 3, this.c.v())) {
                glk.c("Babel_telephony", "TeleWifiCall.triggerNetworkSwitch, cannot handoff to ciruit switched", new Object[0]);
            } else {
                glk.c("Babel_telephony", "TeleWifiCall.triggerNetworkSwitch, handing off to circuit switched", new Object[0]);
                e(3);
                return true;
            }
        }
        if (!z) {
            return false;
        }
        glk.c("Babel_telephony", "TeleWifiCall.triggerNetworkSwitch, calling exitHangout", new Object[0]);
        f(11003);
        return true;
    }

    private void e(int i) {
        if (this.c == null) {
            String valueOf = String.valueOf(this.c);
            glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 51).append("TeleWifiCall.handoffToCircuitSwitched, connection: ").append(valueOf).toString(), new Object[0]);
            return;
        }
        glk.c("Babel_telephony", "TeleWifiCall.handoffToCircuitSwitched, handoffReason: " + i, new Object[0]);
        if (this.c.w()) {
            gwb.f(2904);
        } else {
            gwb.f(2901);
        }
        c(i);
        gdc.a(this.a, this.c, i);
    }

    private void e(boolean z) {
        if (this.d != null) {
            boolean z2 = this.c.getState() == 5;
            String valueOf = String.valueOf(this.c);
            glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 80).append("TeleWifiCall.updateHangoutAudioState, muteMic: ").append(z).append(", shouldMuteSpeaker: ").append(z2).append(", ").append(valueOf).toString(), new Object[0]);
            dgg.a().a(z);
            dgg.a().b(z2);
        }
    }

    private void f(int i) {
        String valueOf = String.valueOf(this.c);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 46).append("TeleWifiCall.exitHangout, cause: ").append(i).append(", ").append(valueOf).toString(), new Object[0]);
        if (this.d == null || this.d != dgg.a().s()) {
            valueOf = String.valueOf(this.c);
            glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 72).append("TeleWifiCall.exitHangout, hangout has already exited, short circuiting, ").append(valueOf).toString(), new Object[0]);
            a(d(i));
            return;
        }
        r();
        this.d.b(i);
    }

    private void u() {
        int i = 66;
        if (this.c.getState() == 4 || this.c.getState() == 5) {
            i = 67;
        }
        if (this.c.getConnectionCapabilities() != i) {
            this.c.setConnectionCapabilities(i);
        }
    }

    void c(int i) {
        if (this.d != null && this.d.p() != null) {
            this.d.p().i().b(i);
        }
    }

    private long v() {
        if (this.o == 0) {
            return -1;
        }
        long j = this.p;
        if (j == 0) {
            j = glj.b();
        }
        return j - this.o;
    }

    DisconnectCause d(int i) {
        return new DisconnectCause(gwb.q(i), gwb.p(this.a, i), null, gwb.p(i), gwb.u(i));
    }
}
