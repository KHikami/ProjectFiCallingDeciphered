package p000;

import android.content.Context;
import android.os.Handler;
import android.telecom.Connection;
import android.telecom.DisconnectCause;
import android.telecom.TelecomManager;
import android.text.TextUtils;

final class gdc implements gcd {
    boolean f14730a;
    private final Context f14731b;
    private final gcq f14732c;
    private final gdf f14733d;
    private final gcc f14734e;
    private gcc f14735f;
    private gcq f14736g;
    private int f14737h;
    private int f14738i = 1;
    private int f14739j = 1;
    private DisconnectCause f14740k;
    private boolean f14741l;
    private Handler f14742m = new Handler();
    private final Runnable f14743n = new gdd(this);

    static void m17020a(Context context, gcq gcq, int i) {
        glk.m17979c("Babel_telephony", "TeleHandoffController.handoffWifiToCellular, reason: " + i, new Object[0]);
        if (!gdc.m17022a(context, gcq.m16963j(), false, i, gcq.m16975v())) {
            return;
        }
        if (gcq.m16964k() != null) {
            if (i == 3) {
                glk.m17979c("Babel_telephony", "TeleHandoffController.handoffWifiToCellular, notify handoff about network loss", new Object[0]);
                gdc k = gcq.m16964k();
                if (k.f14737h != 3) {
                    k.f14737h = 3;
                    if (k.f14735f != null) {
                        k.m17028a(true, 0);
                    }
                }
            }
            glk.m17979c("Babel_telephony", "TeleHandoffController.handoffWifiToCellular, handoff pending, skipping", new Object[0]);
            return;
        }
        gdg gdg = new gdg(context, (TelecomManager) gcq.m16955d().getSystemService("telecom"));
        gdg.m17038a(new gdc(context, gcq, gdg, i));
        gdg.m17036a();
    }

    static void m17023b(Context context, gcq gcq, int i) {
        glk.m17979c("Babel_telephony", "TeleHandoffController.handoffCellularToWifi, reason: " + i, new Object[0]);
        if (!gdc.m17022a(context, gcq.m16963j(), false, i, gcq.m16975v())) {
            return;
        }
        if (gcq.m16964k() != null) {
            glk.m17979c("Babel_telephony", "TeleHandoffController.handoffCellularToWifi, handoff pending, skipping", new Object[0]);
            return;
        }
        gdb gdb = new gdb(context, dgg.m11692a());
        gdb.m17016a(new gdc(context, gcq, gdb, i));
        gdb.m17015a();
    }

    static boolean m17021a(Context context) {
        return gwb.m2214g(context).mo564a("babel_manual_handoff_allowed", false);
    }

    private gdc(Context context, gcq gcq, gdf gdf, int i) {
        this.f14731b = context;
        this.f14732c = gcq;
        this.f14733d = gdf;
        this.f14737h = i;
        this.f14734e = gcq.m16963j();
        this.f14734e.mo2212a((gcd) this);
        this.f14738i = gcq.getState();
        gcq.m16944a(this);
        this.f14734e.mo2216b();
    }

    gcq m17024a() {
        return this.f14732c;
    }

    int m17029b() {
        return this.f14738i;
    }

    int m17030c() {
        return this.f14739j;
    }

    boolean m17031d() {
        return this.f14730a;
    }

    void m17032e() {
        glk.m17979c("Babel_telephony", "TeleHandoffController.cancelHandoffAndEndCall", new Object[0]);
        if (this.f14735f != null) {
            this.f14735f.mo2223g();
        }
        this.f14734e.mo2223g();
        m17028a(false, 219);
    }

    boolean m17033f() {
        return gdc.m17022a(this.f14731b, this.f14734e, this.f14741l, this.f14737h, this.f14732c.m16975v());
    }

    public static boolean m17022a(Context context, gcc gcc, boolean z, int i, boolean z2) {
        if (!gwb.m1438P(context)) {
            glk.m17979c("Babel_telephony", "TeleHandoffController.isHandoffPossible, no permissions", new Object[0]);
            return false;
        } else if (gcc.mo2220d() != 2 || gwb.m1446R(context)) {
            glk.m17979c("Babel_telephony", "TeleHandoffController.isHandoffPossible", new Object[0]);
            if (z) {
                glk.m17979c("Babel_telephony", "TeleHandoffController.isHandoffPossible, handoff is already complete", new Object[0]);
                return false;
            } else if (gcc.mo2206a().m16976w()) {
                glk.m17979c("Babel_telephony", "TeleHandoffController.isHandoffPossible, handoff not allowed for LTE fallback calls", new Object[0]);
                return false;
            } else {
                biw g = gwb.m2214g(context);
                switch (i) {
                    case 1:
                    case 5:
                    case 6:
                    case 7:
                    case 9:
                    case 10:
                        if (glq.m18019d(gwb.m1400H(), gcc.mo2206a().m16959f().m17141c())) {
                            glk.m17979c("Babel_telephony", "TeleHandoffController.isHandoffPossible, emergency call, handoff for network optimization not allowed", new Object[0]);
                            return false;
                        } else if (z2) {
                            glk.m17979c("Babel_telephony", "TeleHandoffController.isHandoffPossible, network optimizing handoff disabled when calling network was choosen manually", new Object[0]);
                            return false;
                        } else if (i == 10) {
                            boolean a = g.mo564a("babel_activity_handoff_allowed", true);
                            String str = a ? "allowed." : "not allowed.";
                            glk.m17979c("Babel_telephony", "TeleHandoffController.isHandoffPossible, activity recognition handoff is %s", str);
                            return a;
                        } else if (gcc.mo2220d() == 2) {
                            if (!g.mo564a("babel_wifi_network_optimizing_handoff_allowed", true)) {
                                glk.m17979c("Babel_telephony", "TeleHandoffController.isHandoffPossible, handoff for wifi network optimization not allowed", new Object[0]);
                                return false;
                            }
                        } else if (!g.mo564a("babel_cell_network_optimizing_handoff_allowed", true)) {
                            glk.m17979c("Babel_telephony", "TeleHandoffController.isHandoffPossible, handoff for cell network optimization not allowed", new Object[0]);
                            return false;
                        }
                        break;
                    case 2:
                        if (!gdc.m17021a(context)) {
                            glk.m17979c("Babel_telephony", "TeleHandoffController.isHandoffPossible, manual handoff not allowed", new Object[0]);
                            return false;
                        }
                        break;
                    case 3:
                        if (gcc.mo2220d() == 2) {
                            if (!g.mo564a("babel_handoff_on_wifi_loss_allowed", true)) {
                                glk.m17979c("Babel_telephony", "TeleHandoffController.isHandoffPossible, handoff on wifi loss not allowed", new Object[0]);
                                return false;
                            }
                        } else if (!g.mo564a("babel_handoff_on_cell_loss_allowed", true)) {
                            glk.m17979c("Babel_telephony", "TeleHandoffController.isHandoffPossible, handoff on cell loss not allowed", new Object[0]);
                            return false;
                        }
                        break;
                    default:
                        glk.m17979c("Babel_telephony", "TeleHandoffController.isHandoffPossible, unknown handoff reason: " + i, new Object[0]);
                        return false;
                }
                gec h = gcc.mo2206a().m16961h();
                if (h.m17120b(context) && !g.mo564a("babel_international_handoff_allowed", false)) {
                    glk.m17979c("Babel_telephony", "TeleHandoffController.isHandoffPossible, handoff while international not allowed", new Object[0]);
                    return false;
                } else if (h.m17117a() == 1 || g.mo564a("babel_roaming_handoff_allowed", true)) {
                    return true;
                } else {
                    glk.m17979c("Babel_telephony", "TeleHandoffController.isHandoffPossible, handoff while roaming not allowed", new Object[0]);
                    return false;
                }
            }
        } else {
            glk.m17979c("Babel_telephony", "TeleHandoffController.isHandoffPossible, can't make cell calls", new Object[0]);
            return false;
        }
    }

    void m17025a(gcc gcc) {
        String valueOf = String.valueOf(gcc);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 52).append("TeleHandoffController.onHandoffStarted, theNewCall: ").append(valueOf).toString(), new Object[0]);
        this.f14732c.m16946a(true);
        this.f14742m.postDelayed(this.f14743n, (long) gwb.m1492a(this.f14731b, "babel_handoff_timeout_millis", 30000));
        this.f14735f = gcc;
        this.f14735f.mo2212a((gcd) this);
        this.f14736g = new gcq(this.f14734e.mo2206a().m16959f(), this.f14734e.mo2206a().m16962i());
        this.f14736g.setDialing();
        this.f14736g.m16948b(this.f14735f);
        if (this.f14737h == 3) {
            m17028a(true, 0);
        } else {
            m17034g();
        }
    }

    void m17028a(boolean z, int i) {
        if (!this.f14741l) {
            this.f14741l = true;
            glk.m17979c("Babel_telephony", String.format("TeleHandoffController.onHandoffComplete(%b, %s)", new Object[]{Boolean.valueOf(z), Integer.valueOf(i)}), new Object[0]);
            this.f14734e.mo2217b((gcd) this);
            if (this.f14735f != null) {
                this.f14735f.mo2217b((gcd) this);
                if (!z) {
                    this.f14735f.mo2209a(this.f14737h, i);
                }
            }
            if (this.f14736g != null) {
                if (z && !TextUtils.isEmpty(this.f14736g.m16967n())) {
                    this.f14732c.m16945a(this.f14736g.m16967n());
                }
                this.f14736g.m16948b(null);
                this.f14736g = null;
            }
            this.f14732c.m16944a(null);
            this.f14742m.removeCallbacks(this.f14743n);
            if (z) {
                if (this.f14735f != null) {
                    gcc gcc = this.f14735f;
                    gcc.mo2215a(true);
                    this.f14742m.postDelayed(new gde(this, gcc), 1000);
                    this.f14732c.m16948b(this.f14735f);
                }
                m17019a(this.f14739j);
                this.f14734e.mo2209a(this.f14737h, i);
            } else {
                m17019a(this.f14738i);
                this.f14734e.mo2216b();
                if (this.f14737h == 3) {
                    this.f14734e.mo2209a(this.f14737h, i);
                }
            }
            this.f14733d.mo2187c();
        }
    }

    public final void mo2188a(gcc gcc, int i) {
        glk.m17979c("Babel_telephony", "TeleHandoffController.onTeleCallStateChanged", new Object[0]);
        if (i != 6) {
            if (gcc == this.f14734e) {
                this.f14738i = i;
            } else if (gcc == this.f14735f) {
                this.f14739j = i;
            }
            m17034g();
        }
    }

    public final void mo2189a(gcc gcc, DisconnectCause disconnectCause) {
        glk.m17979c("Babel_telephony", "TeleHandoffController.onDisconnected", new Object[0]);
        if (gcc == this.f14734e) {
            this.f14738i = 6;
        } else if (gcc == this.f14735f) {
            this.f14739j = 6;
        }
        this.f14740k = disconnectCause;
        m17034g();
    }

    void m17034g() {
        String valueOf = String.valueOf(Connection.stateToString(this.f14738i));
        String valueOf2 = String.valueOf(Connection.stateToString(this.f14739j));
        glk.m17979c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 74) + String.valueOf(valueOf2).length()).append("TeleHandoffController.checkHandoffComplete, oldCallState: ").append(valueOf).append(", newCallState: ").append(valueOf2).toString(), new Object[0]);
        this.f14733d.mo2186b();
    }

    private void m17019a(int i) {
        if (this.f14732c.getState() != i) {
            switch (i) {
                case 2:
                    this.f14732c.setRinging();
                    return;
                case 3:
                    this.f14732c.setDialing();
                    return;
                case 4:
                    this.f14732c.setActive();
                    return;
                case 5:
                    this.f14732c.setOnHold();
                    return;
                case 6:
                    iil.m21875b("Expected non-null", this.f14740k);
                    this.f14732c.setDisconnected(this.f14740k);
                    this.f14732c.destroy();
                    this.f14732c.m16948b(null);
                    return;
                default:
                    return;
            }
        }
    }
}
