package p000;

import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.telecom.TelecomManager;
import android.text.TextUtils;
import java.util.Locale;

public final class gdl {
    private final Context f14760a;
    private final gdn f14761b;
    private final TelecomManager f14762c;
    private final boolean f14763d;
    private final WakeLock f14764e;
    private gdo f14765f;
    private boolean f14766g;
    private boolean f14767h;
    private boolean f14768i;

    public gdl(Context context, gdn gdn, TelecomManager telecomManager, gdo gdo, boolean z) {
        this.f14760a = context.getApplicationContext();
        this.f14761b = gdn;
        this.f14762c = telecomManager;
        this.f14765f = gdo;
        this.f14763d = z;
        this.f14764e = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "Babel_telephony");
    }

    boolean m17058a() {
        glk.m17979c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldProcess", new Object[0]);
        ggc a = ggc.m17608a(this.f14760a);
        if (this.f14765f.f14775f == a.m17630f()) {
            glk.m17979c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldProcess, processing invite for Tycho  account", new Object[0]);
            return true;
        }
        if (this.f14765f.f14775f == a.m17618b()) {
            return true;
        }
        String a2 = fde.m14995a(this.f14760a, this.f14765f.f14775f);
        glk.m17979c("Babel_telephony", String.format("TeleIncomingWifiCallInvite.shouldProcess, selected account id: %d doesn't match incoming account: %s, id: %d", new Object[]{Integer.valueOf(r2), glk.m17974b(a2), Integer.valueOf(this.f14765f.f14775f)}), new Object[0]);
        return false;
    }

    public void m17060b() {
        glk.m17979c("Babel_telephony", "TeleIncomingWifiCallInvite.startProcessing", new Object[0]);
        iil.m21874a("Expected condition to be true", m17058a());
        this.f14766g = true;
        if (!(this.f14763d || this.f14764e.isHeld())) {
            this.f14764e.acquire();
            glk.m17979c("Babel_telephony", "Acquired partial wake lock to keep process alive for TeleIncomingWifiCallInvite", new Object[0]);
        }
        if (!gwb.m1438P(this.f14760a)) {
            glk.m17979c("Babel_telephony", "TeleIncomingWifiCallInvite.startProcessing, no permissions.", new Object[0]);
            m17056d();
        } else if (this.f14763d) {
            if (m17054b(new geb(gck.m16926a(this.f14760a, 0, -1), gfq.m17570a(this.f14760a), this.f14765f.f14777h, null, false, 0, false))) {
                glk.m17979c("Babel_telephony", "TeleIncomingWifiCallInvite.startProcessing, falling back to Wi-Fi", new Object[0]);
                gwb.m2016b(this.f14760a, this.f14765f);
                m17055c();
            } else {
                glk.m17979c("Babel_telephony", "TeleIncomingWifiCallInvite.startProcessing, not falling back to Wi-Fi", new Object[0]);
            }
            m17056d();
        } else {
            new gdz(this.f14760a, new gdm(this)).m17104a();
        }
    }

    boolean m17059a(dhz dhz) {
        if (!this.f14765f.f14770a.equals(dhz)) {
            return false;
        }
        m17056d();
        return true;
    }

    public void m17057a(geb geb) {
        glk.m17979c("Babel_telephony", "TeleIncomingWifiCallInvite.processInviteWithState", new Object[0]);
        if (this.f14766g) {
            this.f14765f = new gdo(this.f14765f.f14770a, this.f14765f.f14771b, this.f14765f.f14772c, this.f14765f.f14773d, this.f14765f.f14774e, this.f14765f.f14775f, this.f14765f.f14776g, geb.f14825c);
            gwb.m2016b(this.f14760a, this.f14765f);
            if (m17054b(geb)) {
                m17055c();
            } else if (!this.f14763d) {
                this.f14768i = gwb.m1900a(this.f14760a, this.f14765f);
            }
            m17056d();
            return;
        }
        glk.m17979c("Babel_telephony", "TeleIncomingWifiCallInvite.processInviteWithState, invite cancelled", new Object[0]);
    }

    private boolean m17054b(geb geb) {
        iil.m21875b("Expected non-null", geb.f14823a);
        iil.m21875b("Expected non-null", geb.f14824b);
        iil.m21875b("Expected non-null", geb.f14825c);
        biw g = gwb.m2214g(this.f14760a);
        if (!g.mo564a("babel_incoming_wifi_calls_allowed", true)) {
            glk.m17979c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, not allowed by gservices", new Object[0]);
            return false;
        } else if (!ggc.m17608a(this.f14760a).m17626c()) {
            glk.m17979c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, wifi calling not enabled", new Object[0]);
            return false;
        } else if (gwb.m1422L(this.f14760a)) {
            boolean z = (!glq.m18010b(gwb.m1400H()) || geb.f14823a == null || geb.f14823a.m16929a()) ? false : true;
            if (z && TextUtils.isEmpty(this.f14765f.f14771b) && !g.mo564a("babel_blocked_incoming_wifi_calls_allowed", true)) {
                glk.m17979c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, incoming wifi calls from blocked numbers not allowed", new Object[0]);
                return false;
            } else if (this.f14763d) {
                glk.m17979c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, falling back to Wi-Fi, only checking for Wi-Fi connection", new Object[0]);
                if (geb.f14824b.f15184a) {
                    return true;
                }
                glk.m17979c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, not connected to wifi", new Object[0]);
                return false;
            } else if (dgg.m11692a().m11722n()) {
                glk.m17979c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, hangout already exists, only checking for Wi-Fi connection, answering incoming ring will exit hangout", new Object[0]);
                if (geb.f14824b.f15184a) {
                    return true;
                }
                glk.m17979c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, not connected to wifi", new Object[0]);
                return false;
            } else if (this.f14765f.f14774e != null) {
                glk.m17979c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, in Wi-Fi calling experiment", new Object[0]);
                return true;
            } else if (gwb.m2055b(this.f14760a, geb.f14825c, geb.f14823a, geb.f14824b) || gwb.m2111c(this.f14760a, geb.f14825c, geb.f14823a, geb.f14824b)) {
                glk.m17979c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, falling back to cellular data", new Object[0]);
                this.f14765f = new gdo(this.f14765f.f14770a, this.f14765f.f14771b, this.f14765f.f14772c, this.f14765f.f14773d, this.f14765f.f14774e, this.f14765f.f14775f, true, geb.f14825c);
                return true;
            } else if (gwb.m2056b(this.f14760a, geb.f14825c, geb.f14823a, geb.f14824b, null)) {
                if (this.f14763d) {
                    glk.m17979c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldCheckExtraNetworkAttributes, not checking, falling back to Wi-Fi", new Object[0]);
                    z = false;
                } else if (geb.f14824b.f15184a && geb.f14823a != null && geb.f14823a.m16929a()) {
                    glk.m17979c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldCheckExtraNetworkAttributes, not checking, no cell service", new Object[0]);
                    z = false;
                } else if (geb.f14824b.f15184a || !gwb.m1901a(this.f14760a, geb.f14825c)) {
                    z = true;
                } else {
                    glk.m17979c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldCheckExtraNetworkAttributes, not checking, potential emergency callback over LTE", new Object[0]);
                    z = false;
                }
                if (z) {
                    String str;
                    if (geb.f14824b.f15184a) {
                        str = "wifi";
                    } else {
                        str = gwb.m2372v(geb.f14823a.f14663e);
                    }
                    str = String.format(Locale.US, "_network_type_%s", new Object[]{str});
                    Context context = this.f14760a;
                    String valueOf = String.valueOf("babel_stun_ping_latency_millis");
                    str = String.valueOf(str);
                    if (str.length() != 0) {
                        str = valueOf.concat(str);
                    } else {
                        str = new String(valueOf);
                    }
                    long a = gwb.m1519a(context, str, 100);
                    if (geb.f14829g || !geb.f14827e || geb.f14828f > a) {
                        boolean z2 = geb.f14829g;
                        glk.m17979c("Babel_telephony", "TeleIncomingWifiCallInvite.hasAcceptableStunPingLatency, not acceptable, didTimeout: " + z2 + ", wasStunPingSuccessful: " + geb.f14827e + ", latency millis: " + geb.f14828f, new Object[0]);
                        m17053a(2897, geb.f14827e, (int) geb.f14828f);
                        z = false;
                    } else {
                        m17053a(2898, geb.f14827e, (int) geb.f14828f);
                        z = true;
                    }
                    if (z) {
                        if (gwb.m1902a(this.f14760a, geb.f14825c, geb.f14826d, geb.f14823a)) {
                            m17053a(2893, false, -1);
                            z = true;
                        } else {
                            m17053a(2895, false, -1);
                            glk.m17979c("Babel_telephony", "TeleIncomingWifiCallInvite.hasAcceptableHerrevadScore, using cell due to bad herrevad network quality score for the wifi network", new Object[0]);
                            z = false;
                        }
                        if (z) {
                            glk.m17979c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, Wi-Fi signal is good", new Object[0]);
                            return true;
                        }
                        glk.m17979c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, poor herrevad score for Wi-Fi", new Object[0]);
                        return false;
                    }
                    glk.m17979c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, poor stun latency on Wi-Fi", new Object[0]);
                    return false;
                }
                glk.m17979c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, not checking extra network attributes.", new Object[0]);
                return true;
            } else {
                glk.m17979c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, returning false", new Object[0]);
                return false;
            }
        } else {
            glk.m17979c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, not connection manager", new Object[0]);
            return false;
        }
    }

    private void m17053a(int i, boolean z, int i2) {
        iie c = ((iih) jyn.m25426a(this.f14760a, iih.class)).mo1979a(this.f14765f.f14775f).mo1693b().mo1712c();
        if (z) {
            c.mo1698a(Integer.valueOf(i2));
        }
        c.mo1714c(i);
    }

    private void m17055c() {
        glk.m17979c("Babel_telephony", "TeleIncomingWifiCallInvite.addNewIncomingCall", new Object[0]);
        if (this.f14762c.getDefaultOutgoingPhoneAccount("tel") != null) {
            try {
                this.f14762c.addNewIncomingCall(this.f14762c.getDefaultOutgoingPhoneAccount("tel"), this.f14765f.m17064a());
                this.f14767h = true;
            } catch (Exception e) {
                String valueOf = String.valueOf(e);
                glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 119).append("TeleIncomingWifiCallInvite.addNewIncomingCall, adding call with SIM account failed, trying non-SIM account, exception: ").append(valueOf).toString(), new Object[0]);
            }
        }
        if (!this.f14767h) {
            try {
                this.f14762c.addNewIncomingCall(gwb.m1409J(this.f14760a), this.f14765f.m17064a());
                this.f14767h = true;
            } catch (Exception e2) {
                valueOf = String.valueOf(e2);
                glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 110).append("TeleIncomingWifiCallInvite.addNewIncomingCall, adding call with non-SIM account failed, giving up, exception: ").append(valueOf).toString(), new Object[0]);
            }
        }
    }

    private void m17056d() {
        glk.m17979c("Babel_telephony", "TeleIncomingWifiCallInvite.cleanupInvite", new Object[0]);
        this.f14766g = false;
        if (!(this.f14767h || this.f14768i)) {
            gwb.m1745a(this.f14760a, this.f14765f.f14775f, this.f14765f.f14771b, 2337);
        }
        this.f14761b.mo1207a(this);
        if (this.f14764e.isHeld()) {
            this.f14764e.release();
            glk.m17979c("Babel_telephony", "Released partial wake lock after cleaning up TeleIncomingWifiCallInvite.", new Object[0]);
        }
    }
}
