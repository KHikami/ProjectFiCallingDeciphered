package defpackage;

import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.telecom.TelecomManager;
import android.text.TextUtils;
import java.util.Locale;

public final class gdl {
    private final Context a;
    private final gdn b;
    private final TelecomManager c;
    private final boolean d;
    private final WakeLock e;
    private gdo f;
    private boolean g;
    private boolean h;
    private boolean i;

    public gdl(Context context, gdn gdn, TelecomManager telecomManager, gdo gdo, boolean z) {
        this.a = context.getApplicationContext();
        this.b = gdn;
        this.c = telecomManager;
        this.f = gdo;
        this.d = z;
        this.e = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "Babel_telephony");
    }

    boolean a() {
        glk.c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldProcess", new Object[0]);
        ggc a = ggc.a(this.a);
        if (this.f.f == a.f()) {
            glk.c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldProcess, processing invite for Tycho  account", new Object[0]);
            return true;
        }
        if (this.f.f == a.b()) {
            return true;
        }
        String a2 = fde.a(this.a, this.f.f);
        glk.c("Babel_telephony", String.format("TeleIncomingWifiCallInvite.shouldProcess, selected account id: %d doesn't match incoming account: %s, id: %d", new Object[]{Integer.valueOf(r2), glk.b(a2), Integer.valueOf(this.f.f)}), new Object[0]);
        return false;
    }

    public void b() {
        glk.c("Babel_telephony", "TeleIncomingWifiCallInvite.startProcessing", new Object[0]);
        iil.a("Expected condition to be true", a());
        this.g = true;
        if (!(this.d || this.e.isHeld())) {
            this.e.acquire();
            glk.c("Babel_telephony", "Acquired partial wake lock to keep process alive for TeleIncomingWifiCallInvite", new Object[0]);
        }
        if (!gwb.P(this.a)) {
            glk.c("Babel_telephony", "TeleIncomingWifiCallInvite.startProcessing, no permissions.", new Object[0]);
            d();
        } else if (this.d) {
            if (b(new geb(gck.a(this.a, 0, -1), gfq.a(this.a), this.f.h, null, false, 0, false))) {
                glk.c("Babel_telephony", "TeleIncomingWifiCallInvite.startProcessing, falling back to Wi-Fi", new Object[0]);
                gwb.b(this.a, this.f);
                c();
            } else {
                glk.c("Babel_telephony", "TeleIncomingWifiCallInvite.startProcessing, not falling back to Wi-Fi", new Object[0]);
            }
            d();
        } else {
            new gdz(this.a, new gdm(this)).a();
        }
    }

    boolean a(dhz dhz) {
        if (!this.f.a.equals(dhz)) {
            return false;
        }
        d();
        return true;
    }

    public void a(geb geb) {
        glk.c("Babel_telephony", "TeleIncomingWifiCallInvite.processInviteWithState", new Object[0]);
        if (this.g) {
            this.f = new gdo(this.f.a, this.f.b, this.f.c, this.f.d, this.f.e, this.f.f, this.f.g, geb.c);
            gwb.b(this.a, this.f);
            if (b(geb)) {
                c();
            } else if (!this.d) {
                this.i = gwb.a(this.a, this.f);
            }
            d();
            return;
        }
        glk.c("Babel_telephony", "TeleIncomingWifiCallInvite.processInviteWithState, invite cancelled", new Object[0]);
    }

    private boolean b(geb geb) {
        iil.b("Expected non-null", geb.a);
        iil.b("Expected non-null", geb.b);
        iil.b("Expected non-null", geb.c);
        biw g = gwb.g(this.a);
        if (!g.a("babel_incoming_wifi_calls_allowed", true)) {
            glk.c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, not allowed by gservices", new Object[0]);
            return false;
        } else if (!ggc.a(this.a).c()) {
            glk.c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, wifi calling not enabled", new Object[0]);
            return false;
        } else if (gwb.L(this.a)) {
            boolean z = (!glq.b(gwb.H()) || geb.a == null || geb.a.a()) ? false : true;
            if (z && TextUtils.isEmpty(this.f.b) && !g.a("babel_blocked_incoming_wifi_calls_allowed", true)) {
                glk.c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, incoming wifi calls from blocked numbers not allowed", new Object[0]);
                return false;
            } else if (this.d) {
                glk.c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, falling back to Wi-Fi, only checking for Wi-Fi connection", new Object[0]);
                if (geb.b.a) {
                    return true;
                }
                glk.c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, not connected to wifi", new Object[0]);
                return false;
            } else if (dgg.a().n()) {
                glk.c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, hangout already exists, only checking for Wi-Fi connection, answering incoming ring will exit hangout", new Object[0]);
                if (geb.b.a) {
                    return true;
                }
                glk.c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, not connected to wifi", new Object[0]);
                return false;
            } else if (this.f.e != null) {
                glk.c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, in Wi-Fi calling experiment", new Object[0]);
                return true;
            } else if (gwb.b(this.a, geb.c, geb.a, geb.b) || gwb.c(this.a, geb.c, geb.a, geb.b)) {
                glk.c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, falling back to cellular data", new Object[0]);
                this.f = new gdo(this.f.a, this.f.b, this.f.c, this.f.d, this.f.e, this.f.f, true, geb.c);
                return true;
            } else if (gwb.b(this.a, geb.c, geb.a, geb.b, null)) {
                if (this.d) {
                    glk.c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldCheckExtraNetworkAttributes, not checking, falling back to Wi-Fi", new Object[0]);
                    z = false;
                } else if (geb.b.a && geb.a != null && geb.a.a()) {
                    glk.c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldCheckExtraNetworkAttributes, not checking, no cell service", new Object[0]);
                    z = false;
                } else if (geb.b.a || !gwb.a(this.a, geb.c)) {
                    z = true;
                } else {
                    glk.c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldCheckExtraNetworkAttributes, not checking, potential emergency callback over LTE", new Object[0]);
                    z = false;
                }
                if (z) {
                    String str;
                    if (geb.b.a) {
                        str = "wifi";
                    } else {
                        str = gwb.v(geb.a.e);
                    }
                    str = String.format(Locale.US, "_network_type_%s", new Object[]{str});
                    Context context = this.a;
                    String valueOf = String.valueOf("babel_stun_ping_latency_millis");
                    str = String.valueOf(str);
                    if (str.length() != 0) {
                        str = valueOf.concat(str);
                    } else {
                        str = new String(valueOf);
                    }
                    long a = gwb.a(context, str, 100);
                    if (geb.g || !geb.e || geb.f > a) {
                        boolean z2 = geb.g;
                        glk.c("Babel_telephony", "TeleIncomingWifiCallInvite.hasAcceptableStunPingLatency, not acceptable, didTimeout: " + z2 + ", wasStunPingSuccessful: " + geb.e + ", latency millis: " + geb.f, new Object[0]);
                        a(2897, geb.e, (int) geb.f);
                        z = false;
                    } else {
                        a(2898, geb.e, (int) geb.f);
                        z = true;
                    }
                    if (z) {
                        if (gwb.a(this.a, geb.c, geb.d, geb.a)) {
                            a(2893, false, -1);
                            z = true;
                        } else {
                            a(2895, false, -1);
                            glk.c("Babel_telephony", "TeleIncomingWifiCallInvite.hasAcceptableHerrevadScore, using cell due to bad herrevad network quality score for the wifi network", new Object[0]);
                            z = false;
                        }
                        if (z) {
                            glk.c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, Wi-Fi signal is good", new Object[0]);
                            return true;
                        }
                        glk.c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, poor herrevad score for Wi-Fi", new Object[0]);
                        return false;
                    }
                    glk.c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, poor stun latency on Wi-Fi", new Object[0]);
                    return false;
                }
                glk.c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, not checking extra network attributes.", new Object[0]);
                return true;
            } else {
                glk.c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, returning false", new Object[0]);
                return false;
            }
        } else {
            glk.c("Babel_telephony", "TeleIncomingWifiCallInvite.shouldAllowRing, not connection manager", new Object[0]);
            return false;
        }
    }

    private void a(int i, boolean z, int i2) {
        iie c = ((iih) jyn.a(this.a, iih.class)).a(this.f.f).b().c();
        if (z) {
            c.a(Integer.valueOf(i2));
        }
        c.c(i);
    }

    private void c() {
        glk.c("Babel_telephony", "TeleIncomingWifiCallInvite.addNewIncomingCall", new Object[0]);
        if (this.c.getDefaultOutgoingPhoneAccount("tel") != null) {
            try {
                this.c.addNewIncomingCall(this.c.getDefaultOutgoingPhoneAccount("tel"), this.f.a());
                this.h = true;
            } catch (Exception e) {
                String valueOf = String.valueOf(e);
                glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 119).append("TeleIncomingWifiCallInvite.addNewIncomingCall, adding call with SIM account failed, trying non-SIM account, exception: ").append(valueOf).toString(), new Object[0]);
            }
        }
        if (!this.h) {
            try {
                this.c.addNewIncomingCall(gwb.J(this.a), this.f.a());
                this.h = true;
            } catch (Exception e2) {
                valueOf = String.valueOf(e2);
                glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 110).append("TeleIncomingWifiCallInvite.addNewIncomingCall, adding call with non-SIM account failed, giving up, exception: ").append(valueOf).toString(), new Object[0]);
            }
        }
    }

    private void d() {
        glk.c("Babel_telephony", "TeleIncomingWifiCallInvite.cleanupInvite", new Object[0]);
        this.g = false;
        if (!(this.h || this.i)) {
            gwb.a(this.a, this.f.f, this.f.b, 2337);
        }
        this.b.a(this);
        if (this.e.isHeld()) {
            this.e.release();
            glk.c("Babel_telephony", "Released partial wake lock after cleaning up TeleIncomingWifiCallInvite.", new Object[0]);
        }
    }
}
