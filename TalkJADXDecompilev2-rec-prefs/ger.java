package p000;

import android.telecom.AudioState;
import android.telecom.Conference;
import android.telecom.Connection;
import android.telecom.PhoneAccountHandle;
import android.telecom.RemoteConference;
import android.telecom.RemoteConference.Callback;
import android.telecom.RemoteConnection;
import com.google.android.apps.hangouts.telephony.TeleConnectionService;

public final class ger extends Conference {
    final RemoteConference f15084a;
    final TeleConnectionService f15085b;
    final Callback f15086c = new ges(this);

    public static ger m17418a(RemoteConference remoteConference, TeleConnectionService teleConnectionService) {
        PhoneAccountHandle accountHandle;
        for (RemoteConnection a : remoteConference.getConnections()) {
            gcq a2 = gel.m17169a(a, teleConnectionService);
            if (a2 != null && a2.m16957e() != null) {
                accountHandle = a2.m16957e().getAccountHandle();
                break;
            }
        }
        accountHandle = null;
        if (accountHandle == null) {
            String valueOf = String.valueOf(remoteConference);
            glk.m17981d("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 101).append("TeleRemoteConferenceWrapper.createConferenceWrapper, didn't find phone account to add to conference: ").append(valueOf).toString(), new Object[0]);
        }
        return new ger(accountHandle, remoteConference, teleConnectionService);
    }

    private ger(PhoneAccountHandle phoneAccountHandle, RemoteConference remoteConference, TeleConnectionService teleConnectionService) {
        super(phoneAccountHandle);
        this.f15084a = remoteConference;
        this.f15085b = teleConnectionService;
        setConnectionCapabilities(remoteConference.getConnectionCapabilities());
        m17419a(remoteConference.getState());
        remoteConference.registerCallback(this.f15086c);
        for (RemoteConnection remoteConnection : remoteConference.getConnections()) {
            Connection a = gel.m17169a(remoteConnection, teleConnectionService);
            if (a == null) {
                String valueOf = String.valueOf(remoteConnection);
                glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 78).append("TeleRemoteConferenceWrapper, failed to find connection for remote connection: ").append(valueOf).toString(), new Object[0]);
            } else if (!addConnection(a)) {
                String valueOf2 = String.valueOf(a);
                glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf2).length() + 66).append("TeleRemoteConferenceWrapper, failed to add conference connection: ").append(valueOf2).toString(), new Object[0]);
            }
        }
    }

    public void onDisconnect() {
        glk.m17979c("Babel_telephony", "TeleRemoteConferenceWrapper.onDisconnect", new Object[0]);
        this.f15084a.disconnect();
    }

    public void onSeparate(Connection connection) {
        String valueOf = String.valueOf(connection);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 52).append("TeleRemoteConferenceWrapper.onSeparate, connection: ").append(valueOf).toString(), new Object[0]);
        if (this.f15084a != null && (connection instanceof gcq)) {
            gcc j = ((gcq) connection).m16963j();
            if (j instanceof gel) {
                this.f15084a.separate(((gel) j).m17194n());
            }
        }
    }

    public void onHold() {
        glk.m17979c("Babel_telephony", "TeleRemoteConferenceWrapper.onHold", new Object[0]);
        this.f15084a.hold();
    }

    public void onUnhold() {
        glk.m17979c("Babel_telephony", "TeleRemoteConferenceWrapper.onUnhold", new Object[0]);
        this.f15084a.unhold();
    }

    public void onMerge() {
        glk.m17979c("Babel_telephony", "TeleRemoteConferenceWrapper.onMerge", new Object[0]);
        this.f15084a.merge();
    }

    public void onSwap() {
        glk.m17979c("Babel_telephony", "TeleRemoteConferenceWrapper.onSwap", new Object[0]);
        this.f15084a.swap();
    }

    public void onPlayDtmfTone(char c) {
        String str = "Babel_telephony";
        String str2 = "TeleRemoteConferenceWrapper.onPlayDtmfTone, ";
        String valueOf = String.valueOf(glk.m17974b(String.valueOf(c)));
        glk.m17979c(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        this.f15084a.playDtmfTone(c);
    }

    public void onStopDtmfTone() {
        glk.m17979c("Babel_telephony", "TeleRemoteConferenceWrapper.onStopDtmfTone", new Object[0]);
        this.f15084a.stopDtmfTone();
    }

    public void onAudioStateChanged(AudioState audioState) {
        String valueOf = String.valueOf(audioState);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 56).append("TeleRemoteConferenceWrapper.onAudioStateChanged, state: ").append(valueOf).toString(), new Object[0]);
        this.f15084a.setAudioState(audioState);
    }

    void m17419a(int i) {
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
                glk.m17981d("Babel_telephony", "TeleRemoteConferenceWrapper.updateState. unrecognized state for Conference: " + i, new Object[0]);
                return;
        }
    }
}
