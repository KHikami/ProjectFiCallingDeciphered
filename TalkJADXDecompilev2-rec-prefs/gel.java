package p000;

import android.content.ComponentName;
import android.content.Context;
import android.telecom.AudioState;
import android.telecom.Connection;
import android.telecom.RemoteConnection;
import android.telecom.StatusHints;
import android.text.TextUtils;
import com.google.android.apps.hangouts.telephony.TeleConnectionService;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

final class gel implements gcc {
    final Context f14863a;
    final List<gcd> f14864b = new CopyOnWriteArrayList();
    final geo f14865c;
    gcq f14866d;
    gem f14867e = new gem(this);
    private RemoteConnection f14868f;
    private boolean f14869g;

    static gcq m17169a(RemoteConnection remoteConnection, TeleConnectionService teleConnectionService) {
        for (Connection connection : teleConnectionService.getAllConnections()) {
            if (connection instanceof gcq) {
                gcq gcq = (gcq) connection;
                if ((gcq.m16963j() instanceof gel) && ((gel) gcq.m16963j()).m17194n() == remoteConnection) {
                    return gcq;
                }
            }
        }
        return null;
    }

    gel(Context context, RemoteConnection remoteConnection, String str, String str2, String str3, boolean z) {
        this.f14863a = context;
        this.f14868f = remoteConnection;
        this.f14868f.registerCallback(this.f14867e);
        this.f14865c = new geo(context, str, remoteConnection.getAddress(), str2, str3, z);
        mo2212a(this.f14865c);
        if (!z && TextUtils.isEmpty(str)) {
            gwb.m1433O(context);
        }
    }

    public void mo2212a(gcd gcd) {
        this.f14864b.add(gcd);
    }

    public void mo2217b(gcd gcd) {
        this.f14864b.remove(gcd);
    }

    public gcq mo2206a() {
        return this.f14866d;
    }

    public void mo2213a(gcq gcq) {
        String valueOf = String.valueOf(this.f14866d);
        String valueOf2 = String.valueOf(gcq);
        glk.m17979c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 34) + String.valueOf(valueOf2).length()).append("TeleRemoteCall.setConnection, ").append(valueOf).append(" -> ").append(valueOf2).toString(), new Object[0]);
        if (this.f14866d != null && gcq == null) {
            this.f14866d.m16939a(mo2220d(), this.f14865c.m17406b());
        }
        this.f14866d = gcq;
        if (this.f14866d != null) {
            this.f14866d.setAudioModeIsVoip(false);
            mo2216b();
        }
    }

    public void mo2209a(int i, int i2) {
        glk.m17979c("Babel_telephony", "TeleRemoteCall.disconnectForHandoff, handoffReason: " + i + ", new call code: " + i2, new Object[0]);
        mo2223g();
    }

    public void mo2216b() {
        Object string;
        int i;
        StatusHints statusHints;
        String valueOf = String.valueOf(this.f14866d);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 34).append("TeleRemoteCall.updateStatusHints, ").append(valueOf).toString(), new Object[0]);
        Context d = this.f14866d.m16955d();
        ComponentName componentName = new ComponentName(d, TeleConnectionService.class);
        if (!(this.f14866d.m16964k() == null || this.f14866d.getState() == 3)) {
            if (!TextUtils.isEmpty(gwb.m1396G(d))) {
                string = d.getString(gwb.vt, new Object[]{gwb.m1396G(d)});
                i = gwb.uU;
                if (string == null && m17195o()) {
                    string = gwb.m1392F(d);
                    if (i == 0 && !TextUtils.isEmpty(string)) {
                        if (this.f14869g) {
                            i = gwb.uY;
                        } else {
                            i = gwb.uW;
                        }
                    }
                }
                statusHints = new StatusHints(componentName, string, i, null);
                if (!statusHints.equals(this.f14866d.getStatusHints())) {
                    String str = "Babel_telephony";
                    String resourceName = i != 0 ? "0" : d.getResources().getResourceName(i);
                    String valueOf2 = String.valueOf(this.f14866d);
                    glk.m17979c(str, new StringBuilder(((String.valueOf(string).length() + 51) + String.valueOf(resourceName).length()) + String.valueOf(valueOf2).length()).append("TeleRemoteCall.updateStatusHints, label: ").append(string).append(", icon: ").append(resourceName).append(", ").append(valueOf2).toString(), new Object[0]);
                    this.f14866d.setStatusHints(statusHints);
                }
            }
        }
        i = 0;
        string = null;
        string = gwb.m1392F(d);
        if (this.f14869g) {
            i = gwb.uY;
        } else {
            i = gwb.uW;
        }
        statusHints = new StatusHints(componentName, string, i, null);
        if (!statusHints.equals(this.f14866d.getStatusHints())) {
            String str2 = "Babel_telephony";
            if (i != 0) {
            }
            String valueOf22 = String.valueOf(this.f14866d);
            glk.m17979c(str2, new StringBuilder(((String.valueOf(string).length() + 51) + String.valueOf(resourceName).length()) + String.valueOf(valueOf22).length()).append("TeleRemoteCall.updateStatusHints, label: ").append(string).append(", icon: ").append(resourceName).append(", ").append(valueOf22).toString(), new Object[0]);
            this.f14866d.setStatusHints(statusHints);
        }
    }

    public void mo2211a(gcc gcc) {
        String valueOf = String.valueOf(gcc);
        String valueOf2 = String.valueOf(this.f14866d);
        glk.m17979c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 41) + String.valueOf(valueOf2).length()).append("TeleRemoteCall.performConferenceWith : ").append(valueOf).append(", ").append(valueOf2).toString(), new Object[0]);
        if (gcc == null) {
            return;
        }
        if (!(gcc instanceof gel)) {
            glk.m17981d("Babel_telephony", "TeleRemoteCall.performConferenceWith. Conferencing Wifi and PSTN calls together is not supported yet.", new Object[0]);
        } else if (this.f14866d != null) {
            this.f14866d.m16955d().conferenceRemoteConnections(m17194n(), ((gel) gcc).m17194n());
        }
    }

    public void mo2219c() {
        String valueOf = String.valueOf(this.f14866d);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 37).append("TeleRemoteCall.performManualHandoff, ").append(valueOf).toString(), new Object[0]);
        this.f14865c.m17401a(2);
        gdc.m17023b(this.f14863a, this.f14866d, 2);
    }

    public void mo2215a(boolean z) {
        this.f14869g = z;
    }

    public int mo2220d() {
        return 1;
    }

    public String mo2221e() {
        return this.f14865c.m17400a();
    }

    public void mo2214a(gcw gcw) {
        String valueOf = String.valueOf(gcw);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 47).append("TeleRemoteCall.maybeAddExperiment, experiment: ").append(valueOf).toString(), new Object[0]);
        this.f14865c.m17405a(gcw);
    }

    public void mo2210a(AudioState audioState) {
        String valueOf = String.valueOf(audioState);
        String valueOf2 = String.valueOf(this.f14866d);
        glk.m17979c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 45) + String.valueOf(valueOf2).length()).append("TeleRemoteCall.onAudioStateChanged, state: ").append(valueOf).append(", ").append(valueOf2).toString(), new Object[0]);
        if (this.f14868f != null) {
            this.f14868f.setAudioState(audioState);
        }
    }

    public void mo2207a(char c) {
        String valueOf = String.valueOf(glk.m17974b(String.valueOf(c)));
        String valueOf2 = String.valueOf(this.f14866d);
        glk.m17979c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 36) + String.valueOf(valueOf2).length()).append("TeleRemoteCall.onPlayDtmfTone, c: ").append(valueOf).append(", ").append(valueOf2).toString(), new Object[0]);
        if (this.f14868f != null) {
            this.f14868f.playDtmfTone(c);
        }
    }

    public void mo2222f() {
        String valueOf = String.valueOf(this.f14866d);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 31).append("TeleRemoteCall.onStopDtmfTone, ").append(valueOf).toString(), new Object[0]);
        if (this.f14868f != null) {
            this.f14868f.stopDtmfTone();
        }
    }

    public void mo2223g() {
        String valueOf = String.valueOf(this.f14866d);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 29).append("TeleRemoteCall.onDisconnect, ").append(valueOf).toString(), new Object[0]);
        if (this.f14868f != null) {
            this.f14868f.disconnect();
        }
    }

    public void mo2224h() {
        String valueOf = String.valueOf(this.f14866d);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 27).append("TeleRemoteCall.onSeparate, ").append(valueOf).toString(), new Object[0]);
    }

    public void mo2225i() {
        String valueOf = String.valueOf(this.f14866d);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 24).append("TeleRemoteCall.onAbort, ").append(valueOf).toString(), new Object[0]);
        if (this.f14868f != null) {
            this.f14868f.abort();
        }
    }

    public void mo2226j() {
        String valueOf = String.valueOf(this.f14866d);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 23).append("TeleRemoteCall.onHold, ").append(valueOf).toString(), new Object[0]);
        if (this.f14868f != null) {
            this.f14868f.hold();
        }
    }

    public void mo2227k() {
        String valueOf = String.valueOf(this.f14866d);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 24).append("TeleRemoteCall.onUhold, ").append(valueOf).toString(), new Object[0]);
        if (this.f14868f != null) {
            this.f14868f.unhold();
        }
    }

    public void mo2228l() {
        String valueOf = String.valueOf(this.f14866d);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 25).append("TeleRemoteCall.onAnswer, ").append(valueOf).toString(), new Object[0]);
        if (this.f14868f != null) {
            this.f14868f.answer();
            gwb.m1433O(this.f14863a);
        }
    }

    public void mo2229m() {
        String valueOf = String.valueOf(this.f14866d);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 25).append("TeleRemoteCall.onReject, ").append(valueOf).toString(), new Object[0]);
        if (this.f14868f != null) {
            this.f14868f.reject();
        }
    }

    public void mo2218b(boolean z) {
        String valueOf = String.valueOf(this.f14866d);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 35).append("TeleRemoteCall.onPostDialContinue, ").append(valueOf).toString(), new Object[0]);
        if (this.f14868f != null) {
            this.f14868f.postDialContinue(z);
        }
    }

    public void mo2208a(int i) {
        String valueOf = String.valueOf(Connection.stateToString(i));
        String valueOf2 = String.valueOf(this.f14866d);
        glk.m17979c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 40) + String.valueOf(valueOf2).length()).append("TeleRemoteCall.onStateChanged, state: ").append(valueOf).append(", ").append(valueOf2).toString(), new Object[0]);
        if (i == 1) {
            for (gcd a : this.f14864b) {
                a.mo2188a((gcc) this, i);
            }
        }
    }

    RemoteConnection m17194n() {
        return this.f14868f;
    }

    boolean m17195o() {
        return (this.f14866d == null || TextUtils.isEmpty(this.f14866d.m16970q())) ? false : true;
    }
}
