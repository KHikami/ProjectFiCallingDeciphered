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

// logic for inducing handoff from cell to wifi
final class gel implements gcc {
    final Context a;
    final List<gcd> b; // list of handoff objects?
    final geo c;
    gcq d;
    gem e;  // Callback handlers for certain Connection states
    private RemoteConnection f;
    private boolean g;

    static gcq a(RemoteConnection remoteConnection, TeleConnectionService teleConnectionService) {
        for (Connection connection : teleConnectionService.getAllConnections()) {
            if (connection instanceof gcq) {
                gcq gcq = (gcq) connection;
                if ((gcq.j() instanceof gel) && ((gel) gcq.j()).n() == remoteConnection) {
                    return gcq;
                }
            }
        }
        return null;
    }

    gel(Context context, RemoteConnection remoteConnection, String str, String str2, String str3, boolean z) {
        this.b = new CopyOnWriteArrayList();
        this.e = new gem(this);
        this.a = context;
        this.f = remoteConnection;
        this.f.registerCallback(this.e);    // Hook up all the gem callbacks for its RemoteConnection
        this.c = new geo(context, str, remoteConnection.getAddress(), str2, str3, z);
        a(this.c);
        if (!z && TextUtils.isEmpty(str)) {
            gwb.O(context); // Unmute microphone
        }
    }

    public void a(gcd gcd) {
        this.b.add(gcd);
    }

    // remove handoff object from list
    public void b(gcd gcd) {
        this.b.remove(gcd);
    }

    public gcq a() {
        return this.d;
    }

    public void a(gcq gcq) {
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(gcq);
        glk.c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 34) + String.valueOf(valueOf2).length()).append("TeleRemoteCall.setConnection, ").append(valueOf).append(" -> ").append(valueOf2).toString(), new Object[0]);
        if (this.d != null && gcq == null) {
            this.d.a(d(), this.c.b());
        }
        this.d = gcq;
        if (this.d != null) {
            this.d.setAudioModeIsVoip(false);
            b();
        }
    }

    // disconnect for handoff from cell to wifi
    public void a(int i, int i2) {
        glk.c("Babel_telephony", "TeleRemoteCall.disconnectForHandoff, handoffReason: " + i + ", new call code: " + i2, new Object[0]);
        g();
    }

    public void b() {
        Object string;
        int i;
        StatusHints statusHints;
        String valueOf = String.valueOf(this.d);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 34).append("TeleRemoteCall.updateStatusHints, ").append(valueOf).toString(), new Object[0]);
        Context d = this.d.d();
        ComponentName componentName = new ComponentName(d, TeleConnectionService.class);
        if (!(this.d.k() == null || this.d.getState() == 3)) {
            if (!TextUtils.isEmpty(gwb.G(d))) {
                string = d.getString(gwb.vt, new Object[]{gwb.G(d)});
                i = gwb.uU;
                if (string == null && o()) {
                    string = gwb.F(d);
                    if (i == 0 && !TextUtils.isEmpty(string)) {
                        if (this.g) {
                            i = gwb.uY;
                        } else {
                            i = gwb.uW;
                        }
                    }
                }
                statusHints = new StatusHints(componentName, string, i, null);
                if (!statusHints.equals(this.d.getStatusHints())) {
                    String str = "Babel_telephony";
                    String resourceName = i != 0 ? "0" : d.getResources().getResourceName(i);
                    String valueOf2 = String.valueOf(this.d);
                    glk.c(str, new StringBuilder(((String.valueOf(string).length() + 51) + String.valueOf(resourceName).length()) + String.valueOf(valueOf2).length()).append("TeleRemoteCall.updateStatusHints, label: ").append(string).append(", icon: ").append(resourceName).append(", ").append(valueOf2).toString(), new Object[0]);
                    this.d.setStatusHints(statusHints);
                }
            }
        }
        i = 0;
        string = null;
        string = gwb.F(d);
        if (this.g) {
            i = gwb.uY;
        } else {
            i = gwb.uW;
        }
        statusHints = new StatusHints(componentName, string, i, null);
        if (!statusHints.equals(this.d.getStatusHints())) {
            String str2 = "Babel_telephony";
            if (i != 0) {
            }
            String valueOf22 = String.valueOf(this.d);
            glk.c(str2, new StringBuilder(((String.valueOf(string).length() + 51) + String.valueOf(resourceName).length()) + String.valueOf(valueOf22).length()).append("TeleRemoteCall.updateStatusHints, label: ").append(string).append(", icon: ").append(resourceName).append(", ").append(valueOf22).toString(), new Object[0]);
            this.d.setStatusHints(statusHints);
        }
    }

    public void a(gcc gcc) {
        String valueOf = String.valueOf(gcc);
        String valueOf2 = String.valueOf(this.d);
        glk.c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 41) + String.valueOf(valueOf2).length()).append("TeleRemoteCall.performConferenceWith : ").append(valueOf).append(", ").append(valueOf2).toString(), new Object[0]);
        if (gcc == null) {
            return;
        }
        if (!(gcc instanceof gel)) {
            glk.d("Babel_telephony", "TeleRemoteCall.performConferenceWith. Conferencing Wifi and PSTN calls together is not supported yet.", new Object[0]);
        } else if (this.d != null) {
            this.d.d().conferenceRemoteConnections(n(), ((gel) gcc).n());
        }
    }

    // perform manual handoff from cell to wifi
    // reason code 2 = manual handoff
    public void c() {
        String valueOf = String.valueOf(this.d);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 37).append("TeleRemoteCall.performManualHandoff, ").append(valueOf).toString(), new Object[0]);
        this.c.a(2);
        gdc.b(this.a, this.d, 2); // initiate cell to wifi handoff - manual handoff
    }

    public void a(boolean z) {
        this.g = z;
    }

    // identifier among gcc implementers
    public int d() {
        return 1;
    }

    // Get call_id? (search gwb for call_id)
    public String e() {
        return this.c.a();
    }

    // wifi experiment?
    public void a(gcw gcw) {
        String valueOf = String.valueOf(gcw);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 47).append("TeleRemoteCall.maybeAddExperiment, experiment: ").append(valueOf).toString(), new Object[0]);
        this.c.a(gcw); // calls geo method
    }

    public void a(AudioState audioState) {
        String valueOf = String.valueOf(audioState);
        String valueOf2 = String.valueOf(this.d);
        glk.c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 45) + String.valueOf(valueOf2).length()).append("TeleRemoteCall.onAudioStateChanged, state: ").append(valueOf).append(", ").append(valueOf2).toString(), new Object[0]);
        if (this.f != null) {
            this.f.setAudioState(audioState);
        }
    }

    public void a(char c) {
        String valueOf = String.valueOf(glk.b(String.valueOf(c)));
        String valueOf2 = String.valueOf(this.d);
        glk.c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 36) + String.valueOf(valueOf2).length()).append("TeleRemoteCall.onPlayDtmfTone, c: ").append(valueOf).append(", ").append(valueOf2).toString(), new Object[0]);
        if (this.f != null) {
            this.f.playDtmfTone(c);
        }
    }

    public void f() {
        String valueOf = String.valueOf(this.d);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 31).append("TeleRemoteCall.onStopDtmfTone, ").append(valueOf).toString(), new Object[0]);
        if (this.f != null) {
            this.f.stopDtmfTone();
        }
    }

    public void g() {
        String valueOf = String.valueOf(this.d);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 29).append("TeleRemoteCall.onDisconnect, ").append(valueOf).toString(), new Object[0]);
        if (this.f != null) {
            this.f.disconnect();
        }
    }

    public void h() {
        String valueOf = String.valueOf(this.d);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 27).append("TeleRemoteCall.onSeparate, ").append(valueOf).toString(), new Object[0]);
    }

    public void i() {
        String valueOf = String.valueOf(this.d);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 24).append("TeleRemoteCall.onAbort, ").append(valueOf).toString(), new Object[0]);
        if (this.f != null) {
            this.f.abort();
        }
    }

    public void j() {
        String valueOf = String.valueOf(this.d);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 23).append("TeleRemoteCall.onHold, ").append(valueOf).toString(), new Object[0]);
        if (this.f != null) {
            this.f.hold();
        }
    }

    public void k() {
        String valueOf = String.valueOf(this.d);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 24).append("TeleRemoteCall.onUhold, ").append(valueOf).toString(), new Object[0]);
        if (this.f != null) {
            this.f.unhold();
        }
    }

    public void l() {
        String valueOf = String.valueOf(this.d);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 25).append("TeleRemoteCall.onAnswer, ").append(valueOf).toString(), new Object[0]);
        if (this.f != null) {
            this.f.answer();
            gwb.O(this.a);
        }
    }

    public void m() {
        String valueOf = String.valueOf(this.d);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 25).append("TeleRemoteCall.onReject, ").append(valueOf).toString(), new Object[0]);
        if (this.f != null) {
            this.f.reject();
        }
    }

    public void b(boolean z) {
        String valueOf = String.valueOf(this.d);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 35).append("TeleRemoteCall.onPostDialContinue, ").append(valueOf).toString(), new Object[0]);
        if (this.f != null) {
            this.f.postDialContinue(z);
        }
    }

    public void a(int i) {
        String valueOf = String.valueOf(Connection.stateToString(i));
        String valueOf2 = String.valueOf(this.d);
        glk.c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 40) + String.valueOf(valueOf2).length()).append("TeleRemoteCall.onStateChanged, state: ").append(valueOf).append(", ").append(valueOf2).toString(), new Object[0]);
        if (i == 1) {
            for (gcd a : this.b) {
                a.a((gcc) this, i);
            }
        }
    }

    RemoteConnection n() {
        return this.f;
    }

    // Returns true if there is an associated TeleConnection obj AND hangout_id is defined (not empty string)
    boolean o() {
        // this.d is gcq object
        // this.d.q() returns hangout_id string
        return (this.d == null || TextUtils.isEmpty(this.d.q())) ? false : true;
    }
}
