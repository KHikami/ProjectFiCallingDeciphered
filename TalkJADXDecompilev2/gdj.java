package defpackage;

import android.content.Context;
import android.net.Uri;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.DisconnectCause;
import android.telecom.RemoteConnection;
import com.google.android.apps.hangouts.telephony.TeleConnectionService;
import java.util.concurrent.TimeUnit;

public final class gdj {
    private final Context a;
    private final gcv b;
    private final gcq c;

    public gdj(Context context, TeleConnectionService teleConnectionService, ConnectionRequest connectionRequest, gcv gcv) {
        this.a = context;
        this.b = gcv;
        this.c = new gcq(new gef(teleConnectionService, connectionRequest, new gec(teleConnectionService, get.a(teleConnectionService)), true));
        this.c.b();
    }

    public gcq a() {
        int i;
        glk.c("Babel_telephony", "TeleIncomingCellCallRequest.startRequest", new Object[0]);
        if (this.b != null && this.b.a(this.c.e(), false)) {
            glk.c("Babel_telephony", "TeleIncomingCellCallRequest.startRequest, call is duplicate", new Object[0]);
            c();
            this.c.setDisconnected(new DisconnectCause(4, null));
            i = 2446;
        } else if (b()) {
            glk.c("Babel_telephony", "TeleIncomingCellCallRequest.startRequest, ongoing call from the same number", new Object[0]);
            c();
            this.c.setDisconnected(new DisconnectCause(4, null));
            i = 2446;
        } else {
            boolean z;
            String b = gwb.b(this.a, "babel_spam_caller_id", "+14082560700");
            String d = this.c.f().d();
            long g;
            if (this.c.h().a(this.a)) {
                if (!gwb.f(d, b)) {
                    glk.c("Babel_telephony", String.format("TeleIncomingCellCallRequest.blockSpamCallsToDarkNumber, not blocking. Incoming caller ID: %s, didn't exactly match blocked caller ID: %s", new Object[]{gwb.G(d), b}), new Object[0]);
                    z = false;
                }
                g = ggc.a(this.a).g();
                if (g <= 0) {
                    i = (int) ((System.currentTimeMillis() - g) / TimeUnit.DAYS.toMillis(1));
                } else {
                    i = -1;
                }
                if (i != -1) {
                    glk.c("Babel_telephony", "TeleIncomingCellCallRequest.blockSpamCallsToDarkNumber, blocking. Caller ID matches and user never made an emergency call", new Object[0]);
                    z = true;
                } else {
                    if (i <= gwb.a(this.a, "babel_days_to_unblock_spam", 30)) {
                        glk.c("Babel_telephony", String.format("TeleIncomingCellCallRequest.blockSpamCallsToDarkNumber, blocking. Caller ID matches and user made an emergency call %d days ago which is greater than the threshold: %d", new Object[]{Integer.valueOf(i), Integer.valueOf(gwb.a(this.a, "babel_days_to_unblock_spam", 30))}), new Object[0]);
                        z = true;
                    } else {
                        glk.c("Babel_telephony", String.format("TeleIncomingCellCallRequest.blockSpamCallsToDarkNumber, not blocking even though caller ID matches. Use made an emergency call %d days ago which is less than the threshold: %d", new Object[]{Integer.valueOf(i), Integer.valueOf(gwb.a(this.a, "babel_days_to_unblock_spam", 30))}), new Object[0]);
                        z = false;
                    }
                }
            } else {
                if (!gwb.g(d, b)) {
                    glk.c("Babel_telephony", String.format("TeleIncomingCellCallRequest.blockSpamCallsToDarkNumber, not blocking. Incoming caller ID: %s, didn't fuzzy match blocked caller ID: %s", new Object[]{gwb.G(d), b}), new Object[0]);
                    z = false;
                }
                g = ggc.a(this.a).g();
                if (g <= 0) {
                    i = -1;
                } else {
                    i = (int) ((System.currentTimeMillis() - g) / TimeUnit.DAYS.toMillis(1));
                }
                if (i != -1) {
                    if (i <= gwb.a(this.a, "babel_days_to_unblock_spam", 30)) {
                        glk.c("Babel_telephony", String.format("TeleIncomingCellCallRequest.blockSpamCallsToDarkNumber, not blocking even though caller ID matches. Use made an emergency call %d days ago which is less than the threshold: %d", new Object[]{Integer.valueOf(i), Integer.valueOf(gwb.a(this.a, "babel_days_to_unblock_spam", 30))}), new Object[0]);
                        z = false;
                    } else {
                        glk.c("Babel_telephony", String.format("TeleIncomingCellCallRequest.blockSpamCallsToDarkNumber, blocking. Caller ID matches and user made an emergency call %d days ago which is greater than the threshold: %d", new Object[]{Integer.valueOf(i), Integer.valueOf(gwb.a(this.a, "babel_days_to_unblock_spam", 30))}), new Object[0]);
                        z = true;
                    }
                } else {
                    glk.c("Babel_telephony", "TeleIncomingCellCallRequest.blockSpamCallsToDarkNumber, blocking. Caller ID matches and user never made an emergency call", new Object[0]);
                    z = true;
                }
            }
            if (z) {
                glk.c("Babel_telephony", "TeleIncomingCellCallRequest.startRequest, call is spam to dark number", new Object[0]);
                c();
                this.c.setDisconnected(new DisconnectCause(4, null));
                i = 2338;
            } else {
                if (gwb.a(this.a, "babel_remote_connection_allowed", true)) {
                    Context d2 = this.c.d();
                    RemoteConnection createRemoteIncomingConnection = d2.createRemoteIncomingConnection(gwb.J(d2), this.c.e());
                    if (createRemoteIncomingConnection == null) {
                        glk.c("Babel_telephony", "TeleIncomingCellCallRequest.createRemoteConnection, remoteConnection is null", new Object[0]);
                        this.c.setDisconnected(new DisconnectCause(10));
                    } else {
                        glk.c("Babel_telephony", "TeleIncomingCellCallRequest.createRemoteConnection", new Object[0]);
                        this.c.a(new gel(this.a, createRemoteIncomingConnection, null, null, this.c.i(), true));
                    }
                } else {
                    glk.c("Babel_telephony", "TeleIncomingCellCallRequest.createRemoteConnection, remote connection disallowed by gservices", new Object[0]);
                    this.c.setDisconnected(new DisconnectCause(10));
                }
                gwb.a(this.a, this.c);
                i = 2338;
            }
        }
        gwb.a(this.a, ggc.a(this.a).b(), this.c.f().c(), i);
        return this.c;
    }

    private boolean b() {
        glk.c("Babel_telephony", "TeleIncomingCellCallRequest.hasOnGoingCallFromSameNumber", new Object[0]);
        for (Connection connection : this.c.d().getAllConnections()) {
            if (connection instanceof gcq) {
                gcq gcq = (gcq) connection;
                if (gcq.z() <= gcv.a(this.a)) {
                    String schemeSpecificPart;
                    String scheme;
                    String schemeSpecificPart2;
                    Uri address = this.c.e().getAddress();
                    Uri address2 = gcq.e().getAddress();
                    String scheme2 = address != null ? address.getScheme() : null;
                    if (address != null) {
                        schemeSpecificPart = address.getSchemeSpecificPart();
                    } else {
                        schemeSpecificPart = null;
                    }
                    if (address2 != null) {
                        scheme = address2.getScheme();
                    } else {
                        scheme = null;
                    }
                    if (address2 != null) {
                        schemeSpecificPart2 = address2.getSchemeSpecificPart();
                    } else {
                        schemeSpecificPart2 = null;
                    }
                    if (gcv.a(scheme2, schemeSpecificPart, scheme, schemeSpecificPart2)) {
                        glk.c("Babel_telephony", "TeleIncomingCellCallRequest.hasOnGoingCallFromSameNumber, duplicate call", new Object[0]);
                        return true;
                    }
                } else {
                    continue;
                }
            } else {
                glk.c("Babel_telephony", "TeleIncomingCellCallRequest.hasOnGoingCallFromSameNumber, not TeleConnection", new Object[0]);
            }
        }
        return false;
    }

    private void c() {
        Context d = this.c.d();
        RemoteConnection createRemoteIncomingConnection = d.createRemoteIncomingConnection(gwb.J(d), this.c.e());
        if (createRemoteIncomingConnection != null) {
            glk.c("Babel_telephony", "TeleIncomingCellCallRequest.rejectCanceledCellularCall, rejecting call", new Object[0]);
            createRemoteIncomingConnection.reject();
        }
    }
}
