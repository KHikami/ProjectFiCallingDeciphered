package p000;

import android.telecom.Connection;
import android.telecom.DisconnectCause;
import android.telecom.RemoteConference;
import android.telecom.RemoteConference.Callback;
import android.telecom.RemoteConnection;

final class ges extends Callback {
    final /* synthetic */ ger f15087a;

    ges(ger ger) {
        this.f15087a = ger;
    }

    public void onStateChanged(RemoteConference remoteConference, int i, int i2) {
        String valueOf = String.valueOf(remoteConference);
        String valueOf2 = String.valueOf(Connection.stateToString(i));
        String valueOf3 = String.valueOf(Connection.stateToString(i2));
        glk.m17979c("Babel_telephony", new StringBuilder(((String.valueOf(valueOf).length() + 62) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("TeleRemoteConferenceWrapper.onStateChanged, conference: ").append(valueOf).append(", ").append(valueOf2).append(" -> ").append(valueOf3).toString(), new Object[0]);
        this.f15087a.m17419a(i2);
    }

    public void onDisconnected(RemoteConference remoteConference, DisconnectCause disconnectCause) {
        String valueOf = String.valueOf(remoteConference);
        String valueOf2 = String.valueOf(disconnectCause);
        glk.m17979c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 65) + String.valueOf(valueOf2).length()).append("TeleRemoteConferenceWrapper.onDisconnected, conference: ").append(valueOf).append(", cause: ").append(valueOf2).toString(), new Object[0]);
        this.f15087a.setDisconnected(disconnectCause);
    }

    public void onConnectionAdded(RemoteConference remoteConference, RemoteConnection remoteConnection) {
        String valueOf = String.valueOf(remoteConference);
        String valueOf2 = String.valueOf(remoteConnection);
        glk.m17979c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 73) + String.valueOf(valueOf2).length()).append("TeleRemoteConferenceWrapper.onConnectionAdded, conference: ").append(valueOf).append(", connection: ").append(valueOf2).toString(), new Object[0]);
        Connection a = gel.m17169a(remoteConnection, this.f15087a.f15085b);
        if (a == null) {
            valueOf = String.valueOf(remoteConnection);
            glk.m17981d("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 78).append("TeleRemoteConferenceWrapper.onConnectionAdded cannot find remote  connection: ").append(valueOf).toString(), new Object[0]);
            return;
        }
        this.f15087a.addConnection(a);
    }

    public void onConnectionRemoved(RemoteConference remoteConference, RemoteConnection remoteConnection) {
        String valueOf = String.valueOf(remoteConference);
        String valueOf2 = String.valueOf(remoteConnection);
        glk.m17979c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 75) + String.valueOf(valueOf2).length()).append("TeleRemoteConferenceWrapper.onConnectionRemoved, conference: ").append(valueOf).append(", connection: ").append(valueOf2).toString(), new Object[0]);
        Connection a = gel.m17169a(remoteConnection, this.f15087a.f15085b);
        if (a == null) {
            valueOf = String.valueOf(remoteConnection);
            glk.m17981d("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 80).append("TeleRemoteConferenceWrapper.onConnectionRemoved cannot find remote  connection: ").append(valueOf).toString(), new Object[0]);
            return;
        }
        this.f15087a.removeConnection(a);
    }

    public void onConnectionCapabilitiesChanged(RemoteConference remoteConference, int i) {
        String valueOf = String.valueOf(remoteConference);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 100).append("TeleRemoteConferenceWrapper.onConnectionCapabilitiesChanged, conference: ").append(valueOf).append(", capabilities: ").append(i).toString(), new Object[0]);
        this.f15087a.setConnectionCapabilities(i);
    }

    public void onConnectionPropertiesChanged(RemoteConference remoteConference, int i) {
        String valueOf = String.valueOf(remoteConference);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 96).append("TeleRemoteConferenceWrapper.onConnectionPropertiesChanged, conference: ").append(valueOf).append(", properties: ").append(i).toString(), new Object[0]);
        this.f15087a.setConnectionProperties(i);
    }

    public void onDestroyed(RemoteConference remoteConference) {
        String valueOf = String.valueOf(remoteConference);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 53).append("TeleRemoteConferenceWrapper.onDestroyed, conference: ").append(valueOf).toString(), new Object[0]);
        this.f15087a.f15084a.unregisterCallback(this.f15087a.f15086c);
        this.f15087a.destroy();
    }
}
