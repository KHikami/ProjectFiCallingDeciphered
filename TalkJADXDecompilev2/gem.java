package defpackage;

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
    final /* synthetic */ gel a;

    gem(gel gel) {
        this.a = gel;
    }

    public void onStateChanged(RemoteConnection remoteConnection, int i) {
        if (this.a.d != null) {
            String valueOf = String.valueOf(Connection.stateToString(this.a.d.getState()));
            String valueOf2 = String.valueOf(Connection.stateToString(i));
            String valueOf3 = String.valueOf(this.a.d);
            glk.c("Babel_telephony", new StringBuilder(((String.valueOf(valueOf).length() + 37) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("TeleRemoteCall.onStateChanged, ").append(valueOf).append(" -> ").append(valueOf2).append(", ").append(valueOf3).toString(), new Object[0]);
            switch (i) {
                case 2:
                    this.a.d.setRinging();
                    break;
                case 3:
                    this.a.d.setDialing();
                    break;
                case 4:
                    this.a.d.setActive();
                    break;
                case 5:
                    this.a.d.setOnHold();
                    break;
            }
        }
        for (gcd a : this.a.b) {
            a.a(this.a, i);
        }
    }

    public void onDisconnected(RemoteConnection remoteConnection, DisconnectCause disconnectCause) {
        String valueOf = String.valueOf(disconnectCause);
        String valueOf2 = String.valueOf(this.a.d);
        glk.c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 40) + String.valueOf(valueOf2).length()).append("TeleRemoteCall.onDisconnected, cause: ").append(valueOf).append(", ").append(valueOf2).toString(), new Object[0]);
        if (this.a.d != null) {
            this.a.d.a(this.a.d(), this.a.c.b());
        }
        if (this.a.d != null && this.a.d.k() == null) {
            if (disconnectCause.getCode() == 1 && this.a.o()) {
                valueOf = String.valueOf(this.a.d);
                glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 53).append("TeleRemoteCall.onDisconnected, handing off to wifi., ").append(valueOf).toString(), new Object[0]);
                this.a.c.a(3);
                gdc.b(this.a.a, this.a.d, 3);
            } else {
                this.a.d.setDisconnected(disconnectCause);
                gwb.a(this.a.d, disconnectCause);
            }
        }
        for (gcd a : this.a.b) {
            a.a(this.a, disconnectCause);
        }
    }

    public void onRingbackRequested(RemoteConnection remoteConnection, boolean z) {
        String valueOf = String.valueOf(this.a.d);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 53).append("TeleRemoteCall.onRingbackRequested, ringback: ").append(z).append(", ").append(valueOf).toString(), new Object[0]);
        if (this.a.d != null) {
            this.a.d.setRingbackRequested(z);
        }
    }

    public void onConnectionCapabilitiesChanged(RemoteConnection remoteConnection, int i) {
        String valueOf = String.valueOf(this.a.d);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 75).append("TeleRemoteCall.onConnectionCapabilitiesChanged, capabilities: ").append(i).append(", ").append(valueOf).toString(), new Object[0]);
        if (this.a.d != null) {
            this.a.d.setConnectionCapabilities(i);
        }
    }

    public void onConnectionPropertiesChanged(RemoteConnection remoteConnection, int i) {
        String valueOf = String.valueOf(this.a.d);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 71).append("TeleRemoteCall.onConnectionPropertiesChanged, properties: ").append(i).append(", ").append(valueOf).toString(), new Object[0]);
        if (this.a.a() != null) {
            this.a.a().setConnectionProperties(i);
        }
    }

    public void onPostDialWait(RemoteConnection remoteConnection, String str) {
        String valueOf = String.valueOf(glk.b(str));
        String valueOf2 = String.valueOf(this.a.d);
        glk.c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 50) + String.valueOf(valueOf2).length()).append("TeleRemoteCall.onPostDialWait, remainingDigits: ").append(valueOf).append(", ").append(valueOf2).toString(), new Object[0]);
        if (this.a.d != null) {
            this.a.d.setPostDialWait(str);
        }
    }

    public void onVoipAudioChanged(RemoteConnection remoteConnection, boolean z) {
        String valueOf = String.valueOf(this.a.d);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 50).append("TeleRemoteCall.onVoipAudioChanged, isVoip: ").append(z).append(", ").append(valueOf).toString(), new Object[0]);
        if (this.a.d != null) {
            this.a.d.setAudioModeIsVoip(z);
        }
    }

    public void onStatusHintsChanged(RemoteConnection remoteConnection, StatusHints statusHints) {
        String valueOf = String.valueOf(this.a.d);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 37).append("TeleRemoteCall.onStatusHintsChanged, ").append(valueOf).toString(), new Object[0]);
        if (this.a.d != null) {
            this.a.d.setStatusHints(statusHints);
        }
    }

    public void onAddressChanged(RemoteConnection remoteConnection, Uri uri, int i) {
        String valueOf = String.valueOf(gwb.e(uri));
        String valueOf2 = String.valueOf(this.a.d);
        glk.c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 35) + String.valueOf(valueOf2).length()).append("TeleRemoteCall.onAddressChanged, ").append(valueOf).append(", ").append(valueOf2).toString(), new Object[0]);
        if (uri == null && i == 0 && this.a.d != null && (this.a.d.getState() == 1 || this.a.d.getState() == 0)) {
            glk.c("Babel_telephony", "TeleRemoteCall.onAddressChanged, ignoring null address", new Object[0]);
            return;
        }
        if (!(this.a.d == null || this.a.o() || this.a.d.f().a(uri))) {
            String schemeSpecificPart;
            if (this.a.d.f().q()) {
                Uri uri2;
                gcq gcq = this.a.d;
                if (uri == null) {
                    uri2 = null;
                } else {
                    schemeSpecificPart = uri.getSchemeSpecificPart();
                    uri2 = (uri.getScheme().equals("tel") && glq.a(gwb.H(), schemeSpecificPart)) ? gwb.F(glq.a(schemeSpecificPart, glq.i(gwb.H()))) : uri;
                }
                gcq.setAddress(uri2, i);
            } else if (this.a.d.f().o()) {
                valueOf = "Babel_telephony";
                valueOf2 = "TeleRemoteCall.onAddressChanged, showing un-remapped number: ";
                schemeSpecificPart = String.valueOf(gwb.G(this.a.d.f().c()));
                glk.c(valueOf, schemeSpecificPart.length() != 0 ? valueOf2.concat(schemeSpecificPart) : new String(valueOf2), new Object[0]);
                this.a.d.setAddress(gwb.F(this.a.d.f().c()), i);
            } else {
                this.a.d.setAddress(uri, i);
            }
        }
        this.a.c.a(uri);
    }

    public void onCallerDisplayNameChanged(RemoteConnection remoteConnection, String str, int i) {
        String valueOf = String.valueOf(this.a.d);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 43).append("TeleRemoteCall.onCallerDisplayNameChanged, ").append(valueOf).toString(), new Object[0]);
        if (this.a.d != null) {
            this.a.d.setCallerDisplayName(str, i);
        }
    }

    public void onDestroyed(RemoteConnection remoteConnection) {
        String valueOf = String.valueOf(this.a.d);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 28).append("TeleRemoteCall.onDestroyed, ").append(valueOf).toString(), new Object[0]);
        if (remoteConnection != null) {
            remoteConnection.unregisterCallback(this.a.e);
        }
        for (gcd a : this.a.b) {
            a.a(this.a, new DisconnectCause(2));
        }
        if (this.a.d != null && this.a.d.k() == null) {
            this.a.d.destroy();
            this.a.d = null;
        }
    }

    public void onConferenceableConnectionsChanged(RemoteConnection remoteConnection, List<RemoteConnection> list) {
        String valueOf = String.valueOf(this.a.d);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 51).append("TeleRemoteCall.onConferenceableConnectionsChanged, ").append(valueOf).toString(), new Object[0]);
        if (this.a.d != null) {
            List arrayList = new ArrayList();
            for (RemoteConnection a : list) {
                gcq a2 = gel.a(a, this.a.d.d());
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            this.a.d.setConferenceableConnections(arrayList);
        }
    }

    public void onConferenceChanged(RemoteConnection remoteConnection, RemoteConference remoteConference) {
        String valueOf = String.valueOf(remoteConnection);
        String valueOf2 = String.valueOf(remoteConference);
        String valueOf3 = String.valueOf(this.a.d);
        glk.c("Babel_telephony", new StringBuilder(((String.valueOf(valueOf).length() + 71) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("TeleRemoteCall.onConferenceChanged, remote connection: ").append(valueOf).append(", conference: ").append(valueOf2).append(", ").append(valueOf3).toString(), new Object[0]);
    }
}
