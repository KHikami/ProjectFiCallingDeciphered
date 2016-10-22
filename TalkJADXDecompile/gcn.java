import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;

final class gcn extends PhoneStateListener {
    private final Context a;
    private gcl b;
    private ServiceState c;
    private SignalStrength d;

    gcn(Context context, gcl gcl) {
        this.a = context;
        this.b = gcl;
    }

    public void onServiceStateChanged(ServiceState serviceState) {
        String valueOf = String.valueOf(serviceState);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 41).append("CellStateListener.onServiceStateChanged: ").append(valueOf).toString(), new Object[0]);
        this.c = serviceState;
        a();
    }

    public void onSignalStrengthsChanged(SignalStrength signalStrength) {
        String valueOf = String.valueOf(signalStrength);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 44).append("CellStateListener.onSignalStrengthsChanged: ").append(valueOf).toString(), new Object[0]);
        this.d = signalStrength;
        a();
    }

    private void a() {
        if (this.c != null && this.d != null && this.b != null) {
            this.b.a(gck.a(this.a, this.c.getState(), gck.a(this.d)));
            this.b = null;
        }
    }
}
