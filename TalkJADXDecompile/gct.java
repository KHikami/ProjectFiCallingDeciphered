import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// initiate manual handoff cell to wifi?
final class gct extends BroadcastReceiver {
    private final gcq a;

    gct(gcq gcq) {
        this.a = gcq;
    }

    public void onReceive(Context context, Intent intent) {
        String valueOf = String.valueOf(this);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 34).append("HandoffBroadcastReceiver.onReceive").append(valueOf).toString(), new Object[0]);
        if (this.a.b != null && this.a.b.a() == this.a) {
            gcq gcq = this.a;
            String valueOf2 = String.valueOf(gcq.b);
            glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf2).length() + 43).append("TeleConnection.performManualHandoff, call: ").append(valueOf2).toString(), new Object[0]);
            if (!gdc.a(gcq.d())) {
                glk.c("Babel_telephony", "TeleConnection.performManualHandoff, manual handoff not allowed", new Object[0]);
            } else if (gcq.b != null) {
                gcq.b.c();
            }
        }
    }
}
