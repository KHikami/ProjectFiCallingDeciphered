package p000;

import android.content.Context;
import android.telecom.AudioState;
import android.telecom.Conference;
import android.telecom.Connection;
import android.telecom.PhoneAccountHandle;
import com.google.android.apps.hangouts.telephony.TeleConnectionService;
import java.util.List;

final class gfp extends Conference implements gcu {
    private gfp(PhoneAccountHandle phoneAccountHandle) {
        super(phoneAccountHandle);
        setConnectionCapabilities(67);
        setActive();
    }

    public void onPlayDtmfTone(char c) {
        gcq a = m17567a();
        if (a != null) {
            a.onPlayDtmfTone(c);
        } else {
            glk.m17981d("Babel_telephony", "No TeleConnection found while trying to play dtmf tone.", new Object[0]);
        }
    }

    public void onStopDtmfTone() {
        gcq a = m17567a();
        if (a != null) {
            a.onStopDtmfTone();
        } else {
            glk.m17981d("Babel_telephony", "No TeleConnection found while trying to stop dtmf tone.", new Object[0]);
        }
    }

    public void onAudioStateChanged(AudioState audioState) {
        String valueOf = String.valueOf(audioState);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 40).append("TeleWifiConference.onAudioStateChanged, ").append(valueOf).toString(), new Object[0]);
        gcq a = m17567a();
        if (a != null) {
            a.onAudioStateChanged(audioState);
        } else {
            glk.m17981d("Babel_telephony", "No TeleConnection found while trying to change audio state.", new Object[0]);
        }
    }

    public void onHold() {
        glk.m17979c("Babel_telephony", "TeleWifiConference.onHold", new Object[0]);
        for (Connection connection : getConnections()) {
            ((gcq) connection).onHold();
        }
    }

    public void onUnhold() {
        glk.m17979c("Babel_telephony", "TeleWifiConference.onUnhold", new Object[0]);
        for (Connection connection : getConnections()) {
            ((gcq) connection).onUnhold();
        }
    }

    public void onDisconnect() {
        glk.m17979c("Babel_telephony", "TeleWifiConference.onDisconnect.", new Object[0]);
        for (Connection onDisconnect : getConnections()) {
            onDisconnect.onDisconnect();
        }
    }

    public void onConnectionAdded(Connection connection) {
        ((gcq) connection).m16942a((gcu) this);
    }

    public void mo2260a(gcq gcq, int i) {
        if (i == 4) {
            setActive();
        } else if (i == 5) {
            setOnHold();
        } else if (i == 6) {
            removeConnection(gcq);
            gcq.m16949b((gcu) this);
            if (getConnections().size() == 0) {
                setDisconnected(gcq.getDisconnectCause());
                destroy();
            }
        }
    }

    private gcq m17567a() {
        List connections = getConnections();
        if (connections.isEmpty()) {
            return null;
        }
        return (gcq) connections.get(0);
    }

    static void m17568a(TeleConnectionService teleConnectionService, gcq gcq) {
        Conference conference;
        glk.m17979c("Babel_telephony", "TeleWifiConference.getOrCreateWifiConference", new Object[0]);
        for (Connection conference2 : teleConnectionService.getAllConnections()) {
            conference = conference2.getConference();
            if (conference instanceof gfp) {
                gfp gfp = (gfp) conference;
                break;
            }
        }
        glk.m17979c("Babel_telephony", "TeleWifiConference.createWifiConference", new Object[0]);
        conference = new gfp(gwb.m1409J((Context) teleConnectionService));
        teleConnectionService.addConference(conference);
        Conference conference3 = conference;
        for (Connection conference22 : teleConnectionService.getAllConnections()) {
            gcq gcq2 = (gcq) conference22;
            if (gcq2 == gcq || gfj.m17507b(gcq2)) {
                String valueOf = String.valueOf(gcq2);
                glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 57).append("TeleWifiConference.adding connection to wifi conference: ").append(valueOf).toString(), new Object[0]);
                AudioState audioState = gcq2.getAudioState();
                if (!(audioState == null || !audioState.isMuted() || gcq2.m16963j() == null)) {
                    ((gfj) gcq2.m16963j()).m17537c(false);
                }
                gfp.addConnection(gcq2);
            }
        }
    }
}
