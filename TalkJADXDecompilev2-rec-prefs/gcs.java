package p000;

import android.telecom.DisconnectCause;

class gcs {
    gee f14704a;

    public void m16980a() {
        glk.m17979c("Babel_telephony", "TeleOutgoingCallRequest.DisconnectCallListener.onDisconnect", new Object[0]);
        if (this.f14704a != null) {
            gee gee = this.f14704a;
            if (!gee.f14836d) {
                gee.f14834b.setDisconnected(new DisconnectCause(2));
                gee.m17128c();
            }
        }
    }

    gcs(gee gee) {
        this.f14704a = gee;
    }

    void m16981b() {
        this.f14704a = null;
    }
}
