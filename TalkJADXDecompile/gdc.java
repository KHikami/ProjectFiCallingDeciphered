import android.content.Context;
import android.os.Handler;
import android.telecom.Connection;
import android.telecom.DisconnectCause;
import android.telecom.TelecomManager;
import android.text.TextUtils;

// Determines if call can be handed off
// I think this is the handoff object, such that...
// if there is a gdc object, then there is a handoff pending (in progress?)
final class gdc implements gcd {
    boolean a;
    private final Context b;
    private final gcq c;    // Connection object before the handoff (cannot be changed, so declared final)
    private final gdf d;
    private final gcc e;    // Call object before the handoff
    private gcc f;          // Call object after the handoff
    private gcq g;  // This is created when handoff actually occurs, inferring that it is the new Connection object
    private int h;  // reason for handoffWiFiToCellular
    private int i;  // Old Connection state constant (during a transition)
    private int j;  // New Connection state constant (during a transition)  // set in onDisconnected and in onTeleCallStateChanged
    private DisconnectCause k;
    private boolean l; // handoff has run to completion (could have either failed or succeeded though)
    private Handler m;
    private final Runnable n;

    // checks network conditions and initiates wifi to cell handoff
    // gcq contains info about Connection state and logs Connection events
    // i: reason for handoff, 2 = manual handoff, 3 = network loss
    static void a(Context context, gcq gcq, int i) {
        glk.c("Babel_telephony", "TeleHandoffController.handoffWifiToCellular, reason: " + i, new Object[0]);
        // gcq.j() returns a gcc object (either gel or gfj)
        if (!a(context, gcq.j(), false, i, gcq.v())) {          // if (!isHandoffPossible(...))
            return;
        }

        // isHandoffPossible returned true

        // If there is a handoff object (gdc)... This means a handoff is pending.
        if (gcq.k() != null) {
            // If reason for handoff is: network loss (3)
            if (i == 3) {
                glk.c("Babel_telephony", "TeleHandoffController.handoffWifiToCellular, notify handoff about network loss", new Object[0]);
                gdc k = gcq.k();    // gcq returns type of gdc (this class)
                if (k.h != 3) {     // checks to see if the handoff reason is not network loss
                    k.h = 3;        // set handoff reason to network loss
                    if (k.f != null) {  // Where is k.f (type gcc) initialized??
                        k.a(true, 0);   // onHandOffComplete
                    }
                }
            }
            glk.c("Babel_telephony", "TeleHandoffController.handoffWifiToCellular, handoff pending, skipping", new Object[0]);
            return;
        }
        // Only gets here if there was no pending handoff
        gdg gdg = new gdg(context, (TelecomManager) gcq.d().getSystemService("telecom"));
        gdg.a(new gdc(context, gcq, gdg, i)); // call to set gdg's gdc
        gdg.a(); // *********call to initiate wifi to cell handoff procedure*********
    }

    // Logs reason for handing off from cell to wifi, and then try to do the handoff using gdb
    //   context: context for call
    //   gcq: call object
    //   i: reason for handoff
    static void b(Context context, gcq gcq, int i) {
        glk.c("Babel_telephony", "TeleHandoffController.handoffCellularToWifi, reason: " + i, new Object[0]);
        // If not isHandoffPossible... return early
        if (!a(context, gcq.j(), false, i, gcq.v())) {
            return;
        }
        // If there is a gdc object associated with gcq, then there is a handoff pending (in progress?)...
        // so log it and then return early
        if (gcq.k() != null) {
            glk.c("Babel_telephony", "TeleHandoffController.handoffCellularToWifi, handoff pending, skipping", new Object[0]);
            return;
        }
        gdb gdb = new gdb(context, dgg.a());
        gdb.a(new gdc(context, gcq, gdb, i));   // Sets gdb's c object to gdc
        gdb.a();    // Start handoff if it is possible
    }

    // Lookup if manual handoff allowed using context
    // Returns false by default if key/value pair not found
    static boolean a(Context context) {
        // gwb.g gets a biw (biz implements) from the context
        // Then use biz to lookup string as a key for context hashmap, or return default boolean if not a key
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

    // Get old Connection state
    int b() {
        return this.i;
    }

    // Get new Connection state
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

    // Wrapper for isHandoffPossible
    boolean f() {
        return a(this.b, this.e, this.l, this.h, this.c.v());
    }

    // isHandoffPossible
    //   z: handoff_complete
    //   i: handoff_reason (only used to check for i == 10 in this function)
    //   z2: manual_network_selection
    public static boolean a(Context context, gcc gcc, boolean z, int i, boolean z2) {
        // gwb.P(context) returns true if we have permission to handoff
        if (!gwb.P(context)) {
            glk.c("Babel_telephony", "TeleHandoffController.isHandoffPossible, no permissions", new Object[0]);
            return false;
        
        // gcc.d() returns 2 if it is a gfj child (which implements gcc). gfj might be a wifi related object
        // gcc.d() returns 1 if it is a gel child (which implements gcc). gel might be a cell related object
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
                        // gwb.H() returns a Context
                        // gcc.a() --> gcq.f() --> gef.c() --> remote_party_number
                        if (glq.d(gwb.H(), gcc.a().f().c())) {
                            glk.c("Babel_telephony", "TeleHandoffController.isHandoffPossible, emergency call, handoff for network optimization not allowed", new Object[0]);
                            return false;
                        // If manual_network_selection...
                        } else if (z2) {
                            glk.c("Babel_telephony", "TeleHandoffController.isHandoffPossible, network optimizing handoff disabled when calling network was choosen manually", new Object[0]);
                            return false;
                        // Only place 'i' is used
                        } else if (i == 10) {
                            // g is a biz object
                            // g.a uses the str to lookup a value in the context hashmap, or returns the given default bool if not a key
                            boolean a = g.a("babel_activity_handoff_allowed", true);
                            // Convert bool value to string allowed or not allowed, for logging purposes
                            String str = a ? "allowed." : "not allowed.";
                            glk.c("Babel_telephony", "TeleHandoffController.isHandoffPossible, activity recognition handoff is %s", str);
                            return a;
                        // Means that gcc is a gfj child (which implements gcc). This means call is over Wifi.
                        } else if (gcc.d() == 2) {
                            // Check context hashmap using string as key, if it's value is false... (meaning WIFI network optimizing handoff not allowed)
                            if (!g.a("babel_wifi_network_optimizing_handoff_allowed", true)) {
                                glk.c("Babel_telephony", "TeleHandoffController.isHandoffPossible, handoff for wifi network optimization not allowed", new Object[0]);
                                return false;
                            }
                        // CELL network optimizing handoff not allowed
                        } else if (!g.a("babel_cell_network_optimizing_handoff_allowed", true)) {
                            glk.c("Babel_telephony", "TeleHandoffController.isHandoffPossible, handoff for cell network optimization not allowed", new Object[0]);
                            return false;
                        }
                        break;
                    // 2: manual handoff mode
                    case wi.l /*2*/:
                        // If manual handoff allowed not allowed (or key/value pair not found in context hashmap)
                        if (!a(context)) {
                            glk.c("Babel_telephony", "TeleHandoffController.isHandoffPossible, manual handoff not allowed", new Object[0]);
                            return false;
                        }
                        break;
                    // 3: network loss (our main use case)
                    case wi.z /*3*/:
                        // gcc is a gfj child (which implements gcc). This means call is over Wifi.
                        if (gcc.d() == 2) {
                            // If we cannot handoff when wifi is lost...
                            if (!g.a("babel_handoff_on_wifi_loss_allowed", true)) {
                                glk.c("Babel_telephony", "TeleHandoffController.isHandoffPossible, handoff on wifi loss not allowed", new Object[0]);
                                return false;
                            }
                        // Otherwise gcc is a gel child (which implements gcc), AND IF handoff is NOT allowed on cell loss...
                        // gel child means call is over cellular signal
                        // I looked in gservices database for this string, but no 'handoff' strings were found (assume it takes default)
                        } else if (!g.a("babel_handoff_on_cell_loss_allowed", true)) {
                            glk.c("Babel_telephony", "TeleHandoffController.isHandoffPossible, handoff on cell loss not allowed", new Object[0]);
                            return false;
                        }
                        break;
                    // Unknown handoff reason 'i'
                    default:
                        glk.c("Babel_telephony", "TeleHandoffController.isHandoffPossible, unknown handoff reason: " + i, new Object[0]);
                        return false;
                }
                // gcc.a returns a gcq object
                // gcq.h returns the current_network_carrier object (gec)
                gec h = gcc.a().h();
                // If this is an international ISO, AND international handoffs are NOT allowed...
                if (h.b(context) && !g.a("babel_international_handoff_allowed", false)) {
                    glk.c("Babel_telephony", "TeleHandoffController.isHandoffPossible, handoff while international not allowed", new Object[0]);
                    return false;
                // If we are not roaming, OR roaming handoff is allowed...
                } else if (h.a() == 1 || g.a("babel_roaming_handoff_allowed", true)) {
                    return true;
                // Otherwise we are roaming AND roaming handoff is not allowed...
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
        this.f = gcc;   // Set post-handoff call object
        this.f.a((gcd) this);   // Append this handoff to call object's history list
        this.g = new gcq(this.e.a().f(), this.e.a().i());   // Create the new TeleConnection object (for post-handoff)
        this.g.setDialing(); // setDialing() in gcq's parent class Connection
        this.g.b(this.f); // set geo's gcw
        if (this.h == 3) { // if reason for handoffWiFiToCellular
            a(true, 0); // handoffcomplete
        } else {
            g(); // print to log
        }
    }

    // onHandoffComplete
    //   z: is_handoff_complete
    //   i: HTTP status code
    // https://developer.android.com/reference/org/apache/http/HttpStatus.html
    // Many status codes are probably for internal use only (extended from normal REST codes)
    void a(boolean z, int i) {
        if (!this.l) {  // This ensures that this method can only be run once (if it fails, it cannot retry with this same handoff object)
            this.l = true;
            glk.c("Babel_telephony", String.format("TeleHandoffController.onHandoffComplete(%b, %s)", new Object[]{Boolean.valueOf(z), Integer.valueOf(i)}), new Object[0]);
            this.e.b((gcd) this); // remove this handoff object from list?
            if (this.f != null) { // if gcc is not null
                this.f.b((gcd) this); // remove this handoff object from list?
                if (!z) { // if handoff is not complete
                    this.f.a(this.h, i); // disconnect for handoff with non-final gcc (post-handoff call)
                }
            }
            if (this.g != null) { // if post-handoff gcq is not null
                if (z && !TextUtils.isEmpty(this.g.n())) {  // If handoff is complete and post-handoff gcq's handoff_number is not empty...
                    this.c.a(this.g.n()); // Sets pre-handoff gcq's handoff_number with post-handoff gcq's handoff_number
                }
                this.g.b(null); // Clear out wifi_calling_account (assuming null was supposed to be a string)
                this.g = null;  // Clear out post-handoff gcq
            }
            this.c.a(null); // resets pre-handoff gcq's handoff_number to null, regardless of setting it above?
            this.m.removeCallbacks(this.n);
            if (z) { // if handoff is complete
                if (this.f != null) {   // If post-handoff call object is defined...
                    gcc gcc = this.f;
                    gcc.a(true);    // Possibly set call's boolean that says if handed off or not?
                    this.m.postDelayed(new gde(this, gcc), 1000);
                    this.c.b(this.f);
                }
                a(this.j);  // Set state of our call using post-handoff state 
                this.e.a(this.h, i);  // disconnect for handoff with final gcc (pre-handoff call)
            } else {
                a(this.i);  // Set state of our call using pre-handoff state (because handoff failed)
                this.e.b(); // Update status hints
                if (this.h == 3) {  // If reason for handoff was network loss...
                    this.e.a(this.h, i); // disconnect for handoff with final gcc (pre-handoff call)
                }
            }
            this.d.c();
        }
    }

    // Update old or new Connection state
    public final void a(gcc gcc, int i) {
        glk.c("Babel_telephony", "TeleHandoffController.onTeleCallStateChanged", new Object[0]);
        // If not disconnected...
        if (i != 6) {
            // Update i or j Connection state depending on which gcc you have
            // I'm guessing this.e is the old gcc state object...
            if (gcc == this.e) {
                this.i = i;
            // and this.f is the new gcc state object...
            } else if (gcc == this.f) {
                this.j = i;
            }
            g();    // Log transition from old to new state
        }
    }

    // Set old or new Connection state to disconnected
    public final void a(gcc gcc, DisconnectCause disconnectCause) {
        glk.c("Babel_telephony", "TeleHandoffController.onDisconnected", new Object[0]);
        if (gcc == this.e) {
            // STATE_DISCONNECTED
            this.i = 6;                 // set to 6
        } else if (gcc == this.f) {
            // STATE_DISCONNECTED
            this.j = 6;                 // set to 6 on disconnect
        }
        this.k = disconnectCause;
        g();    // Log transition from old to new state
    }

    // Print to log transition from old state to new state
    void g() {
        // Find Connection state constants here:
        // https://developer.android.com/reference/android/telecom/Connection.html
        String valueOf = String.valueOf(Connection.stateToString(this.i));  // Old call state
        String valueOf2 = String.valueOf(Connection.stateToString(this.j)); // New call state
        glk.c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 74) + String.valueOf(valueOf2).length()).append("TeleHandoffController.checkHandoffComplete, oldCallState: ").append(valueOf).append(", newCallState: ").append(valueOf2).toString(), new Object[0]);
        // d is a gdf object, but since gdf is just an interface, it must be either gdb or gdg
        this.d.b();
    }

    private void a(int i) {
        // this.c is a gcq object
        // If the state of our Connection doesn't match, then update it
        if (this.c.getState() != i) {
            switch (i) {
                // These functions don't appear in gcq because they are implemented by the parent class Connection
                // https://developer.android.com/reference/android/telecom/Connection.html
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
