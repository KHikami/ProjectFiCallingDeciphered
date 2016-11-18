package defpackage;

import android.telecom.AudioState;
import android.telecom.Conference;
import android.telecom.Connection;
import android.telecom.PhoneAccountHandle;
import android.telecom.RemoteConference;
import android.telecom.RemoteConference.Callback;
import android.telecom.RemoteConnection;
import com.google.android.apps.hangouts.telephony.TeleConnectionService;

public final class ger extends Conference {
    final RemoteConference a;
    final TeleConnectionService b;
    final Callback c = new ges(this);

    public static ger a(RemoteConference remoteConference, TeleConnectionService teleConnectionService) {
        PhoneAccountHandle accountHandle;
        for (RemoteConnection a : remoteConference.getConnections()) {
            gcq a2 = gel.a(a, teleConnectionService);
            if (a2 != null && a2.e() != null) {
                accountHandle = a2.e().getAccountHandle();
                break;
            }
        }
        accountHandle = null;
        if (accountHandle == null) {
            String valueOf = String.valueOf(remoteConference);
            glk.d("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 101).append("TeleRemoteConferenceWrapper.createConferenceWrapper, didn't find phone account to add to conference: ").append(valueOf).toString(), new Object[0]);
        }
        return new ger(accountHandle, remoteConference, teleConnectionService);
    }

    private ger(PhoneAccountHandle phoneAccountHandle, RemoteConference remoteConference, TeleConnectionService teleConnectionService) {
        super(phoneAccountHandle);
        this.a = remoteConference;
        this.b = teleConnectionService;
        setConnectionCapabilities(remoteConference.getConnectionCapabilities());
        a(remoteConference.getState());
        remoteConference.registerCallback(this.c);
        for (RemoteConnection remoteConnection : remoteConference.getConnections()) {
            Connection a = gel.a(remoteConnection, teleConnectionService);
            if (a == null) {
                String valueOf = String.valueOf(remoteConnection);
                glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 78).append("TeleRemoteConferenceWrapper, failed to find connection for remote connection: ").append(valueOf).toString(), new Object[0]);
            } else if (!addConnection(a)) {
                String valueOf2 = String.valueOf(a);
                glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf2).length() + 66).append("TeleRemoteConferenceWrapper, failed to add conference connection: ").append(valueOf2).toString(), new Object[0]);
            }
        }
    }

    public void onDisconnect() {
        glk.c("Babel_telephony", "TeleRemoteConferenceWrapper.onDisconnect", new Object[0]);
        this.a.disconnect();
    }

    public void onSeparate(Connection connection) {
        String valueOf = String.valueOf(connection);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 52).append("TeleRemoteConferenceWrapper.onSeparate, connection: ").append(valueOf).toString(), new Object[0]);
        if (this.a != null && (connection instanceof gcq)) {
            gcc j = ((gcq) connection).j();
            if (j instanceof gel) {
                this.a.separate(((gel) j).n());
            }
        }
    }

    public void onHold() {
        glk.c("Babel_telephony", "TeleRemoteConferenceWrapper.onHold", new Object[0]);
        this.a.hold();
    }

    public void onUnhold() {
        glk.c("Babel_telephony", "TeleRemoteConferenceWrapper.onUnhold", new Object[0]);
        this.a.unhold();
    }

    public void onMerge() {
        glk.c("Babel_telephony", "TeleRemoteConferenceWrapper.onMerge", new Object[0]);
        this.a.merge();
    }

    public void onSwap() {
        glk.c("Babel_telephony", "TeleRemoteConferenceWrapper.onSwap", new Object[0]);
        this.a.swap();
    }

    public void onPlayDtmfTone(char c) {
        String str = "Babel_telephony";
        String str2 = "TeleRemoteConferenceWrapper.onPlayDtmfTone, ";
        String valueOf = String.valueOf(glk.b(String.valueOf(c)));
        glk.c(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        this.a.playDtmfTone(c);
    }

    public void onStopDtmfTone() {
        glk.c("Babel_telephony", "TeleRemoteConferenceWrapper.onStopDtmfTone", new Object[0]);
        this.a.stopDtmfTone();
    }

    public void onAudioStateChanged(AudioState audioState) {
        String valueOf = String.valueOf(audioState);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 56).append("TeleRemoteConferenceWrapper.onAudioStateChanged, state: ").append(valueOf).toString(), new Object[0]);
        this.a.setAudioState(audioState);
    }

    void a(int i) {
        switch (i) {
            case 4:
                setActive();
                return;
            case 5:
                setOnHold();
                return;
            case 6:
                return;
            default:
                glk.d("Babel_telephony", "TeleRemoteConferenceWrapper.updateState. unrecognized state for Conference: " + i, new Object[0]);
                return;
        }
    }
}
