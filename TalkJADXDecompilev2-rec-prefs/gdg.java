package p000;

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
    final Context f14747a;
    gdc f14748b;
    private final TelecomManager f14749c;
    private final Runnable f14750d = new gdh(this);

    gdg(Context context, TelecomManager telecomManager) {
        this.f14747a = context;
        this.f14749c = telecomManager;
    }

    void m17038a(gdc gdc) {
        this.f14748b = gdc;
    }

    void m17036a() {
        PhoneAccountHandle defaultOutgoingPhoneAccount;
        glk.m17979c("Babel_telephony", "TeleHandoffWifiToCellular.startHandoff", new Object[0]);
        gcq a = this.f14748b.m17024a();
        if (a.m16960g()) {
            defaultOutgoingPhoneAccount = this.f14749c.getDefaultOutgoingPhoneAccount("tel");
        } else {
            defaultOutgoingPhoneAccount = a.m16957e().getAccountHandle();
        }
        String valueOf = String.valueOf(defaultOutgoingPhoneAccount);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 59).append("TeleHandoffWifiToCellular.startHandoff, got phone account: ").append(valueOf).toString(), new Object[0]);
        if (defaultOutgoingPhoneAccount == null) {
            glk.m17979c("Babel_telephony", "TeleHandoffWifiToCellular.startHandoff, no phone account.", new Object[0]);
            this.f14748b.m17028a(false, 225);
        } else if (!this.f14748b.m17033f()) {
            glk.m17979c("Babel_telephony", "TeleHandoffWifiToCellular.startHandoff, disallowed by config.", new Object[0]);
            this.f14748b.m17028a(false, 224);
        } else if (TextUtils.isEmpty(a.m16967n())) {
            glk.m17979c("Babel_telephony", "TeleHandoffWifiToCellular.startHandoff, no handoff number", new Object[0]);
            this.f14748b.m17028a(false, 320);
        } else {
            int b = this.f14748b.m17029b();
            if (b == 3 || b == 4) {
                int size = a.m16955d().getAllConnections().size();
                if (size > 1) {
                    glk.m17979c("Babel_telephony", "TeleHandoffWifiToCellular.startHandoff, call count: " + size + ", fail handoff", new Object[0]);
                    this.f14748b.m17028a(false, 221);
                    return;
                }
                gck.m16927a(this.f14747a, new gdi(this, defaultOutgoingPhoneAccount));
                return;
            }
            String str = "Babel_telephony";
            valueOf = "TeleHandoffWifiToCellular.startHandoff, not possible for call state: ";
            String valueOf2 = String.valueOf(Connection.stateToString(b));
            glk.m17979c(str, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), new Object[0]);
            this.f14748b.m17028a(false, 227);
        }
    }

    public void mo2186b() {
        if (this.f14748b.m17029b() == 6) {
            this.f14748b.m17028a(true, 0);
        } else if (this.f14748b.m17030c() == 4 && m17035a(2)) {
            glk.m17979c("Babel_telephony", "TeleHandoffWifiToCellular.checkHandoffComplete, handoff is complete - carrier is T-Mobile and new call is active.", new Object[0]);
            gwb.m2198f(2981);
            this.f14748b.m17028a(true, 0);
        } else if (this.f14748b.m17030c() == 6) {
            this.f14748b.m17028a(false, 0);
        } else if (this.f14748b.m17031d()) {
            this.f14748b.m17028a(false, (int) HttpStatusCodes.STATUS_CODE_NOT_MODIFIED);
        }
    }

    private boolean m17035a(int i) {
        return this.f14748b.m17024a().m16959f().m17140b().m17121c() == i;
    }

    void m17037a(PhoneAccountHandle phoneAccountHandle) {
        glk.m17979c("Babel_telephony", "TeleHandoffWifiToCellular.callHandoffNumber", new Object[0]);
        gcq a = this.f14748b.m17024a();
        ConnectionRequest connectionRequest = new ConnectionRequest(phoneAccountHandle, gwb.m1390F(a.m16967n()), Bundle.EMPTY);
        if (m17035a(1)) {
            gwb.aL().postDelayed(this.f14750d, (long) gwb.m1492a(this.f14747a, "babel_handoff_sprint_timeout_millis", 4000));
        }
        Context d = a.m16955d();
        RemoteConnection createRemoteOutgoingConnection = d.createRemoteOutgoingConnection(gwb.m1409J(d), connectionRequest);
        if (createRemoteOutgoingConnection == null) {
            this.f14748b.m17028a(false, 321);
            return;
        }
        String e;
        CharSequence charSequence = null;
        if (a.m16963j() instanceof gfj) {
            charSequence = ((gfj) a.m16963j()).m17553q();
        }
        if (TextUtils.isEmpty(charSequence)) {
            e = a.m16963j().mo2221e();
        } else {
            CharSequence charSequence2 = charSequence;
        }
        this.f14748b.m17025a(new gel(this.f14747a, createRemoteOutgoingConnection, e, a.m16972s(), a.m16962i(), a.m16960g()));
    }

    public void mo2187c() {
        gwb.aL().removeCallbacks(this.f14750d);
    }
}
