package defpackage;

import android.telecom.DisconnectCause;

class gcs {
    gee a;

    public void a() {
        glk.c("Babel_telephony", "TeleOutgoingCallRequest.DisconnectCallListener.onDisconnect", new Object[0]);
        if (this.a != null) {
            gee gee = this.a;
            if (!gee.d) {
                gee.b.setDisconnected(new DisconnectCause(2));
                gee.c();
            }
        }
    }

    gcs(gee gee) {
        this.a = gee;
    }

    void b() {
        this.a = null;
    }
}
