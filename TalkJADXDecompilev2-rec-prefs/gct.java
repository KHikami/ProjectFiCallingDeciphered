package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class gct extends BroadcastReceiver {
    private final gcq f14705a;

    gct(gcq gcq) {
        this.f14705a = gcq;
    }

    public void onReceive(Context context, Intent intent) {
        String valueOf = String.valueOf(this);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 34).append("HandoffBroadcastReceiver.onReceive").append(valueOf).toString(), new Object[0]);
        if (this.f14705a.f14680b != null && this.f14705a.f14680b.mo2206a() == this.f14705a) {
            gcq gcq = this.f14705a;
            String valueOf2 = String.valueOf(gcq.f14680b);
            glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf2).length() + 43).append("TeleConnection.performManualHandoff, call: ").append(valueOf2).toString(), new Object[0]);
            if (!gdc.m17021a(gcq.m16955d())) {
                glk.m17979c("Babel_telephony", "TeleConnection.performManualHandoff, manual handoff not allowed", new Object[0]);
            } else if (gcq.f14680b != null) {
                gcq.f14680b.mo2219c();
            }
        }
    }
}
