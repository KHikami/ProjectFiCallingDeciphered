import android.content.Context;
import android.os.Handler;
import android.telecom.Connection;
import android.telecom.DisconnectCause;
import android.telecom.TelecomManager;
import android.text.TextUtils;

// Determines if call can be handed off
final class gdc implements gcd {
    boolean a;
    private final Context b;
    private final gcq c;
    private final gdf d;
    private final gcc e;
    private gcc f;
    private gcq g;
    private int h;  // reason for handoffWiFiToCellular
    private int i;
    private int j;  // set in onDisconnected and in onTeleCallStateChanged
    private DisconnectCause k;
    private boolean l;
    private Handler m;
    private final Runnable n;

    // gcq contains info about Connection state and logs Connection events
    // i: reason for handoff, 3 == network loss
    static void a(Context context, gcq gcq, int i) {
        glk.c("Babel_telephony", "TeleHandoffController.handoffWifiToCellular, reason: " + i, new Object[0]);
        // gcq.j() returns a gcc object (either gel or gfj)
        if (!a(context, gcq.j(), false, i, gcq.v())) {          // if (!isHandoffPossible(...))
            return;
        }

        // isHandoffPossible returned true

        if (gcq.k() != null) {
            if (i == 3) {
                glk.c("Babel_telephony", "TeleHandoffController.handoffWifiToCellular, notify handoff about network loss", new Object[0]);
                gdc k = gcq.k();    // gcq returns type of gdc (this class)
                if (k.h != 3) {     // checks to see if the handoff reason was not already set
                    k.h = 3;        // set handoff reason
                    if (k.f != null) {  // Where is k.f (type gcc) initialized??
                        k.a(true, 0);   // onHandOffComplete
                    }
                }
            }
            glk.c("Babel_telephony", "TeleHandoffController.handoffWifiToCellular, handoff pending, skipping", new Object[0]);
            return;
        }
        gdg gdg = new gdg(context, (TelecomManager) gcq.d().getSystemService("telecom"));
        gdg.a(new gdc(context, gcq, gdg, i));
        gdg.a();
    }

    static void b(Context context, gcq gcq, int i) {
        glk.c("Babel_telephony", "TeleHandoffController.handoffCellularToWifi, reason: " + i, new Object[0]);
        if (!a(context, gcq.j(), false, i, gcq.v())) {
            return;
        }
        if (gcq.k() != null) {
            glk.c("Babel_telephony", "TeleHandoffController.handoffCellularToWifi, handoff pending, skipping", new Object[0]);
            return;
        }
        gdb gdb = new gdb(context, dgg.a());
        gdb.a(new gdc(context, gcq, gdb, i));
        gdb.a();
    }

    static boolean a(Context context) {
        return gwb.g(context).a("babel_manual_handoff_allowed", false);
    }

    private gdc(Context context, gcq gcq, gdf gdf, int i) {
        this.i = 1;
        this.j = 1;
        this.m = new Handler();
        this.n = new gdd(this);
        this.b = context;
        this.c = gcq;
        this.d = gdf;
        this.h = i;
        this.e = gcq.j();
        this.e.a((gcd) this);
        this.i = gcq.getState();
        gcq.a(this);
        this.e.b();
    }

    gcq a() {
        return this.c;
    }

    int b() {
        return this.i;
    }

    int c() {
        return this.j;
    }

    boolean d() {
        return this.a;
    }

    // cancelHandoffAndEndCall
    void e() {
        glk.c("Babel_telephony", "TeleHandoffController.cancelHandoffAndEndCall", new Object[0]);
        if (this.f != null) {
            this.f.g();
        }
        this.e.g();
        a(false, 219);
    }

    boolean f() {
        return a(this.b, this.e, this.l, this.h, this.c.v());
    }

    // isHandoffPossible
    //   z: handoff_complete
    //   i: 
    //   z2: manual_network_selection
    public static boolean a(Context context, gcc gcc, boolean z, int i, boolean z2) {
        // gwb.P(context) returns true if we have permission to handoff
        if (!gwb.P(context)) {
            glk.c("Babel_telephony", "TeleHandoffController.isHandoffPossible, no permissions", new Object[0]);
            return false;
        
        // gcc.d() returns 2 if it is a gfj child (which implements gcc)
        // gcc.d() returns 1 if it is a gel child (which implements gcc)
        // gwb.R(context) checks capabilities for making cell calls
        
        // If gcc is not a gfj object OR our context says we have the capability (permission) to make cell calls...
        } else if (gcc.d() != 2 || gwb.R(context)) {
            glk.c("Babel_telephony", "TeleHandoffController.isHandoffPossible", new Object[0]);
            // If handoff is complete...
            if (z) {
                glk.c("Babel_telephony", "TeleHandoffController.isHandoffPossible, handoff is already complete", new Object[0]);
                return false;
            // Else if this is an LTE_fallback_call...
            } else if (gcc.a().w()) {
                glk.c("Babel_telephony", "TeleHandoffController.isHandoffPossible, handoff not allowed for LTE fallback calls", new Object[0]);
                return false;
            } else {
                biw g = gwb.g(context);
                switch (i) {
                    // Cases 1,5,6,7,9,10: this is a network optimization handoff
                    case wi.j /*1*/:
                    case wi.p /*5*/:
                    case wi.s /*6*/:
                    case wi.q /*7*/:
                    case wi.n /*9*/:
                    case wi.dr /*10*/:
                        // If emergency_call...
                        if (glq.d(gwb.H(), gcc.a().f().c())) {
                            glk.c("Babel_telephony", "TeleHandoffController.isHandoffPossible, emergency call, handoff for network optimization not allowed", new Object[0]);
                            return false;
                        // If manual_network_selection...
                        } else if (z2) {
                            glk.c("Babel_telephony", "TeleHandoffController.isHandoffPossible, network optimizing handoff disabled when calling network was choosen manually", new Object[0]);
                            return false;
                        // 
                        } else if (i == 10) {
                            // I think 'a' will always be true
                            boolean a = g.a("babel_activity_handoff_allowed", true);\
                            // Always sets to "allowed."???
                            String str = a ? "allowed." : "not allowed.";
                            glk.c("Babel_telephony", "TeleHandoffController.isHandoffPossible, activity recognition handoff is %s", str);
                            return a;
                        } else if (gcc.d() == 2) {
                            if (!g.a("babel_wifi_network_optimizing_handoff_allowed", true)) {
                                glk.c("Babel_telephony", "TeleHandoffController.isHandoffPossible, handoff for wifi network optimization not allowed", new Object[0]);
                                return false;
                            }
                        } else if (!g.a("babel_cell_network_optimizing_handoff_allowed", true)) {
                            glk.c("Babel_telephony", "TeleHandoffController.isHandoffPossible, handoff for cell network optimization not allowed", new Object[0]);
                            return false;
                        }
                        break;
                    case wi.l /*2*/:
                        if (!a(context)) {
                            glk.c("Babel_telephony", "TeleHandoffController.isHandoffPossible, manual handoff not allowed", new Object[0]);
                            return false;
                        }
                        break;
                    case wi.z /*3*/:
                        if (gcc.d() == 2) {
                            if (!g.a("babel_handoff_on_wifi_loss_allowed", true)) {
                                glk.c("Babel_telephony", "TeleHandoffController.isHandoffPossible, handoff on wifi loss not allowed", new Object[0]);
                                return false;
                            }
                        } else if (!g.a("babel_handoff_on_cell_loss_allowed", true)) {
                            glk.c("Babel_telephony", "TeleHandoffController.isHandoffPossible, handoff on cell loss not allowed", new Object[0]);
                            return false;
                        }
                        break;
                    default:
                        glk.c("Babel_telephony", "TeleHandoffController.isHandoffPossible, unknown handoff reason: " + i, new Object[0]);
                        return false;
                }
                gec h = gcc.a().h();
                if (h.b(context) && !g.a("babel_international_handoff_allowed", false)) {
                    glk.c("Babel_telephony", "TeleHandoffController.isHandoffPossible, handoff while international not allowed", new Object[0]);
                    return false;
                } else if (h.a() == 1 || g.a("babel_roaming_handoff_allowed", true)) {
                    return true;
                } else {
                    glk.c("Babel_telephony", "TeleHandoffController.isHandoffPossible, handoff while roaming not allowed", new Object[0]);
                    return false;
                }
            }
        // No capability to make cell calls
        } else {
            glk.c("Babel_telephony", "TeleHandoffController.isHandoffPossible, can't make cell calls", new Object[0]);
            return false;
        }
    }

    // onHandOffStarted
    void a(gcc gcc) {
        String valueOf = String.valueOf(gcc);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 52).append("TeleHandoffController.onHandoffStarted, theNewCall: ").append(valueOf).toString(), new Object[0]);
        this.c.a(true);
        this.m.postDelayed(this.n, (long) gwb.a(this.b, "babel_handoff_timeout_millis", 30000));
        this.f = gcc;
        this.f.a((gcd) this);
        this.g = new gcq(this.e.a().f(), this.e.a().i());
        this.g.setDialing();
        this.g.b(this.f);
        if (this.h == 3) {
            a(true, 0);
        } else {
            g();
        }
    }

    // onHandOffComplete
    // z: is_handoff_complete
    // i: 
    void a(boolean z, int i) {
        if (!this.l) {
            this.l = true;
            glk.c("Babel_telephony", String.format("TeleHandoffController.onHandoffComplete(%b, %s)", new Object[]{Boolean.valueOf(z), Integer.valueOf(i)}), new Object[0]);
            this.e.b((gcd) this);
            if (this.f != null) {
                this.f.b((gcd) this);
                if (!z) {
                    this.f.a(this.h, i);
                }
            }
            if (this.g != null) {
                if (z && !TextUtils.isEmpty(this.g.n())) {
                    this.c.a(this.g.n());
                }
                this.g.b(null);
                this.g = null;
            }
            this.c.a(null);
            this.m.removeCallbacks(this.n);
            if (z) {
                if (this.f != null) {
                    gcc gcc = this.f;
                    gcc.a(true);
                    this.m.postDelayed(new gde(this, gcc), 1000);
                    this.c.b(this.f);
                }
                a(this.j);
                this.e.a(this.h, i);  // (int, int)
            } else {
                a(this.i);
                this.e.b();
                if (this.h == 3) {
                    this.e.a(this.h, i);
                }
            }
            this.d.c();
        }
    }

    public final void a(gcc gcc, int i) {
        glk.c("Babel_telephony", "TeleHandoffController.onTeleCallStateChanged", new Object[0]);
        if (i != 6) {
            if (gcc == this.e) {
                this.i = i;
            } else if (gcc == this.f) {
                this.j = i;
            }
            g();
        }
    }

    public final void a(gcc gcc, DisconnectCause disconnectCause) {
        glk.c("Babel_telephony", "TeleHandoffController.onDisconnected", new Object[0]);
        if (gcc == this.e) {
            this.i = 6;                 // set to 6
        } else if (gcc == this.f) {
            this.j = 6;                 // set to 6 on disconnect
        }
        this.k = disconnectCause;
        g();
    }

    void g() {
        String valueOf = String.valueOf(Connection.stateToString(this.i));
        String valueOf2 = String.valueOf(Connection.stateToString(this.j));
        glk.c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 74) + String.valueOf(valueOf2).length()).append("TeleHandoffController.checkHandoffComplete, oldCallState: ").append(valueOf).append(", newCallState: ").append(valueOf2).toString(), new Object[0]);
        this.d.b();
    }

    private void a(int i) {
        if (this.c.getState() != i) {
            switch (i) {
                case wi.l /*2*/:
                    this.c.setRinging();
                case wi.z /*3*/:
                    this.c.setDialing();
                case wi.h /*4*/:
                    this.c.setActive();
                case wi.p /*5*/:
                    this.c.setOnHold();
                case wi.s /*6*/:
                    iil.b("Expected non-null", this.k);
                    this.c.setDisconnected(this.k);
                    this.c.destroy();
                    this.c.b(null);
                default:
            }
        }
    }
}
