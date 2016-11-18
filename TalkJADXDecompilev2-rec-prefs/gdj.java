package p000;

import android.content.Context;
import android.net.Uri;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.DisconnectCause;
import android.telecom.RemoteConnection;
import com.google.android.apps.hangouts.telephony.TeleConnectionService;
import java.util.concurrent.TimeUnit;

public final class gdj {
    private final Context f14754a;
    private final gcv f14755b;
    private final gcq f14756c;

    public gdj(Context context, TeleConnectionService teleConnectionService, ConnectionRequest connectionRequest, gcv gcv) {
        this.f14754a = context;
        this.f14755b = gcv;
        this.f14756c = new gcq(new gef(teleConnectionService, connectionRequest, new gec(teleConnectionService, get.m17420a(teleConnectionService)), true));
        this.f14756c.m16947b();
    }

    public gcq m17044a() {
        int i;
        glk.m17979c("Babel_telephony", "TeleIncomingCellCallRequest.startRequest", new Object[0]);
        if (this.f14755b != null && this.f14755b.m16989a(this.f14756c.m16957e(), false)) {
            glk.m17979c("Babel_telephony", "TeleIncomingCellCallRequest.startRequest, call is duplicate", new Object[0]);
            m17043c();
            this.f14756c.setDisconnected(new DisconnectCause(4, null));
            i = 2446;
        } else if (m17042b()) {
            glk.m17979c("Babel_telephony", "TeleIncomingCellCallRequest.startRequest, ongoing call from the same number", new Object[0]);
            m17043c();
            this.f14756c.setDisconnected(new DisconnectCause(4, null));
            i = 2446;
        } else {
            boolean z;
            String b = gwb.m1998b(this.f14754a, "babel_spam_caller_id", "+14082560700");
            String d = this.f14756c.m16959f().m17142d();
            long g;
            if (this.f14756c.m16961h().m17118a(this.f14754a)) {
                if (!gwb.m2207f(d, b)) {
                    glk.m17979c("Babel_telephony", String.format("TeleIncomingCellCallRequest.blockSpamCallsToDarkNumber, not blocking. Incoming caller ID: %s, didn't exactly match blocked caller ID: %s", new Object[]{gwb.m1397G(d), b}), new Object[0]);
                    z = false;
                }
                g = ggc.m17608a(this.f14754a).m17631g();
                if (g <= 0) {
                    i = (int) ((System.currentTimeMillis() - g) / TimeUnit.DAYS.toMillis(1));
                } else {
                    i = -1;
                }
                if (i != -1) {
                    glk.m17979c("Babel_telephony", "TeleIncomingCellCallRequest.blockSpamCallsToDarkNumber, blocking. Caller ID matches and user never made an emergency call", new Object[0]);
                    z = true;
                } else {
                    if (i <= gwb.m1492a(this.f14754a, "babel_days_to_unblock_spam", 30)) {
                        glk.m17979c("Babel_telephony", String.format("TeleIncomingCellCallRequest.blockSpamCallsToDarkNumber, blocking. Caller ID matches and user made an emergency call %d days ago which is greater than the threshold: %d", new Object[]{Integer.valueOf(i), Integer.valueOf(gwb.m1492a(this.f14754a, "babel_days_to_unblock_spam", 30))}), new Object[0]);
                        z = true;
                    } else {
                        glk.m17979c("Babel_telephony", String.format("TeleIncomingCellCallRequest.blockSpamCallsToDarkNumber, not blocking even though caller ID matches. Use made an emergency call %d days ago which is less than the threshold: %d", new Object[]{Integer.valueOf(i), Integer.valueOf(gwb.m1492a(this.f14754a, "babel_days_to_unblock_spam", 30))}), new Object[0]);
                        z = false;
                    }
                }
            } else {
                if (!gwb.m2225g(d, b)) {
                    glk.m17979c("Babel_telephony", String.format("TeleIncomingCellCallRequest.blockSpamCallsToDarkNumber, not blocking. Incoming caller ID: %s, didn't fuzzy match blocked caller ID: %s", new Object[]{gwb.m1397G(d), b}), new Object[0]);
                    z = false;
                }
                g = ggc.m17608a(this.f14754a).m17631g();
                if (g <= 0) {
                    i = -1;
                } else {
                    i = (int) ((System.currentTimeMillis() - g) / TimeUnit.DAYS.toMillis(1));
                }
                if (i != -1) {
                    if (i <= gwb.m1492a(this.f14754a, "babel_days_to_unblock_spam", 30)) {
                        glk.m17979c("Babel_telephony", String.format("TeleIncomingCellCallRequest.blockSpamCallsToDarkNumber, not blocking even though caller ID matches. Use made an emergency call %d days ago which is less than the threshold: %d", new Object[]{Integer.valueOf(i), Integer.valueOf(gwb.m1492a(this.f14754a, "babel_days_to_unblock_spam", 30))}), new Object[0]);
                        z = false;
                    } else {
                        glk.m17979c("Babel_telephony", String.format("TeleIncomingCellCallRequest.blockSpamCallsToDarkNumber, blocking. Caller ID matches and user made an emergency call %d days ago which is greater than the threshold: %d", new Object[]{Integer.valueOf(i), Integer.valueOf(gwb.m1492a(this.f14754a, "babel_days_to_unblock_spam", 30))}), new Object[0]);
                        z = true;
                    }
                } else {
                    glk.m17979c("Babel_telephony", "TeleIncomingCellCallRequest.blockSpamCallsToDarkNumber, blocking. Caller ID matches and user never made an emergency call", new Object[0]);
                    z = true;
                }
            }
            if (z) {
                glk.m17979c("Babel_telephony", "TeleIncomingCellCallRequest.startRequest, call is spam to dark number", new Object[0]);
                m17043c();
                this.f14756c.setDisconnected(new DisconnectCause(4, null));
                i = 2338;
            } else {
                if (gwb.m1906a(this.f14754a, "babel_remote_connection_allowed", true)) {
                    Context d2 = this.f14756c.m16955d();
                    RemoteConnection createRemoteIncomingConnection = d2.createRemoteIncomingConnection(gwb.m1409J(d2), this.f14756c.m16957e());
                    if (createRemoteIncomingConnection == null) {
                        glk.m17979c("Babel_telephony", "TeleIncomingCellCallRequest.createRemoteConnection, remoteConnection is null", new Object[0]);
                        this.f14756c.setDisconnected(new DisconnectCause(10));
                    } else {
                        glk.m17979c("Babel_telephony", "TeleIncomingCellCallRequest.createRemoteConnection", new Object[0]);
                        this.f14756c.m16940a(new gel(this.f14754a, createRemoteIncomingConnection, null, null, this.f14756c.m16962i(), true));
                    }
                } else {
                    glk.m17979c("Babel_telephony", "TeleIncomingCellCallRequest.createRemoteConnection, remote connection disallowed by gservices", new Object[0]);
                    this.f14756c.setDisconnected(new DisconnectCause(10));
                }
                gwb.m1751a(this.f14754a, this.f14756c);
                i = 2338;
            }
        }
        gwb.m1745a(this.f14754a, ggc.m17608a(this.f14754a).m17618b(), this.f14756c.m16959f().m17141c(), i);
        return this.f14756c;
    }

    private boolean m17042b() {
        glk.m17979c("Babel_telephony", "TeleIncomingCellCallRequest.hasOnGoingCallFromSameNumber", new Object[0]);
        for (Connection connection : this.f14756c.m16955d().getAllConnections()) {
            if (connection instanceof gcq) {
                gcq gcq = (gcq) connection;
                if (gcq.m16979z() <= gcv.m16983a(this.f14754a)) {
                    String schemeSpecificPart;
                    String scheme;
                    String schemeSpecificPart2;
                    Uri address = this.f14756c.m16957e().getAddress();
                    Uri address2 = gcq.m16957e().getAddress();
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
                    if (gcv.m16986a(scheme2, schemeSpecificPart, scheme, schemeSpecificPart2)) {
                        glk.m17979c("Babel_telephony", "TeleIncomingCellCallRequest.hasOnGoingCallFromSameNumber, duplicate call", new Object[0]);
                        return true;
                    }
                } else {
                    continue;
                }
            } else {
                glk.m17979c("Babel_telephony", "TeleIncomingCellCallRequest.hasOnGoingCallFromSameNumber, not TeleConnection", new Object[0]);
            }
        }
        return false;
    }

    private void m17043c() {
        Context d = this.f14756c.m16955d();
        RemoteConnection createRemoteIncomingConnection = d.createRemoteIncomingConnection(gwb.m1409J(d), this.f14756c.m16957e());
        if (createRemoteIncomingConnection != null) {
            glk.m17979c("Babel_telephony", "TeleIncomingCellCallRequest.rejectCanceledCellularCall, rejecting call", new Object[0]);
            createRemoteIncomingConnection.reject();
        }
    }
}
