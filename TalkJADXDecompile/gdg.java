import android.content.Context;
import android.os.Bundle;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.PhoneAccountHandle;
import android.telecom.RemoteConnection;
import android.telecom.TelecomManager;
import android.text.TextUtils;
import com.google.api.client.http.HttpStatusCodes;

final class gdg implements gdf {
    final Context a;
    gdc b;
    private final TelecomManager c;
    private final Runnable d;

    gdg(Context context, TelecomManager telecomManager) {
        this.d = new gdh(this);
        this.a = context;
        this.c = telecomManager;
    }

    void a(gdc gdc) {
        this.b = gdc;
    }

    // initiate wifi to cell handoff
    void a() {
        PhoneAccountHandle defaultOutgoingPhoneAccount;
        glk.c("Babel_telephony", "TeleHandoffWifiToCellular.startHandoff", new Object[0]);
        gcq a = this.b.a();
        if (a.g()) {
            defaultOutgoingPhoneAccount = this.c.getDefaultOutgoingPhoneAccount("tel");
        } else {
            defaultOutgoingPhoneAccount = a.e().getAccountHandle();
        }
        String valueOf = String.valueOf(defaultOutgoingPhoneAccount);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 59).append("TeleHandoffWifiToCellular.startHandoff, got phone account: ").append(valueOf).toString(), new Object[0]);
        if (defaultOutgoingPhoneAccount == null) {
            glk.c("Babel_telephony", "TeleHandoffWifiToCellular.startHandoff, no phone account.", new Object[0]);
            this.b.a(false, 225);
        } else if (!this.b.f()) { // if handoff is not possible
            glk.c("Babel_telephony", "TeleHandoffWifiToCellular.startHandoff, disallowed by config.", new Object[0]);
            this.b.a(false, 224);
        } else if (TextUtils.isEmpty(a.n())) {
            glk.c("Babel_telephony", "TeleHandoffWifiToCellular.startHandoff, no handoff number", new Object[0]);
            this.b.a(false, 320);
        } else {
            int b = this.b.b();
            if (b == 3 || b == 4) { // if old connection state is STATE_DIALING or STATE_ACTIVE
                int size = a.d().getAllConnections().size();
                if (size > 1) { // cannot handoff if more than one call is currently active?
                    glk.c("Babel_telephony", "TeleHandoffWifiToCellular.startHandoff, call count: " + size + ", fail handoff", new Object[0]);
                    this.b.a(false, 221);
                    return;
                }
                // *******actual handoff, with defaultOutgoingPhoneAccount not null*******
                gck.a(this.a, new gdi(this, defaultOutgoingPhoneAccount)); // gck -> gcl(gdi) = handoff to make call with defaultOutgoingPhoneAccount
                return;
            }
            // cannot handoff if connection state is not STATE_DIALING or STATE_ACTIVE
            String str = "Babel_telephony";
            valueOf = "TeleHandoffWifiToCellular.startHandoff, not possible for call state: ";
            String valueOf2 = String.valueOf(Connection.stateToString(b));
            glk.c(str, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), new Object[0]);
            this.b.a(false, 227);
        }
    }

    // complete handoff from wifi to T-Mobile
    public void b() {
        if (this.b.b() == 6) { // if old connection state is STATE_DISCONNECTED
            this.b.a(true, 0);
        } else if (this.b.c() == 4 && a(2)) { // if new connection state = STATE_ACTIVE & carrier = T-Mobile
            glk.c("Babel_telephony", "TeleHandoffWifiToCellular.checkHandoffComplete, handoff is complete - carrier is T-Mobile and new call is active.", new Object[0]);
            gwb.f(2981);
            this.b.a(true, 0); // handoff complete
        } else if (this.b.c() == 6) { // if new connection state is STATE_DISCONNECTED
            this.b.a(false, 0);
        } else if (this.b.d()) { // if gdc.a?
            this.b.a(false, (int) HttpStatusCodes.STATUS_CODE_NOT_MODIFIED);
        }
    }

    // i: SIM operator code
    // 1: Sprint, 2: T-Mobile, 3: US Cellular, 4: Hutchinson 3G (UK), 5: Hutchinson Telecom (HK)
    // gdc -> gcq -> gef -> gec (network carrier) -> get int for current MCC/MNC number
    private boolean a(int i) { return this.b.a().f().b().c() == i; }

    // handoff from wifi to cell (Sprint)
    void a(PhoneAccountHandle phoneAccountHandle) {
        glk.c("Babel_telephony", "TeleHandoffWifiToCellular.callHandoffNumber", new Object[0]);
        gcq a = this.b.a();
        ConnectionRequest connectionRequest = new ConnectionRequest(phoneAccountHandle, gwb.F(a.n()), Bundle.EMPTY); // ConnectionRequest(PhoneAccountHandle, Uri, Bundle)
        if (a(1)) { // if currently on Sprint
            gwb.aL().postDelayed(this.d, (long) gwb.a(this.a, "babel_handoff_sprint_timeout_millis", 4000)); // handoff from wifi to Sprint complete
        }
        Context d = a.d();
        RemoteConnection createRemoteOutgoingConnection = d.createRemoteOutgoingConnection(gwb.J(d), connectionRequest);
        if (createRemoteOutgoingConnection == null) {
            this.b.a(false, 321); // handoff failed
            return;
        }
        String e;
        CharSequence charSequence = null;
        if (a.j() instanceof gfj) {
            charSequence = ((gfj) a.j()).q(); // gets ikd.a
        }
        if (TextUtils.isEmpty(charSequence)) {
            e = a.j().e();
        } else {
            CharSequence charSequence2 = charSequence; // why is this set, but never used?
        }
        this.b.a(new gel(this.a, createRemoteOutgoingConnection, e, a.s(), a.i(), a.g())); // onHandOffStarted
    }

    public void c() {
        gwb.aL().removeCallbacks(this.d); // remove runnable (check handoff for wifi to Sprint) callback from handler
    }
}
