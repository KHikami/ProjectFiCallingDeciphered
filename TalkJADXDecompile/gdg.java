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
        } else if (!this.b.f()) {
            glk.c("Babel_telephony", "TeleHandoffWifiToCellular.startHandoff, disallowed by config.", new Object[0]);
            this.b.a(false, 224);
        } else if (TextUtils.isEmpty(a.n())) {
            glk.c("Babel_telephony", "TeleHandoffWifiToCellular.startHandoff, no handoff number", new Object[0]);
            this.b.a(false, 320);
        } else {
            int b = this.b.b();
            if (b == 3 || b == 4) {
                int size = a.d().getAllConnections().size();
                if (size > 1) {
                    glk.c("Babel_telephony", "TeleHandoffWifiToCellular.startHandoff, call count: " + size + ", fail handoff", new Object[0]);
                    this.b.a(false, 221);
                    return;
                }
                gck.a(this.a, new gdi(this, defaultOutgoingPhoneAccount)); // gck -> gcl(gdi) = handoff?
                return;
            }
            String str = "Babel_telephony";
            valueOf = "TeleHandoffWifiToCellular.startHandoff, not possible for call state: ";
            String valueOf2 = String.valueOf(Connection.stateToString(b));
            glk.c(str, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), new Object[0]);
            this.b.a(false, 227);
        }
    }

    // handoff from wifi to T-Mobile..where is sprint?
    public void b() {
        if (this.b.b() == 6) {
            this.b.a(true, 0);
        } else if (this.b.c() == 4 && a(2)) { // if connection state = STATE_ACTIVE & ...
            glk.c("Babel_telephony", "TeleHandoffWifiToCellular.checkHandoffComplete, handoff is complete - carrier is T-Mobile and new call is active.", new Object[0]);
            gwb.f(2981);
            this.b.a(true, 0);
        } else if (this.b.c() == 6) {
            this.b.a(false, 0);
        } else if (this.b.d()) {
            this.b.a(false, (int) HttpStatusCodes.STATUS_CODE_NOT_MODIFIED);
        }
    }

    //
    private boolean a(int i) {
        return this.b.a().f().b().c() == i;
    }

    // handoff - makes connection to called number from wifi?
    void a(PhoneAccountHandle phoneAccountHandle) {
        glk.c("Babel_telephony", "TeleHandoffWifiToCellular.callHandoffNumber", new Object[0]);
        gcq a = this.b.a();
        ConnectionRequest connectionRequest = new ConnectionRequest(phoneAccountHandle, gwb.F(a.n()), Bundle.EMPTY);
        if (a(1)) {
            gwb.aL().postDelayed(this.d, (long) gwb.a(this.a, "babel_handoff_sprint_timeout_millis", 4000));
        }
        Context d = a.d();
        RemoteConnection createRemoteOutgoingConnection = d.createRemoteOutgoingConnection(gwb.J(d), connectionRequest);
        if (createRemoteOutgoingConnection == null) {
            this.b.a(false, 321);
            return;
        }
        String e;
        CharSequence charSequence = null;
        if (a.j() instanceof gfj) {
            charSequence = ((gfj) a.j()).q();
        }
        if (TextUtils.isEmpty(charSequence)) {
            e = a.j().e();
        } else {
            CharSequence charSequence2 = charSequence;
        }
        this.b.a(new gel(this.a, createRemoteOutgoingConnection, e, a.s(), a.i(), a.g()));
    }

    public void c() {
        gwb.aL().removeCallbacks(this.d);
    }
}
