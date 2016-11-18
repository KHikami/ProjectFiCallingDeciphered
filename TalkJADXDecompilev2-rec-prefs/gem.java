package p000;

import android.net.Uri;
import android.telecom.Connection;
import android.telecom.DisconnectCause;
import android.telecom.RemoteConference;
import android.telecom.RemoteConnection;
import android.telecom.RemoteConnection.Callback;
import android.telecom.StatusHints;
import java.util.ArrayList;
import java.util.List;

final class gem extends Callback {
    final /* synthetic */ gel f14870a;

    gem(gel gel) {
        this.f14870a = gel;
    }

    public void onStateChanged(RemoteConnection remoteConnection, int i) {
        if (this.f14870a.f14866d != null) {
            String valueOf = String.valueOf(Connection.stateToString(this.f14870a.f14866d.getState()));
            String valueOf2 = String.valueOf(Connection.stateToString(i));
            String valueOf3 = String.valueOf(this.f14870a.f14866d);
            glk.m17979c("Babel_telephony", new StringBuilder(((String.valueOf(valueOf).length() + 37) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("TeleRemoteCall.onStateChanged, ").append(valueOf).append(" -> ").append(valueOf2).append(", ").append(valueOf3).toString(), new Object[0]);
            switch (i) {
                case 2:
                    this.f14870a.f14866d.setRinging();
                    break;
                case 3:
                    this.f14870a.f14866d.setDialing();
                    break;
                case 4:
                    this.f14870a.f14866d.setActive();
                    break;
                case 5:
                    this.f14870a.f14866d.setOnHold();
                    break;
            }
        }
        for (gcd a : this.f14870a.f14864b) {
            a.mo2188a(this.f14870a, i);
        }
    }

    public void onDisconnected(RemoteConnection remoteConnection, DisconnectCause disconnectCause) {
        String valueOf = String.valueOf(disconnectCause);
        String valueOf2 = String.valueOf(this.f14870a.f14866d);
        glk.m17979c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 40) + String.valueOf(valueOf2).length()).append("TeleRemoteCall.onDisconnected, cause: ").append(valueOf).append(", ").append(valueOf2).toString(), new Object[0]);
        if (this.f14870a.f14866d != null) {
            this.f14870a.f14866d.m16939a(this.f14870a.mo2220d(), this.f14870a.f14865c.m17406b());
        }
        if (this.f14870a.f14866d != null && this.f14870a.f14866d.m16964k() == null) {
            if (disconnectCause.getCode() == 1 && this.f14870a.m17195o()) {
                valueOf = String.valueOf(this.f14870a.f14866d);
                glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 53).append("TeleRemoteCall.onDisconnected, handing off to wifi., ").append(valueOf).toString(), new Object[0]);
                this.f14870a.f14865c.m17401a(3);
                gdc.m17023b(this.f14870a.f14863a, this.f14870a.f14866d, 3);
            } else {
                this.f14870a.f14866d.setDisconnected(disconnectCause);
                gwb.m1839a(this.f14870a.f14866d, disconnectCause);
            }
        }
        for (gcd a : this.f14870a.f14864b) {
            a.mo2189a(this.f14870a, disconnectCause);
        }
    }

    public void onRingbackRequested(RemoteConnection remoteConnection, boolean z) {
        String valueOf = String.valueOf(this.f14870a.f14866d);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 53).append("TeleRemoteCall.onRingbackRequested, ringback: ").append(z).append(", ").append(valueOf).toString(), new Object[0]);
        if (this.f14870a.f14866d != null) {
            this.f14870a.f14866d.setRingbackRequested(z);
        }
    }

    public void onConnectionCapabilitiesChanged(RemoteConnection remoteConnection, int i) {
        String valueOf = String.valueOf(this.f14870a.f14866d);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 75).append("TeleRemoteCall.onConnectionCapabilitiesChanged, capabilities: ").append(i).append(", ").append(valueOf).toString(), new Object[0]);
        if (this.f14870a.f14866d != null) {
            this.f14870a.f14866d.setConnectionCapabilities(i);
        }
    }

    public void onConnectionPropertiesChanged(RemoteConnection remoteConnection, int i) {
        String valueOf = String.valueOf(this.f14870a.f14866d);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 71).append("TeleRemoteCall.onConnectionPropertiesChanged, properties: ").append(i).append(", ").append(valueOf).toString(), new Object[0]);
        if (this.f14870a.mo2206a() != null) {
            this.f14870a.mo2206a().setConnectionProperties(i);
        }
    }

    public void onPostDialWait(RemoteConnection remoteConnection, String str) {
        String valueOf = String.valueOf(glk.m17974b(str));
        String valueOf2 = String.valueOf(this.f14870a.f14866d);
        glk.m17979c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 50) + String.valueOf(valueOf2).length()).append("TeleRemoteCall.onPostDialWait, remainingDigits: ").append(valueOf).append(", ").append(valueOf2).toString(), new Object[0]);
        if (this.f14870a.f14866d != null) {
            this.f14870a.f14866d.setPostDialWait(str);
        }
    }

    public void onVoipAudioChanged(RemoteConnection remoteConnection, boolean z) {
        String valueOf = String.valueOf(this.f14870a.f14866d);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 50).append("TeleRemoteCall.onVoipAudioChanged, isVoip: ").append(z).append(", ").append(valueOf).toString(), new Object[0]);
        if (this.f14870a.f14866d != null) {
            this.f14870a.f14866d.setAudioModeIsVoip(z);
        }
    }

    public void onStatusHintsChanged(RemoteConnection remoteConnection, StatusHints statusHints) {
        String valueOf = String.valueOf(this.f14870a.f14866d);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 37).append("TeleRemoteCall.onStatusHintsChanged, ").append(valueOf).toString(), new Object[0]);
        if (this.f14870a.f14866d != null) {
            this.f14870a.f14866d.setStatusHints(statusHints);
        }
    }

    public void onAddressChanged(RemoteConnection remoteConnection, Uri uri, int i) {
        String valueOf = String.valueOf(gwb.m2170e(uri));
        String valueOf2 = String.valueOf(this.f14870a.f14866d);
        glk.m17979c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 35) + String.valueOf(valueOf2).length()).append("TeleRemoteCall.onAddressChanged, ").append(valueOf).append(", ").append(valueOf2).toString(), new Object[0]);
        if (uri == null && i == 0 && this.f14870a.f14866d != null && (this.f14870a.f14866d.getState() == 1 || this.f14870a.f14866d.getState() == 0)) {
            glk.m17979c("Babel_telephony", "TeleRemoteCall.onAddressChanged, ignoring null address", new Object[0]);
            return;
        }
        if (!(this.f14870a.f14866d == null || this.f14870a.m17195o() || this.f14870a.f14866d.m16959f().m17139a(uri))) {
            String schemeSpecificPart;
            if (this.f14870a.f14866d.m16959f().m17155q()) {
                Uri uri2;
                gcq gcq = this.f14870a.f14866d;
                if (uri == null) {
                    uri2 = null;
                } else {
                    schemeSpecificPart = uri.getSchemeSpecificPart();
                    uri2 = (uri.getScheme().equals("tel") && glq.m18007a(gwb.m1400H(), schemeSpecificPart)) ? gwb.m1390F(glq.m18003a(schemeSpecificPart, glq.m18037i(gwb.m1400H()))) : uri;
                }
                gcq.setAddress(uri2, i);
            } else if (this.f14870a.f14866d.m16959f().m17153o()) {
                valueOf = "Babel_telephony";
                valueOf2 = "TeleRemoteCall.onAddressChanged, showing un-remapped number: ";
                schemeSpecificPart = String.valueOf(gwb.m1397G(this.f14870a.f14866d.m16959f().m17141c()));
                glk.m17979c(valueOf, schemeSpecificPart.length() != 0 ? valueOf2.concat(schemeSpecificPart) : new String(valueOf2), new Object[0]);
                this.f14870a.f14866d.setAddress(gwb.m1390F(this.f14870a.f14866d.m16959f().m17141c()), i);
            } else {
                this.f14870a.f14866d.setAddress(uri, i);
            }
        }
        this.f14870a.f14865c.m17402a(uri);
    }

    public void onCallerDisplayNameChanged(RemoteConnection remoteConnection, String str, int i) {
        String valueOf = String.valueOf(this.f14870a.f14866d);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 43).append("TeleRemoteCall.onCallerDisplayNameChanged, ").append(valueOf).toString(), new Object[0]);
        if (this.f14870a.f14866d != null) {
            this.f14870a.f14866d.setCallerDisplayName(str, i);
        }
    }

    public void onDestroyed(RemoteConnection remoteConnection) {
        String valueOf = String.valueOf(this.f14870a.f14866d);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 28).append("TeleRemoteCall.onDestroyed, ").append(valueOf).toString(), new Object[0]);
        if (remoteConnection != null) {
            remoteConnection.unregisterCallback(this.f14870a.f14867e);
        }
        for (gcd a : this.f14870a.f14864b) {
            a.mo2189a(this.f14870a, new DisconnectCause(2));
        }
        if (this.f14870a.f14866d != null && this.f14870a.f14866d.m16964k() == null) {
            this.f14870a.f14866d.destroy();
            this.f14870a.f14866d = null;
        }
    }

    public void onConferenceableConnectionsChanged(RemoteConnection remoteConnection, List<RemoteConnection> list) {
        String valueOf = String.valueOf(this.f14870a.f14866d);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 51).append("TeleRemoteCall.onConferenceableConnectionsChanged, ").append(valueOf).toString(), new Object[0]);
        if (this.f14870a.f14866d != null) {
            List arrayList = new ArrayList();
            for (RemoteConnection a : list) {
                gcq a2 = gel.m17169a(a, this.f14870a.f14866d.m16955d());
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            this.f14870a.f14866d.setConferenceableConnections(arrayList);
        }
    }

    public void onConferenceChanged(RemoteConnection remoteConnection, RemoteConference remoteConference) {
        String valueOf = String.valueOf(remoteConnection);
        String valueOf2 = String.valueOf(remoteConference);
        String valueOf3 = String.valueOf(this.f14870a.f14866d);
        glk.m17979c("Babel_telephony", new StringBuilder(((String.valueOf(valueOf).length() + 71) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("TeleRemoteCall.onConferenceChanged, remote connection: ").append(valueOf).append(", conference: ").append(valueOf2).append(", ").append(valueOf3).toString(), new Object[0]);
    }
}
